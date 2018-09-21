package zdoctor.zcoremod.map;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import net.minecraftforge.fml.common.FMLCommonHandler;
import zdoctor.commons.io.util.FileUtil;
import zdoctor.commons.util.FileStreamDictironary;
import zdoctor.commons.util.NodeDictionary;
import zdoctor.commons.util.PrimitiveUtil;
import zdoctor.zcoremod.Config;
import zdoctor.zcoremod.map.pair.McObfClass;
import zdoctor.zcoremod.map.pair.McObfField;
import zdoctor.zcoremod.map.pair.McObfMethod;
import zdoctor.zcoremod.map.pair.McObfPair;

public class McPairDictironary extends NodeDictionary<Character, McObfPair> {

  private FileStreamDictironary files;

  public McPairDictironary() {
    if (Config.GENERATEENTRIES)
      files = new FileStreamDictironary();
  }

  public McObfPair lookUp(String key) {
    return super.lookUp(PrimitiveUtil.toCharacterArray(key));
  }

  public boolean hasKey(String key) {
    return super.hasKey(PrimitiveUtil.toCharacterArray(key));
  }

  public boolean register(String keys, McObfPair value) {
    return super.register(PrimitiveUtil.toCharacterArray(keys), value);
  }

  @Override
  public Character[][] searchSimilarKeys(Character[] partialKey) {
    return new Character[0][];
  }

  @Override
  public McObfPair[] searchSimilarValues(McObfPair partialValue) {
    return new McObfPair[0];
  }

  public void generateEntries() {
    if (Config.GENERATEENTRIES) {
      database.forEach((key, value) -> {
//        System.out.println("key: " + PrimitiveUtil.toString(key));

        String name = value.getClassName();
        name = name.substring(name.indexOf('/') + 1);

        if (PrimitiveUtil.toString(key).equals("field_70180_af")) {
          System.out.println("Found: " + value.getOwner());
        }

        if (value instanceof McObfClass) {
          File entryFile = FileUtil.createFile("zdoctor/zcoremod/map/" + name + ".java");
          if (entryFile != null) {
            try {
              FileOutputStream entryStream = new FileOutputStream(entryFile);
              entryStream
                  .write(String.format(Config.ENTRYSTART, name.replaceAll("/", ".").substring(0, name.lastIndexOf('/')), name.substring(name.lastIndexOf('/') + 1)).getBytes());
              entryStream.write(Config.GETKEY.getBytes());
              entryStream.write(String.format(Config.GETCLASSNAME, value.getObf(), value.getDeobf()).getBytes());
              entryStream.write(
                  String.format(Config.GETNAME, value.getObf().substring(value.getObf().lastIndexOf('/') + 1), value.getDeobf().substring(value.getDeobf().lastIndexOf('/') + 1))
                      .getBytes());
              entryStream.write(String.format(Config.GETDESCRIPTOR, "L" + value.getObf() + ";", "L" + value.getDeobf() + ";").getBytes());
              files.register(name, entryStream);
            } catch (IOException e) {
              e.printStackTrace();
            }
          }
        }
      });

      database.forEach((key, value) -> {
        try {
//					System.out.println(PrimitiveUtil.toString(key));
          String name = value.getOwner();
          name = name.substring(name.indexOf('/') + 1);

          File entryFile = FileUtil.createFile("zdoctor/zcoremod/map/" + name + ".java");

          if (files.hasKey(name)) {
//						System.out.println(name);
            FileOutputStream entryStream = files.lookUp(name);
            if (value instanceof McObfMethod) {
              entryStream.write('\t');
              entryStream.write(String.format(Config.FUNCFORMATCOMMENT, value.getVariableName(), Arrays.toString(value.getDescriptors())).getBytes());
            } else if (value instanceof McObfField) {
              entryStream.write('\t');
              entryStream.write(String.format(Config.FIELDFORMATCOMMENT, value.getVariableName()).getBytes());
            }
//
            entryStream.write('\t');
            if (value instanceof McObfField) {
              entryStream.write(String.format(Config.ENTRYFORMAT, PrimitiveUtil.toString(key).replaceAll(".*\\.", ""), PrimitiveUtil.toString(key)).getBytes());
            } else if (value instanceof McObfMethod)
              entryStream.write(String.format(Config.ENTRYFORMAT, PrimitiveUtil.toString(key).replaceAll(".*\\.", ""), PrimitiveUtil.toString(key)).getBytes());
            else
              System.out.println("Other: " + value);
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
      });

      files.forEach((key, value) -> {
        try {
          value.write(Config.ENTRYEND.getBytes());
          value.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      });
      FMLCommonHandler.instance().exitJava(0, true);
    }
  }
}

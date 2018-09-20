package zdoctor.zcoremod.map.pair;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import zdoctor.commons.io.util.FileUtil;
import zdoctor.commons.util.NodeDictionary;
import zdoctor.commons.util.PrimitiveUtil;

public class McPairDictironary extends NodeDictionary<Character, McObfPair> {

	private FileWriter fw;

	public McPairDictironary() {

	}

	public McPairDictironary(String output) {
		try {
			File entries = FileUtil.createFile(output);
			System.out.println(entries.getAbsolutePath());
			fw = new FileWriter(entries);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public McObfPair lookUp(String key) {
		return super.lookUp(PrimitiveUtil.toCharacterArray(key));
	}

	public boolean hasKey(String key) {
		return super.hasKey(PrimitiveUtil.toCharacterArray(key));
	}

	public boolean register(String keys, McObfPair value) {
		if (fw != null)
			try {
				fw.write(keys + "=" + value.getName() + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
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

	public void close() {
		if (fw != null)
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}

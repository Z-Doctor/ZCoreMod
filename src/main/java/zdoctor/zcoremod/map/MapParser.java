package zdoctor.zcoremod.map;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import zdoctor.commons.io.util.FileUtil;
import zdoctor.commons.io.util.StreamUtil;
import zdoctor.commons.io.util.ZipUtil;
import zdoctor.zcoremod.map.pair.McObfClass;
import zdoctor.zcoremod.map.pair.McObfField;
import zdoctor.zcoremod.map.pair.McObfMethod;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.pair.McPairDictironary;

public class MapParser {

	public static McPairDictironary parseZipMap(File file) {
		McPairDictironary map = new McPairDictironary();
		ZipUtil.forEach(file, (entry, zis) -> {
			scanMapInputStream(map, zis);
		});

		return map.count() <= 0 ? null : map;
	}

	public static McPairDictironary parseMapStream(InputStream mapStream) {
		if (mapStream != null)
			try {
				File file = FileUtil.flushToTempFile(StreamUtil.getInputData(mapStream));
				return parseZipMap(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		return null;
	}

	public static McPairDictironary parseMapStream(McPairDictironary mappings, InputStream srgStream) {
		if (srgStream != null)
			try {
				File file = FileUtil.flushToTempFile(StreamUtil.getInputData(srgStream));
				return parseZipSRG(mappings, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		return null;
	}

	public static void scanMapInputStream(McPairDictironary map, InputStream inputStream) {
		Scanner scan = new Scanner(inputStream);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			if (line.toLowerCase().startsWith("f") || line.toLowerCase().startsWith("p")) {
				String[] args = line.split(",");
				McObfPair pair = null;
				if (args.length == 4) {
					pair = new McObfPair(args[0], args[1], args[2], args[3]);
				} else if (args.length == 3) {
					pair = new McObfPair(args[0], args[1], args[2]);
				} else if (args.length == 2) {
					pair = new McObfPair(args[0], args[1]);
				}

				if (pair != null) {
					map.register(args[0], pair);
				}
			}
		}
		scan.close();
	}

	public static McPairDictironary parseZipSRG(McPairDictironary mappings, File file) {
		McPairDictironary srg = new McPairDictironary();

		ZipUtil.forEach(file, (entry, zis) -> {
			if (entry.getName().endsWith(".srg")) {
				scanSRGInputStream(mappings, srg, zis);
			}
		});
		return srg.count() <= 0 ? null : srg;
	}

	public static void scanSRGInputStream(McPairDictironary mappings, McPairDictironary srg, InputStream inputStream) {
		Scanner scan = new Scanner(inputStream);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] args = line.split(" ");
			McObfPair pair = null;
			if (args[0].toLowerCase().startsWith("cl")) {
				pair = new McObfClass(args[1], args[2]);
				srg.register(pair.getName(), pair);
			} else if (args[0].toLowerCase().startsWith("fd")) {
				String owner = args[2];
				owner = owner.substring(0, owner.lastIndexOf('/'));

				String field = args[2];
				field = field.substring(field.lastIndexOf('/') + 1);

				McObfPair mcPair = mappings.lookUp(field);
				if (mcPair != null) {
					String deobfField = args[2].replace(field, mcPair.getDeobf());
					pair = new McObfField(args[1], deobfField);
					srg.register(field, pair);
				}
			} else if (args[0].toLowerCase().startsWith("md")) {
				String func = args[3];
				func = func.substring(func.lastIndexOf('/') + 1);

				McObfPair mcPair = mappings.lookUp(func);
				if (mcPair != null) {
					String deobFunc = args[3].replace(func, mcPair.getDeobf());

					String key = deobFunc.substring(0, deobFunc.lastIndexOf('/'));
					key = key.substring(key.lastIndexOf('/') + 1) + "." + func;

					McObfMethod method = new McObfMethod(args[3], deobFunc, args[1], args[2], args[4]);
					srg.register(key, method);
				}
			}

		}
		scan.close();
	}

}

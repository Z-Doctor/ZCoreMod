package zdoctor.zcoremod.map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class MapParser {

	public static void parseZipMap(File file) {
		ZipUtil.forEach(file, (entry, zis) -> {
			scanMapInputStream(zis);
		});
	}

	public static void parseMapFile(File file) {
		try {
			scanMapInputStream(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void parseMapStream(InputStream mapStream) {
		if (mapStream != null)
			try {
				File file = FileUtil.flushToTempFile(StreamUtil.getInputData(mapStream));
				parseZipMap(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	public static void scanMapInputStream(InputStream inputStream) {
		Scanner scan = new Scanner(inputStream);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			if (line.toLowerCase().startsWith("f") || line.toLowerCase().startsWith("p")) {
				String[] args = parse(line);
				McObfPair pair = null;
				if (args.length == 4) {
					pair = new McObfPair(args[0], args[1], args[2], args[3]);
				} else if (args.length == 3) {
					pair = new McObfPair(args[0], args[1], args[2]);
				} else if (args.length == 2) {
					pair = new McObfPair(args[0], args[1]);
				}

				if (pair != null) {
					McMappingDatabase.registerMap(args[0], pair);
				}
			}
		}
		scan.close();
	}

	public static String[] parse(String line) {
		char[] array = line.toCharArray();
		String[] temp = new String[4];
		int args = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			char c = array[i];
			if (c == ',' && args <= 2) {
				temp[args++] = sb.toString();
				sb = new StringBuilder("");
			} else
				sb.append(c);
		}
		if (sb.length() > 0)
			temp[args++] = sb.toString();

		if (args == 3)
			temp[3] = "";

		return temp;
	}

	public static void parseSrgStream(McPairDictironary mappings, InputStream srgStream) {
		if (srgStream != null)
			try {
				File file = FileUtil.flushToTempFile(StreamUtil.getInputData(srgStream));
				parseZipSRG(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	public static void parseSrgFile(File srgFile) {
		try {
			scanSrgInputStream(new FileInputStream(srgFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void parseZipSRG(File file) {
		ZipUtil.forEach(file, (entry, zis) -> {
			if (entry.getName().endsWith(".srg")) {
				scanSrgInputStream(zis);
			}
		});
	}

	public static void scanSrgInputStream(InputStream inputStream) {
		Scanner scan = new Scanner(inputStream);
		while (scan.hasNextLine() || scan.hasNext()) {
			String line = scan.nextLine();
			if (line.equals(""))
				continue;

			String[] args = line.split(" ");

			if (args.length == 0)
				continue;

			McObfPair pair = null;
			if (args[0].toLowerCase().startsWith("cl")) {
				pair = new McObfClass(args[1], args[2]);
				McMappingDatabase.registerSrg(pair.getName(), pair);
			} else if (args[0].toLowerCase().startsWith("fd")) {
				String owner = args[2];
				owner = owner.substring(0, owner.lastIndexOf('/'));

				String field = args[2];
				field = field.substring(field.lastIndexOf('/') + 1);
				McObfPair mcPair = McMappingDatabase.getMapping(field);
				if (mcPair != null) {
					String deobfField = args[2].replace(field, mcPair.getDeobf());
					pair = new McObfField(args[1], deobfField);
					McMappingDatabase.registerSrg(field, pair);
				}
			} else if (args[0].toLowerCase().startsWith("md")) {
				String func = args[3];
				func = func.substring(func.lastIndexOf('/') + 1);

				McObfPair mcPair = McMappingDatabase.getMapping(func);
				if (mcPair != null) {
					String deobFunc = args[3].replace(func, mcPair.getDeobf());

					String key = deobFunc.substring(0, deobFunc.lastIndexOf('/'));
					key = key.substring(key.lastIndexOf('/') + 1) + "." + func;

					McObfMethod method = new McObfMethod(args[3], deobFunc, args[1], args[2], args[4]);
					McMappingDatabase.registerSrg(key, method);
				}
			} else {
				System.out.println("Skipped: " + line);
			}

		}
		scan.close();
	}

}

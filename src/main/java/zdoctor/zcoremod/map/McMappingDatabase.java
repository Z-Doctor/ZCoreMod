package zdoctor.zcoremod.map;

import java.io.File;

import zdoctor.zcoremod.Config;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.pair.McPairDictironary;

public class McMappingDatabase {

	protected static McPairDictironary MCMAPPINGS;
	protected static McPairDictironary SRGMAPPINGS;

	public static McObfPair getMapping(String key) {
		return MCMAPPINGS.lookUp(key);
	}

	public static McObfPair getSRG(String key) {
		return SRGMAPPINGS.lookUp(key);
	}

	public static void loadDefaultMappings() {
		MCMAPPINGS = new McPairDictironary();
//		MCMAPPINGS = new McPairDictironary("Mappings.txt");
		File mapDir = getMapDir();

		for (File file : mapDir.listFiles()) {
			if (file.isFile() && file.getName().endsWith(".csv")) {
				MapParser.parseMapFile(file);
			}
		}

		SRGMAPPINGS = new McPairDictironary("Srg-Entries.txt");
		File notchSrg = getSrgFile();
		MapParser.parseSrgFile(notchSrg);

	}

	public static File getMapDir() {
		File mapDir = new File(Config.PATH);
//		if (!CoreModFMLLoadPlugin.isDeobfuscationEnabled)
//			return new File(System.getProperty("net.minecraftforge.gradle.GradleStart.csvDir"));
//		else
		return mapDir;
	}

	public static File getSrgFile() {
		File srgFile = new File(Config.SRG);
		return srgFile;
	}

	public static void registerMap(String key, McObfPair value) {
		MCMAPPINGS.register(key, value);
	}

	public static void registerSrg(String key, McObfPair value) {
		SRGMAPPINGS.register(key, value);
	}

}

package zdoctor.zcoremod.map;

import java.io.File;

import zdoctor.commons.io.util.ZipUtil;
import zdoctor.zcoremod.Config;
import zdoctor.zcoremod.CoreModFMLLoadPlugin;
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
		McPairDictironary map = new McPairDictironary();
		File mapDir = getMapDir();
		
		for (File file : mapDir.listFiles()) {
			if (file.isFile() && file.getName().endsWith(".csv")) {
				MapParser.parseMapFile(map, file);
			}
		}

		if (map != null && map.count() > 0)
			MCMAPPINGS = map;
		
		File notchSrg = getSrgFile();

		McPairDictironary srg = MapParser.parseSrgFile(MCMAPPINGS, notchSrg);
		if (srg != null && srg.count() > 0)
			SRGMAPPINGS = srg;

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
//		if (!CoreModFMLLoadPlugin.isDeobfuscationEnabled)
//			return new File(System.getProperty("net.minecraftforge.gradle.GradleStart.srg.notch-srg"));
//		else
		return srgFile;
	}

	public static void loadMappings(File map, File srg) {
		McPairDictironary tempMap = null;
		McPairDictironary tempSRG = null;

		if (map != null && map.exists()) {
			if (ZipUtil.isZip(map)) {
				tempMap = MapParser.parseZipMap(map);
			}
		}

		if (tempMap != null)
			MCMAPPINGS = tempMap;

		if (srg != null && srg.exists()) {
			if (ZipUtil.isZip(srg)) {
				tempSRG = MapParser.parseZipSRG(MCMAPPINGS, srg);
			}
		}

		if (tempSRG != null)
			SRGMAPPINGS = tempSRG;

	}

}

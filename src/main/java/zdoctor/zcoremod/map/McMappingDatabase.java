package zdoctor.zcoremod.map;

import java.io.File;
import java.io.InputStream;

import zdoctor.commons.io.util.StreamUtil;
import zdoctor.commons.io.util.ZipUtil;
import zdoctor.zcoremod.asm.util.ASMConstants;
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
		InputStream mapStream = StreamUtil.getResourceAsStream(McMappingDatabase.class,
				ASMConstants.ZPackage + "/mappings/mcp_snapshot-20180814-1.12.zip");
		McPairDictironary map = MapParser.parseMapStream(mapStream);
		if (map != null)
			MCMAPPINGS = map;

		InputStream srgStream = StreamUtil.getResourceAsStream(McMappingDatabase.class,
				ASMConstants.ZPackage + "/mappings/mcp-1.12-srg.zip");
		McPairDictironary srg = MapParser.parseMapStream(MCMAPPINGS, srgStream);
		if (srg != null)
			SRGMAPPINGS = srg;

		assert (MCMAPPINGS != null && SRGMAPPINGS != null);
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

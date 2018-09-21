package zdoctor.zcoremod.map.minecraft.world.chunk.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RegionFile {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayj";
		else
			return "net/minecraft/world/chunk/storage/RegionFile";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayj";
		else
			return "RegionFile";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layj;";
		else
			return "Lnet/minecraft/world/chunk/storage/RegionFile;";
	}

	/**
	 * <p>
	 * Name: close
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76708_c = McMappingDatabase.getSRG("RegionFile.func_76708_c");

	/**
	 * <p>
	 * Name: isChunkSaved
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_76709_c = McMappingDatabase.getSRG("RegionFile.func_76709_c");

	/**
	 * <p>
	 * Name: chunkTimestamps
	 * </p>
	 */
	public static McObfPair field_76717_e = McMappingDatabase.getSRG("field_76717_e");

	/**
	 * <p>
	 * Name: setChunkTimestamp
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_76713_b = McMappingDatabase.getSRG("RegionFile.func_76713_b");

	/**
	 * <p>
	 * Name: getChunkDataOutputStream
	 * </p>
	 * <p>
	 * Desc: [(II)Ljava/io/DataOutputStream;]
	 * </p>
	 */
	public static McObfPair func_76710_b = McMappingDatabase.getSRG("RegionFile.func_76710_b");

	/**
	 * <p>
	 * Name: dataFile
	 * </p>
	 */
	public static McObfPair field_76719_c = McMappingDatabase.getSRG("field_76719_c");

	/**
	 * <p>
	 * Name: getOffset
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_76707_e = McMappingDatabase.getSRG("RegionFile.func_76707_e");

	/**
	 * <p>
	 * Name: outOfBounds
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_76705_d = McMappingDatabase.getSRG("RegionFile.func_76705_d");

	/**
	 * <p>
	 * Name: fileName
	 * </p>
	 */
	public static McObfPair field_76718_b = McMappingDatabase.getSRG("field_76718_b");

	/**
	 * <p>
	 * Name: EMPTY_SECTOR
	 * </p>
	 */
	public static McObfPair field_76720_a = McMappingDatabase.getSRG("field_76720_a");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(II[BI)V]
	 * </p>
	 */
	public static McObfPair func_76706_a = McMappingDatabase.getSRG("RegionFile.func_76706_a");

	/**
	 * <p>
	 * Name: sectorFree
	 * </p>
	 */
	public static McObfPair field_76714_f = McMappingDatabase.getSRG("field_76714_f");

	/**
	 * <p>
	 * Name: offsets
	 * </p>
	 */
	public static McObfPair field_76716_d = McMappingDatabase.getSRG("field_76716_d");

	/**
	 * <p>
	 * Name: sizeDelta
	 * </p>
	 */
	public static McObfPair field_76715_g = McMappingDatabase.getSRG("field_76715_g");

	/**
	 * <p>
	 * Name: lastModified
	 * </p>
	 */
	public static McObfPair field_76721_h = McMappingDatabase.getSRG("field_76721_h");

	/**
	 * <p>
	 * Name: setOffset
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_76711_a = McMappingDatabase.getSRG("RegionFile.func_76711_a");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(I[BI)V]
	 * </p>
	 */
	public static McObfPair func_76712_a = McMappingDatabase.getSRG("RegionFile.func_76712_a");

	/**
	 * <p>
	 * Name: getChunkDataInputStream
	 * </p>
	 * <p>
	 * Desc: [(II)Ljava/io/DataInputStream;]
	 * </p>
	 */
	public static McObfPair func_76704_a = McMappingDatabase.getSRG("RegionFile.func_76704_a");

}

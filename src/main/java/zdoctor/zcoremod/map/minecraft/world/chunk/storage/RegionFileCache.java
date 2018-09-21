package zdoctor.zcoremod.map.minecraft.world.chunk.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RegionFileCache {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayk";
		else
			return "net/minecraft/world/chunk/storage/RegionFileCache";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayk";
		else
			return "RegionFileCache";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layk;";
		else
			return "Lnet/minecraft/world/chunk/storage/RegionFileCache;";
	}

	/**
	 * <p>
	 * Name: getChunkInputStream
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;II)Ljava/io/DataInputStream;]
	 * </p>
	 */
	public static McObfPair func_76549_c = McMappingDatabase.getSRG("RegionFileCache.func_76549_c");

	/**
	 * <p>
	 * Name: getChunkOutputStream
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;II)Ljava/io/DataOutputStream;]
	 * </p>
	 */
	public static McObfPair func_76552_d = McMappingDatabase.getSRG("RegionFileCache.func_76552_d");

	/**
	 * <p>
	 * Name: createOrLoadRegionFile
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;II)Lnet/minecraft/world/chunk/storage/RegionFile;]
	 * </p>
	 */
	public static McObfPair func_76550_a = McMappingDatabase.getSRG("RegionFileCache.func_76550_a");

	/**
	 * <p>
	 * Name: clearRegionFileReferences
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76551_a = McMappingDatabase.getSRG("RegionFileCache.func_76551_a");

	/**
	 * <p>
	 * Name: chunkExists
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;II)Z]
	 * </p>
	 */
	public static McObfPair func_191064_f = McMappingDatabase.getSRG("RegionFileCache.func_191064_f");

	/**
	 * <p>
	 * Name: REGIONS_BY_FILE
	 * </p>
	 */
	public static McObfPair field_76553_a = McMappingDatabase.getSRG("field_76553_a");

	/**
	 * <p>
	 * Name: getRegionFileIfExists
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;II)Lnet/minecraft/world/chunk/storage/RegionFile;]
	 * </p>
	 */
	public static McObfPair func_191065_b = McMappingDatabase.getSRG("RegionFileCache.func_191065_b");

}

package zdoctor.zcoremod.map.minecraft.world.chunk.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AnvilSaveConverter {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bez";
		else
			return "net/minecraft/world/chunk/storage/AnvilSaveConverter";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bez";
		else
			return "AnvilSaveConverter";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbez;";
		else
			return "Lnet/minecraft/world/chunk/storage/AnvilSaveConverter;";
	}

	/**
	 * <p>
	 * Name: getSaveList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_75799_b = McMappingDatabase.getSRG("AnvilSaveConverter.func_75799_b");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_154333_a = McMappingDatabase.getSRG("AnvilSaveConverter.func_154333_a");

	/**
	 * <p>
	 * Name: getSaveVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75812_c = McMappingDatabase.getSRG("AnvilSaveConverter.func_75812_c");

	/**
	 * <p>
	 * Name: isOldMapFormat
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_75801_b = McMappingDatabase.getSRG("AnvilSaveConverter.func_75801_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151480_b = McMappingDatabase.getSRG("field_151480_b");

	/**
	 * <p>
	 * Name: flushCache
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75800_d = McMappingDatabase.getSRG("AnvilSaveConverter.func_75800_d");

	/**
	 * <p>
	 * Name: getSaveLoader
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Z)Lnet/minecraft/world/storage/ISaveHandler;]
	 * </p>
	 */
	public static McObfPair func_75804_a = McMappingDatabase.getSRG("AnvilSaveConverter.func_75804_a");

	/**
	 * <p>
	 * Name: isConvertible
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_154334_a = McMappingDatabase.getSRG("AnvilSaveConverter.func_154334_a");

	/**
	 * <p>
	 * Name: convertMapFormat
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/util/IProgressUpdate;)Z]
	 * </p>
	 */
	public static McObfPair func_75805_a = McMappingDatabase.getSRG("AnvilSaveConverter.func_75805_a");

	/**
	 * <p>
	 * Name: convertFile
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;Ljava/lang/Iterable;Lnet/minecraft/world/biome/BiomeProvider;IILnet/minecraft/util/IProgressUpdate;)V]
	 * </p>
	 */
	public static McObfPair func_75813_a = McMappingDatabase.getSRG("AnvilSaveConverter.func_75813_a");

	/**
	 * <p>
	 * Name: convertChunks
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;Ljava/io/File;Lnet/minecraft/world/biome/BiomeProvider;IILnet/minecraft/util/IProgressUpdate;)V]
	 * </p>
	 */
	public static McObfPair func_75811_a = McMappingDatabase.getSRG("AnvilSaveConverter.func_75811_a");

	/**
	 * <p>
	 * Name: addRegionFilesToCollection
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;Ljava/util/Collection;)V]
	 * </p>
	 */
	public static McObfPair func_75810_a = McMappingDatabase.getSRG("AnvilSaveConverter.func_75810_a");

	/**
	 * <p>
	 * Name: createFile
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_75809_f = McMappingDatabase.getSRG("AnvilSaveConverter.func_75809_f");

}

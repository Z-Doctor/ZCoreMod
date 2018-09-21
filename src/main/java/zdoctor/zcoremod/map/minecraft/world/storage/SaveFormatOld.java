package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SaveFormatOld {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfc";
		else
			return "net/minecraft/world/storage/SaveFormatOld";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfc";
		else
			return "SaveFormatOld";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfc;";
		else
			return "Lnet/minecraft/world/storage/SaveFormatOld;";
	}

	/**
	 * <p>
	 * Name: getFile
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_186352_b = McMappingDatabase.getSRG("SaveFormatOld.func_186352_b");

	/**
	 * <p>
	 * Name: deleteWorldDirectory
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_75802_e = McMappingDatabase.getSRG("SaveFormatOld.func_75802_e");

	/**
	 * <p>
	 * Name: getWorldInfo
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/world/storage/WorldInfo;]
	 * </p>
	 */
	public static McObfPair func_75803_c = McMappingDatabase.getSRG("SaveFormatOld.func_75803_c");

	/**
	 * <p>
	 * Name: dataFixer
	 * </p>
	 */
	public static McObfPair field_186354_b = McMappingDatabase.getSRG("field_186354_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151479_b = McMappingDatabase.getSRG("field_151479_b");

	/**
	 * <p>
	 * Name: flushCache
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75800_d = McMappingDatabase.getSRG("SaveFormatOld.func_75800_d");

	/**
	 * <p>
	 * Name: deleteFiles
	 * </p>
	 * <p>
	 * Desc: [([Ljava/io/File;)Z]
	 * </p>
	 */
	public static McObfPair func_75807_a = McMappingDatabase.getSRG("SaveFormatOld.func_75807_a");

	/**
	 * <p>
	 * Name: canLoadWorld
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_90033_f = McMappingDatabase.getSRG("SaveFormatOld.func_90033_f");

	/**
	 * <p>
	 * Name: savesDirectory
	 * </p>
	 */
	public static McObfPair field_75808_a = McMappingDatabase.getSRG("field_75808_a");

	/**
	 * <p>
	 * Name: convertMapFormat
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/util/IProgressUpdate;)Z]
	 * </p>
	 */
	public static McObfPair func_75805_a = McMappingDatabase.getSRG("SaveFormatOld.func_75805_a");

	/**
	 * <p>
	 * Name: isNewLevelIdAcceptable
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_154335_d = McMappingDatabase.getSRG("SaveFormatOld.func_154335_d");

	/**
	 * <p>
	 * Name: getWorldData
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;Lnet/minecraft/util/datafix/DataFixer;)Lnet/minecraft/world/storage/WorldInfo;]
	 * </p>
	 */
	public static McObfPair func_186353_a = McMappingDatabase.getSRG("SaveFormatOld.func_186353_a");

	/**
	 * <p>
	 * Name: getSaveList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_75799_b = McMappingDatabase.getSRG("SaveFormatOld.func_75799_b");

	/**
	 * <p>
	 * Name: renameWorld
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_75806_a = McMappingDatabase.getSRG("SaveFormatOld.func_75806_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_154333_a = McMappingDatabase.getSRG("SaveFormatOld.func_154333_a");

	/**
	 * <p>
	 * Name: getSaveLoader
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Z)Lnet/minecraft/world/storage/ISaveHandler;]
	 * </p>
	 */
	public static McObfPair func_75804_a = McMappingDatabase.getSRG("SaveFormatOld.func_75804_a");

	/**
	 * <p>
	 * Name: isOldMapFormat
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_75801_b = McMappingDatabase.getSRG("SaveFormatOld.func_75801_b");

	/**
	 * <p>
	 * Name: isConvertible
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_154334_a = McMappingDatabase.getSRG("SaveFormatOld.func_154334_a");

}

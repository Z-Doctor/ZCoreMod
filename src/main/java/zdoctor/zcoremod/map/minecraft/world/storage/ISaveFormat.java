package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ISaveFormat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfg";
		else
			return "net/minecraft/world/storage/ISaveFormat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfg";
		else
			return "ISaveFormat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfg;";
		else
			return "Lnet/minecraft/world/storage/ISaveFormat;";
	}

	/**
	 * <p>
	 * Name: convertMapFormat
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/util/IProgressUpdate;)Z]
	 * </p>
	 */
	public static McObfPair func_75805_a = McMappingDatabase.getSRG("ISaveFormat.func_75805_a");

	/**
	 * <p>
	 * Name: deleteWorldDirectory
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_75802_e = McMappingDatabase.getSRG("ISaveFormat.func_75802_e");

	/**
	 * <p>
	 * Name: getFile
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_186352_b = McMappingDatabase.getSRG("ISaveFormat.func_186352_b");

	/**
	 * <p>
	 * Name: flushCache
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75800_d = McMappingDatabase.getSRG("ISaveFormat.func_75800_d");

	/**
	 * <p>
	 * Name: isOldMapFormat
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_75801_b = McMappingDatabase.getSRG("ISaveFormat.func_75801_b");

	/**
	 * <p>
	 * Name: isNewLevelIdAcceptable
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_154335_d = McMappingDatabase.getSRG("ISaveFormat.func_154335_d");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_154333_a = McMappingDatabase.getSRG("ISaveFormat.func_154333_a");

	/**
	 * <p>
	 * Name: getSaveLoader
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Z)Lnet/minecraft/world/storage/ISaveHandler;]
	 * </p>
	 */
	public static McObfPair func_75804_a = McMappingDatabase.getSRG("ISaveFormat.func_75804_a");

	/**
	 * <p>
	 * Name: getSaveList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_75799_b = McMappingDatabase.getSRG("ISaveFormat.func_75799_b");

	/**
	 * <p>
	 * Name: getWorldInfo
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/world/storage/WorldInfo;]
	 * </p>
	 */
	public static McObfPair func_75803_c = McMappingDatabase.getSRG("ISaveFormat.func_75803_c");

	/**
	 * <p>
	 * Name: isConvertible
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_154334_a = McMappingDatabase.getSRG("ISaveFormat.func_154334_a");

	/**
	 * <p>
	 * Name: canLoadWorld
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_90033_f = McMappingDatabase.getSRG("ISaveFormat.func_90033_f");

	/**
	 * <p>
	 * Name: renameWorld
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_75806_a = McMappingDatabase.getSRG("ISaveFormat.func_75806_a");

}

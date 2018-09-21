package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ISaveHandler {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfe";
		else
			return "net/minecraft/world/storage/ISaveHandler";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfe";
		else
			return "ISaveHandler";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfe;";
		else
			return "Lnet/minecraft/world/storage/ISaveHandler;";
	}

	/**
	 * <p>
	 * Name: loadWorldInfo
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/storage/WorldInfo;]
	 * </p>
	 */
	public static McObfPair func_75757_d = McMappingDatabase.getSRG("ISaveHandler.func_75757_d");

	/**
	 * <p>
	 * Name: getMapFileFromName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_75758_b = McMappingDatabase.getSRG("ISaveHandler.func_75758_b");

	/**
	 * <p>
	 * Name: saveWorldInfoWithPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/WorldInfo;Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_75755_a = McMappingDatabase.getSRG("ISaveHandler.func_75755_a");

	/**
	 * <p>
	 * Name: checkSessionLock
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75762_c = McMappingDatabase.getSRG("ISaveHandler.func_75762_c");

	/**
	 * <p>
	 * Name: flush
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75759_a = McMappingDatabase.getSRG("ISaveHandler.func_75759_a");

	/**
	 * <p>
	 * Name: getWorldDirectory
	 * </p>
	 * <p>
	 * Desc: [()Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_75765_b = McMappingDatabase.getSRG("ISaveHandler.func_75765_b");

	/**
	 * <p>
	 * Name: saveWorldInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/WorldInfo;)V]
	 * </p>
	 */
	public static McObfPair func_75761_a = McMappingDatabase.getSRG("ISaveHandler.func_75761_a");

	/**
	 * <p>
	 * Name: getPlayerNBTManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/storage/IPlayerFileData;]
	 * </p>
	 */
	public static McObfPair func_75756_e = McMappingDatabase.getSRG("ISaveHandler.func_75756_e");

	/**
	 * <p>
	 * Name: getChunkLoader
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldProvider;)Lnet/minecraft/world/chunk/storage/IChunkLoader;]
	 * </p>
	 */
	public static McObfPair func_75763_a = McMappingDatabase.getSRG("ISaveHandler.func_75763_a");

	/**
	 * <p>
	 * Name: getStructureTemplateManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/gen/structure/template/TemplateManager;]
	 * </p>
	 */
	public static McObfPair func_186340_h = McMappingDatabase.getSRG("ISaveHandler.func_186340_h");

}

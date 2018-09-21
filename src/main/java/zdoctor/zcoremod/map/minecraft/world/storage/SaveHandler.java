package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SaveHandler {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfb";
		else
			return "net/minecraft/world/storage/SaveHandler";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfb";
		else
			return "SaveHandler";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfb;";
		else
			return "Lnet/minecraft/world/storage/SaveHandler;";
	}

	/**
	 * <p>
	 * Name: getMapFileFromName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_75758_b = McMappingDatabase.getSRG("SaveHandler.func_75758_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151478_a = McMappingDatabase.getSRG("field_151478_a");

	/**
	 * <p>
	 * Name: loadWorldInfo
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/storage/WorldInfo;]
	 * </p>
	 */
	public static McObfPair func_75757_d = McMappingDatabase.getSRG("SaveHandler.func_75757_d");

	/**
	 * <p>
	 * Name: worldDirectory
	 * </p>
	 */
	public static McObfPair field_75770_b = McMappingDatabase.getSRG("field_75770_b");

	/**
	 * <p>
	 * Name: getPlayerNBTManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/storage/IPlayerFileData;]
	 * </p>
	 */
	public static McObfPair func_75756_e = McMappingDatabase.getSRG("SaveHandler.func_75756_e");

	/**
	 * <p>
	 * Name: writePlayerData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_75753_a = McMappingDatabase.getSRG("SaveHandler.func_75753_a");

	/**
	 * <p>
	 * Name: playersDirectory
	 * </p>
	 */
	public static McObfPair field_75771_c = McMappingDatabase.getSRG("field_75771_c");

	/**
	 * <p>
	 * Name: saveWorldInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/WorldInfo;)V]
	 * </p>
	 */
	public static McObfPair func_75761_a = McMappingDatabase.getSRG("SaveHandler.func_75761_a");

	/**
	 * <p>
	 * Name: saveWorldInfoWithPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/WorldInfo;Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_75755_a = McMappingDatabase.getSRG("SaveHandler.func_75755_a");

	/**
	 * <p>
	 * Name: structureTemplateManager
	 * </p>
	 */
	public static McObfPair field_186342_h = McMappingDatabase.getSRG("field_186342_h");

	/**
	 * <p>
	 * Name: flush
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75759_a = McMappingDatabase.getSRG("SaveHandler.func_75759_a");

	/**
	 * <p>
	 * Name: saveDirectoryName
	 * </p>
	 */
	public static McObfPair field_75767_f = McMappingDatabase.getSRG("field_75767_f");

	/**
	 * <p>
	 * Name: setSessionLock
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75766_h = McMappingDatabase.getSRG("SaveHandler.func_75766_h");

	/**
	 * <p>
	 * Name: getAvailablePlayerDat
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_75754_f = McMappingDatabase.getSRG("SaveHandler.func_75754_f");

	/**
	 * <p>
	 * Name: initializationTime
	 * </p>
	 */
	public static McObfPair field_75769_e = McMappingDatabase.getSRG("field_75769_e");

	/**
	 * <p>
	 * Name: getStructureTemplateManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/gen/structure/template/TemplateManager;]
	 * </p>
	 */
	public static McObfPair func_186340_h = McMappingDatabase.getSRG("SaveHandler.func_186340_h");

	/**
	 * <p>
	 * Name: mapDataDir
	 * </p>
	 */
	public static McObfPair field_75768_d = McMappingDatabase.getSRG("field_75768_d");

	/**
	 * <p>
	 * Name: getChunkLoader
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldProvider;)Lnet/minecraft/world/chunk/storage/IChunkLoader;]
	 * </p>
	 */
	public static McObfPair func_75763_a = McMappingDatabase.getSRG("SaveHandler.func_75763_a");

	/**
	 * <p>
	 * Name: dataFixer
	 * </p>
	 */
	public static McObfPair field_186341_a = McMappingDatabase.getSRG("field_186341_a");

	/**
	 * <p>
	 * Name: checkSessionLock
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75762_c = McMappingDatabase.getSRG("SaveHandler.func_75762_c");

	/**
	 * <p>
	 * Name: readPlayerData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_75752_b = McMappingDatabase.getSRG("SaveHandler.func_75752_b");

	/**
	 * <p>
	 * Name: getWorldDirectory
	 * </p>
	 * <p>
	 * Desc: [()Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_75765_b = McMappingDatabase.getSRG("SaveHandler.func_75765_b");

}

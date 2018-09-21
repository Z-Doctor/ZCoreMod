package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SaveDataMemoryStorage {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfl";
		else
			return "net/minecraft/world/storage/SaveDataMemoryStorage";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfl";
		else
			return "SaveDataMemoryStorage";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfl;";
		else
			return "Lnet/minecraft/world/storage/SaveDataMemoryStorage;";
	}

	/**
	 * <p>
	 * Name: saveAllData
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75744_a = McMappingDatabase.getSRG("SaveDataMemoryStorage.func_75744_a");

	/**
	 * <p>
	 * Name: setData
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/world/storage/WorldSavedData;)V]
	 * </p>
	 */
	public static McObfPair func_75745_a = McMappingDatabase.getSRG("SaveDataMemoryStorage.func_75745_a");

	/**
	 * <p>
	 * Name: getOrLoadData
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Ljava/lang/String;)Lnet/minecraft/world/storage/WorldSavedData;]
	 * </p>
	 */
	public static McObfPair func_75742_a = McMappingDatabase.getSRG("SaveDataMemoryStorage.func_75742_a");

	/**
	 * <p>
	 * Name: getUniqueDataId
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_75743_a = McMappingDatabase.getSRG("SaveDataMemoryStorage.func_75743_a");

}

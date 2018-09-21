package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapStorage {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfm";
		else
			return "net/minecraft/world/storage/MapStorage";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfm";
		else
			return "MapStorage";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfm;";
		else
			return "Lnet/minecraft/world/storage/MapStorage;";
	}

	/**
	 * <p>
	 * Name: idCounts
	 * </p>
	 */
	public static McObfPair field_75748_d = McMappingDatabase.getSRG("field_75748_d");

	/**
	 * <p>
	 * Name: loadIdCounts
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75746_b = McMappingDatabase.getSRG("MapStorage.func_75746_b");

	/**
	 * <p>
	 * Name: saveHandler
	 * </p>
	 */
	public static McObfPair field_75751_a = McMappingDatabase.getSRG("field_75751_a");

	/**
	 * <p>
	 * Name: loadedDataMap
	 * </p>
	 */
	public static McObfPair field_75749_b = McMappingDatabase.getSRG("field_75749_b");

	/**
	 * <p>
	 * Name: setData
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/world/storage/WorldSavedData;)V]
	 * </p>
	 */
	public static McObfPair func_75745_a = McMappingDatabase.getSRG("MapStorage.func_75745_a");

	/**
	 * <p>
	 * Name: getOrLoadData
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Ljava/lang/String;)Lnet/minecraft/world/storage/WorldSavedData;]
	 * </p>
	 */
	public static McObfPair func_75742_a = McMappingDatabase.getSRG("MapStorage.func_75742_a");

	/**
	 * <p>
	 * Name: loadedDataList
	 * </p>
	 */
	public static McObfPair field_75750_c = McMappingDatabase.getSRG("field_75750_c");

	/**
	 * <p>
	 * Name: getUniqueDataId
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_75743_a = McMappingDatabase.getSRG("MapStorage.func_75743_a");

	/**
	 * <p>
	 * Name: saveData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/WorldSavedData;)V]
	 * </p>
	 */
	public static McObfPair func_75747_a = McMappingDatabase.getSRG("MapStorage.func_75747_a");

	/**
	 * <p>
	 * Name: saveAllData
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75744_a = McMappingDatabase.getSRG("MapStorage.func_75744_a");

}

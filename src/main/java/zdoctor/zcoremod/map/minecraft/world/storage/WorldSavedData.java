package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldSavedData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bet";
		else
			return "net/minecraft/world/storage/WorldSavedData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bet";
		else
			return "WorldSavedData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbet;";
		else
			return "Lnet/minecraft/world/storage/WorldSavedData;";
	}

	/**
	 * <p>
	 * Name: markDirty
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76185_a = McMappingDatabase.getSRG("WorldSavedData.func_76185_a");

	/**
	 * <p>
	 * Name: mapName
	 * </p>
	 */
	public static McObfPair field_76190_i = McMappingDatabase.getSRG("field_76190_i");

	/**
	 * <p>
	 * Name: setDirty
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_76186_a = McMappingDatabase.getSRG("WorldSavedData.func_76186_a");

	/**
	 * <p>
	 * Name: isDirty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76188_b = McMappingDatabase.getSRG("WorldSavedData.func_76188_b");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_76184_a = McMappingDatabase.getSRG("WorldSavedData.func_76184_a");

	/**
	 * <p>
	 * Name: dirty
	 * </p>
	 */
	public static McObfPair field_76189_a = McMappingDatabase.getSRG("field_76189_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189551_b = McMappingDatabase.getSRG("WorldSavedData.func_189551_b");

}

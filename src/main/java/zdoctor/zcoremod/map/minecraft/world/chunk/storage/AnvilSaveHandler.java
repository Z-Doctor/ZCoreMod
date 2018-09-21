package zdoctor.zcoremod.map.minecraft.world.chunk.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AnvilSaveHandler {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bey";
		else
			return "net/minecraft/world/chunk/storage/AnvilSaveHandler";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bey";
		else
			return "AnvilSaveHandler";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbey;";
		else
			return "Lnet/minecraft/world/chunk/storage/AnvilSaveHandler;";
	}

	/**
	 * <p>
	 * Name: flush
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75759_a = McMappingDatabase.getSRG("AnvilSaveHandler.func_75759_a");

	/**
	 * <p>
	 * Name: getChunkLoader
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldProvider;)Lnet/minecraft/world/chunk/storage/IChunkLoader;]
	 * </p>
	 */
	public static McObfPair func_75763_a = McMappingDatabase.getSRG("AnvilSaveHandler.func_75763_a");

	/**
	 * <p>
	 * Name: saveWorldInfoWithPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/WorldInfo;Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_75755_a = McMappingDatabase.getSRG("AnvilSaveHandler.func_75755_a");

}

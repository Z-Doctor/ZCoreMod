package zdoctor.zcoremod.map.minecraft.world.chunk.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkLoader {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayi";
		else
			return "net/minecraft/world/chunk/storage/ChunkLoader";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayi";
		else
			return "ChunkLoader";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layi;";
		else
			return "Lnet/minecraft/world/chunk/storage/ChunkLoader;";
	}

	/**
	 * <p>
	 * Name: convertToAnvilFormat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/storage/ChunkLoader$AnvilConverterData;Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/biome/BiomeProvider;)V]
	 * </p>
	 */
	public static McObfPair func_76690_a = McMappingDatabase.getSRG("ChunkLoader.func_76690_a");

	/**
	 * <p>
	 * Name: load
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/world/chunk/storage/ChunkLoader$AnvilConverterData;]
	 * </p>
	 */
	public static McObfPair func_76691_a = McMappingDatabase.getSRG("ChunkLoader.func_76691_a");

}

package zdoctor.zcoremod.map.minecraft.world.chunk.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IChunkLoader {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayf";
		else
			return "net/minecraft/world/chunk/storage/IChunkLoader";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayf";
		else
			return "IChunkLoader";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layf;";
		else
			return "Lnet/minecraft/world/chunk/storage/IChunkLoader;";
	}

	/**
	 * <p>
	 * Name: saveExtraChunkData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/chunk/Chunk;)V]
	 * </p>
	 */
	public static McObfPair func_75819_b = McMappingDatabase.getSRG("IChunkLoader.func_75819_b");

	/**
	 * <p>
	 * Name: saveChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/chunk/Chunk;)V]
	 * </p>
	 */
	public static McObfPair func_75816_a = McMappingDatabase.getSRG("IChunkLoader.func_75816_a");

	/**
	 * <p>
	 * Name: chunkTick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75817_a = McMappingDatabase.getSRG("IChunkLoader.func_75817_a");

	/**
	 * <p>
	 * Name: loadChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_75815_a = McMappingDatabase.getSRG("IChunkLoader.func_75815_a");

	/**
	 * <p>
	 * Name: isChunkGeneratedAt
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_191063_a = McMappingDatabase.getSRG("IChunkLoader.func_191063_a");

	/**
	 * <p>
	 * Name: flush
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75818_b = McMappingDatabase.getSRG("IChunkLoader.func_75818_b");

}

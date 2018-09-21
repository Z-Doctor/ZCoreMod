package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkProviderServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "on";
		else
			return "net/minecraft/world/gen/ChunkProviderServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "on";
		else
			return "ChunkProviderServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lon;";
		else
			return "Lnet/minecraft/world/gen/ChunkProviderServer;";
	}

	/**
	 * <p>
	 * Name: saveChunkData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;)V]
	 * </p>
	 */
	public static McObfPair func_73242_b = McMappingDatabase.getSRG("ChunkProviderServer.func_73242_b");

	/**
	 * <p>
	 * Name: getNearestStructurePos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180513_a = McMappingDatabase.getSRG("ChunkProviderServer.func_180513_a");

	/**
	 * <p>
	 * Name: queueUnload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;)V]
	 * </p>
	 */
	public static McObfPair func_189549_a = McMappingDatabase.getSRG("ChunkProviderServer.func_189549_a");

	/**
	 * <p>
	 * Name: droppedChunksSet
	 * </p>
	 */
	public static McObfPair field_73248_b = McMappingDatabase.getSRG("field_73248_b");

	/**
	 * <p>
	 * Name: saveChunkExtraData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;)V]
	 * </p>
	 */
	public static McObfPair func_73243_a = McMappingDatabase.getSRG("ChunkProviderServer.func_73243_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147417_b = McMappingDatabase.getSRG("field_147417_b");

	/**
	 * <p>
	 * Name: makeString
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_73148_d = McMappingDatabase.getSRG("ChunkProviderServer.func_73148_d");

	/**
	 * <p>
	 * Name: chunkLoader
	 * </p>
	 */
	public static McObfPair field_73247_e = McMappingDatabase.getSRG("field_73247_e");

	/**
	 * <p>
	 * Name: id2ChunkMap
	 * </p>
	 */
	public static McObfPair field_73244_f = McMappingDatabase.getSRG("field_73244_f");

	/**
	 * <p>
	 * Name: getLoadedChunks
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_189548_a = McMappingDatabase.getSRG("ChunkProviderServer.func_189548_a");

	/**
	 * <p>
	 * Name: loadChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_186028_c = McMappingDatabase.getSRG("ChunkProviderServer.func_186028_c");

	/**
	 * <p>
	 * Name: isChunkGeneratedAt
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_191062_e = McMappingDatabase.getSRG("ChunkProviderServer.func_191062_e");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_73251_h = McMappingDatabase.getSRG("field_73251_h");

	/**
	 * <p>
	 * Name: canSave
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73157_c = McMappingDatabase.getSRG("ChunkProviderServer.func_73157_c");

	/**
	 * <p>
	 * Name: loadChunkFromFile
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_73239_e = McMappingDatabase.getSRG("ChunkProviderServer.func_73239_e");

	/**
	 * <p>
	 * Name: saveChunks
	 * </p>
	 * <p>
	 * Desc: [(Z)Z]
	 * </p>
	 */
	public static McObfPair func_186027_a = McMappingDatabase.getSRG("ChunkProviderServer.func_186027_a");

	/**
	 * <p>
	 * Name: chunkGenerator
	 * </p>
	 */
	public static McObfPair field_186029_c = McMappingDatabase.getSRG("field_186029_c");

	/**
	 * <p>
	 * Name: getLoadedChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_186026_b = McMappingDatabase.getSRG("ChunkProviderServer.func_186026_b");

	/**
	 * <p>
	 * Name: chunkExists
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_73149_a = McMappingDatabase.getSRG("ChunkProviderServer.func_73149_a");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73156_b = McMappingDatabase.getSRG("ChunkProviderServer.func_73156_b");

	/**
	 * <p>
	 * Name: provideChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_186025_d = McMappingDatabase.getSRG("ChunkProviderServer.func_186025_d");

	/**
	 * <p>
	 * Name: isInsideStructure
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_193413_a = McMappingDatabase.getSRG("ChunkProviderServer.func_193413_a");

	/**
	 * <p>
	 * Name: queueUnloadAll
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73240_a = McMappingDatabase.getSRG("ChunkProviderServer.func_73240_a");

	/**
	 * <p>
	 * Name: getLoadedChunkCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_73152_e = McMappingDatabase.getSRG("ChunkProviderServer.func_73152_e");

	/**
	 * <p>
	 * Name: getPossibleCreatures
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EnumCreatureType;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_177458_a = McMappingDatabase.getSRG("ChunkProviderServer.func_177458_a");

	/**
	 * <p>
	 * Name: flushToDisk
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_104112_b = McMappingDatabase.getSRG("ChunkProviderServer.func_104112_b");

}

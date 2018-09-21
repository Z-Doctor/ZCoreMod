package zdoctor.zcoremod.map.minecraft.client.multiplayer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkProviderClient {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brx";
		else
			return "net/minecraft/client/multiplayer/ChunkProviderClient";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brx";
		else
			return "ChunkProviderClient";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrx;";
		else
			return "Lnet/minecraft/client/multiplayer/ChunkProviderClient;";
	}

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_73235_d = McMappingDatabase.getSRG("field_73235_d");

	/**
	 * <p>
	 * Name: isChunkGeneratedAt
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_191062_e = McMappingDatabase.getSRG("ChunkProviderClient.func_191062_e");

	/**
	 * <p>
	 * Name: blankChunk
	 * </p>
	 */
	public static McObfPair field_73238_a = McMappingDatabase.getSRG("field_73238_a");

	/**
	 * <p>
	 * Name: getLoadedChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_186026_b = McMappingDatabase.getSRG("ChunkProviderClient.func_186026_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147436_a = McMappingDatabase.getSRG("field_147436_a");

	/**
	 * <p>
	 * Name: makeString
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_73148_d = McMappingDatabase.getSRG("ChunkProviderClient.func_73148_d");

	/**
	 * <p>
	 * Name: loadChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_73158_c = McMappingDatabase.getSRG("ChunkProviderClient.func_73158_c");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73156_b = McMappingDatabase.getSRG("ChunkProviderClient.func_73156_b");

	/**
	 * <p>
	 * Name: chunkMapping
	 * </p>
	 */
	public static McObfPair field_73236_b = McMappingDatabase.getSRG("field_73236_b");

	/**
	 * <p>
	 * Name: unloadChunk
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_73234_b = McMappingDatabase.getSRG("ChunkProviderClient.func_73234_b");

	/**
	 * <p>
	 * Name: provideChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_186025_d = McMappingDatabase.getSRG("ChunkProviderClient.func_186025_d");

}

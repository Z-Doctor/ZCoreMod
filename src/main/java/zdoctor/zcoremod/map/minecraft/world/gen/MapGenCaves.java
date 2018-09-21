package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenCaves {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aza";
		else
			return "net/minecraft/world/gen/MapGenCaves";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aza";
		else
			return "MapGenCaves";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laza;";
		else
			return "Lnet/minecraft/world/gen/MapGenCaves;";
	}

	/**
	 * <p>
	 * Name: addRoom
	 * </p>
	 * <p>
	 * Desc: [(JIILnet/minecraft/world/chunk/ChunkPrimer;DDD)V]
	 * </p>
	 */
	public static McObfPair func_180703_a = McMappingDatabase.getSRG("MapGenCaves.func_180703_a");

	/**
	 * <p>
	 * Name: canReplaceBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_175793_a = McMappingDatabase.getSRG("MapGenCaves.func_175793_a");

	/**
	 * <p>
	 * Name: BLK_SANDSTONE
	 * </p>
	 */
	public static McObfPair field_186128_c = McMappingDatabase.getSRG("field_186128_c");

	/**
	 * <p>
	 * Name: BLK_LAVA
	 * </p>
	 */
	public static McObfPair field_186126_a = McMappingDatabase.getSRG("field_186126_a");

	/**
	 * <p>
	 * Name: recursiveGenerate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V]
	 * </p>
	 */
	public static McObfPair func_180701_a = McMappingDatabase.getSRG("MapGenCaves.func_180701_a");

	/**
	 * <p>
	 * Name: BLK_AIR
	 * </p>
	 */
	public static McObfPair field_186127_b = McMappingDatabase.getSRG("field_186127_b");

	/**
	 * <p>
	 * Name: BLK_RED_SANDSTONE
	 * </p>
	 */
	public static McObfPair field_186129_d = McMappingDatabase.getSRG("field_186129_d");

	/**
	 * <p>
	 * Name: addTunnel
	 * </p>
	 * <p>
	 * Desc: [(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V]
	 * </p>
	 */
	public static McObfPair func_180702_a = McMappingDatabase.getSRG("MapGenCaves.func_180702_a");

}

package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldEntitySpawner {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anb";
		else
			return "net/minecraft/world/WorldEntitySpawner";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anb";
		else
			return "WorldEntitySpawner";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanb;";
		else
			return "Lnet/minecraft/world/WorldEntitySpawner;";
	}

	/**
	 * <p>
	 * Name: getRandomChunkPosition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;II)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180621_a = McMappingDatabase.getSRG("WorldEntitySpawner.func_180621_a");

	/**
	 * <p>
	 * Name: performWorldGenSpawning
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_77191_a = McMappingDatabase.getSRG("WorldEntitySpawner.func_77191_a");

	/**
	 * <p>
	 * Name: MOB_COUNT_DIV
	 * </p>
	 */
	public static McObfPair field_180268_a = McMappingDatabase.getSRG("field_180268_a");

	/**
	 * <p>
	 * Name: findChunksForSpawning
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldServer;ZZZ)I]
	 * </p>
	 */
	public static McObfPair func_77192_a = McMappingDatabase.getSRG("WorldEntitySpawner.func_77192_a");

	/**
	 * <p>
	 * Name: canCreatureTypeSpawnAtLocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLiving$SpawnPlacementType;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180267_a = McMappingDatabase.getSRG("WorldEntitySpawner.func_180267_a");

	/**
	 * <p>
	 * Name: isValidEmptySpawnBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_185331_a = McMappingDatabase.getSRG("WorldEntitySpawner.func_185331_a");

	/**
	 * <p>
	 * Name: eligibleChunksForSpawning
	 * </p>
	 */
	public static McObfPair field_77193_b = McMappingDatabase.getSRG("field_77193_b");

}

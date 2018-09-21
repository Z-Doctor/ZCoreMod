package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityMobSpawner$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avy$1";
		else
			return "net/minecraft/tileentity/TileEntityMobSpawner$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avy$1";
		else
			return "TileEntityMobSpawner$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavy$1;";
		else
			return "Lnet/minecraft/tileentity/TileEntityMobSpawner$1;";
	}

	/**
	 * <p>
	 * Name: broadcastEvent
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_98267_a = McMappingDatabase.getSRG("TileEntityMobSpawner$1.func_98267_a");

	/**
	 * <p>
	 * Name: getSpawnerWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_98271_a = McMappingDatabase.getSRG("TileEntityMobSpawner$1.func_98271_a");

	/**
	 * <p>
	 * Name: getSpawnerPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177221_b = McMappingDatabase.getSRG("TileEntityMobSpawner$1.func_177221_b");

	/**
	 * <p>
	 * Name: setNextSpawnData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/WeightedSpawnerEntity;)V]
	 * </p>
	 */
	public static McObfPair func_184993_a = McMappingDatabase.getSRG("TileEntityMobSpawner$1.func_184993_a");

}

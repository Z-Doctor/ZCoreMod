package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityMinecartMobSpawner$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afl$1";
		else
			return "net/minecraft/entity/item/EntityMinecartMobSpawner$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afl$1";
		else
			return "EntityMinecartMobSpawner$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafl$1;";
		else
			return "Lnet/minecraft/entity/item/EntityMinecartMobSpawner$1;";
	}

	/**
	 * <p>
	 * Name: getSpawnerWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_98271_a = McMappingDatabase.getSRG("EntityMinecartMobSpawner$1.func_98271_a");

	/**
	 * <p>
	 * Name: broadcastEvent
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_98267_a = McMappingDatabase.getSRG("EntityMinecartMobSpawner$1.func_98267_a");

	/**
	 * <p>
	 * Name: getSpawnerPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177221_b = McMappingDatabase.getSRG("EntityMinecartMobSpawner$1.func_177221_b");

}

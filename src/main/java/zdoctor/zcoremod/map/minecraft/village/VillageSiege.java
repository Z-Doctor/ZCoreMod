package zdoctor.zcoremod.map.minecraft.village;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class VillageSiege {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zp";
		else
			return "net/minecraft/village/VillageSiege";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zp";
		else
			return "VillageSiege";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lzp;";
		else
			return "Lnet/minecraft/village/VillageSiege;";
	}

	/**
	 * <p>
	 * Name: spawnZ
	 * </p>
	 */
	public static McObfPair field_75539_i = McMappingDatabase.getSRG("field_75539_i");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75528_a = McMappingDatabase.getSRG("VillageSiege.func_75528_a");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_75537_a = McMappingDatabase.getSRG("field_75537_a");

	/**
	 * <p>
	 * Name: hasSetupSiege
	 * </p>
	 */
	public static McObfPair field_75535_b = McMappingDatabase.getSRG("field_75535_b");

	/**
	 * <p>
	 * Name: spawnZombie
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75530_c = McMappingDatabase.getSRG("VillageSiege.func_75530_c");

	/**
	 * <p>
	 * Name: village
	 * </p>
	 */
	public static McObfPair field_75531_f = McMappingDatabase.getSRG("field_75531_f");

	/**
	 * <p>
	 * Name: nextSpawnTime
	 * </p>
	 */
	public static McObfPair field_75534_e = McMappingDatabase.getSRG("field_75534_e");

	/**
	 * <p>
	 * Name: spawnY
	 * </p>
	 */
	public static McObfPair field_75538_h = McMappingDatabase.getSRG("field_75538_h");

	/**
	 * <p>
	 * Name: siegeCount
	 * </p>
	 */
	public static McObfPair field_75533_d = McMappingDatabase.getSRG("field_75533_d");

	/**
	 * <p>
	 * Name: spawnX
	 * </p>
	 */
	public static McObfPair field_75532_g = McMappingDatabase.getSRG("field_75532_g");

	/**
	 * <p>
	 * Name: findRandomSpawnPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_179867_a = McMappingDatabase.getSRG("VillageSiege.func_179867_a");

	/**
	 * <p>
	 * Name: siegeState
	 * </p>
	 */
	public static McObfPair field_75536_c = McMappingDatabase.getSRG("field_75536_c");

	/**
	 * <p>
	 * Name: trySetupSiege
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75529_b = McMappingDatabase.getSRG("VillageSiege.func_75529_b");

}

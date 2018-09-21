package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityWaterMob {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aal";
		else
			return "net/minecraft/entity/passive/EntityWaterMob";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aal";
		else
			return "EntityWaterMob";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laal;";
		else
			return "Lnet/minecraft/entity/passive/EntityWaterMob;";
	}

	/**
	 * <p>
	 * Name: isPushedByWater
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_96092_aw = McMappingDatabase.getSRG("EntityWaterMob.func_96092_aw");

	/**
	 * <p>
	 * Name: onEntityUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70030_z = McMappingDatabase.getSRG("EntityWaterMob.func_70030_z");

	/**
	 * <p>
	 * Name: getExperiencePoints
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)I]
	 * </p>
	 */
	public static McObfPair func_70693_a = McMappingDatabase.getSRG("EntityWaterMob.func_70693_a");

	/**
	 * <p>
	 * Name: getTalkInterval
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70627_aG = McMappingDatabase.getSRG("EntityWaterMob.func_70627_aG");

	/**
	 * <p>
	 * Name: canBreatheUnderwater
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70648_aU = McMappingDatabase.getSRG("EntityWaterMob.func_70648_aU");

	/**
	 * <p>
	 * Name: isNotColliding
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70058_J = McMappingDatabase.getSRG("EntityWaterMob.func_70058_J");

	/**
	 * <p>
	 * Name: canDespawn
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70692_ba = McMappingDatabase.getSRG("EntityWaterMob.func_70692_ba");

	/**
	 * <p>
	 * Name: getCanSpawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70601_bi = McMappingDatabase.getSRG("EntityWaterMob.func_70601_bi");

}

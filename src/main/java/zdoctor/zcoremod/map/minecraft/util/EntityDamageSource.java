package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityDamageSource {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "us";
		else
			return "net/minecraft/util/EntityDamageSource";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "us";
		else
			return "EntityDamageSource";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lus;";
		else
			return "Lnet/minecraft/util/EntityDamageSource;";
	}

	/**
	 * <p>
	 * Name: isThornsDamage
	 * </p>
	 */
	public static McObfPair field_180140_r = McMappingDatabase.getSRG("field_180140_r");

	/**
	 * <p>
	 * Name: getTrueSource
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_76346_g = McMappingDatabase.getSRG("EntityDamageSource.func_76346_g");

	/**
	 * <p>
	 * Name: isDifficultyScaled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76350_n = McMappingDatabase.getSRG("EntityDamageSource.func_76350_n");

	/**
	 * <p>
	 * Name: getDamageLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_188404_v = McMappingDatabase.getSRG("EntityDamageSource.func_188404_v");

	/**
	 * <p>
	 * Name: getDeathMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_151519_b = McMappingDatabase.getSRG("EntityDamageSource.func_151519_b");

	/**
	 * <p>
	 * Name: setIsThornsDamage
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EntityDamageSource;]
	 * </p>
	 */
	public static McObfPair func_180138_v = McMappingDatabase.getSRG("EntityDamageSource.func_180138_v");

	/**
	 * <p>
	 * Name: getIsThornsDamage
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_180139_w = McMappingDatabase.getSRG("EntityDamageSource.func_180139_w");

	/**
	 * <p>
	 * Name: damageSourceEntity
	 * </p>
	 */
	public static McObfPair field_76386_o = McMappingDatabase.getSRG("field_76386_o");

}

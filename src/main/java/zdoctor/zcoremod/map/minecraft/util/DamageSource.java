package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DamageSource {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ur";
		else
			return "net/minecraft/util/DamageSource";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ur";
		else
			return "DamageSource";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lur;";
		else
			return "Lnet/minecraft/util/DamageSource;";
	}

	/**
	 * <p>
	 * Name: setFireDamage
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_76361_j = McMappingDatabase.getSRG("DamageSource.func_76361_j");

	/**
	 * <p>
	 * Name: causeMobDamage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_76358_a = McMappingDatabase.getSRG("DamageSource.func_76358_a");

	/**
	 * <p>
	 * Name: IN_WALL
	 * </p>
	 */
	public static McObfPair field_76368_d = McMappingDatabase.getSRG("field_76368_d");

	/**
	 * <p>
	 * Name: canHarmInCreative
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76357_e = McMappingDatabase.getSRG("DamageSource.func_76357_e");

	/**
	 * <p>
	 * Name: setExplosion
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_94540_d = McMappingDatabase.getSRG("DamageSource.func_94540_d");

	/**
	 * <p>
	 * Name: FALL
	 * </p>
	 */
	public static McObfPair field_76379_h = McMappingDatabase.getSRG("field_76379_h");

	/**
	 * <p>
	 * Name: causeThrownDamage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_76356_a = McMappingDatabase.getSRG("DamageSource.func_76356_a");

	/**
	 * <p>
	 * Name: GENERIC
	 * </p>
	 */
	public static McObfPair field_76377_j = McMappingDatabase.getSRG("field_76377_j");

	/**
	 * <p>
	 * Name: isCreativePlayer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_180136_u = McMappingDatabase.getSRG("DamageSource.func_180136_u");

	/**
	 * <p>
	 * Name: getDamageType
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_76355_l = McMappingDatabase.getSRG("DamageSource.func_76355_l");

	/**
	 * <p>
	 * Name: FALLING_BLOCK
	 * </p>
	 */
	public static McObfPair field_82729_p = McMappingDatabase.getSRG("field_82729_p");

	/**
	 * <p>
	 * Name: LIGHTNING_BOLT
	 * </p>
	 */
	public static McObfPair field_180137_b = McMappingDatabase.getSRG("field_180137_b");

	/**
	 * <p>
	 * Name: isUnblockable
	 * </p>
	 */
	public static McObfPair field_76374_o = McMappingDatabase.getSRG("field_76374_o");

	/**
	 * <p>
	 * Name: fireDamage
	 * </p>
	 */
	public static McObfPair field_76383_r = McMappingDatabase.getSRG("field_76383_r");

	/**
	 * <p>
	 * Name: difficultyScaled
	 * </p>
	 */
	public static McObfPair field_76381_t = McMappingDatabase.getSRG("field_76381_t");

	/**
	 * <p>
	 * Name: causeIndirectDamage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_188403_a = McMappingDatabase.getSRG("DamageSource.func_188403_a");

	/**
	 * <p>
	 * Name: damageIsAbsolute
	 * </p>
	 */
	public static McObfPair field_151520_r = McMappingDatabase.getSRG("field_151520_r");

	/**
	 * <p>
	 * Name: IN_FIRE
	 * </p>
	 */
	public static McObfPair field_76372_a = McMappingDatabase.getSRG("field_76372_a");

	/**
	 * <p>
	 * Name: DROWN
	 * </p>
	 */
	public static McObfPair field_76369_e = McMappingDatabase.getSRG("field_76369_e");

	/**
	 * <p>
	 * Name: setProjectile
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_76349_b = McMappingDatabase.getSRG("DamageSource.func_76349_b");

	/**
	 * <p>
	 * Name: getHungerDamage
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_76345_d = McMappingDatabase.getSRG("DamageSource.func_76345_d");

	/**
	 * <p>
	 * Name: STARVE
	 * </p>
	 */
	public static McObfPair field_76366_f = McMappingDatabase.getSRG("field_76366_f");

	/**
	 * <p>
	 * Name: ON_FIRE
	 * </p>
	 */
	public static McObfPair field_76370_b = McMappingDatabase.getSRG("field_76370_b");

	/**
	 * <p>
	 * Name: setDamageBypassesArmor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_76348_h = McMappingDatabase.getSRG("DamageSource.func_76348_h");

	/**
	 * <p>
	 * Name: isDamageAllowedInCreativeMode
	 * </p>
	 */
	public static McObfPair field_76385_p = McMappingDatabase.getSRG("field_76385_p");

	/**
	 * <p>
	 * Name: setMagicDamage
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_82726_p = McMappingDatabase.getSRG("DamageSource.func_82726_p");

	/**
	 * <p>
	 * Name: HOT_FLOOR
	 * </p>
	 */
	public static McObfPair field_190095_e = McMappingDatabase.getSRG("field_190095_e");

	/**
	 * <p>
	 * Name: causeExplosionDamage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_188405_b = McMappingDatabase.getSRG("DamageSource.func_188405_b");

	/**
	 * <p>
	 * Name: setDamageAllowedInCreativeMode
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_76359_i = McMappingDatabase.getSRG("DamageSource.func_76359_i");

	/**
	 * <p>
	 * Name: FLY_INTO_WALL
	 * </p>
	 */
	public static McObfPair field_188406_j = McMappingDatabase.getSRG("field_188406_j");

	/**
	 * <p>
	 * Name: MAGIC
	 * </p>
	 */
	public static McObfPair field_76376_m = McMappingDatabase.getSRG("field_76376_m");

	/**
	 * <p>
	 * Name: OUT_OF_WORLD
	 * </p>
	 */
	public static McObfPair field_76380_i = McMappingDatabase.getSRG("field_76380_i");

	/**
	 * <p>
	 * Name: isMagicDamage
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82725_o = McMappingDatabase.getSRG("DamageSource.func_82725_o");

	/**
	 * <p>
	 * Name: WITHER
	 * </p>
	 */
	public static McObfPair field_82727_n = McMappingDatabase.getSRG("field_82727_n");

	/**
	 * <p>
	 * Name: isDamageAbsolute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_151517_h = McMappingDatabase.getSRG("DamageSource.func_151517_h");

	/**
	 * <p>
	 * Name: causeThornsDamage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_92087_a = McMappingDatabase.getSRG("DamageSource.func_92087_a");

	/**
	 * <p>
	 * Name: CACTUS
	 * </p>
	 */
	public static McObfPair field_76367_g = McMappingDatabase.getSRG("field_76367_g");

	/**
	 * <p>
	 * Name: getDeathMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_151519_b = McMappingDatabase.getSRG("DamageSource.func_151519_b");

	/**
	 * <p>
	 * Name: getTrueSource
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_76346_g = McMappingDatabase.getSRG("DamageSource.func_76346_g");

	/**
	 * <p>
	 * Name: DRAGON_BREATH
	 * </p>
	 */
	public static McObfPair field_188407_q = McMappingDatabase.getSRG("field_188407_q");

	/**
	 * <p>
	 * Name: explosion
	 * </p>
	 */
	public static McObfPair field_76378_k = McMappingDatabase.getSRG("field_76378_k");

	/**
	 * <p>
	 * Name: getDamageLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_188404_v = McMappingDatabase.getSRG("DamageSource.func_188404_v");

	/**
	 * <p>
	 * Name: setDifficultyScaled
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_76351_m = McMappingDatabase.getSRG("DamageSource.func_76351_m");

	/**
	 * <p>
	 * Name: setDamageIsAbsolute
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_151518_m = McMappingDatabase.getSRG("DamageSource.func_151518_m");

	/**
	 * <p>
	 * Name: causeFireballDamage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/projectile/EntityFireball;Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_76362_a = McMappingDatabase.getSRG("DamageSource.func_76362_a");

	/**
	 * <p>
	 * Name: getImmediateSource
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_76364_f = McMappingDatabase.getSRG("DamageSource.func_76364_f");

	/**
	 * <p>
	 * Name: isDifficultyScaled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76350_n = McMappingDatabase.getSRG("DamageSource.func_76350_n");

	/**
	 * <p>
	 * Name: magicDamage
	 * </p>
	 */
	public static McObfPair field_82730_x = McMappingDatabase.getSRG("field_82730_x");

	/**
	 * <p>
	 * Name: FIREWORKS
	 * </p>
	 */
	public static McObfPair field_191552_t = McMappingDatabase.getSRG("field_191552_t");

	/**
	 * <p>
	 * Name: causePlayerDamage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_76365_a = McMappingDatabase.getSRG("DamageSource.func_76365_a");

	/**
	 * <p>
	 * Name: projectile
	 * </p>
	 */
	public static McObfPair field_76382_s = McMappingDatabase.getSRG("field_76382_s");

	/**
	 * <p>
	 * Name: isExplosion
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_94541_c = McMappingDatabase.getSRG("DamageSource.func_94541_c");

	/**
	 * <p>
	 * Name: causeIndirectMagicDamage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_76354_b = McMappingDatabase.getSRG("DamageSource.func_76354_b");

	/**
	 * <p>
	 * Name: LAVA
	 * </p>
	 */
	public static McObfPair field_76371_c = McMappingDatabase.getSRG("field_76371_c");

	/**
	 * <p>
	 * Name: causeArrowDamage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/projectile/EntityArrow;Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_76353_a = McMappingDatabase.getSRG("DamageSource.func_76353_a");

	/**
	 * <p>
	 * Name: hungerDamage
	 * </p>
	 */
	public static McObfPair field_76384_q = McMappingDatabase.getSRG("field_76384_q");

	/**
	 * <p>
	 * Name: isFireDamage
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76347_k = McMappingDatabase.getSRG("DamageSource.func_76347_k");

	/**
	 * <p>
	 * Name: isProjectile
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76352_a = McMappingDatabase.getSRG("DamageSource.func_76352_a");

	/**
	 * <p>
	 * Name: isUnblockable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76363_c = McMappingDatabase.getSRG("DamageSource.func_76363_c");

	/**
	 * <p>
	 * Name: CRAMMING
	 * </p>
	 */
	public static McObfPair field_191291_g = McMappingDatabase.getSRG("field_191291_g");

	/**
	 * <p>
	 * Name: causeExplosionDamage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/Explosion;)Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_94539_a = McMappingDatabase.getSRG("DamageSource.func_94539_a");

	/**
	 * <p>
	 * Name: damageType
	 * </p>
	 */
	public static McObfPair field_76373_n = McMappingDatabase.getSRG("field_76373_n");

	/**
	 * <p>
	 * Name: ANVIL
	 * </p>
	 */
	public static McObfPair field_82728_o = McMappingDatabase.getSRG("field_82728_o");

}

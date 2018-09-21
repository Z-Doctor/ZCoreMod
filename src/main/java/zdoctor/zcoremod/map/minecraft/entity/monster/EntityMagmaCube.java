package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityMagmaCube {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "add";
		else
			return "net/minecraft/entity/monster/EntityMagmaCube";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "add";
		else
			return "EntityMagmaCube";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladd;";
		else
			return "Lnet/minecraft/entity/monster/EntityMagmaCube;";
	}

	/**
	 * <p>
	 * Name: alterSquishAmount
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70808_l = McMappingDatabase.getSRG("EntityMagmaCube.func_70808_l");

	/**
	 * <p>
	 * Name: fall
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_180430_e = McMappingDatabase.getSRG("EntityMagmaCube.func_180430_e");

	/**
	 * <p>
	 * Name: getSquishSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184709_cY = McMappingDatabase.getSRG("EntityMagmaCube.func_184709_cY");

	/**
	 * <p>
	 * Name: getCanSpawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70601_bi = McMappingDatabase.getSRG("EntityMagmaCube.func_70601_bi");

	/**
	 * <p>
	 * Name: getAttackStrength
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70805_n = McMappingDatabase.getSRG("EntityMagmaCube.func_70805_n");

	/**
	 * <p>
	 * Name: getJumpDelay
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70806_k = McMappingDatabase.getSRG("EntityMagmaCube.func_70806_k");

	/**
	 * <p>
	 * Name: handleJumpLava
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_180466_bG = McMappingDatabase.getSRG("EntityMagmaCube.func_180466_bG");

	/**
	 * <p>
	 * Name: getJumpSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184710_cZ = McMappingDatabase.getSRG("EntityMagmaCube.func_184710_cZ");

	/**
	 * <p>
	 * Name: isBurning
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70027_ad = McMappingDatabase.getSRG("EntityMagmaCube.func_70027_ad");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityMagmaCube.func_184647_J");

	/**
	 * <p>
	 * Name: jump
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70664_aZ = McMappingDatabase.getSRG("EntityMagmaCube.func_70664_aZ");

	/**
	 * <p>
	 * Name: getBrightness
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70013_c = McMappingDatabase.getSRG("EntityMagmaCube.func_70013_c");

	/**
	 * <p>
	 * Name: canDamagePlayer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70800_m = McMappingDatabase.getSRG("EntityMagmaCube.func_70800_m");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityMagmaCube.func_184601_bQ");

	/**
	 * <p>
	 * Name: setSlimeSize
	 * </p>
	 * <p>
	 * Desc: [(IZ)V]
	 * </p>
	 */
	public static McObfPair func_70799_a = McMappingDatabase.getSRG("EntityMagmaCube.func_70799_a");

	/**
	 * <p>
	 * Name: registerFixesMagmaCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189759_b = McMappingDatabase.getSRG("EntityMagmaCube.func_189759_b");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityMagmaCube.func_184615_bR");

	/**
	 * <p>
	 * Name: getParticleType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumParticleTypes;]
	 * </p>
	 */
	public static McObfPair func_180487_n = McMappingDatabase.getSRG("EntityMagmaCube.func_180487_n");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityMagmaCube.func_110147_ax");

	/**
	 * <p>
	 * Name: createInstance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/monster/EntitySlime;]
	 * </p>
	 */
	public static McObfPair func_70802_j = McMappingDatabase.getSRG("EntityMagmaCube.func_70802_j");

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70070_b = McMappingDatabase.getSRG("EntityMagmaCube.func_70070_b");

	/**
	 * <p>
	 * Name: isNotColliding
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70058_J = McMappingDatabase.getSRG("EntityMagmaCube.func_70058_J");

}

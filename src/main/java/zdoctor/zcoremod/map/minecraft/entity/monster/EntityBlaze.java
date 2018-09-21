package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityBlaze {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acq";
		else
			return "net/minecraft/entity/monster/EntityBlaze";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acq";
		else
			return "EntityBlaze";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacq;";
		else
			return "Lnet/minecraft/entity/monster/EntityBlaze;";
	}

	/**
	 * <p>
	 * Name: heightOffsetUpdateTime
	 * </p>
	 */
	public static McObfPair field_70848_e = McMappingDatabase.getSRG("field_70848_e");

	/**
	 * <p>
	 * Name: registerFixesBlaze
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189761_b = McMappingDatabase.getSRG("EntityBlaze.func_189761_b");

	/**
	 * <p>
	 * Name: setOnFire
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70844_e = McMappingDatabase.getSRG("EntityBlaze.func_70844_e");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityBlaze.func_70636_d");

	/**
	 * <p>
	 * Name: isValidLightLevel
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70814_o = McMappingDatabase.getSRG("EntityBlaze.func_70814_o");

	/**
	 * <p>
	 * Name: updateAITasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70619_bc = McMappingDatabase.getSRG("EntityBlaze.func_70619_bc");

	/**
	 * <p>
	 * Name: ON_FIRE
	 * </p>
	 */
	public static McObfPair field_184712_c = McMappingDatabase.getSRG("field_184712_c");

	/**
	 * <p>
	 * Name: isCharged
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70845_n = McMappingDatabase.getSRG("EntityBlaze.func_70845_n");

	/**
	 * <p>
	 * Name: fall
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_180430_e = McMappingDatabase.getSRG("EntityBlaze.func_180430_e");

	/**
	 * <p>
	 * Name: isBurning
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70027_ad = McMappingDatabase.getSRG("EntityBlaze.func_70027_ad");

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70070_b = McMappingDatabase.getSRG("EntityBlaze.func_70070_b");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityBlaze.func_110147_ax");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityBlaze.func_70088_a");

	/**
	 * <p>
	 * Name: getBrightness
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70013_c = McMappingDatabase.getSRG("EntityBlaze.func_70013_c");

	/**
	 * <p>
	 * Name: heightOffset
	 * </p>
	 */
	public static McObfPair field_70847_d = McMappingDatabase.getSRG("field_70847_d");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityBlaze.func_184601_bQ");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityBlaze.func_184651_r");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityBlaze.func_184639_G");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityBlaze.func_184647_J");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityBlaze.func_184615_bR");

}

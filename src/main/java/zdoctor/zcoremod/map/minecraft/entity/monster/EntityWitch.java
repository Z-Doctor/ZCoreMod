package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityWitch {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adr";
		else
			return "net/minecraft/entity/monster/EntityWitch";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adr";
		else
			return "EntityWitch";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladr;";
		else
			return "Lnet/minecraft/entity/monster/EntityWitch;";
	}

	/**
	 * <p>
	 * Name: applyPotionDamageCalculations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)F]
	 * </p>
	 */
	public static McObfPair func_70672_c = McMappingDatabase.getSRG("EntityWitch.func_70672_c");

	/**
	 * <p>
	 * Name: IS_DRINKING
	 * </p>
	 */
	public static McObfPair field_184731_c = McMappingDatabase.getSRG("field_184731_c");

	/**
	 * <p>
	 * Name: MODIFIER
	 * </p>
	 */
	public static McObfPair field_110185_bq = McMappingDatabase.getSRG("field_110185_bq");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityWitch.func_184601_bQ");

	/**
	 * <p>
	 * Name: setSwingingArms
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184724_a = McMappingDatabase.getSRG("EntityWitch.func_184724_a");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityWitch.func_184639_G");

	/**
	 * <p>
	 * Name: potionUseTimer
	 * </p>
	 */
	public static McObfPair field_82200_e = McMappingDatabase.getSRG("field_82200_e");

	/**
	 * <p>
	 * Name: MODIFIER_UUID
	 * </p>
	 */
	public static McObfPair field_110184_bp = McMappingDatabase.getSRG("field_110184_bp");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityWitch.func_70047_e");

	/**
	 * <p>
	 * Name: setDrinkingPotion
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_82197_f = McMappingDatabase.getSRG("EntityWitch.func_82197_f");

	/**
	 * <p>
	 * Name: isDrinkingPotion
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184730_o = McMappingDatabase.getSRG("EntityWitch.func_184730_o");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityWitch.func_70088_a");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityWitch.func_70103_a");

	/**
	 * <p>
	 * Name: attackEntityWithRangedAttack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_82196_d = McMappingDatabase.getSRG("EntityWitch.func_82196_d");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityWitch.func_110147_ax");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityWitch.func_184647_J");

	/**
	 * <p>
	 * Name: registerFixesWitch
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189776_b = McMappingDatabase.getSRG("EntityWitch.func_189776_b");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityWitch.func_70636_d");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityWitch.func_184651_r");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityWitch.func_184615_bR");

}

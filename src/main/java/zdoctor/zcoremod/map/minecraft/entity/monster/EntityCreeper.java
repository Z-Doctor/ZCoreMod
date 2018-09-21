package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityCreeper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acs";
		else
			return "net/minecraft/entity/monster/EntityCreeper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acs";
		else
			return "EntityCreeper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacs;";
		else
			return "Lnet/minecraft/entity/monster/EntityCreeper;";
	}

	/**
	 * <p>
	 * Name: getPowered
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70830_n = McMappingDatabase.getSRG("EntityCreeper.func_70830_n");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityCreeper.func_70014_b");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityCreeper.func_70037_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityCreeper.func_70088_a");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityCreeper.func_110147_ax");

	/**
	 * <p>
	 * Name: lastActiveTime
	 * </p>
	 */
	public static McObfPair field_70834_e = McMappingDatabase.getSRG("field_70834_e");

	/**
	 * <p>
	 * Name: getMaxFallHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82143_as = McMappingDatabase.getSRG("EntityCreeper.func_82143_as");

	/**
	 * <p>
	 * Name: spawnLingeringCloud
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190741_do = McMappingDatabase.getSRG("EntityCreeper.func_190741_do");

	/**
	 * <p>
	 * Name: ableToCauseSkullDrop
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70650_aV = McMappingDatabase.getSRG("EntityCreeper.func_70650_aV");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityCreeper.func_184651_r");

	/**
	 * <p>
	 * Name: processInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184645_a = McMappingDatabase.getSRG("EntityCreeper.func_184645_a");

	/**
	 * <p>
	 * Name: timeSinceIgnited
	 * </p>
	 */
	public static McObfPair field_70833_d = McMappingDatabase.getSRG("field_70833_d");

	/**
	 * <p>
	 * Name: hasIgnited
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_146078_ca = McMappingDatabase.getSRG("EntityCreeper.func_146078_ca");

	/**
	 * <p>
	 * Name: explode
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146077_cc = McMappingDatabase.getSRG("EntityCreeper.func_146077_cc");

	/**
	 * <p>
	 * Name: explosionRadius
	 * </p>
	 */
	public static McObfPair field_82226_g = McMappingDatabase.getSRG("field_82226_g");

	/**
	 * <p>
	 * Name: getCreeperFlashIntensity
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_70831_j = McMappingDatabase.getSRG("EntityCreeper.func_70831_j");

	/**
	 * <p>
	 * Name: attackEntityAsMob
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_70652_k = McMappingDatabase.getSRG("EntityCreeper.func_70652_k");

	/**
	 * <p>
	 * Name: STATE
	 * </p>
	 */
	public static McObfPair field_184713_a = McMappingDatabase.getSRG("field_184713_a");

	/**
	 * <p>
	 * Name: IGNITED
	 * </p>
	 */
	public static McObfPair field_184715_c = McMappingDatabase.getSRG("field_184715_c");

	/**
	 * <p>
	 * Name: droppedSkulls
	 * </p>
	 */
	public static McObfPair field_175494_bm = McMappingDatabase.getSRG("field_175494_bm");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityCreeper.func_184601_bQ");

	/**
	 * <p>
	 * Name: fuseTime
	 * </p>
	 */
	public static McObfPair field_82225_f = McMappingDatabase.getSRG("field_82225_f");

	/**
	 * <p>
	 * Name: incrementDroppedSkulls
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175493_co = McMappingDatabase.getSRG("EntityCreeper.func_175493_co");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityCreeper.func_184647_J");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityCreeper.func_184615_bR");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityCreeper.func_70071_h_");

	/**
	 * <p>
	 * Name: onDeath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_70645_a = McMappingDatabase.getSRG("EntityCreeper.func_70645_a");

	/**
	 * <p>
	 * Name: onStruckByLightning
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/effect/EntityLightningBolt;)V]
	 * </p>
	 */
	public static McObfPair func_70077_a = McMappingDatabase.getSRG("EntityCreeper.func_70077_a");

	/**
	 * <p>
	 * Name: ignite
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146079_cb = McMappingDatabase.getSRG("EntityCreeper.func_146079_cb");

	/**
	 * <p>
	 * Name: registerFixesCreeper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189762_b = McMappingDatabase.getSRG("EntityCreeper.func_189762_b");

	/**
	 * <p>
	 * Name: setCreeperState
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70829_a = McMappingDatabase.getSRG("EntityCreeper.func_70829_a");

	/**
	 * <p>
	 * Name: fall
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_180430_e = McMappingDatabase.getSRG("EntityCreeper.func_180430_e");

	/**
	 * <p>
	 * Name: POWERED
	 * </p>
	 */
	public static McObfPair field_184714_b = McMappingDatabase.getSRG("field_184714_b");

	/**
	 * <p>
	 * Name: getCreeperState
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70832_p = McMappingDatabase.getSRG("EntityCreeper.func_70832_p");

}

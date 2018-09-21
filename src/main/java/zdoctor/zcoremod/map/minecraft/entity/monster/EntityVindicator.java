package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityVindicator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adq";
		else
			return "net/minecraft/entity/monster/EntityVindicator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adq";
		else
			return "EntityVindicator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladq;";
		else
			return "Lnet/minecraft/entity/monster/EntityVindicator;";
	}

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityVindicator.func_110147_ax");

	/**
	 * <p>
	 * Name: registerFixesVindicator
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_190641_b = McMappingDatabase.getSRG("EntityVindicator.func_190641_b");

	/**
	 * <p>
	 * Name: setAggressive
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_190636_a = McMappingDatabase.getSRG("EntityVindicator.func_190636_a");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("EntityVindicator.func_180482_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityVindicator.func_70037_a");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityVindicator.func_184639_G");

	/**
	 * <p>
	 * Name: isAggressive
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190639_o = McMappingDatabase.getSRG("EntityVindicator.func_190639_o");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityVindicator.func_184647_J");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityVindicator.func_70088_a");

	/**
	 * <p>
	 * Name: johnny
	 * </p>
	 */
	public static McObfPair field_190643_b = McMappingDatabase.getSRG("field_190643_b");

	/**
	 * <p>
	 * Name: setCustomNameTag
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_96094_a = McMappingDatabase.getSRG("EntityVindicator.func_96094_a");

	/**
	 * <p>
	 * Name: updateAITasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70619_bc = McMappingDatabase.getSRG("EntityVindicator.func_70619_bc");

	/**
	 * <p>
	 * Name: setEquipmentBasedOnDifficulty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;)V]
	 * </p>
	 */
	public static McObfPair func_180481_a = McMappingDatabase.getSRG("EntityVindicator.func_180481_a");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityVindicator.func_184601_bQ");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityVindicator.func_184615_bR");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityVindicator.func_184651_r");

	/**
	 * <p>
	 * Name: getArmPose
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/monster/AbstractIllager$IllagerArmPose;]
	 * </p>
	 */
	public static McObfPair func_193077_p = McMappingDatabase.getSRG("EntityVindicator.func_193077_p");

	/**
	 * <p>
	 * Name: isOnSameTeam
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_184191_r = McMappingDatabase.getSRG("EntityVindicator.func_184191_r");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityVindicator.func_70014_b");

	/**
	 * <p>
	 * Name: JOHNNY_SELECTOR
	 * </p>
	 */
	public static McObfPair field_190644_c = McMappingDatabase.getSRG("field_190644_c");

}

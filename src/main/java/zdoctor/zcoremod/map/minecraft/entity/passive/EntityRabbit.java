package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityRabbit {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaf";
		else
			return "net/minecraft/entity/passive/EntityRabbit";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaf";
		else
			return "EntityRabbit";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laaf;";
		else
			return "Lnet/minecraft/entity/passive/EntityRabbit;";
	}

	/**
	 * <p>
	 * Name: enableJumpControl
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175518_cr = McMappingDatabase.getSRG("EntityRabbit.func_175518_cr");

	/**
	 * <p>
	 * Name: carrotTicks
	 * </p>
	 */
	public static McObfPair field_175541_bs = McMappingDatabase.getSRG("field_175541_bs");

	/**
	 * <p>
	 * Name: jumpDuration
	 * </p>
	 */
	public static McObfPair field_175535_bn = McMappingDatabase.getSRG("field_175535_bn");

	/**
	 * <p>
	 * Name: createChild
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;, (Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityRabbit;]
	 * </p>
	 */
	public static McObfPair func_90011_a = McMappingDatabase.getSRG("EntityRabbit.func_90011_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityRabbit.func_70088_a");

	/**
	 * <p>
	 * Name: getRandomRabbitType
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184772_dk = McMappingDatabase.getSRG("EntityRabbit.func_184772_dk");

	/**
	 * <p>
	 * Name: jumpTicks
	 * </p>
	 */
	public static McObfPair field_175540_bm = McMappingDatabase.getSRG("field_175540_bm");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("EntityRabbit.func_180482_a");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityRabbit.func_184615_bR");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityRabbit.func_70636_d");

	/**
	 * <p>
	 * Name: RABBIT_TYPE
	 * </p>
	 */
	public static McObfPair field_184773_bv = McMappingDatabase.getSRG("field_184773_bv");

	/**
	 * <p>
	 * Name: setRabbitType
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_175529_r = McMappingDatabase.getSRG("EntityRabbit.func_175529_r");

	/**
	 * <p>
	 * Name: setMovementSpeed
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_175515_b = McMappingDatabase.getSRG("EntityRabbit.func_175515_b");

	/**
	 * <p>
	 * Name: checkLandingDelay
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175517_cu = McMappingDatabase.getSRG("EntityRabbit.func_175517_cu");

	/**
	 * <p>
	 * Name: getJumpUpwardsMotion
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_175134_bD = McMappingDatabase.getSRG("EntityRabbit.func_175134_bD");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityRabbit.func_70037_a");

	/**
	 * <p>
	 * Name: createEatingParticles
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175528_cn = McMappingDatabase.getSRG("EntityRabbit.func_175528_cn");

	/**
	 * <p>
	 * Name: currentMoveTypeDuration
	 * </p>
	 */
	public static McObfPair field_175538_bq = McMappingDatabase.getSRG("field_175538_bq");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityRabbit.func_70097_a");

	/**
	 * <p>
	 * Name: getSoundCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundCategory;]
	 * </p>
	 */
	public static McObfPair func_184176_by = McMappingDatabase.getSRG("EntityRabbit.func_184176_by");

	/**
	 * <p>
	 * Name: setJumpCompletion
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_175521_o = McMappingDatabase.getSRG("EntityRabbit.func_175521_o");

	/**
	 * <p>
	 * Name: isRabbitBreedingItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Z]
	 * </p>
	 */
	public static McObfPair func_175525_a = McMappingDatabase.getSRG("EntityRabbit.func_175525_a");

	/**
	 * <p>
	 * Name: calculateRotationYaw
	 * </p>
	 * <p>
	 * Desc: [(DD)V]
	 * </p>
	 */
	public static McObfPair func_175533_a = McMappingDatabase.getSRG("EntityRabbit.func_175533_a");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityRabbit.func_184601_bQ");

	/**
	 * <p>
	 * Name: getJumpSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184771_da = McMappingDatabase.getSRG("EntityRabbit.func_184771_da");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityRabbit.func_184651_r");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityRabbit.func_70103_a");

	/**
	 * <p>
	 * Name: updateMoveTypeDuration
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175530_ct = McMappingDatabase.getSRG("EntityRabbit.func_175530_ct");

	/**
	 * <p>
	 * Name: getRabbitType
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_175531_cl = McMappingDatabase.getSRG("EntityRabbit.func_175531_cl");

	/**
	 * <p>
	 * Name: wasOnGround
	 * </p>
	 */
	public static McObfPair field_175537_bp = McMappingDatabase.getSRG("field_175537_bp");

	/**
	 * <p>
	 * Name: registerFixesRabbit
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189801_b = McMappingDatabase.getSRG("EntityRabbit.func_189801_b");

	/**
	 * <p>
	 * Name: updateAITasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70619_bc = McMappingDatabase.getSRG("EntityRabbit.func_70619_bc");

	/**
	 * <p>
	 * Name: spawnRunningParticles
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174830_Y = McMappingDatabase.getSRG("EntityRabbit.func_174830_Y");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityRabbit.func_184647_J");

	/**
	 * <p>
	 * Name: jump
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70664_aZ = McMappingDatabase.getSRG("EntityRabbit.func_70664_aZ");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityRabbit.func_70014_b");

	/**
	 * <p>
	 * Name: disableJumpControl
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175520_cs = McMappingDatabase.getSRG("EntityRabbit.func_175520_cs");

	/**
	 * <p>
	 * Name: attackEntityAsMob
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_70652_k = McMappingDatabase.getSRG("EntityRabbit.func_70652_k");

	/**
	 * <p>
	 * Name: setJumping
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70637_d = McMappingDatabase.getSRG("EntityRabbit.func_70637_d");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityRabbit.func_110147_ax");

	/**
	 * <p>
	 * Name: startJumping
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184770_cZ = McMappingDatabase.getSRG("EntityRabbit.func_184770_cZ");

	/**
	 * <p>
	 * Name: isBreedingItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_70877_b = McMappingDatabase.getSRG("EntityRabbit.func_70877_b");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityRabbit.func_184639_G");

	/**
	 * <p>
	 * Name: isCarrotEaten
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175534_cv = McMappingDatabase.getSRG("EntityRabbit.func_175534_cv");

}

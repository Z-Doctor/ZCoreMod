package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityWolf {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aam";
		else
			return "net/minecraft/entity/passive/EntityWolf";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aam";
		else
			return "EntityWolf";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laam;";
		else
			return "Lnet/minecraft/entity/passive/EntityWolf;";
	}

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityWolf.func_70047_e");

	/**
	 * <p>
	 * Name: isBegging
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70922_bv = McMappingDatabase.getSRG("EntityWolf.func_70922_bv");

	/**
	 * <p>
	 * Name: setAttackTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_70624_b = McMappingDatabase.getSRG("EntityWolf.func_70624_b");

	/**
	 * <p>
	 * Name: getMaxSpawnedInChunk
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70641_bl = McMappingDatabase.getSRG("EntityWolf.func_70641_bl");

	/**
	 * <p>
	 * Name: getSoundVolume
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70599_aP = McMappingDatabase.getSRG("EntityWolf.func_70599_aP");

	/**
	 * <p>
	 * Name: canMateWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityAnimal;)Z]
	 * </p>
	 */
	public static McObfPair func_70878_b = McMappingDatabase.getSRG("EntityWolf.func_70878_b");

	/**
	 * <p>
	 * Name: shouldAttackEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_142018_a = McMappingDatabase.getSRG("EntityWolf.func_142018_a");

	/**
	 * <p>
	 * Name: prevTimeWolfIsShaking
	 * </p>
	 */
	public static McObfPair field_70927_j = McMappingDatabase.getSRG("field_70927_j");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityWolf.func_70097_a");

	/**
	 * <p>
	 * Name: getTailRotation
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70920_v = McMappingDatabase.getSRG("EntityWolf.func_70920_v");

	/**
	 * <p>
	 * Name: getCollarColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/EnumDyeColor;]
	 * </p>
	 */
	public static McObfPair func_175546_cu = McMappingDatabase.getSRG("EntityWolf.func_175546_cu");

	/**
	 * <p>
	 * Name: getVerticalFaceSpeed
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70646_bf = McMappingDatabase.getSRG("EntityWolf.func_70646_bf");

	/**
	 * <p>
	 * Name: getShadingWhileWet
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_70915_j = McMappingDatabase.getSRG("EntityWolf.func_70915_j");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityWolf.func_184647_J");

	/**
	 * <p>
	 * Name: setAngry
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70916_h = McMappingDatabase.getSRG("EntityWolf.func_70916_h");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityWolf.func_110147_ax");

	/**
	 * <p>
	 * Name: isShaking
	 * </p>
	 */
	public static McObfPair field_70928_h = McMappingDatabase.getSRG("field_70928_h");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityWolf.func_70636_d");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityWolf.func_184651_r");

	/**
	 * <p>
	 * Name: processInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184645_a = McMappingDatabase.getSRG("EntityWolf.func_184645_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityWolf.func_70037_a");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityWolf.func_184639_G");

	/**
	 * <p>
	 * Name: getInterestedAngle
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_70917_k = McMappingDatabase.getSRG("EntityWolf.func_70917_k");

	/**
	 * <p>
	 * Name: isBreedingItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_70877_b = McMappingDatabase.getSRG("EntityWolf.func_70877_b");

	/**
	 * <p>
	 * Name: getShakeAngle
	 * </p>
	 * <p>
	 * Desc: [(FF)F]
	 * </p>
	 */
	public static McObfPair func_70923_f = McMappingDatabase.getSRG("EntityWolf.func_70923_f");

	/**
	 * <p>
	 * Name: canBeLeashedTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_184652_a = McMappingDatabase.getSRG("EntityWolf.func_184652_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityWolf.func_70014_b");

	/**
	 * <p>
	 * Name: isAngry
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70919_bu = McMappingDatabase.getSRG("EntityWolf.func_70919_bu");

	/**
	 * <p>
	 * Name: COLLAR_COLOR
	 * </p>
	 */
	public static McObfPair field_184758_bB = McMappingDatabase.getSRG("field_184758_bB");

	/**
	 * <p>
	 * Name: setCollarColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/EnumDyeColor;)V]
	 * </p>
	 */
	public static McObfPair func_175547_a = McMappingDatabase.getSRG("EntityWolf.func_175547_a");

	/**
	 * <p>
	 * Name: isWet
	 * </p>
	 */
	public static McObfPair field_70925_g = McMappingDatabase.getSRG("field_70925_g");

	/**
	 * <p>
	 * Name: timeWolfIsShaking
	 * </p>
	 */
	public static McObfPair field_70929_i = McMappingDatabase.getSRG("field_70929_i");

	/**
	 * <p>
	 * Name: createChild
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;, (Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityWolf;]
	 * </p>
	 */
	public static McObfPair func_90011_a = McMappingDatabase.getSRG("EntityWolf.func_90011_a");

	/**
	 * <p>
	 * Name: attackEntityAsMob
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_70652_k = McMappingDatabase.getSRG("EntityWolf.func_70652_k");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityWolf.func_70103_a");

	/**
	 * <p>
	 * Name: headRotationCourseOld
	 * </p>
	 */
	public static McObfPair field_70924_f = McMappingDatabase.getSRG("field_70924_f");

	/**
	 * <p>
	 * Name: headRotationCourse
	 * </p>
	 */
	public static McObfPair field_70926_e = McMappingDatabase.getSRG("field_70926_e");

	/**
	 * <p>
	 * Name: BEGGING
	 * </p>
	 */
	public static McObfPair field_184760_bA = McMappingDatabase.getSRG("field_184760_bA");

	/**
	 * <p>
	 * Name: setTamed
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70903_f = McMappingDatabase.getSRG("EntityWolf.func_70903_f");

	/**
	 * <p>
	 * Name: isWolfWet
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70921_u = McMappingDatabase.getSRG("EntityWolf.func_70921_u");

	/**
	 * <p>
	 * Name: updateAITasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70619_bc = McMappingDatabase.getSRG("EntityWolf.func_70619_bc");

	/**
	 * <p>
	 * Name: registerFixesWolf
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189788_b = McMappingDatabase.getSRG("EntityWolf.func_189788_b");

	/**
	 * <p>
	 * Name: DATA_HEALTH_ID
	 * </p>
	 */
	public static McObfPair field_184759_bz = McMappingDatabase.getSRG("field_184759_bz");

	/**
	 * <p>
	 * Name: setBegging
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70918_i = McMappingDatabase.getSRG("EntityWolf.func_70918_i");

	/**
	 * <p>
	 * Name: playStepSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_180429_a = McMappingDatabase.getSRG("EntityWolf.func_180429_a");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityWolf.func_184601_bQ");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityWolf.func_70088_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityWolf.func_70071_h_");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityWolf.func_184615_bR");

}

package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPigZombie {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adf";
		else
			return "net/minecraft/entity/monster/EntityPigZombie";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adf";
		else
			return "EntityPigZombie";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladf;";
		else
			return "Lnet/minecraft/entity/monster/EntityPigZombie;";
	}

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityPigZombie.func_70014_b");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityPigZombie.func_184601_bQ");

	/**
	 * <p>
	 * Name: isAngry
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175457_ck = McMappingDatabase.getSRG("EntityPigZombie.func_175457_ck");

	/**
	 * <p>
	 * Name: setEquipmentBasedOnDifficulty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;)V]
	 * </p>
	 */
	public static McObfPair func_180481_a = McMappingDatabase.getSRG("EntityPigZombie.func_180481_a");

	/**
	 * <p>
	 * Name: registerFixesPigZombie
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189781_b = McMappingDatabase.getSRG("EntityPigZombie.func_189781_b");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityPigZombie.func_70097_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityPigZombie.func_70037_a");

	/**
	 * <p>
	 * Name: isNotColliding
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70058_J = McMappingDatabase.getSRG("EntityPigZombie.func_70058_J");

	/**
	 * <p>
	 * Name: applyEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175456_n = McMappingDatabase.getSRG("EntityPigZombie.func_175456_n");

	/**
	 * <p>
	 * Name: processInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184645_a = McMappingDatabase.getSRG("EntityPigZombie.func_184645_a");

	/**
	 * <p>
	 * Name: ATTACK_SPEED_BOOST_MODIFIER
	 * </p>
	 */
	public static McObfPair field_110190_br = McMappingDatabase.getSRG("field_110190_br");

	/**
	 * <p>
	 * Name: isPreventingPlayerRest
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_191990_c = McMappingDatabase.getSRG("EntityPigZombie.func_191990_c");

	/**
	 * <p>
	 * Name: angerLevel
	 * </p>
	 */
	public static McObfPair field_70837_d = McMappingDatabase.getSRG("field_70837_d");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityPigZombie.func_184639_G");

	/**
	 * <p>
	 * Name: updateAITasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70619_bc = McMappingDatabase.getSRG("EntityPigZombie.func_70619_bc");

	/**
	 * <p>
	 * Name: ATTACK_SPEED_BOOST_MODIFIER_UUID
	 * </p>
	 */
	public static McObfPair field_110189_bq = McMappingDatabase.getSRG("field_110189_bq");

	/**
	 * <p>
	 * Name: setRevengeTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_70604_c = McMappingDatabase.getSRG("EntityPigZombie.func_70604_c");

	/**
	 * <p>
	 * Name: becomeAngryAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_70835_c = McMappingDatabase.getSRG("EntityPigZombie.func_70835_c");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityPigZombie.func_184615_bR");

	/**
	 * <p>
	 * Name: getCanSpawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70601_bi = McMappingDatabase.getSRG("EntityPigZombie.func_70601_bi");

	/**
	 * <p>
	 * Name: angerTargetUUID
	 * </p>
	 */
	public static McObfPair field_175459_bn = McMappingDatabase.getSRG("field_175459_bn");

	/**
	 * <p>
	 * Name: randomSoundDelay
	 * </p>
	 */
	public static McObfPair field_70838_e = McMappingDatabase.getSRG("field_70838_e");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityPigZombie.func_184647_J");

	/**
	 * <p>
	 * Name: getSkullDrop
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190732_dj = McMappingDatabase.getSRG("EntityPigZombie.func_190732_dj");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityPigZombie.func_110147_ax");

}

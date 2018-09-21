package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityZombie {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adt";
		else
			return "net/minecraft/entity/monster/EntityZombie";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adt";
		else
			return "EntityZombie";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladt;";
		else
			return "Lnet/minecraft/entity/monster/EntityZombie;";
	}

	/**
	 * <p>
	 * Name: onDeath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_70645_a = McMappingDatabase.getSRG("EntityZombie.func_70645_a");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("EntityZombie.func_184206_a");

	/**
	 * <p>
	 * Name: getStepSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_190731_di = McMappingDatabase.getSRG("EntityZombie.func_190731_di");

	/**
	 * <p>
	 * Name: attackEntityAsMob
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_70652_k = McMappingDatabase.getSRG("EntityZombie.func_70652_k");

	/**
	 * <p>
	 * Name: getSkullDrop
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190732_dj = McMappingDatabase.getSRG("EntityZombie.func_190732_dj");

	/**
	 * <p>
	 * Name: IS_CHILD
	 * </p>
	 */
	public static McObfPair field_184737_bv = McMappingDatabase.getSRG("field_184737_bv");

	/**
	 * <p>
	 * Name: getYOffset
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_70033_W = McMappingDatabase.getSRG("EntityZombie.func_70033_W");

	/**
	 * <p>
	 * Name: canEquipItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_175448_a = McMappingDatabase.getSRG("EntityZombie.func_175448_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityZombie.func_70088_a");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityZombie.func_70097_a");

	/**
	 * <p>
	 * Name: setEquipmentBasedOnDifficulty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;)V]
	 * </p>
	 */
	public static McObfPair func_180481_a = McMappingDatabase.getSRG("EntityZombie.func_180481_a");

	/**
	 * <p>
	 * Name: zombieHeight
	 * </p>
	 */
	public static McObfPair field_146073_bw = McMappingDatabase.getSRG("field_146073_bw");

	/**
	 * <p>
	 * Name: zombieWidth
	 * </p>
	 */
	public static McObfPair field_146074_bv = McMappingDatabase.getSRG("field_146074_bv");

	/**
	 * <p>
	 * Name: ARMS_RAISED
	 * </p>
	 */
	public static McObfPair field_184740_by = McMappingDatabase.getSRG("field_184740_by");

	/**
	 * <p>
	 * Name: getExperiencePoints
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)I]
	 * </p>
	 */
	public static McObfPair func_70693_a = McMappingDatabase.getSRG("EntityZombie.func_70693_a");

	/**
	 * <p>
	 * Name: breakDoor
	 * </p>
	 */
	public static McObfPair field_146075_bs = McMappingDatabase.getSRG("field_146075_bs");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityZombie.func_184647_J");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityZombie.func_184601_bQ");

	/**
	 * <p>
	 * Name: isBreakDoorsTaskSet
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_146072_bX = McMappingDatabase.getSRG("EntityZombie.func_146072_bX");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("EntityZombie.func_180482_a");

	/**
	 * <p>
	 * Name: shouldBurnInDay
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190730_o = McMappingDatabase.getSRG("EntityZombie.func_190730_o");

	/**
	 * <p>
	 * Name: isBreakDoorsTaskSet
	 * </p>
	 */
	public static McObfPair field_146076_bu = McMappingDatabase.getSRG("field_146076_bu");

	/**
	 * <p>
	 * Name: setBreakDoorsAItask
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_146070_a = McMappingDatabase.getSRG("EntityZombie.func_146070_a");

	/**
	 * <p>
	 * Name: getCreatureAttribute
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EnumCreatureAttribute;]
	 * </p>
	 */
	public static McObfPair func_70668_bt = McMappingDatabase.getSRG("EntityZombie.func_70668_bt");

	/**
	 * <p>
	 * Name: VILLAGER_TYPE
	 * </p>
	 */
	public static McObfPair field_184738_bw = McMappingDatabase.getSRG("field_184738_bw");

	/**
	 * <p>
	 * Name: isArmsRaised
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184734_db = McMappingDatabase.getSRG("EntityZombie.func_184734_db");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityZombie.func_70037_a");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityZombie.func_70636_d");

	/**
	 * <p>
	 * Name: BABY_SPEED_BOOST_ID
	 * </p>
	 */
	public static McObfPair field_110187_bq = McMappingDatabase.getSRG("field_110187_bq");

	/**
	 * <p>
	 * Name: BABY_SPEED_BOOST
	 * </p>
	 */
	public static McObfPair field_110188_br = McMappingDatabase.getSRG("field_110188_br");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityZombie.func_70047_e");

	/**
	 * <p>
	 * Name: multiplySize
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_146069_a = McMappingDatabase.getSRG("EntityZombie.func_146069_a");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityZombie.func_184651_r");

	/**
	 * <p>
	 * Name: playStepSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_180429_a = McMappingDatabase.getSRG("EntityZombie.func_180429_a");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityZombie.func_184615_bR");

	/**
	 * <p>
	 * Name: setArmsRaised
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184733_a = McMappingDatabase.getSRG("EntityZombie.func_184733_a");

	/**
	 * <p>
	 * Name: isChild
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70631_g_ = McMappingDatabase.getSRG("EntityZombie.func_70631_g_");

	/**
	 * <p>
	 * Name: setSize
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_70105_a = McMappingDatabase.getSRG("EntityZombie.func_70105_a");

	/**
	 * <p>
	 * Name: setChildSize
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_146071_k = McMappingDatabase.getSRG("EntityZombie.func_146071_k");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityZombie.func_70014_b");

	/**
	 * <p>
	 * Name: SPAWN_REINFORCEMENTS_CHANCE
	 * </p>
	 */
	public static McObfPair field_110186_bp = McMappingDatabase.getSRG("field_110186_bp");

	/**
	 * <p>
	 * Name: registerFixesZombie
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189779_d = McMappingDatabase.getSRG("EntityZombie.func_189779_d");

	/**
	 * <p>
	 * Name: onKillEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_70074_a = McMappingDatabase.getSRG("EntityZombie.func_70074_a");

	/**
	 * <p>
	 * Name: setChild
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_82227_f = McMappingDatabase.getSRG("EntityZombie.func_82227_f");

	/**
	 * <p>
	 * Name: applyEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175456_n = McMappingDatabase.getSRG("EntityZombie.func_175456_n");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityZombie.func_110147_ax");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityZombie.func_184639_G");

}

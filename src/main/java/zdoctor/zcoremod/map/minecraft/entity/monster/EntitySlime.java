package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySlime {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adl";
		else
			return "net/minecraft/entity/monster/EntitySlime";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adl";
		else
			return "EntitySlime";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladl;";
		else
			return "Lnet/minecraft/entity/monster/EntitySlime;";
	}

	/**
	 * <p>
	 * Name: onCollideWithPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_70100_b_ = McMappingDatabase.getSRG("EntitySlime.func_70100_b_");

	/**
	 * <p>
	 * Name: setDead
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70106_y = McMappingDatabase.getSRG("EntitySlime.func_70106_y");

	/**
	 * <p>
	 * Name: jump
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70664_aZ = McMappingDatabase.getSRG("EntitySlime.func_70664_aZ");

	/**
	 * <p>
	 * Name: canDamagePlayer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70800_m = McMappingDatabase.getSRG("EntitySlime.func_70800_m");

	/**
	 * <p>
	 * Name: setSlimeSize
	 * </p>
	 * <p>
	 * Desc: [(IZ)V]
	 * </p>
	 */
	public static McObfPair func_70799_a = McMappingDatabase.getSRG("EntitySlime.func_70799_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntitySlime.func_70037_a");

	/**
	 * <p>
	 * Name: wasOnGround
	 * </p>
	 */
	public static McObfPair field_175452_bi = McMappingDatabase.getSRG("field_175452_bi");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntitySlime.func_70088_a");

	/**
	 * <p>
	 * Name: getSlimeSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70809_q = McMappingDatabase.getSRG("EntitySlime.func_70809_q");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntitySlime.func_184615_bR");

	/**
	 * <p>
	 * Name: squishAmount
	 * </p>
	 */
	public static McObfPair field_70813_a = McMappingDatabase.getSRG("field_70813_a");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("EntitySlime.func_184206_a");

	/**
	 * <p>
	 * Name: prevSquishFactor
	 * </p>
	 */
	public static McObfPair field_70812_c = McMappingDatabase.getSRG("field_70812_c");

	/**
	 * <p>
	 * Name: getSquishSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184709_cY = McMappingDatabase.getSRG("EntitySlime.func_184709_cY");

	/**
	 * <p>
	 * Name: getParticleType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumParticleTypes;]
	 * </p>
	 */
	public static McObfPair func_180487_n = McMappingDatabase.getSRG("EntitySlime.func_180487_n");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntitySlime.func_70014_b");

	/**
	 * <p>
	 * Name: SLIME_SIZE
	 * </p>
	 */
	public static McObfPair field_184711_bt = McMappingDatabase.getSRG("field_184711_bt");

	/**
	 * <p>
	 * Name: alterSquishAmount
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70808_l = McMappingDatabase.getSRG("EntitySlime.func_70808_l");

	/**
	 * <p>
	 * Name: createInstance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/monster/EntitySlime;]
	 * </p>
	 */
	public static McObfPair func_70802_j = McMappingDatabase.getSRG("EntitySlime.func_70802_j");

	/**
	 * <p>
	 * Name: getJumpSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184710_cZ = McMappingDatabase.getSRG("EntitySlime.func_184710_cZ");

	/**
	 * <p>
	 * Name: getVerticalFaceSpeed
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70646_bf = McMappingDatabase.getSRG("EntitySlime.func_70646_bf");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntitySlime.func_184647_J");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("EntitySlime.func_180482_a");

	/**
	 * <p>
	 * Name: dealDamage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_175451_e = McMappingDatabase.getSRG("EntitySlime.func_175451_e");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntitySlime.func_184651_r");

	/**
	 * <p>
	 * Name: registerFixesSlime
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189758_c = McMappingDatabase.getSRG("EntitySlime.func_189758_c");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntitySlime.func_70071_h_");

	/**
	 * <p>
	 * Name: makesSoundOnJump
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70807_r = McMappingDatabase.getSRG("EntitySlime.func_70807_r");

	/**
	 * <p>
	 * Name: getAttackStrength
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70805_n = McMappingDatabase.getSRG("EntitySlime.func_70805_n");

	/**
	 * <p>
	 * Name: applyEntityCollision
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_70108_f = McMappingDatabase.getSRG("EntitySlime.func_70108_f");

	/**
	 * <p>
	 * Name: getDropItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_146068_u = McMappingDatabase.getSRG("EntitySlime.func_146068_u");

	/**
	 * <p>
	 * Name: getCanSpawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70601_bi = McMappingDatabase.getSRG("EntitySlime.func_70601_bi");

	/**
	 * <p>
	 * Name: getJumpDelay
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70806_k = McMappingDatabase.getSRG("EntitySlime.func_70806_k");

	/**
	 * <p>
	 * Name: getSoundVolume
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70599_aP = McMappingDatabase.getSRG("EntitySlime.func_70599_aP");

	/**
	 * <p>
	 * Name: isSmallSlime
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_189101_db = McMappingDatabase.getSRG("EntitySlime.func_189101_db");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntitySlime.func_184601_bQ");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntitySlime.func_70047_e");

	/**
	 * <p>
	 * Name: squishFactor
	 * </p>
	 */
	public static McObfPair field_70811_b = McMappingDatabase.getSRG("field_70811_b");

}

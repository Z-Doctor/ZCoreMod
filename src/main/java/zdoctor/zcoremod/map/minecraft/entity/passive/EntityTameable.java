package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityTameable {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wb";
		else
			return "net/minecraft/entity/passive/EntityTameable";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wb";
		else
			return "EntityTameable";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwb;";
		else
			return "Lnet/minecraft/entity/passive/EntityTameable;";
	}

	/**
	 * <p>
	 * Name: aiSit
	 * </p>
	 */
	public static McObfPair field_70911_d = McMappingDatabase.getSRG("field_70911_d");

	/**
	 * <p>
	 * Name: setTamedBy
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_193101_c = McMappingDatabase.getSRG("EntityTameable.func_193101_c");

	/**
	 * <p>
	 * Name: onDeath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_70645_a = McMappingDatabase.getSRG("EntityTameable.func_70645_a");

	/**
	 * <p>
	 * Name: isOwner
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_152114_e = McMappingDatabase.getSRG("EntityTameable.func_152114_e");

	/**
	 * <p>
	 * Name: shouldAttackEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_142018_a = McMappingDatabase.getSRG("EntityTameable.func_142018_a");

	/**
	 * <p>
	 * Name: isTamed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70909_n = McMappingDatabase.getSRG("EntityTameable.func_70909_n");

	/**
	 * <p>
	 * Name: getOwnerId
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_184753_b = McMappingDatabase.getSRG("EntityTameable.func_184753_b");

	/**
	 * <p>
	 * Name: playTameEffect
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70908_e = McMappingDatabase.getSRG("EntityTameable.func_70908_e");

	/**
	 * <p>
	 * Name: setSitting
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70904_g = McMappingDatabase.getSRG("EntityTameable.func_70904_g");

	/**
	 * <p>
	 * Name: isOnSameTeam
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_184191_r = McMappingDatabase.getSRG("EntityTameable.func_184191_r");

	/**
	 * <p>
	 * Name: canBeLeashedTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_184652_a = McMappingDatabase.getSRG("EntityTameable.func_184652_a");

	/**
	 * <p>
	 * Name: setupTamedAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175544_ck = McMappingDatabase.getSRG("EntityTameable.func_175544_ck");

	/**
	 * <p>
	 * Name: getOwner
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityLivingBase;, ()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_70902_q = McMappingDatabase.getSRG("EntityTameable.func_70902_q");

	/**
	 * <p>
	 * Name: setOwnerId
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)V]
	 * </p>
	 */
	public static McObfPair func_184754_b = McMappingDatabase.getSRG("EntityTameable.func_184754_b");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityTameable.func_70103_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityTameable.func_70037_a");

	/**
	 * <p>
	 * Name: TAMED
	 * </p>
	 */
	public static McObfPair field_184755_bv = McMappingDatabase.getSRG("field_184755_bv");

	/**
	 * <p>
	 * Name: OWNER_UNIQUE_ID
	 * </p>
	 */
	public static McObfPair field_184756_bw = McMappingDatabase.getSRG("field_184756_bw");

	/**
	 * <p>
	 * Name: isSitting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70906_o = McMappingDatabase.getSRG("EntityTameable.func_70906_o");

	/**
	 * <p>
	 * Name: getTeam
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/Team;]
	 * </p>
	 */
	public static McObfPair func_96124_cp = McMappingDatabase.getSRG("EntityTameable.func_96124_cp");

	/**
	 * <p>
	 * Name: getAISit
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/ai/EntityAISit;]
	 * </p>
	 */
	public static McObfPair func_70907_r = McMappingDatabase.getSRG("EntityTameable.func_70907_r");

	/**
	 * <p>
	 * Name: setTamed
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70903_f = McMappingDatabase.getSRG("EntityTameable.func_70903_f");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityTameable.func_70014_b");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityTameable.func_70088_a");

}

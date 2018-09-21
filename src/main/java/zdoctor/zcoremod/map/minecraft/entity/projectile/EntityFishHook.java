package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityFishHook {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acf";
		else
			return "net/minecraft/entity/projectile/EntityFishHook";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acf";
		else
			return "EntityFishHook";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacf;";
		else
			return "Lnet/minecraft/entity/projectile/EntityFishHook;";
	}

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityFishHook.func_70071_h_");

	/**
	 * <p>
	 * Name: catchingFish
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_190621_a = McMappingDatabase.getSRG("EntityFishHook.func_190621_a");

	/**
	 * <p>
	 * Name: canTriggerWalking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70041_e_ = McMappingDatabase.getSRG("EntityFishHook.func_70041_e_");

	/**
	 * <p>
	 * Name: setDead
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70106_y = McMappingDatabase.getSRG("EntityFishHook.func_70106_y");

	/**
	 * <p>
	 * Name: bringInHookedEntity
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184527_k = McMappingDatabase.getSRG("EntityFishHook.func_184527_k");

	/**
	 * <p>
	 * Name: setLuck
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_191517_b = McMappingDatabase.getSRG("EntityFishHook.func_191517_b");

	/**
	 * <p>
	 * Name: luck
	 * </p>
	 */
	public static McObfPair field_191518_aw = McMappingDatabase.getSRG("field_191518_aw");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityFishHook.func_70103_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityFishHook.func_70037_a");

	/**
	 * <p>
	 * Name: DATA_HOOKED_ENTITY
	 * </p>
	 */
	public static McObfPair field_184528_c = McMappingDatabase.getSRG("field_184528_c");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityFishHook.func_70088_a");

	/**
	 * <p>
	 * Name: ticksCaughtDelay
	 * </p>
	 */
	public static McObfPair field_146040_ay = McMappingDatabase.getSRG("field_146040_ay");

	/**
	 * <p>
	 * Name: shouldStopFishing
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190625_o = McMappingDatabase.getSRG("EntityFishHook.func_190625_o");

	/**
	 * <p>
	 * Name: canBeHooked
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_189739_a = McMappingDatabase.getSRG("EntityFishHook.func_189739_a");

	/**
	 * <p>
	 * Name: updateRotation
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190623_q = McMappingDatabase.getSRG("EntityFishHook.func_190623_q");

	/**
	 * <p>
	 * Name: getAngler
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/player/EntityPlayer;]
	 * </p>
	 */
	public static McObfPair func_190619_l = McMappingDatabase.getSRG("EntityFishHook.func_190619_l");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityFishHook.func_70014_b");

	/**
	 * <p>
	 * Name: setLureSpeed
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_191516_a = McMappingDatabase.getSRG("EntityFishHook.func_191516_a");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("EntityFishHook.func_184206_a");

	/**
	 * <p>
	 * Name: ticksInGround
	 * </p>
	 */
	public static McObfPair field_146049_av = McMappingDatabase.getSRG("field_146049_av");

	/**
	 * <p>
	 * Name: setHookedEntity
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190622_s = McMappingDatabase.getSRG("EntityFishHook.func_190622_s");

	/**
	 * <p>
	 * Name: angler
	 * </p>
	 */
	public static McObfPair field_146042_b = McMappingDatabase.getSRG("field_146042_b");

	/**
	 * <p>
	 * Name: caughtEntity
	 * </p>
	 */
	public static McObfPair field_146043_c = McMappingDatabase.getSRG("field_146043_c");

	/**
	 * <p>
	 * Name: ticksCatchableDelay
	 * </p>
	 */
	public static McObfPair field_146038_az = McMappingDatabase.getSRG("field_146038_az");

	/**
	 * <p>
	 * Name: setPositionAndRotationDirect
	 * </p>
	 * <p>
	 * Desc: [(DDDFFIZ)V]
	 * </p>
	 */
	public static McObfPair func_180426_a = McMappingDatabase.getSRG("EntityFishHook.func_180426_a");

	/**
	 * <p>
	 * Name: ticksCatchable
	 * </p>
	 */
	public static McObfPair field_146045_ax = McMappingDatabase.getSRG("field_146045_ax");

	/**
	 * <p>
	 * Name: ticksInAir
	 * </p>
	 */
	public static McObfPair field_146047_aw = McMappingDatabase.getSRG("field_146047_aw");

	/**
	 * <p>
	 * Name: fishApproachAngle
	 * </p>
	 */
	public static McObfPair field_146054_aA = McMappingDatabase.getSRG("field_146054_aA");

	/**
	 * <p>
	 * Name: inGround
	 * </p>
	 */
	public static McObfPair field_146051_au = McMappingDatabase.getSRG("field_146051_au");

	/**
	 * <p>
	 * Name: currentState
	 * </p>
	 */
	public static McObfPair field_190627_av = McMappingDatabase.getSRG("field_190627_av");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_190626_a = McMappingDatabase.getSRG("EntityFishHook.func_190626_a");

	/**
	 * <p>
	 * Name: shoot
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190620_n = McMappingDatabase.getSRG("EntityFishHook.func_190620_n");

	/**
	 * <p>
	 * Name: handleHookRetraction
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_146034_e = McMappingDatabase.getSRG("EntityFishHook.func_146034_e");

	/**
	 * <p>
	 * Name: lureSpeed
	 * </p>
	 */
	public static McObfPair field_191519_ax = McMappingDatabase.getSRG("field_191519_ax");

	/**
	 * <p>
	 * Name: checkCollision
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190624_r = McMappingDatabase.getSRG("EntityFishHook.func_190624_r");

	/**
	 * <p>
	 * Name: isInRangeToRenderDist
	 * </p>
	 * <p>
	 * Desc: [(D)Z]
	 * </p>
	 */
	public static McObfPair func_70112_a = McMappingDatabase.getSRG("EntityFishHook.func_70112_a");

}

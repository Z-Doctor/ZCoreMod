package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityEnderCrystal {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abc";
		else
			return "net/minecraft/entity/item/EntityEnderCrystal";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abc";
		else
			return "EntityEnderCrystal";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labc;";
		else
			return "Lnet/minecraft/entity/item/EntityEnderCrystal;";
	}

	/**
	 * <p>
	 * Name: onCrystalDestroyed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_184519_a = McMappingDatabase.getSRG("EntityEnderCrystal.func_184519_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityEnderCrystal.func_70014_b");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityEnderCrystal.func_70071_h_");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityEnderCrystal.func_70088_a");

	/**
	 * <p>
	 * Name: setBeamTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184516_a = McMappingDatabase.getSRG("EntityEnderCrystal.func_184516_a");

	/**
	 * <p>
	 * Name: getBeamTarget
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_184518_j = McMappingDatabase.getSRG("EntityEnderCrystal.func_184518_j");

	/**
	 * <p>
	 * Name: shouldShowBottom
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184520_k = McMappingDatabase.getSRG("EntityEnderCrystal.func_184520_k");

	/**
	 * <p>
	 * Name: setShowBottom
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184517_a = McMappingDatabase.getSRG("EntityEnderCrystal.func_184517_a");

	/**
	 * <p>
	 * Name: innerRotation
	 * </p>
	 */
	public static McObfPair field_70261_a = McMappingDatabase.getSRG("field_70261_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityEnderCrystal.func_70037_a");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityEnderCrystal.func_70097_a");

	/**
	 * <p>
	 * Name: onKillCommand
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174812_G = McMappingDatabase.getSRG("EntityEnderCrystal.func_174812_G");

	/**
	 * <p>
	 * Name: canBeCollidedWith
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70067_L = McMappingDatabase.getSRG("EntityEnderCrystal.func_70067_L");

	/**
	 * <p>
	 * Name: SHOW_BOTTOM
	 * </p>
	 */
	public static McObfPair field_184522_c = McMappingDatabase.getSRG("field_184522_c");

	/**
	 * <p>
	 * Name: canTriggerWalking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70041_e_ = McMappingDatabase.getSRG("EntityEnderCrystal.func_70041_e_");

	/**
	 * <p>
	 * Name: BEAM_TARGET
	 * </p>
	 */
	public static McObfPair field_184521_b = McMappingDatabase.getSRG("field_184521_b");

	/**
	 * <p>
	 * Name: isInRangeToRenderDist
	 * </p>
	 * <p>
	 * Desc: [(D)Z]
	 * </p>
	 */
	public static McObfPair func_70112_a = McMappingDatabase.getSRG("EntityEnderCrystal.func_70112_a");

}

package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityXPOrb {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vm";
		else
			return "net/minecraft/entity/item/EntityXPOrb";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vm";
		else
			return "EntityXPOrb";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvm;";
		else
			return "Lnet/minecraft/entity/item/EntityXPOrb;";
	}

	/**
	 * <p>
	 * Name: onCollideWithPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_70100_b_ = McMappingDatabase.getSRG("EntityXPOrb.func_70100_b_");

	/**
	 * <p>
	 * Name: canTriggerWalking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70041_e_ = McMappingDatabase.getSRG("EntityXPOrb.func_70041_e_");

	/**
	 * <p>
	 * Name: closestPlayer
	 * </p>
	 */
	public static McObfPair field_80001_f = McMappingDatabase.getSRG("field_80001_f");

	/**
	 * <p>
	 * Name: getXPSplit
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_70527_a = McMappingDatabase.getSRG("EntityXPOrb.func_70527_a");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityXPOrb.func_70097_a");

	/**
	 * <p>
	 * Name: xpOrbHealth
	 * </p>
	 */
	public static McObfPair field_70529_d = McMappingDatabase.getSRG("field_70529_d");

	/**
	 * <p>
	 * Name: xpValue
	 * </p>
	 */
	public static McObfPair field_70530_e = McMappingDatabase.getSRG("field_70530_e");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityXPOrb.func_70037_a");

	/**
	 * <p>
	 * Name: delayBeforeCanPickup
	 * </p>
	 */
	public static McObfPair field_70532_c = McMappingDatabase.getSRG("field_70532_c");

	/**
	 * <p>
	 * Name: canBeAttackedWithItem
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70075_an = McMappingDatabase.getSRG("EntityXPOrb.func_70075_an");

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70070_b = McMappingDatabase.getSRG("EntityXPOrb.func_70070_b");

	/**
	 * <p>
	 * Name: durabilityToXp
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_184515_b = McMappingDatabase.getSRG("EntityXPOrb.func_184515_b");

	/**
	 * <p>
	 * Name: xpOrbAge
	 * </p>
	 */
	public static McObfPair field_70531_b = McMappingDatabase.getSRG("field_70531_b");

	/**
	 * <p>
	 * Name: xpTargetColor
	 * </p>
	 */
	public static McObfPair field_80002_g = McMappingDatabase.getSRG("field_80002_g");

	/**
	 * <p>
	 * Name: getXpValue
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70526_d = McMappingDatabase.getSRG("EntityXPOrb.func_70526_d");

	/**
	 * <p>
	 * Name: handleWaterMovement
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70072_I = McMappingDatabase.getSRG("EntityXPOrb.func_70072_I");

	/**
	 * <p>
	 * Name: xpToDurability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_184514_c = McMappingDatabase.getSRG("EntityXPOrb.func_184514_c");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityXPOrb.func_70088_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityXPOrb.func_70071_h_");

	/**
	 * <p>
	 * Name: dealFireDamage
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70081_e = McMappingDatabase.getSRG("EntityXPOrb.func_70081_e");

	/**
	 * <p>
	 * Name: xpColor
	 * </p>
	 */
	public static McObfPair field_70533_a = McMappingDatabase.getSRG("field_70533_a");

	/**
	 * <p>
	 * Name: getTextureByXP
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70528_g = McMappingDatabase.getSRG("EntityXPOrb.func_70528_g");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityXPOrb.func_70014_b");

}

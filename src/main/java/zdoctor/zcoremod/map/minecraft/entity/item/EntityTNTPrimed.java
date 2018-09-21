package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityTNTPrimed {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acm";
		else
			return "net/minecraft/entity/item/EntityTNTPrimed";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acm";
		else
			return "EntityTNTPrimed";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacm;";
		else
			return "Lnet/minecraft/entity/item/EntityTNTPrimed;";
	}

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityTNTPrimed.func_70037_a");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("EntityTNTPrimed.func_184206_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityTNTPrimed.func_70071_h_");

	/**
	 * <p>
	 * Name: getFuseDataManager
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184535_k = McMappingDatabase.getSRG("EntityTNTPrimed.func_184535_k");

	/**
	 * <p>
	 * Name: fuse
	 * </p>
	 */
	public static McObfPair field_70516_a = McMappingDatabase.getSRG("field_70516_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityTNTPrimed.func_70088_a");

	/**
	 * <p>
	 * Name: setFuse
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_184534_a = McMappingDatabase.getSRG("EntityTNTPrimed.func_184534_a");

	/**
	 * <p>
	 * Name: canBeCollidedWith
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70067_L = McMappingDatabase.getSRG("EntityTNTPrimed.func_70067_L");

	/**
	 * <p>
	 * Name: getFuse
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184536_l = McMappingDatabase.getSRG("EntityTNTPrimed.func_184536_l");

	/**
	 * <p>
	 * Name: getTntPlacedBy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityLivingBase;]
	 * </p>
	 */
	public static McObfPair func_94083_c = McMappingDatabase.getSRG("EntityTNTPrimed.func_94083_c");

	/**
	 * <p>
	 * Name: FUSE
	 * </p>
	 */
	public static McObfPair field_184537_a = McMappingDatabase.getSRG("field_184537_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityTNTPrimed.func_70014_b");

	/**
	 * <p>
	 * Name: canTriggerWalking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70041_e_ = McMappingDatabase.getSRG("EntityTNTPrimed.func_70041_e_");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityTNTPrimed.func_70047_e");

	/**
	 * <p>
	 * Name: explode
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70515_d = McMappingDatabase.getSRG("EntityTNTPrimed.func_70515_d");

	/**
	 * <p>
	 * Name: tntPlacedBy
	 * </p>
	 */
	public static McObfPair field_94084_b = McMappingDatabase.getSRG("field_94084_b");

}

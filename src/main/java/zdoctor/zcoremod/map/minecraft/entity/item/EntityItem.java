package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityItem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acl";
		else
			return "net/minecraft/entity/item/EntityItem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acl";
		else
			return "EntityItem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacl;";
		else
			return "Lnet/minecraft/entity/item/EntityItem;";
	}

	/**
	 * <p>
	 * Name: setAgeToCreativeDespawnTime
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70288_d = McMappingDatabase.getSRG("EntityItem.func_70288_d");

	/**
	 * <p>
	 * Name: hoverStart
	 * </p>
	 */
	public static McObfPair field_70290_d = McMappingDatabase.getSRG("field_70290_d");

	/**
	 * <p>
	 * Name: setOwner
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_145797_a = McMappingDatabase.getSRG("EntityItem.func_145797_a");

	/**
	 * <p>
	 * Name: health
	 * </p>
	 */
	public static McObfPair field_70291_e = McMappingDatabase.getSRG("field_70291_e");

	/**
	 * <p>
	 * Name: setThrower
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_145799_b = McMappingDatabase.getSRG("EntityItem.func_145799_b");

	/**
	 * <p>
	 * Name: onCollideWithPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_70100_b_ = McMappingDatabase.getSRG("EntityItem.func_70100_b_");

	/**
	 * <p>
	 * Name: setPickupDelay
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_174867_a = McMappingDatabase.getSRG("EntityItem.func_174867_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("EntityItem.func_70005_c_");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityItem.func_70014_b");

	/**
	 * <p>
	 * Name: getAge
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_174872_o = McMappingDatabase.getSRG("EntityItem.func_174872_o");

	/**
	 * <p>
	 * Name: handleWaterMovement
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70072_I = McMappingDatabase.getSRG("EntityItem.func_70072_I");

	/**
	 * <p>
	 * Name: getThrower
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_145800_j = McMappingDatabase.getSRG("EntityItem.func_145800_j");

	/**
	 * <p>
	 * Name: canBeAttackedWithItem
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70075_an = McMappingDatabase.getSRG("EntityItem.func_70075_an");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_92059_d = McMappingDatabase.getSRG("EntityItem.func_92059_d");

	/**
	 * <p>
	 * Name: getOwner
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_145798_i = McMappingDatabase.getSRG("EntityItem.func_145798_i");

	/**
	 * <p>
	 * Name: changeDimension
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_184204_a = McMappingDatabase.getSRG("EntityItem.func_184204_a");

	/**
	 * <p>
	 * Name: setInfinitePickupDelay
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174871_r = McMappingDatabase.getSRG("EntityItem.func_174871_r");

	/**
	 * <p>
	 * Name: dealFireDamage
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70081_e = McMappingDatabase.getSRG("EntityItem.func_70081_e");

	/**
	 * <p>
	 * Name: cannotPickup
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174874_s = McMappingDatabase.getSRG("EntityItem.func_174874_s");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityItem.func_70071_h_");

	/**
	 * <p>
	 * Name: owner
	 * </p>
	 */
	public static McObfPair field_145802_g = McMappingDatabase.getSRG("field_145802_g");

	/**
	 * <p>
	 * Name: ITEM
	 * </p>
	 */
	public static McObfPair field_184533_c = McMappingDatabase.getSRG("field_184533_c");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_145803_d = McMappingDatabase.getSRG("field_145803_d");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityItem.func_70037_a");

	/**
	 * <p>
	 * Name: combineItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityItem;)Z]
	 * </p>
	 */
	public static McObfPair func_70289_a = McMappingDatabase.getSRG("EntityItem.func_70289_a");

	/**
	 * <p>
	 * Name: pickupDelay
	 * </p>
	 */
	public static McObfPair field_145804_b = McMappingDatabase.getSRG("field_145804_b");

	/**
	 * <p>
	 * Name: makeFakeItem
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174870_v = McMappingDatabase.getSRG("EntityItem.func_174870_v");

	/**
	 * <p>
	 * Name: setDefaultPickupDelay
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174869_p = McMappingDatabase.getSRG("EntityItem.func_174869_p");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityItem.func_70097_a");

	/**
	 * <p>
	 * Name: setNoPickupDelay
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174868_q = McMappingDatabase.getSRG("EntityItem.func_174868_q");

	/**
	 * <p>
	 * Name: registerFixesItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189742_a = McMappingDatabase.getSRG("EntityItem.func_189742_a");

	/**
	 * <p>
	 * Name: thrower
	 * </p>
	 */
	public static McObfPair field_145801_f = McMappingDatabase.getSRG("field_145801_f");

	/**
	 * <p>
	 * Name: age
	 * </p>
	 */
	public static McObfPair field_70292_b = McMappingDatabase.getSRG("field_70292_b");

	/**
	 * <p>
	 * Name: searchForOtherItemsNearby
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_85054_d = McMappingDatabase.getSRG("EntityItem.func_85054_d");

	/**
	 * <p>
	 * Name: setItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_92058_a = McMappingDatabase.getSRG("EntityItem.func_92058_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityItem.func_70088_a");

	/**
	 * <p>
	 * Name: canTriggerWalking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70041_e_ = McMappingDatabase.getSRG("EntityItem.func_70041_e_");

	/**
	 * <p>
	 * Name: setNoDespawn
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174873_u = McMappingDatabase.getSRG("EntityItem.func_174873_u");

}

package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityItemFrame {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acb";
		else
			return "net/minecraft/entity/item/EntityItemFrame";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acb";
		else
			return "EntityItemFrame";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacb;";
		else
			return "Lnet/minecraft/entity/item/EntityItemFrame;";
	}

	/**
	 * <p>
	 * Name: dropItemOrSelf
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Z)V]
	 * </p>
	 */
	public static McObfPair func_146065_b = McMappingDatabase.getSRG("EntityItemFrame.func_146065_b");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityItemFrame.func_70037_a");

	/**
	 * <p>
	 * Name: isInRangeToRenderDist
	 * </p>
	 * <p>
	 * Desc: [(D)Z]
	 * </p>
	 */
	public static McObfPair func_70112_a = McMappingDatabase.getSRG("EntityItemFrame.func_70112_a");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("EntityItemFrame.func_184206_a");

	/**
	 * <p>
	 * Name: setItemRotation
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_82336_g = McMappingDatabase.getSRG("EntityItemFrame.func_82336_g");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityItemFrame.func_70088_a");

	/**
	 * <p>
	 * Name: getCollisionBorderSize
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70111_Y = McMappingDatabase.getSRG("EntityItemFrame.func_70111_Y");

	/**
	 * <p>
	 * Name: ITEM
	 * </p>
	 */
	public static McObfPair field_184525_c = McMappingDatabase.getSRG("field_184525_c");

	/**
	 * <p>
	 * Name: playPlaceSound
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184523_o = McMappingDatabase.getSRG("EntityItemFrame.func_184523_o");

	/**
	 * <p>
	 * Name: setDisplayedItemWithUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Z)V]
	 * </p>
	 */
	public static McObfPair func_174864_a = McMappingDatabase.getSRG("EntityItemFrame.func_174864_a");

	/**
	 * <p>
	 * Name: getRotation
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82333_j = McMappingDatabase.getSRG("EntityItemFrame.func_82333_j");

	/**
	 * <p>
	 * Name: itemDropChance
	 * </p>
	 */
	public static McObfPair field_82337_e = McMappingDatabase.getSRG("field_82337_e");

	/**
	 * <p>
	 * Name: processInitialInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184230_a = McMappingDatabase.getSRG("EntityItemFrame.func_184230_a");

	/**
	 * <p>
	 * Name: setDisplayedItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_82334_a = McMappingDatabase.getSRG("EntityItemFrame.func_82334_a");

	/**
	 * <p>
	 * Name: getWidthPixels
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82329_d = McMappingDatabase.getSRG("EntityItemFrame.func_82329_d");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityItemFrame.func_70097_a");

	/**
	 * <p>
	 * Name: ROTATION
	 * </p>
	 */
	public static McObfPair field_184526_d = McMappingDatabase.getSRG("field_184526_d");

	/**
	 * <p>
	 * Name: getDisplayedItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82335_i = McMappingDatabase.getSRG("EntityItemFrame.func_82335_i");

	/**
	 * <p>
	 * Name: getAnalogOutput
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_174866_q = McMappingDatabase.getSRG("EntityItemFrame.func_174866_q");

	/**
	 * <p>
	 * Name: registerFixesItemFrame
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189738_a = McMappingDatabase.getSRG("EntityItemFrame.func_189738_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityItemFrame.func_70014_b");

	/**
	 * <p>
	 * Name: onBroken
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_110128_b = McMappingDatabase.getSRG("EntityItemFrame.func_110128_b");

	/**
	 * <p>
	 * Name: removeFrameFromMap
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_110131_b = McMappingDatabase.getSRG("EntityItemFrame.func_110131_b");

	/**
	 * <p>
	 * Name: setRotation
	 * </p>
	 * <p>
	 * Desc: [(IZ)V]
	 * </p>
	 */
	public static McObfPair func_174865_a = McMappingDatabase.getSRG("EntityItemFrame.func_174865_a");

	/**
	 * <p>
	 * Name: getHeightPixels
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82330_g = McMappingDatabase.getSRG("EntityItemFrame.func_82330_g");

}

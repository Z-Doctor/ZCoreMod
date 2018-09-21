package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class InventoryLargeChest {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tu";
		else
			return "net/minecraft/inventory/InventoryLargeChest";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tu";
		else
			return "InventoryLargeChest";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ltu;";
		else
			return "Lnet/minecraft/inventory/InventoryLargeChest;";
	}

	/**
	 * <p>
	 * Name: setInventorySlotContents
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_70299_a = McMappingDatabase.getSRG("InventoryLargeChest.func_70299_a");

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174888_l = McMappingDatabase.getSRG("InventoryLargeChest.func_174888_l");

	/**
	 * <p>
	 * Name: decrStackSize
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70298_a = McMappingDatabase.getSRG("InventoryLargeChest.func_70298_a");

	/**
	 * <p>
	 * Name: upperChest
	 * </p>
	 */
	public static McObfPair field_70477_b = McMappingDatabase.getSRG("field_70477_b");

	/**
	 * <p>
	 * Name: openInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174889_b = McMappingDatabase.getSRG("InventoryLargeChest.func_174889_b");

	/**
	 * <p>
	 * Name: getInventoryStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70297_j_ = McMappingDatabase.getSRG("InventoryLargeChest.func_70297_j_");

	/**
	 * <p>
	 * Name: createContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/inventory/Container;]
	 * </p>
	 */
	public static McObfPair func_174876_a = McMappingDatabase.getSRG("InventoryLargeChest.func_174876_a");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191420_l = McMappingDatabase.getSRG("InventoryLargeChest.func_191420_l");

	/**
	 * <p>
	 * Name: getField
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_174887_a_ = McMappingDatabase.getSRG("InventoryLargeChest.func_174887_a_");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("InventoryLargeChest.func_70005_c_");

	/**
	 * <p>
	 * Name: isPartOfLargeChest
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;)Z]
	 * </p>
	 */
	public static McObfPair func_90010_a = McMappingDatabase.getSRG("InventoryLargeChest.func_90010_a");

	/**
	 * <p>
	 * Name: closeInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174886_c = McMappingDatabase.getSRG("InventoryLargeChest.func_174886_c");

	/**
	 * <p>
	 * Name: getGuiID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_174875_k = McMappingDatabase.getSRG("InventoryLargeChest.func_174875_k");

	/**
	 * <p>
	 * Name: hasCustomName
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145818_k_ = McMappingDatabase.getSRG("InventoryLargeChest.func_145818_k_");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("InventoryLargeChest.func_145748_c_");

	/**
	 * <p>
	 * Name: isLocked
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174893_q_ = McMappingDatabase.getSRG("InventoryLargeChest.func_174893_q_");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_70479_a = McMappingDatabase.getSRG("field_70479_a");

	/**
	 * <p>
	 * Name: removeStackFromSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70304_b = McMappingDatabase.getSRG("InventoryLargeChest.func_70304_b");

	/**
	 * <p>
	 * Name: getStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70301_a = McMappingDatabase.getSRG("InventoryLargeChest.func_70301_a");

	/**
	 * <p>
	 * Name: setLockCode
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/LockCode;)V]
	 * </p>
	 */
	public static McObfPair func_174892_a = McMappingDatabase.getSRG("InventoryLargeChest.func_174892_a");

	/**
	 * <p>
	 * Name: getSizeInventory
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70302_i_ = McMappingDatabase.getSRG("InventoryLargeChest.func_70302_i_");

	/**
	 * <p>
	 * Name: getLockCode
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/LockCode;]
	 * </p>
	 */
	public static McObfPair func_174891_i = McMappingDatabase.getSRG("InventoryLargeChest.func_174891_i");

	/**
	 * <p>
	 * Name: lowerChest
	 * </p>
	 */
	public static McObfPair field_70478_c = McMappingDatabase.getSRG("field_70478_c");

	/**
	 * <p>
	 * Name: markDirty
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70296_d = McMappingDatabase.getSRG("InventoryLargeChest.func_70296_d");

	/**
	 * <p>
	 * Name: getFieldCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_174890_g = McMappingDatabase.getSRG("InventoryLargeChest.func_174890_g");

	/**
	 * <p>
	 * Name: setField
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_174885_b = McMappingDatabase.getSRG("InventoryLargeChest.func_174885_b");

	/**
	 * <p>
	 * Name: isUsableByPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_70300_a = McMappingDatabase.getSRG("InventoryLargeChest.func_70300_a");

	/**
	 * <p>
	 * Name: isItemValidForSlot
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_94041_b = McMappingDatabase.getSRG("InventoryLargeChest.func_94041_b");

}

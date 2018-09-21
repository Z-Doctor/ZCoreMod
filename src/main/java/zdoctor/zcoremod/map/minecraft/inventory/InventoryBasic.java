package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class InventoryBasic {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uk";
		else
			return "net/minecraft/inventory/InventoryBasic";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uk";
		else
			return "InventoryBasic";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Luk;";
		else
			return "Lnet/minecraft/inventory/InventoryBasic;";
	}

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191420_l = McMappingDatabase.getSRG("InventoryBasic.func_191420_l");

	/**
	 * <p>
	 * Name: openInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174889_b = McMappingDatabase.getSRG("InventoryBasic.func_174889_b");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("InventoryBasic.func_145748_c_");

	/**
	 * <p>
	 * Name: isItemValidForSlot
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_94041_b = McMappingDatabase.getSRG("InventoryBasic.func_94041_b");

	/**
	 * <p>
	 * Name: inventoryContents
	 * </p>
	 */
	public static McObfPair field_70482_c = McMappingDatabase.getSRG("field_70482_c");

	/**
	 * <p>
	 * Name: getInventoryStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70297_j_ = McMappingDatabase.getSRG("InventoryBasic.func_70297_j_");

	/**
	 * <p>
	 * Name: markDirty
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70296_d = McMappingDatabase.getSRG("InventoryBasic.func_70296_d");

	/**
	 * <p>
	 * Name: changeListeners
	 * </p>
	 */
	public static McObfPair field_70480_d = McMappingDatabase.getSRG("field_70480_d");

	/**
	 * <p>
	 * Name: getFieldCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_174890_g = McMappingDatabase.getSRG("InventoryBasic.func_174890_g");

	/**
	 * <p>
	 * Name: setCustomName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_110133_a = McMappingDatabase.getSRG("InventoryBasic.func_110133_a");

	/**
	 * <p>
	 * Name: setField
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_174885_b = McMappingDatabase.getSRG("InventoryBasic.func_174885_b");

	/**
	 * <p>
	 * Name: getField
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_174887_a_ = McMappingDatabase.getSRG("InventoryBasic.func_174887_a_");

	/**
	 * <p>
	 * Name: getSizeInventory
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70302_i_ = McMappingDatabase.getSRG("InventoryBasic.func_70302_i_");

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174888_l = McMappingDatabase.getSRG("InventoryBasic.func_174888_l");

	/**
	 * <p>
	 * Name: addItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_174894_a = McMappingDatabase.getSRG("InventoryBasic.func_174894_a");

	/**
	 * <p>
	 * Name: decrStackSize
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70298_a = McMappingDatabase.getSRG("InventoryBasic.func_70298_a");

	/**
	 * <p>
	 * Name: hasCustomName
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145818_k_ = McMappingDatabase.getSRG("InventoryBasic.func_145818_k_");

	/**
	 * <p>
	 * Name: removeStackFromSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70304_b = McMappingDatabase.getSRG("InventoryBasic.func_70304_b");

	/**
	 * <p>
	 * Name: inventoryTitle
	 * </p>
	 */
	public static McObfPair field_70483_a = McMappingDatabase.getSRG("field_70483_a");

	/**
	 * <p>
	 * Name: isUsableByPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_70300_a = McMappingDatabase.getSRG("InventoryBasic.func_70300_a");

	/**
	 * <p>
	 * Name: slotsCount
	 * </p>
	 */
	public static McObfPair field_70481_b = McMappingDatabase.getSRG("field_70481_b");

	/**
	 * <p>
	 * Name: closeInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174886_c = McMappingDatabase.getSRG("InventoryBasic.func_174886_c");

	/**
	 * <p>
	 * Name: addInventoryChangeListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventoryChangedListener;)V]
	 * </p>
	 */
	public static McObfPair func_110134_a = McMappingDatabase.getSRG("InventoryBasic.func_110134_a");

	/**
	 * <p>
	 * Name: removeInventoryChangeListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventoryChangedListener;)V]
	 * </p>
	 */
	public static McObfPair func_110132_b = McMappingDatabase.getSRG("InventoryBasic.func_110132_b");

	/**
	 * <p>
	 * Name: hasCustomName
	 * </p>
	 */
	public static McObfPair field_94051_e = McMappingDatabase.getSRG("field_94051_e");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("InventoryBasic.func_70005_c_");

	/**
	 * <p>
	 * Name: setInventorySlotContents
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_70299_a = McMappingDatabase.getSRG("InventoryBasic.func_70299_a");

	/**
	 * <p>
	 * Name: getStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70301_a = McMappingDatabase.getSRG("InventoryBasic.func_70301_a");

}

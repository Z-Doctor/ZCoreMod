package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class InventoryMerchant {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agj";
		else
			return "net/minecraft/inventory/InventoryMerchant";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agj";
		else
			return "InventoryMerchant";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagj;";
		else
			return "Lnet/minecraft/inventory/InventoryMerchant;";
	}

	/**
	 * <p>
	 * Name: setInventorySlotContents
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_70299_a = McMappingDatabase.getSRG("InventoryMerchant.func_70299_a");

	/**
	 * <p>
	 * Name: isUsableByPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_70300_a = McMappingDatabase.getSRG("InventoryMerchant.func_70300_a");

	/**
	 * <p>
	 * Name: getField
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_174887_a_ = McMappingDatabase.getSRG("InventoryMerchant.func_174887_a_");

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174888_l = McMappingDatabase.getSRG("InventoryMerchant.func_174888_l");

	/**
	 * <p>
	 * Name: getFieldCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_174890_g = McMappingDatabase.getSRG("InventoryMerchant.func_174890_g");

	/**
	 * <p>
	 * Name: markDirty
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70296_d = McMappingDatabase.getSRG("InventoryMerchant.func_70296_d");

	/**
	 * <p>
	 * Name: removeStackFromSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70304_b = McMappingDatabase.getSRG("InventoryMerchant.func_70304_b");

	/**
	 * <p>
	 * Name: getCurrentRecipe
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/village/MerchantRecipe;]
	 * </p>
	 */
	public static McObfPair func_70468_h = McMappingDatabase.getSRG("InventoryMerchant.func_70468_h");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("InventoryMerchant.func_70005_c_");

	/**
	 * <p>
	 * Name: currentRecipe
	 * </p>
	 */
	public static McObfPair field_70472_d = McMappingDatabase.getSRG("field_70472_d");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("InventoryMerchant.func_145748_c_");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191420_l = McMappingDatabase.getSRG("InventoryMerchant.func_191420_l");

	/**
	 * <p>
	 * Name: merchant
	 * </p>
	 */
	public static McObfPair field_70476_a = McMappingDatabase.getSRG("field_70476_a");

	/**
	 * <p>
	 * Name: getInventoryStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70297_j_ = McMappingDatabase.getSRG("InventoryMerchant.func_70297_j_");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_70475_c = McMappingDatabase.getSRG("field_70475_c");

	/**
	 * <p>
	 * Name: getStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70301_a = McMappingDatabase.getSRG("InventoryMerchant.func_70301_a");

	/**
	 * <p>
	 * Name: inventoryResetNeededOnSlotChange
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_70469_d = McMappingDatabase.getSRG("InventoryMerchant.func_70469_d");

	/**
	 * <p>
	 * Name: resetRecipeAndSlots
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70470_g = McMappingDatabase.getSRG("InventoryMerchant.func_70470_g");

	/**
	 * <p>
	 * Name: closeInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174886_c = McMappingDatabase.getSRG("InventoryMerchant.func_174886_c");

	/**
	 * <p>
	 * Name: setField
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_174885_b = McMappingDatabase.getSRG("InventoryMerchant.func_174885_b");

	/**
	 * <p>
	 * Name: currentRecipeIndex
	 * </p>
	 */
	public static McObfPair field_70473_e = McMappingDatabase.getSRG("field_70473_e");

	/**
	 * <p>
	 * Name: openInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174889_b = McMappingDatabase.getSRG("InventoryMerchant.func_174889_b");

	/**
	 * <p>
	 * Name: getSizeInventory
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70302_i_ = McMappingDatabase.getSRG("InventoryMerchant.func_70302_i_");

	/**
	 * <p>
	 * Name: hasCustomName
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145818_k_ = McMappingDatabase.getSRG("InventoryMerchant.func_145818_k_");

	/**
	 * <p>
	 * Name: setCurrentRecipeIndex
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70471_c = McMappingDatabase.getSRG("InventoryMerchant.func_70471_c");

	/**
	 * <p>
	 * Name: isItemValidForSlot
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_94041_b = McMappingDatabase.getSRG("InventoryMerchant.func_94041_b");

	/**
	 * <p>
	 * Name: slots
	 * </p>
	 */
	public static McObfPair field_70474_b = McMappingDatabase.getSRG("field_70474_b");

	/**
	 * <p>
	 * Name: decrStackSize
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70298_a = McMappingDatabase.getSRG("InventoryMerchant.func_70298_a");

}

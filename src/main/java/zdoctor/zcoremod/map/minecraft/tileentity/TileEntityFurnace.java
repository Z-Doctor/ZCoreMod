package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityFurnace {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avu";
		else
			return "net/minecraft/tileentity/TileEntityFurnace";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avu";
		else
			return "TileEntityFurnace";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavu;";
		else
			return "Lnet/minecraft/tileentity/TileEntityFurnace;";
	}

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("TileEntityFurnace.func_73660_a");

	/**
	 * <p>
	 * Name: setField
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_174885_b = McMappingDatabase.getSRG("TileEntityFurnace.func_174885_b");

	/**
	 * <p>
	 * Name: furnaceItemStacks
	 * </p>
	 */
	public static McObfPair field_145957_n = McMappingDatabase.getSRG("field_145957_n");

	/**
	 * <p>
	 * Name: registerFixesFurnace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189676_a = McMappingDatabase.getSRG("TileEntityFurnace.func_189676_a");

	/**
	 * <p>
	 * Name: isItemValidForSlot
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_94041_b = McMappingDatabase.getSRG("TileEntityFurnace.func_94041_b");

	/**
	 * <p>
	 * Name: furnaceCustomName
	 * </p>
	 */
	public static McObfPair field_145958_o = McMappingDatabase.getSRG("field_145958_o");

	/**
	 * <p>
	 * Name: getCookTime
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_174904_a = McMappingDatabase.getSRG("TileEntityFurnace.func_174904_a");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191420_l = McMappingDatabase.getSRG("TileEntityFurnace.func_191420_l");

	/**
	 * <p>
	 * Name: isBurning
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;)Z]
	 * </p>
	 */
	public static McObfPair func_174903_a = McMappingDatabase.getSRG("TileEntityFurnace.func_174903_a");

	/**
	 * <p>
	 * Name: isBurning
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145950_i = McMappingDatabase.getSRG("TileEntityFurnace.func_145950_i");

	/**
	 * <p>
	 * Name: SLOTS_BOTTOM
	 * </p>
	 */
	public static McObfPair field_145959_l = McMappingDatabase.getSRG("field_145959_l");

	/**
	 * <p>
	 * Name: getGuiID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_174875_k = McMappingDatabase.getSRG("TileEntityFurnace.func_174875_k");

	/**
	 * <p>
	 * Name: SLOTS_TOP
	 * </p>
	 */
	public static McObfPair field_145962_k = McMappingDatabase.getSRG("field_145962_k");

	/**
	 * <p>
	 * Name: currentItemBurnTime
	 * </p>
	 */
	public static McObfPair field_145963_i = McMappingDatabase.getSRG("field_145963_i");

	/**
	 * <p>
	 * Name: canSmelt
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145948_k = McMappingDatabase.getSRG("TileEntityFurnace.func_145948_k");

	/**
	 * <p>
	 * Name: openInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174889_b = McMappingDatabase.getSRG("TileEntityFurnace.func_174889_b");

	/**
	 * <p>
	 * Name: isItemFuel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_145954_b = McMappingDatabase.getSRG("TileEntityFurnace.func_145954_b");

	/**
	 * <p>
	 * Name: smeltItem
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145949_j = McMappingDatabase.getSRG("TileEntityFurnace.func_145949_j");

	/**
	 * <p>
	 * Name: cookTime
	 * </p>
	 */
	public static McObfPair field_174906_k = McMappingDatabase.getSRG("field_174906_k");

	/**
	 * <p>
	 * Name: decrStackSize
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70298_a = McMappingDatabase.getSRG("TileEntityFurnace.func_70298_a");

	/**
	 * <p>
	 * Name: canInsertItem
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_180462_a = McMappingDatabase.getSRG("TileEntityFurnace.func_180462_a");

	/**
	 * <p>
	 * Name: getStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70301_a = McMappingDatabase.getSRG("TileEntityFurnace.func_70301_a");

	/**
	 * <p>
	 * Name: getFieldCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_174890_g = McMappingDatabase.getSRG("TileEntityFurnace.func_174890_g");

	/**
	 * <p>
	 * Name: totalCookTime
	 * </p>
	 */
	public static McObfPair field_174905_l = McMappingDatabase.getSRG("field_174905_l");

	/**
	 * <p>
	 * Name: getInventoryStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70297_j_ = McMappingDatabase.getSRG("TileEntityFurnace.func_70297_j_");

	/**
	 * <p>
	 * Name: furnaceBurnTime
	 * </p>
	 */
	public static McObfPair field_145956_a = McMappingDatabase.getSRG("field_145956_a");

	/**
	 * <p>
	 * Name: getSizeInventory
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70302_i_ = McMappingDatabase.getSRG("TileEntityFurnace.func_70302_i_");

	/**
	 * <p>
	 * Name: getField
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_174887_a_ = McMappingDatabase.getSRG("TileEntityFurnace.func_174887_a_");

	/**
	 * <p>
	 * Name: createContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/inventory/Container;]
	 * </p>
	 */
	public static McObfPair func_174876_a = McMappingDatabase.getSRG("TileEntityFurnace.func_174876_a");

	/**
	 * <p>
	 * Name: hasCustomName
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145818_k_ = McMappingDatabase.getSRG("TileEntityFurnace.func_145818_k_");

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174888_l = McMappingDatabase.getSRG("TileEntityFurnace.func_174888_l");

	/**
	 * <p>
	 * Name: getSlotsForFace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)[I]
	 * </p>
	 */
	public static McObfPair func_180463_a = McMappingDatabase.getSRG("TileEntityFurnace.func_180463_a");

	/**
	 * <p>
	 * Name: getItemBurnTime
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_145952_a = McMappingDatabase.getSRG("TileEntityFurnace.func_145952_a");

	/**
	 * <p>
	 * Name: canExtractItem
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_180461_b = McMappingDatabase.getSRG("TileEntityFurnace.func_180461_b");

	/**
	 * <p>
	 * Name: removeStackFromSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70304_b = McMappingDatabase.getSRG("TileEntityFurnace.func_70304_b");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityFurnace.func_189515_b");

	/**
	 * <p>
	 * Name: SLOTS_SIDES
	 * </p>
	 */
	public static McObfPair field_145960_m = McMappingDatabase.getSRG("field_145960_m");

	/**
	 * <p>
	 * Name: closeInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174886_c = McMappingDatabase.getSRG("TileEntityFurnace.func_174886_c");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityFurnace.func_145839_a");

	/**
	 * <p>
	 * Name: isUsableByPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_70300_a = McMappingDatabase.getSRG("TileEntityFurnace.func_70300_a");

	/**
	 * <p>
	 * Name: setInventorySlotContents
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_70299_a = McMappingDatabase.getSRG("TileEntityFurnace.func_70299_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("TileEntityFurnace.func_70005_c_");

	/**
	 * <p>
	 * Name: setCustomInventoryName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_145951_a = McMappingDatabase.getSRG("TileEntityFurnace.func_145951_a");

}

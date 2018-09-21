package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityBrewingStand {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avk";
		else
			return "net/minecraft/tileentity/TileEntityBrewingStand";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avk";
		else
			return "TileEntityBrewingStand";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavk;";
		else
			return "Lnet/minecraft/tileentity/TileEntityBrewingStand;";
	}

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174888_l = McMappingDatabase.getSRG("TileEntityBrewingStand.func_174888_l");

	/**
	 * <p>
	 * Name: brewPotions
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145940_l = McMappingDatabase.getSRG("TileEntityBrewingStand.func_145940_l");

	/**
	 * <p>
	 * Name: getInventoryStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70297_j_ = McMappingDatabase.getSRG("TileEntityBrewingStand.func_70297_j_");

	/**
	 * <p>
	 * Name: createFilledSlotsArray
	 * </p>
	 * <p>
	 * Desc: [()[Z]
	 * </p>
	 */
	public static McObfPair func_174902_m = McMappingDatabase.getSRG("TileEntityBrewingStand.func_174902_m");

	/**
	 * <p>
	 * Name: OUTPUT_SLOTS
	 * </p>
	 */
	public static McObfPair field_145947_i = McMappingDatabase.getSRG("field_145947_i");

	/**
	 * <p>
	 * Name: canInsertItem
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_180462_a = McMappingDatabase.getSRG("TileEntityBrewingStand.func_180462_a");

	/**
	 * <p>
	 * Name: getSizeInventory
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70302_i_ = McMappingDatabase.getSRG("TileEntityBrewingStand.func_70302_i_");

	/**
	 * <p>
	 * Name: getField
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_174887_a_ = McMappingDatabase.getSRG("TileEntityBrewingStand.func_174887_a_");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("TileEntityBrewingStand.func_73660_a");

	/**
	 * <p>
	 * Name: canExtractItem
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_180461_b = McMappingDatabase.getSRG("TileEntityBrewingStand.func_180461_b");

	/**
	 * <p>
	 * Name: ingredientID
	 * </p>
	 */
	public static McObfPair field_145944_m = McMappingDatabase.getSRG("field_145944_m");

	/**
	 * <p>
	 * Name: customName
	 * </p>
	 */
	public static McObfPair field_145942_n = McMappingDatabase.getSRG("field_145942_n");

	/**
	 * <p>
	 * Name: setField
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_174885_b = McMappingDatabase.getSRG("TileEntityBrewingStand.func_174885_b");

	/**
	 * <p>
	 * Name: brewTime
	 * </p>
	 */
	public static McObfPair field_145946_k = McMappingDatabase.getSRG("field_145946_k");

	/**
	 * <p>
	 * Name: SLOTS_FOR_UP
	 * </p>
	 */
	public static McObfPair field_145941_a = McMappingDatabase.getSRG("field_145941_a");

	/**
	 * <p>
	 * Name: registerFixesBrewingStand
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189675_a = McMappingDatabase.getSRG("TileEntityBrewingStand.func_189675_a");

	/**
	 * <p>
	 * Name: getGuiID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_174875_k = McMappingDatabase.getSRG("TileEntityBrewingStand.func_174875_k");

	/**
	 * <p>
	 * Name: getFieldCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_174890_g = McMappingDatabase.getSRG("TileEntityBrewingStand.func_174890_g");

	/**
	 * <p>
	 * Name: createContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/inventory/Container;]
	 * </p>
	 */
	public static McObfPair func_174876_a = McMappingDatabase.getSRG("TileEntityBrewingStand.func_174876_a");

	/**
	 * <p>
	 * Name: brewingItemStacks
	 * </p>
	 */
	public static McObfPair field_145945_j = McMappingDatabase.getSRG("field_145945_j");

	/**
	 * <p>
	 * Name: isItemValidForSlot
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_94041_b = McMappingDatabase.getSRG("TileEntityBrewingStand.func_94041_b");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityBrewingStand.func_145839_a");

	/**
	 * <p>
	 * Name: closeInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174886_c = McMappingDatabase.getSRG("TileEntityBrewingStand.func_174886_c");

	/**
	 * <p>
	 * Name: removeStackFromSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70304_b = McMappingDatabase.getSRG("TileEntityBrewingStand.func_70304_b");

	/**
	 * <p>
	 * Name: fuel
	 * </p>
	 */
	public static McObfPair field_184278_m = McMappingDatabase.getSRG("field_184278_m");

	/**
	 * <p>
	 * Name: getSlotsForFace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)[I]
	 * </p>
	 */
	public static McObfPair func_180463_a = McMappingDatabase.getSRG("TileEntityBrewingStand.func_180463_a");

	/**
	 * <p>
	 * Name: setName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_145937_a = McMappingDatabase.getSRG("TileEntityBrewingStand.func_145937_a");

	/**
	 * <p>
	 * Name: canBrew
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145934_k = McMappingDatabase.getSRG("TileEntityBrewingStand.func_145934_k");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("TileEntityBrewingStand.func_70005_c_");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityBrewingStand.func_189515_b");

	/**
	 * <p>
	 * Name: openInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174889_b = McMappingDatabase.getSRG("TileEntityBrewingStand.func_174889_b");

	/**
	 * <p>
	 * Name: setInventorySlotContents
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_70299_a = McMappingDatabase.getSRG("TileEntityBrewingStand.func_70299_a");

	/**
	 * <p>
	 * Name: SLOTS_FOR_DOWN
	 * </p>
	 */
	public static McObfPair field_184277_f = McMappingDatabase.getSRG("field_184277_f");

	/**
	 * <p>
	 * Name: getStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70301_a = McMappingDatabase.getSRG("TileEntityBrewingStand.func_70301_a");

	/**
	 * <p>
	 * Name: isUsableByPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_70300_a = McMappingDatabase.getSRG("TileEntityBrewingStand.func_70300_a");

	/**
	 * <p>
	 * Name: decrStackSize
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70298_a = McMappingDatabase.getSRG("TileEntityBrewingStand.func_70298_a");

	/**
	 * <p>
	 * Name: hasCustomName
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145818_k_ = McMappingDatabase.getSRG("TileEntityBrewingStand.func_145818_k_");

	/**
	 * <p>
	 * Name: filledSlots
	 * </p>
	 */
	public static McObfPair field_145943_l = McMappingDatabase.getSRG("field_145943_l");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191420_l = McMappingDatabase.getSRG("TileEntityBrewingStand.func_191420_l");

}

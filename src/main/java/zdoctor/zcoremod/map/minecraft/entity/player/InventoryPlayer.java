package zdoctor.zcoremod.map.minecraft.entity.player;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class InventoryPlayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aec";
		else
			return "net/minecraft/entity/player/InventoryPlayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aec";
		else
			return "InventoryPlayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laec;";
		else
			return "Lnet/minecraft/entity/player/InventoryPlayer;";
	}

	/**
	 * <p>
	 * Name: hasCustomName
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145818_k_ = McMappingDatabase.getSRG("InventoryPlayer.func_145818_k_");

	/**
	 * <p>
	 * Name: getInventoryStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70297_j_ = McMappingDatabase.getSRG("InventoryPlayer.func_70297_j_");

	/**
	 * <p>
	 * Name: getSizeInventory
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70302_i_ = McMappingDatabase.getSRG("InventoryPlayer.func_70302_i_");

	/**
	 * <p>
	 * Name: currentItem
	 * </p>
	 */
	public static McObfPair field_70461_c = McMappingDatabase.getSRG("field_70461_c");

	/**
	 * <p>
	 * Name: mainInventory
	 * </p>
	 */
	public static McObfPair field_70462_a = McMappingDatabase.getSRG("field_70462_a");

	/**
	 * <p>
	 * Name: findSlotMatchingUnusedItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_194014_c = McMappingDatabase.getSRG("InventoryPlayer.func_194014_c");

	/**
	 * <p>
	 * Name: getBestHotbarSlot
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184433_k = McMappingDatabase.getSRG("InventoryPlayer.func_184433_k");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("InventoryPlayer.func_145748_c_");

	/**
	 * <p>
	 * Name: markDirty
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70296_d = McMappingDatabase.getSRG("InventoryPlayer.func_70296_d");

	/**
	 * <p>
	 * Name: setPickedItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_184434_a = McMappingDatabase.getSRG("InventoryPlayer.func_184434_a");

	/**
	 * <p>
	 * Name: addResource
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_191973_d = McMappingDatabase.getSRG("InventoryPlayer.func_191973_d");

	/**
	 * <p>
	 * Name: isItemValidForSlot
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_94041_b = McMappingDatabase.getSRG("InventoryPlayer.func_94041_b");

	/**
	 * <p>
	 * Name: allInventories
	 * </p>
	 */
	public static McObfPair field_184440_g = McMappingDatabase.getSRG("field_184440_g");

	/**
	 * <p>
	 * Name: placeItemBackInInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_191975_a = McMappingDatabase.getSRG("InventoryPlayer.func_191975_a");

	/**
	 * <p>
	 * Name: addItemStackToInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_70441_a = McMappingDatabase.getSRG("InventoryPlayer.func_70441_a");

	/**
	 * <p>
	 * Name: closeInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174886_c = McMappingDatabase.getSRG("InventoryPlayer.func_174886_c");

	/**
	 * <p>
	 * Name: getCurrentItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70448_g = McMappingDatabase.getSRG("InventoryPlayer.func_70448_g");

	/**
	 * <p>
	 * Name: getHotbarSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70451_h = McMappingDatabase.getSRG("InventoryPlayer.func_70451_h");

	/**
	 * <p>
	 * Name: removeStackFromSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70304_b = McMappingDatabase.getSRG("InventoryPlayer.func_70304_b");

	/**
	 * <p>
	 * Name: decrStackSize
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70298_a = McMappingDatabase.getSRG("InventoryPlayer.func_70298_a");

	/**
	 * <p>
	 * Name: isHotbar
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_184435_e = McMappingDatabase.getSRG("InventoryPlayer.func_184435_e");

	/**
	 * <p>
	 * Name: armorItemInSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70440_f = McMappingDatabase.getSRG("InventoryPlayer.func_70440_f");

	/**
	 * <p>
	 * Name: timesChanged
	 * </p>
	 */
	public static McObfPair field_194017_h = McMappingDatabase.getSRG("field_194017_h");

	/**
	 * <p>
	 * Name: canMergeStacks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_184436_a = McMappingDatabase.getSRG("InventoryPlayer.func_184436_a");

	/**
	 * <p>
	 * Name: pickItem
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_184430_d = McMappingDatabase.getSRG("InventoryPlayer.func_184430_d");

	/**
	 * <p>
	 * Name: storePartialItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_70452_e = McMappingDatabase.getSRG("InventoryPlayer.func_70452_e");

	/**
	 * <p>
	 * Name: getStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70301_a = McMappingDatabase.getSRG("InventoryPlayer.func_70301_a");

	/**
	 * <p>
	 * Name: setField
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_174885_b = McMappingDatabase.getSRG("InventoryPlayer.func_174885_b");

	/**
	 * <p>
	 * Name: decrementAnimations
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70429_k = McMappingDatabase.getSRG("InventoryPlayer.func_70429_k");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagList;)V]
	 * </p>
	 */
	public static McObfPair func_70443_b = McMappingDatabase.getSRG("InventoryPlayer.func_70443_b");

	/**
	 * <p>
	 * Name: getSlotFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_184429_b = McMappingDatabase.getSRG("InventoryPlayer.func_184429_b");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191420_l = McMappingDatabase.getSRG("InventoryPlayer.func_191420_l");

	/**
	 * <p>
	 * Name: changeCurrentItem
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70453_c = McMappingDatabase.getSRG("InventoryPlayer.func_70453_c");

	/**
	 * <p>
	 * Name: canHarvestBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_184432_b = McMappingDatabase.getSRG("InventoryPlayer.func_184432_b");

	/**
	 * <p>
	 * Name: setInventorySlotContents
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_70299_a = McMappingDatabase.getSRG("InventoryPlayer.func_70299_a");

	/**
	 * <p>
	 * Name: damageArmor
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_70449_g = McMappingDatabase.getSRG("InventoryPlayer.func_70449_g");

	/**
	 * <p>
	 * Name: offHandInventory
	 * </p>
	 */
	public static McObfPair field_184439_c = McMappingDatabase.getSRG("field_184439_c");

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174888_l = McMappingDatabase.getSRG("InventoryPlayer.func_174888_l");

	/**
	 * <p>
	 * Name: dropAllItems
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70436_m = McMappingDatabase.getSRG("InventoryPlayer.func_70436_m");

	/**
	 * <p>
	 * Name: armorInventory
	 * </p>
	 */
	public static McObfPair field_70460_b = McMappingDatabase.getSRG("field_70460_b");

	/**
	 * <p>
	 * Name: hasItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_70431_c = McMappingDatabase.getSRG("InventoryPlayer.func_70431_c");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagList;)Lnet/minecraft/nbt/NBTTagList;]
	 * </p>
	 */
	public static McObfPair func_70442_a = McMappingDatabase.getSRG("InventoryPlayer.func_70442_a");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_191971_c = McMappingDatabase.getSRG("InventoryPlayer.func_191971_c");

	/**
	 * <p>
	 * Name: setItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_70437_b = McMappingDatabase.getSRG("InventoryPlayer.func_70437_b");

	/**
	 * <p>
	 * Name: getFieldCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_174890_g = McMappingDatabase.getSRG("InventoryPlayer.func_174890_g");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_70458_d = McMappingDatabase.getSRG("field_70458_d");

	/**
	 * <p>
	 * Name: clearMatchingItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;IILnet/minecraft/nbt/NBTTagCompound;)I]
	 * </p>
	 */
	public static McObfPair func_174925_a = McMappingDatabase.getSRG("InventoryPlayer.func_174925_a");

	/**
	 * <p>
	 * Name: getItemStack
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70445_o = McMappingDatabase.getSRG("InventoryPlayer.func_70445_o");

	/**
	 * <p>
	 * Name: fillStackedContents
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/util/RecipeItemHelper;Z)V]
	 * </p>
	 */
	public static McObfPair func_194016_a = McMappingDatabase.getSRG("InventoryPlayer.func_194016_a");

	/**
	 * <p>
	 * Name: stackEqualExact
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_184431_b = McMappingDatabase.getSRG("InventoryPlayer.func_184431_b");

	/**
	 * <p>
	 * Name: storeItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_70432_d = McMappingDatabase.getSRG("InventoryPlayer.func_70432_d");

	/**
	 * <p>
	 * Name: copyInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_70455_b = McMappingDatabase.getSRG("InventoryPlayer.func_70455_b");

	/**
	 * <p>
	 * Name: getDestroySpeed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)F]
	 * </p>
	 */
	public static McObfPair func_184438_a = McMappingDatabase.getSRG("InventoryPlayer.func_184438_a");

	/**
	 * <p>
	 * Name: isUsableByPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_70300_a = McMappingDatabase.getSRG("InventoryPlayer.func_70300_a");

	/**
	 * <p>
	 * Name: itemStack
	 * </p>
	 */
	public static McObfPair field_70457_g = McMappingDatabase.getSRG("field_70457_g");

	/**
	 * <p>
	 * Name: getTimesChanged
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_194015_p = McMappingDatabase.getSRG("InventoryPlayer.func_194015_p");

	/**
	 * <p>
	 * Name: getFirstEmptyStack
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70447_i = McMappingDatabase.getSRG("InventoryPlayer.func_70447_i");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("InventoryPlayer.func_70005_c_");

	/**
	 * <p>
	 * Name: getField
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_174887_a_ = McMappingDatabase.getSRG("InventoryPlayer.func_174887_a_");

	/**
	 * <p>
	 * Name: openInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174889_b = McMappingDatabase.getSRG("InventoryPlayer.func_174889_b");

	/**
	 * <p>
	 * Name: deleteStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_184437_d = McMappingDatabase.getSRG("InventoryPlayer.func_184437_d");

}

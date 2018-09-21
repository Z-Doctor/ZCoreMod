package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityHopper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avw";
		else
			return "net/minecraft/tileentity/TileEntityHopper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avw";
		else
			return "TileEntityHopper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavw;";
		else
			return "Lnet/minecraft/tileentity/TileEntityHopper;";
	}

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityHopper.func_189515_b");

	/**
	 * <p>
	 * Name: transferItemsOut
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145883_k = McMappingDatabase.getSRG("TileEntityHopper.func_145883_k");

	/**
	 * <p>
	 * Name: registerFixesHopper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189683_a = McMappingDatabase.getSRG("TileEntityHopper.func_189683_a");

	/**
	 * <p>
	 * Name: getGuiID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_174875_k = McMappingDatabase.getSRG("TileEntityHopper.func_174875_k");

	/**
	 * <p>
	 * Name: putStackInInventoryAllSlots
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;Lnet/minecraft/inventory/IInventory;Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_174918_a = McMappingDatabase.getSRG("TileEntityHopper.func_174918_a");

	/**
	 * <p>
	 * Name: updateHopper
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145887_i = McMappingDatabase.getSRG("TileEntityHopper.func_145887_i");

	/**
	 * <p>
	 * Name: getCaptureItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;DDD)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184292_a = McMappingDatabase.getSRG("TileEntityHopper.func_184292_a");

	/**
	 * <p>
	 * Name: isFull
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_152105_l = McMappingDatabase.getSRG("TileEntityHopper.func_152105_l");

	/**
	 * <p>
	 * Name: getZPos
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_96108_aC = McMappingDatabase.getSRG("TileEntityHopper.func_96108_aC");

	/**
	 * <p>
	 * Name: getSizeInventory
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70302_i_ = McMappingDatabase.getSRG("TileEntityHopper.func_70302_i_");

	/**
	 * <p>
	 * Name: isOnTransferCooldown
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145888_j = McMappingDatabase.getSRG("TileEntityHopper.func_145888_j");

	/**
	 * <p>
	 * Name: setTransferCooldown
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_145896_c = McMappingDatabase.getSRG("TileEntityHopper.func_145896_c");

	/**
	 * <p>
	 * Name: mayTransfer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174914_o = McMappingDatabase.getSRG("TileEntityHopper.func_174914_o");

	/**
	 * <p>
	 * Name: insertStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;Lnet/minecraft/inventory/IInventory;Lnet/minecraft/item/ItemStack;ILnet/minecraft/util/EnumFacing;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_174916_c = McMappingDatabase.getSRG("TileEntityHopper.func_174916_c");

	/**
	 * <p>
	 * Name: isInventoryEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_152104_k = McMappingDatabase.getSRG("TileEntityHopper.func_152104_k");

	/**
	 * <p>
	 * Name: getInventoryForHopperTransfer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/inventory/IInventory;]
	 * </p>
	 */
	public static McObfPair func_145895_l = McMappingDatabase.getSRG("TileEntityHopper.func_145895_l");

	/**
	 * <p>
	 * Name: getItems
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_190576_q = McMappingDatabase.getSRG("TileEntityHopper.func_190576_q");

	/**
	 * <p>
	 * Name: inventory
	 * </p>
	 */
	public static McObfPair field_145900_a = McMappingDatabase.getSRG("field_145900_a");

	/**
	 * <p>
	 * Name: getInventoryStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70297_j_ = McMappingDatabase.getSRG("TileEntityHopper.func_70297_j_");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("TileEntityHopper.func_73660_a");

	/**
	 * <p>
	 * Name: createContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/inventory/Container;]
	 * </p>
	 */
	public static McObfPair func_174876_a = McMappingDatabase.getSRG("TileEntityHopper.func_174876_a");

	/**
	 * <p>
	 * Name: isInventoryFull
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_174919_a = McMappingDatabase.getSRG("TileEntityHopper.func_174919_a");

	/**
	 * <p>
	 * Name: getInventoryAtPosition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;DDD)Lnet/minecraft/inventory/IInventory;]
	 * </p>
	 */
	public static McObfPair func_145893_b = McMappingDatabase.getSRG("TileEntityHopper.func_145893_b");

	/**
	 * <p>
	 * Name: pullItemFromSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/IHopper;Lnet/minecraft/inventory/IInventory;ILnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_174915_a = McMappingDatabase.getSRG("TileEntityHopper.func_174915_a");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191420_l = McMappingDatabase.getSRG("TileEntityHopper.func_191420_l");

	/**
	 * <p>
	 * Name: transferCooldown
	 * </p>
	 */
	public static McObfPair field_145901_j = McMappingDatabase.getSRG("field_145901_j");

	/**
	 * <p>
	 * Name: decrStackSize
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70298_a = McMappingDatabase.getSRG("TileEntityHopper.func_70298_a");

	/**
	 * <p>
	 * Name: getSourceInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/IHopper;)Lnet/minecraft/inventory/IInventory;]
	 * </p>
	 */
	public static McObfPair func_145884_b = McMappingDatabase.getSRG("TileEntityHopper.func_145884_b");

	/**
	 * <p>
	 * Name: tickedGameTime
	 * </p>
	 */
	public static McObfPair field_190578_g = McMappingDatabase.getSRG("field_190578_g");

	/**
	 * <p>
	 * Name: canInsertItemInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;Lnet/minecraft/item/ItemStack;ILnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_174920_a = McMappingDatabase.getSRG("TileEntityHopper.func_174920_a");

	/**
	 * <p>
	 * Name: putDropInInventoryAllSlots
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;Lnet/minecraft/inventory/IInventory;Lnet/minecraft/entity/item/EntityItem;)Z]
	 * </p>
	 */
	public static McObfPair func_145898_a = McMappingDatabase.getSRG("TileEntityHopper.func_145898_a");

	/**
	 * <p>
	 * Name: canCombine
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_145894_a = McMappingDatabase.getSRG("TileEntityHopper.func_145894_a");

	/**
	 * <p>
	 * Name: getYPos
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_96109_aB = McMappingDatabase.getSRG("TileEntityHopper.func_96109_aB");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityHopper.func_145839_a");

	/**
	 * <p>
	 * Name: pullItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/IHopper;)Z]
	 * </p>
	 */
	public static McObfPair func_145891_a = McMappingDatabase.getSRG("TileEntityHopper.func_145891_a");

	/**
	 * <p>
	 * Name: setInventorySlotContents
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_70299_a = McMappingDatabase.getSRG("TileEntityHopper.func_70299_a");

	/**
	 * <p>
	 * Name: canExtractItemFromSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;Lnet/minecraft/item/ItemStack;ILnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_174921_b = McMappingDatabase.getSRG("TileEntityHopper.func_174921_b");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("TileEntityHopper.func_70005_c_");

	/**
	 * <p>
	 * Name: getXPos
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_96107_aA = McMappingDatabase.getSRG("TileEntityHopper.func_96107_aA");

	/**
	 * <p>
	 * Name: isInventoryEmpty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_174917_b = McMappingDatabase.getSRG("TileEntityHopper.func_174917_b");

}

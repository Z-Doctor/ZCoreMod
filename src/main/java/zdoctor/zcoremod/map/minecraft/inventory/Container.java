package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Container {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afr";
		else
			return "net/minecraft/inventory/Container";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afr";
		else
			return "Container";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafr;";
		else
			return "Lnet/minecraft/inventory/Container;";
	}

	/**
	 * <p>
	 * Name: getDragEvent
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_94532_c = McMappingDatabase.getSRG("Container.func_94532_c");

	/**
	 * <p>
	 * Name: updateProgressBar
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_75137_b = McMappingDatabase.getSRG("Container.func_75137_b");

	/**
	 * <p>
	 * Name: setCanCraft
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Z)V]
	 * </p>
	 */
	public static McObfPair func_75128_a = McMappingDatabase.getSRG("Container.func_75128_a");

	/**
	 * <p>
	 * Name: transactionID
	 * </p>
	 */
	public static McObfPair field_75150_e = McMappingDatabase.getSRG("field_75150_e");

	/**
	 * <p>
	 * Name: setAll
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_190896_a = McMappingDatabase.getSRG("Container.func_190896_a");

	/**
	 * <p>
	 * Name: addListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IContainerListener;)V]
	 * </p>
	 */
	public static McObfPair func_75132_a = McMappingDatabase.getSRG("Container.func_75132_a");

	/**
	 * <p>
	 * Name: onContainerClosed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_75134_a = McMappingDatabase.getSRG("Container.func_75134_a");

	/**
	 * <p>
	 * Name: calcRedstoneFromInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;)I]
	 * </p>
	 */
	public static McObfPair func_94526_b = McMappingDatabase.getSRG("Container.func_94526_b");

	/**
	 * <p>
	 * Name: getSlotFromInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;I)Lnet/minecraft/inventory/Slot;]
	 * </p>
	 */
	public static McObfPair func_75147_a = McMappingDatabase.getSRG("Container.func_75147_a");

	/**
	 * <p>
	 * Name: playerList
	 * </p>
	 */
	public static McObfPair field_75148_f = McMappingDatabase.getSRG("field_75148_f");

	/**
	 * <p>
	 * Name: removeListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IContainerListener;)V]
	 * </p>
	 */
	public static McObfPair func_82847_b = McMappingDatabase.getSRG("Container.func_82847_b");

	/**
	 * <p>
	 * Name: onCraftMatrixChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_75130_a = McMappingDatabase.getSRG("Container.func_75130_a");

	/**
	 * <p>
	 * Name: getQuickcraftMask
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_94534_d = McMappingDatabase.getSRG("Container.func_94534_d");

	/**
	 * <p>
	 * Name: calcRedstone
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;)I]
	 * </p>
	 */
	public static McObfPair func_178144_a = McMappingDatabase.getSRG("Container.func_178144_a");

	/**
	 * <p>
	 * Name: resetDrag
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_94533_d = McMappingDatabase.getSRG("Container.func_94533_d");

	/**
	 * <p>
	 * Name: extractDragMode
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_94529_b = McMappingDatabase.getSRG("Container.func_94529_b");

	/**
	 * <p>
	 * Name: enchantItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;I)Z]
	 * </p>
	 */
	public static McObfPair func_75140_a = McMappingDatabase.getSRG("Container.func_75140_a");

	/**
	 * <p>
	 * Name: detectAndSendChanges
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75142_b = McMappingDatabase.getSRG("Container.func_75142_b");

	/**
	 * <p>
	 * Name: transferStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82846_b = McMappingDatabase.getSRG("Container.func_82846_b");

	/**
	 * <p>
	 * Name: canInteractWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_75145_c = McMappingDatabase.getSRG("Container.func_75145_c");

	/**
	 * <p>
	 * Name: dragMode
	 * </p>
	 */
	public static McObfPair field_94535_f = McMappingDatabase.getSRG("field_94535_f");

	/**
	 * <p>
	 * Name: getInventory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_75138_a = McMappingDatabase.getSRG("Container.func_75138_a");

	/**
	 * <p>
	 * Name: dragEvent
	 * </p>
	 */
	public static McObfPair field_94536_g = McMappingDatabase.getSRG("field_94536_g");

	/**
	 * <p>
	 * Name: slotClick
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/inventory/ClickType;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184996_a = McMappingDatabase.getSRG("Container.func_184996_a");

	/**
	 * <p>
	 * Name: isValidDragMode
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_180610_a = McMappingDatabase.getSRG("Container.func_180610_a");

	/**
	 * <p>
	 * Name: dragSlots
	 * </p>
	 */
	public static McObfPair field_94537_h = McMappingDatabase.getSRG("field_94537_h");

	/**
	 * <p>
	 * Name: addSlotToContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Slot;)Lnet/minecraft/inventory/Slot;]
	 * </p>
	 */
	public static McObfPair func_75146_a = McMappingDatabase.getSRG("Container.func_75146_a");

	/**
	 * <p>
	 * Name: computeStackSize
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Set;ILnet/minecraft/item/ItemStack;I)V]
	 * </p>
	 */
	public static McObfPair func_94525_a = McMappingDatabase.getSRG("Container.func_94525_a");

	/**
	 * <p>
	 * Name: inventorySlots
	 * </p>
	 */
	public static McObfPair field_75151_b = McMappingDatabase.getSRG("field_75151_b");

	/**
	 * <p>
	 * Name: windowId
	 * </p>
	 */
	public static McObfPair field_75152_c = McMappingDatabase.getSRG("field_75152_c");

	/**
	 * <p>
	 * Name: getNextTransactionID
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;)S]
	 * </p>
	 */
	public static McObfPair func_75136_a = McMappingDatabase.getSRG("Container.func_75136_a");

	/**
	 * <p>
	 * Name: clearContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_193327_a = McMappingDatabase.getSRG("Container.func_193327_a");

	/**
	 * <p>
	 * Name: getCanCraft
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_75129_b = McMappingDatabase.getSRG("Container.func_75129_b");

	/**
	 * <p>
	 * Name: slotChangedCraftingGrid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/inventory/InventoryCrafting;Lnet/minecraft/inventory/InventoryCraftResult;)V]
	 * </p>
	 */
	public static McObfPair func_192389_a = McMappingDatabase.getSRG("Container.func_192389_a");

	/**
	 * <p>
	 * Name: mergeItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;IIZ)Z]
	 * </p>
	 */
	public static McObfPair func_75135_a = McMappingDatabase.getSRG("Container.func_75135_a");

	/**
	 * <p>
	 * Name: putStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_75141_a = McMappingDatabase.getSRG("Container.func_75141_a");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_75149_d = McMappingDatabase.getSRG("field_75149_d");

	/**
	 * <p>
	 * Name: canAddItemToSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Slot;Lnet/minecraft/item/ItemStack;Z)Z]
	 * </p>
	 */
	public static McObfPair func_94527_a = McMappingDatabase.getSRG("Container.func_94527_a");

	/**
	 * <p>
	 * Name: canMergeSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/inventory/Slot;)Z]
	 * </p>
	 */
	public static McObfPair func_94530_a = McMappingDatabase.getSRG("Container.func_94530_a");

	/**
	 * <p>
	 * Name: inventoryItemStacks
	 * </p>
	 */
	public static McObfPair field_75153_a = McMappingDatabase.getSRG("field_75153_a");

	/**
	 * <p>
	 * Name: getSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/inventory/Slot;]
	 * </p>
	 */
	public static McObfPair func_75139_a = McMappingDatabase.getSRG("Container.func_75139_a");

	/**
	 * <p>
	 * Name: canDragIntoSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Slot;)Z]
	 * </p>
	 */
	public static McObfPair func_94531_b = McMappingDatabase.getSRG("Container.func_94531_b");

}

package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Slot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agr";
		else
			return "net/minecraft/inventory/Slot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agr";
		else
			return "Slot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagr;";
		else
			return "Lnet/minecraft/inventory/Slot;";
	}

	/**
	 * <p>
	 * Name: onSwapCraft
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_190900_b = McMappingDatabase.getSRG("Slot.func_190900_b");

	/**
	 * <p>
	 * Name: isEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_111238_b = McMappingDatabase.getSRG("Slot.func_111238_b");

	/**
	 * <p>
	 * Name: isHere
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;I)Z]
	 * </p>
	 */
	public static McObfPair func_75217_a = McMappingDatabase.getSRG("Slot.func_75217_a");

	/**
	 * <p>
	 * Name: slotNumber
	 * </p>
	 */
	public static McObfPair field_75222_d = McMappingDatabase.getSRG("field_75222_d");

	/**
	 * <p>
	 * Name: onSlotChanged
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75218_e = McMappingDatabase.getSRG("Slot.func_75218_e");

	/**
	 * <p>
	 * Name: getSlotTexture
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_178171_c = McMappingDatabase.getSRG("Slot.func_178171_c");

	/**
	 * <p>
	 * Name: xPos
	 * </p>
	 */
	public static McObfPair field_75223_e = McMappingDatabase.getSRG("field_75223_e");

	/**
	 * <p>
	 * Name: canTakeStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_82869_a = McMappingDatabase.getSRG("Slot.func_82869_a");

	/**
	 * <p>
	 * Name: putStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_75215_d = McMappingDatabase.getSRG("Slot.func_75215_d");

	/**
	 * <p>
	 * Name: yPos
	 * </p>
	 */
	public static McObfPair field_75221_f = McMappingDatabase.getSRG("field_75221_f");

	/**
	 * <p>
	 * Name: onTake
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190901_a = McMappingDatabase.getSRG("Slot.func_190901_a");

	/**
	 * <p>
	 * Name: getSlotStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75219_a = McMappingDatabase.getSRG("Slot.func_75219_a");

	/**
	 * <p>
	 * Name: isItemValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75214_a = McMappingDatabase.getSRG("Slot.func_75214_a");

	/**
	 * <p>
	 * Name: getStack
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_75211_c = McMappingDatabase.getSRG("Slot.func_75211_c");

	/**
	 * <p>
	 * Name: getItemStackLimit
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_178170_b = McMappingDatabase.getSRG("Slot.func_178170_b");

	/**
	 * <p>
	 * Name: decrStackSize
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_75209_a = McMappingDatabase.getSRG("Slot.func_75209_a");

	/**
	 * <p>
	 * Name: onCrafting
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;I)V]
	 * </p>
	 */
	public static McObfPair func_75210_a = McMappingDatabase.getSRG("Slot.func_75210_a");

	/**
	 * <p>
	 * Name: onSlotChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_75220_a = McMappingDatabase.getSRG("Slot.func_75220_a");

	/**
	 * <p>
	 * Name: getHasStack
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75216_d = McMappingDatabase.getSRG("Slot.func_75216_d");

	/**
	 * <p>
	 * Name: onCrafting
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_75208_c = McMappingDatabase.getSRG("Slot.func_75208_c");

	/**
	 * <p>
	 * Name: slotIndex
	 * </p>
	 */
	public static McObfPair field_75225_a = McMappingDatabase.getSRG("field_75225_a");

	/**
	 * <p>
	 * Name: inventory
	 * </p>
	 */
	public static McObfPair field_75224_c = McMappingDatabase.getSRG("field_75224_c");

}

package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ISidedInventory {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "un";
		else
			return "net/minecraft/inventory/ISidedInventory";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "un";
		else
			return "ISidedInventory";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lun;";
		else
			return "Lnet/minecraft/inventory/ISidedInventory;";
	}

	/**
	 * <p>
	 * Name: canInsertItem
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_180462_a = McMappingDatabase.getSRG("ISidedInventory.func_180462_a");

	/**
	 * <p>
	 * Name: canExtractItem
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_180461_b = McMappingDatabase.getSRG("ISidedInventory.func_180461_b");

	/**
	 * <p>
	 * Name: getSlotsForFace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)[I]
	 * </p>
	 */
	public static McObfPair func_180463_a = McMappingDatabase.getSRG("ISidedInventory.func_180463_a");

}

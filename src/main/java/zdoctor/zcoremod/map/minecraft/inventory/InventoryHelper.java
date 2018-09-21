package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class InventoryHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ty";
		else
			return "net/minecraft/inventory/InventoryHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ty";
		else
			return "InventoryHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lty;";
		else
			return "Lnet/minecraft/inventory/InventoryHelper;";
	}

	/**
	 * <p>
	 * Name: RANDOM
	 * </p>
	 */
	public static McObfPair field_180177_a = McMappingDatabase.getSRG("field_180177_a");

	/**
	 * <p>
	 * Name: dropInventoryItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_180176_a = McMappingDatabase.getSRG("InventoryHelper.func_180176_a");

	/**
	 * <p>
	 * Name: spawnItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_180173_a = McMappingDatabase.getSRG("InventoryHelper.func_180173_a");

	/**
	 * <p>
	 * Name: dropInventoryItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_180175_a = McMappingDatabase.getSRG("InventoryHelper.func_180175_a");

	/**
	 * <p>
	 * Name: dropInventoryItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;DDDLnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_180174_a = McMappingDatabase.getSRG("InventoryHelper.func_180174_a");

}

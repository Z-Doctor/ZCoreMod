package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class InventoryEnderChest {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agm";
		else
			return "net/minecraft/inventory/InventoryEnderChest";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agm";
		else
			return "InventoryEnderChest";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagm;";
		else
			return "Lnet/minecraft/inventory/InventoryEnderChest;";
	}

	/**
	 * <p>
	 * Name: loadInventoryFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagList;)V]
	 * </p>
	 */
	public static McObfPair func_70486_a = McMappingDatabase.getSRG("InventoryEnderChest.func_70486_a");

	/**
	 * <p>
	 * Name: saveInventoryToNBT
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagList;]
	 * </p>
	 */
	public static McObfPair func_70487_g = McMappingDatabase.getSRG("InventoryEnderChest.func_70487_g");

	/**
	 * <p>
	 * Name: closeInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174886_c = McMappingDatabase.getSRG("InventoryEnderChest.func_174886_c");

	/**
	 * <p>
	 * Name: openInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174889_b = McMappingDatabase.getSRG("InventoryEnderChest.func_174889_b");

	/**
	 * <p>
	 * Name: setChestTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntityEnderChest;)V]
	 * </p>
	 */
	public static McObfPair func_146031_a = McMappingDatabase.getSRG("InventoryEnderChest.func_146031_a");

	/**
	 * <p>
	 * Name: associatedChest
	 * </p>
	 */
	public static McObfPair field_70488_a = McMappingDatabase.getSRG("field_70488_a");

	/**
	 * <p>
	 * Name: isUsableByPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_70300_a = McMappingDatabase.getSRG("InventoryEnderChest.func_70300_a");

}

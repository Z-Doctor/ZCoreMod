package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CreativeCrafting {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmo";
		else
			return "net/minecraft/client/gui/inventory/CreativeCrafting";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmo";
		else
			return "CreativeCrafting";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmo;";
		else
			return "Lnet/minecraft/client/gui/inventory/CreativeCrafting;";
	}

	/**
	 * <p>
	 * Name: sendSlotContents
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_71111_a = McMappingDatabase.getSRG("CreativeCrafting.func_71111_a");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_146109_a = McMappingDatabase.getSRG("field_146109_a");

	/**
	 * <p>
	 * Name: sendWindowProperty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;II)V]
	 * </p>
	 */
	public static McObfPair func_71112_a = McMappingDatabase.getSRG("CreativeCrafting.func_71112_a");

	/**
	 * <p>
	 * Name: sendAllContents
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_71110_a = McMappingDatabase.getSRG("CreativeCrafting.func_71110_a");

	/**
	 * <p>
	 * Name: sendAllWindowProperties
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_175173_a = McMappingDatabase.getSRG("CreativeCrafting.func_175173_a");

}

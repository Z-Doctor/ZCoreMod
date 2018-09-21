package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IContainerListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afx";
		else
			return "net/minecraft/inventory/IContainerListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afx";
		else
			return "IContainerListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafx;";
		else
			return "Lnet/minecraft/inventory/IContainerListener;";
	}

	/**
	 * <p>
	 * Name: sendAllContents
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_71110_a = McMappingDatabase.getSRG("IContainerListener.func_71110_a");

	/**
	 * <p>
	 * Name: sendAllWindowProperties
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_175173_a = McMappingDatabase.getSRG("IContainerListener.func_175173_a");

	/**
	 * <p>
	 * Name: sendWindowProperty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;II)V]
	 * </p>
	 */
	public static McObfPair func_71112_a = McMappingDatabase.getSRG("IContainerListener.func_71112_a");

	/**
	 * <p>
	 * Name: sendSlotContents
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_71111_a = McMappingDatabase.getSRG("IContainerListener.func_71111_a");

}

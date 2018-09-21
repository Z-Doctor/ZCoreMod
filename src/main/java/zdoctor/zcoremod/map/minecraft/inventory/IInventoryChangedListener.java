package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IInventoryChangedListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tx";
		else
			return "net/minecraft/inventory/IInventoryChangedListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tx";
		else
			return "IInventoryChangedListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ltx;";
		else
			return "Lnet/minecraft/inventory/IInventoryChangedListener;";
	}

	/**
	 * <p>
	 * Name: onInventoryChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_76316_a = McMappingDatabase.getSRG("IInventoryChangedListener.func_76316_a");

}

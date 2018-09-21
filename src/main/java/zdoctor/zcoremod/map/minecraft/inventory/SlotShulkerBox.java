package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SlotShulkerBox {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agq";
		else
			return "net/minecraft/inventory/SlotShulkerBox";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agq";
		else
			return "SlotShulkerBox";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagq;";
		else
			return "Lnet/minecraft/inventory/SlotShulkerBox;";
	}

	/**
	 * <p>
	 * Name: isItemValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75214_a = McMappingDatabase.getSRG("SlotShulkerBox.func_75214_a");

}

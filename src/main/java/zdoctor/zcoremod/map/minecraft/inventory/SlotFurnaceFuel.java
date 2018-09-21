package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SlotFurnaceFuel {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agc";
		else
			return "net/minecraft/inventory/SlotFurnaceFuel";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agc";
		else
			return "SlotFurnaceFuel";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagc;";
		else
			return "Lnet/minecraft/inventory/SlotFurnaceFuel;";
	}

	/**
	 * <p>
	 * Name: getItemStackLimit
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_178170_b = McMappingDatabase.getSRG("SlotFurnaceFuel.func_178170_b");

	/**
	 * <p>
	 * Name: isItemValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75214_a = McMappingDatabase.getSRG("SlotFurnaceFuel.func_75214_a");

	/**
	 * <p>
	 * Name: isBucket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_178173_c_ = McMappingDatabase.getSRG("SlotFurnaceFuel.func_178173_c_");

}

package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerBrewingStand$Fuel {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afu$a";
		else
			return "net/minecraft/inventory/ContainerBrewingStand$Fuel";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afu$a";
		else
			return "ContainerBrewingStand$Fuel";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafu$a;";
		else
			return "Lnet/minecraft/inventory/ContainerBrewingStand$Fuel;";
	}

	/**
	 * <p>
	 * Name: getSlotStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75219_a = McMappingDatabase.getSRG("ContainerBrewingStand$Fuel.func_75219_a");

	/**
	 * <p>
	 * Name: isValidBrewingFuel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_185004_b_ = McMappingDatabase.getSRG("ContainerBrewingStand$Fuel.func_185004_b_");

	/**
	 * <p>
	 * Name: isItemValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75214_a = McMappingDatabase.getSRG("ContainerBrewingStand$Fuel.func_75214_a");

}

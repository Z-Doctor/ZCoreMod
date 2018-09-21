package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerBrewingStand$Ingredient {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afu$b";
		else
			return "net/minecraft/inventory/ContainerBrewingStand$Ingredient";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afu$b";
		else
			return "ContainerBrewingStand$Ingredient";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafu$b;";
		else
			return "Lnet/minecraft/inventory/ContainerBrewingStand$Ingredient;";
	}

	/**
	 * <p>
	 * Name: isItemValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75214_a = McMappingDatabase.getSRG("ContainerBrewingStand$Ingredient.func_75214_a");

	/**
	 * <p>
	 * Name: getSlotStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75219_a = McMappingDatabase.getSRG("ContainerBrewingStand$Ingredient.func_75219_a");

}

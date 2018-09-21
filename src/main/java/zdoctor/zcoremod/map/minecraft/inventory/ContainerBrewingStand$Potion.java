package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerBrewingStand$Potion {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afu$c";
		else
			return "net/minecraft/inventory/ContainerBrewingStand$Potion";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afu$c";
		else
			return "ContainerBrewingStand$Potion";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafu$c;";
		else
			return "Lnet/minecraft/inventory/ContainerBrewingStand$Potion;";
	}

	/**
	 * <p>
	 * Name: getSlotStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75219_a = McMappingDatabase.getSRG("ContainerBrewingStand$Potion.func_75219_a");

	/**
	 * <p>
	 * Name: isItemValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75214_a = McMappingDatabase.getSRG("ContainerBrewingStand$Potion.func_75214_a");

	/**
	 * <p>
	 * Name: canHoldPotion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75243_a_ = McMappingDatabase.getSRG("ContainerBrewingStand$Potion.func_75243_a_");

	/**
	 * <p>
	 * Name: onTake
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190901_a = McMappingDatabase.getSRG("ContainerBrewingStand$Potion.func_190901_a");

}

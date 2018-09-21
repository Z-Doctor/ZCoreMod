package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerHorseInventory$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agh$2";
		else
			return "net/minecraft/inventory/ContainerHorseInventory$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agh$2";
		else
			return "ContainerHorseInventory$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagh$2;";
		else
			return "Lnet/minecraft/inventory/ContainerHorseInventory$2;";
	}

	/**
	 * <p>
	 * Name: getSlotStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75219_a = McMappingDatabase.getSRG("ContainerHorseInventory$2.func_75219_a");

	/**
	 * <p>
	 * Name: isItemValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75214_a = McMappingDatabase.getSRG("ContainerHorseInventory$2.func_75214_a");

	/**
	 * <p>
	 * Name: isEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_111238_b = McMappingDatabase.getSRG("ContainerHorseInventory$2.func_111238_b");

}

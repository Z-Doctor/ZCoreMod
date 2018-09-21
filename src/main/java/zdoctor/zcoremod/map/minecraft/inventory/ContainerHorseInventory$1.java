package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerHorseInventory$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agh$1";
		else
			return "net/minecraft/inventory/ContainerHorseInventory$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agh$1";
		else
			return "ContainerHorseInventory$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagh$1;";
		else
			return "Lnet/minecraft/inventory/ContainerHorseInventory$1;";
	}

	/**
	 * <p>
	 * Name: isEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_111238_b = McMappingDatabase.getSRG("ContainerHorseInventory$1.func_111238_b");

	/**
	 * <p>
	 * Name: isItemValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75214_a = McMappingDatabase.getSRG("ContainerHorseInventory$1.func_75214_a");

}

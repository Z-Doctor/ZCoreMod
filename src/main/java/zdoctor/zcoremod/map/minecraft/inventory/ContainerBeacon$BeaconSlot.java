package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerBeacon$BeaconSlot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aft$a";
		else
			return "net/minecraft/inventory/ContainerBeacon$BeaconSlot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aft$a";
		else
			return "ContainerBeacon$BeaconSlot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laft$a;";
		else
			return "Lnet/minecraft/inventory/ContainerBeacon$BeaconSlot;";
	}

	/**
	 * <p>
	 * Name: isItemValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75214_a = McMappingDatabase.getSRG("ContainerBeacon$BeaconSlot.func_75214_a");

	/**
	 * <p>
	 * Name: getSlotStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75219_a = McMappingDatabase.getSRG("ContainerBeacon$BeaconSlot.func_75219_a");

}

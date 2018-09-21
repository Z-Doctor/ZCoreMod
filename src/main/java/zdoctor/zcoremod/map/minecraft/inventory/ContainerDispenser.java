package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerDispenser {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aga";
		else
			return "net/minecraft/inventory/ContainerDispenser";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aga";
		else
			return "ContainerDispenser";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laga;";
		else
			return "Lnet/minecraft/inventory/ContainerDispenser;";
	}

	/**
	 * <p>
	 * Name: transferStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82846_b = McMappingDatabase.getSRG("ContainerDispenser.func_82846_b");

	/**
	 * <p>
	 * Name: canInteractWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_75145_c = McMappingDatabase.getSRG("ContainerDispenser.func_75145_c");

	/**
	 * <p>
	 * Name: dispenserInventory
	 * </p>
	 */
	public static McObfPair field_178146_a = McMappingDatabase.getSRG("field_178146_a");

}

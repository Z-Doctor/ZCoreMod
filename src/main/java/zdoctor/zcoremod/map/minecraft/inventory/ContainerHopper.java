package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerHopper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agf";
		else
			return "net/minecraft/inventory/ContainerHopper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agf";
		else
			return "ContainerHopper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagf;";
		else
			return "Lnet/minecraft/inventory/ContainerHopper;";
	}

	/**
	 * <p>
	 * Name: onContainerClosed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_75134_a = McMappingDatabase.getSRG("ContainerHopper.func_75134_a");

	/**
	 * <p>
	 * Name: hopperInventory
	 * </p>
	 */
	public static McObfPair field_94538_a = McMappingDatabase.getSRG("field_94538_a");

	/**
	 * <p>
	 * Name: transferStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82846_b = McMappingDatabase.getSRG("ContainerHopper.func_82846_b");

	/**
	 * <p>
	 * Name: canInteractWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_75145_c = McMappingDatabase.getSRG("ContainerHopper.func_75145_c");

}

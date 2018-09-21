package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerChest {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afv";
		else
			return "net/minecraft/inventory/ContainerChest";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afv";
		else
			return "ContainerChest";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafv;";
		else
			return "Lnet/minecraft/inventory/ContainerChest;";
	}

	/**
	 * <p>
	 * Name: onContainerClosed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_75134_a = McMappingDatabase.getSRG("ContainerChest.func_75134_a");

	/**
	 * <p>
	 * Name: numRows
	 * </p>
	 */
	public static McObfPair field_75154_f = McMappingDatabase.getSRG("field_75154_f");

	/**
	 * <p>
	 * Name: canInteractWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_75145_c = McMappingDatabase.getSRG("ContainerChest.func_75145_c");

	/**
	 * <p>
	 * Name: getLowerChestInventory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/inventory/IInventory;]
	 * </p>
	 */
	public static McObfPair func_85151_d = McMappingDatabase.getSRG("ContainerChest.func_85151_d");

	/**
	 * <p>
	 * Name: lowerChestInventory
	 * </p>
	 */
	public static McObfPair field_75155_e = McMappingDatabase.getSRG("field_75155_e");

	/**
	 * <p>
	 * Name: transferStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82846_b = McMappingDatabase.getSRG("ContainerChest.func_82846_b");

}

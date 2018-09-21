package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerBeacon {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aft";
		else
			return "net/minecraft/inventory/ContainerBeacon";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aft";
		else
			return "ContainerBeacon";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laft;";
		else
			return "Lnet/minecraft/inventory/ContainerBeacon;";
	}

	/**
	 * <p>
	 * Name: tileBeacon
	 * </p>
	 */
	public static McObfPair field_82866_e = McMappingDatabase.getSRG("field_82866_e");

	/**
	 * <p>
	 * Name: transferStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82846_b = McMappingDatabase.getSRG("ContainerBeacon.func_82846_b");

	/**
	 * <p>
	 * Name: canInteractWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_75145_c = McMappingDatabase.getSRG("ContainerBeacon.func_75145_c");

	/**
	 * <p>
	 * Name: addListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IContainerListener;)V]
	 * </p>
	 */
	public static McObfPair func_75132_a = McMappingDatabase.getSRG("ContainerBeacon.func_75132_a");

	/**
	 * <p>
	 * Name: onContainerClosed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_75134_a = McMappingDatabase.getSRG("ContainerBeacon.func_75134_a");

	/**
	 * <p>
	 * Name: getTileEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/inventory/IInventory;]
	 * </p>
	 */
	public static McObfPair func_180611_e = McMappingDatabase.getSRG("ContainerBeacon.func_180611_e");

	/**
	 * <p>
	 * Name: beaconSlot
	 * </p>
	 */
	public static McObfPair field_82864_f = McMappingDatabase.getSRG("field_82864_f");

	/**
	 * <p>
	 * Name: updateProgressBar
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_75137_b = McMappingDatabase.getSRG("ContainerBeacon.func_75137_b");

}

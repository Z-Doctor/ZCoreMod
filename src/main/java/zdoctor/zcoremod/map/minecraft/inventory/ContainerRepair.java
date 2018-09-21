package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerRepair {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afs";
		else
			return "net/minecraft/inventory/ContainerRepair";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afs";
		else
			return "ContainerRepair";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafs;";
		else
			return "Lnet/minecraft/inventory/ContainerRepair;";
	}

	/**
	 * <p>
	 * Name: materialCost
	 * </p>
	 */
	public static McObfPair field_82856_l = McMappingDatabase.getSRG("field_82856_l");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_148326_f = McMappingDatabase.getSRG("field_148326_f");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_82855_n = McMappingDatabase.getSRG("field_82855_n");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_82860_h = McMappingDatabase.getSRG("field_82860_h");

	/**
	 * <p>
	 * Name: updateRepairOutput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_82848_d = McMappingDatabase.getSRG("ContainerRepair.func_82848_d");

	/**
	 * <p>
	 * Name: addListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IContainerListener;)V]
	 * </p>
	 */
	public static McObfPair func_75132_a = McMappingDatabase.getSRG("ContainerRepair.func_75132_a");

	/**
	 * <p>
	 * Name: outputSlot
	 * </p>
	 */
	public static McObfPair field_82852_f = McMappingDatabase.getSRG("field_82852_f");

	/**
	 * <p>
	 * Name: inputSlots
	 * </p>
	 */
	public static McObfPair field_82853_g = McMappingDatabase.getSRG("field_82853_g");

	/**
	 * <p>
	 * Name: updateProgressBar
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_75137_b = McMappingDatabase.getSRG("ContainerRepair.func_75137_b");

	/**
	 * <p>
	 * Name: selfPosition
	 * </p>
	 */
	public static McObfPair field_178156_j = McMappingDatabase.getSRG("field_178156_j");

	/**
	 * <p>
	 * Name: transferStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82846_b = McMappingDatabase.getSRG("ContainerRepair.func_82846_b");

	/**
	 * <p>
	 * Name: onContainerClosed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_75134_a = McMappingDatabase.getSRG("ContainerRepair.func_75134_a");

	/**
	 * <p>
	 * Name: onCraftMatrixChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_75130_a = McMappingDatabase.getSRG("ContainerRepair.func_75130_a");

	/**
	 * <p>
	 * Name: canInteractWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_75145_c = McMappingDatabase.getSRG("ContainerRepair.func_75145_c");

	/**
	 * <p>
	 * Name: updateItemName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_82850_a = McMappingDatabase.getSRG("ContainerRepair.func_82850_a");

	/**
	 * <p>
	 * Name: maximumCost
	 * </p>
	 */
	public static McObfPair field_82854_e = McMappingDatabase.getSRG("field_82854_e");

	/**
	 * <p>
	 * Name: repairedItemName
	 * </p>
	 */
	public static McObfPair field_82857_m = McMappingDatabase.getSRG("field_82857_m");

}

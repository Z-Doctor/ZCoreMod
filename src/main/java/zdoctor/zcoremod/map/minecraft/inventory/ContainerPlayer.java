package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerPlayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agi";
		else
			return "net/minecraft/inventory/ContainerPlayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agi";
		else
			return "ContainerPlayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagi;";
		else
			return "Lnet/minecraft/inventory/ContainerPlayer;";
	}

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_82862_h = McMappingDatabase.getSRG("field_82862_h");

	/**
	 * <p>
	 * Name: onContainerClosed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_75134_a = McMappingDatabase.getSRG("ContainerPlayer.func_75134_a");

	/**
	 * <p>
	 * Name: VALID_EQUIPMENT_SLOTS
	 * </p>
	 */
	public static McObfPair field_185003_h = McMappingDatabase.getSRG("field_185003_h");

	/**
	 * <p>
	 * Name: craftResult
	 * </p>
	 */
	public static McObfPair field_75179_f = McMappingDatabase.getSRG("field_75179_f");

	/**
	 * <p>
	 * Name: transferStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82846_b = McMappingDatabase.getSRG("ContainerPlayer.func_82846_b");

	/**
	 * <p>
	 * Name: onCraftMatrixChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_75130_a = McMappingDatabase.getSRG("ContainerPlayer.func_75130_a");

	/**
	 * <p>
	 * Name: canMergeSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/inventory/Slot;)Z]
	 * </p>
	 */
	public static McObfPair func_94530_a = McMappingDatabase.getSRG("ContainerPlayer.func_94530_a");

	/**
	 * <p>
	 * Name: canInteractWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_75145_c = McMappingDatabase.getSRG("ContainerPlayer.func_75145_c");

	/**
	 * <p>
	 * Name: isLocalWorld
	 * </p>
	 */
	public static McObfPair field_75180_g = McMappingDatabase.getSRG("field_75180_g");

	/**
	 * <p>
	 * Name: craftMatrix
	 * </p>
	 */
	public static McObfPair field_75181_e = McMappingDatabase.getSRG("field_75181_e");

}

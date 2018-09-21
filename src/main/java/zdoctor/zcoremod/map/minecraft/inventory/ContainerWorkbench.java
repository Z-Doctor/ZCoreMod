package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerWorkbench {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afz";
		else
			return "net/minecraft/inventory/ContainerWorkbench";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afz";
		else
			return "ContainerWorkbench";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafz;";
		else
			return "Lnet/minecraft/inventory/ContainerWorkbench;";
	}

	/**
	 * <p>
	 * Name: onCraftMatrixChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_75130_a = McMappingDatabase.getSRG("ContainerWorkbench.func_75130_a");

	/**
	 * <p>
	 * Name: canInteractWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_75145_c = McMappingDatabase.getSRG("ContainerWorkbench.func_75145_c");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_192390_i = McMappingDatabase.getSRG("field_192390_i");

	/**
	 * <p>
	 * Name: pos
	 * </p>
	 */
	public static McObfPair field_178145_h = McMappingDatabase.getSRG("field_178145_h");

	/**
	 * <p>
	 * Name: transferStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82846_b = McMappingDatabase.getSRG("ContainerWorkbench.func_82846_b");

	/**
	 * <p>
	 * Name: canMergeSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/inventory/Slot;)Z]
	 * </p>
	 */
	public static McObfPair func_94530_a = McMappingDatabase.getSRG("ContainerWorkbench.func_94530_a");

	/**
	 * <p>
	 * Name: craftMatrix
	 * </p>
	 */
	public static McObfPair field_75162_e = McMappingDatabase.getSRG("field_75162_e");

	/**
	 * <p>
	 * Name: onContainerClosed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_75134_a = McMappingDatabase.getSRG("ContainerWorkbench.func_75134_a");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_75161_g = McMappingDatabase.getSRG("field_75161_g");

	/**
	 * <p>
	 * Name: craftResult
	 * </p>
	 */
	public static McObfPair field_75160_f = McMappingDatabase.getSRG("field_75160_f");

}

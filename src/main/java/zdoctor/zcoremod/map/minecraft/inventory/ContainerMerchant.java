package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerMerchant {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agk";
		else
			return "net/minecraft/inventory/ContainerMerchant";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agk";
		else
			return "ContainerMerchant";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagk;";
		else
			return "Lnet/minecraft/inventory/ContainerMerchant;";
	}

	/**
	 * <p>
	 * Name: merchantInventory
	 * </p>
	 */
	public static McObfPair field_75176_f = McMappingDatabase.getSRG("field_75176_f");

	/**
	 * <p>
	 * Name: canInteractWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_75145_c = McMappingDatabase.getSRG("ContainerMerchant.func_75145_c");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_75177_g = McMappingDatabase.getSRG("field_75177_g");

	/**
	 * <p>
	 * Name: merchant
	 * </p>
	 */
	public static McObfPair field_75178_e = McMappingDatabase.getSRG("field_75178_e");

	/**
	 * <p>
	 * Name: getMerchantInventory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/inventory/InventoryMerchant;]
	 * </p>
	 */
	public static McObfPair func_75174_d = McMappingDatabase.getSRG("ContainerMerchant.func_75174_d");

	/**
	 * <p>
	 * Name: onCraftMatrixChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_75130_a = McMappingDatabase.getSRG("ContainerMerchant.func_75130_a");

	/**
	 * <p>
	 * Name: onContainerClosed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_75134_a = McMappingDatabase.getSRG("ContainerMerchant.func_75134_a");

	/**
	 * <p>
	 * Name: setCurrentRecipeIndex
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_75175_c = McMappingDatabase.getSRG("ContainerMerchant.func_75175_c");

	/**
	 * <p>
	 * Name: transferStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82846_b = McMappingDatabase.getSRG("ContainerMerchant.func_82846_b");

}

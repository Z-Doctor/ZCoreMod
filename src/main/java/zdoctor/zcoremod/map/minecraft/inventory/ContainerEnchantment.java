package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerEnchantment {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agb";
		else
			return "net/minecraft/inventory/ContainerEnchantment";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agb";
		else
			return "ContainerEnchantment";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagb;";
		else
			return "Lnet/minecraft/inventory/ContainerEnchantment;";
	}

	/**
	 * <p>
	 * Name: getEnchantmentList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;II)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_178148_a = McMappingDatabase.getSRG("ContainerEnchantment.func_178148_a");

	/**
	 * <p>
	 * Name: transferStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82846_b = McMappingDatabase.getSRG("ContainerEnchantment.func_82846_b");

	/**
	 * <p>
	 * Name: onContainerClosed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_75134_a = McMappingDatabase.getSRG("ContainerEnchantment.func_75134_a");

	/**
	 * <p>
	 * Name: broadcastData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IContainerListener;)V]
	 * </p>
	 */
	public static McObfPair func_185000_c = McMappingDatabase.getSRG("ContainerEnchantment.func_185000_c");

	/**
	 * <p>
	 * Name: enchantItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;I)Z]
	 * </p>
	 */
	public static McObfPair func_75140_a = McMappingDatabase.getSRG("ContainerEnchantment.func_75140_a");

	/**
	 * <p>
	 * Name: onCraftMatrixChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_75130_a = McMappingDatabase.getSRG("ContainerEnchantment.func_75130_a");

	/**
	 * <p>
	 * Name: canInteractWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_75145_c = McMappingDatabase.getSRG("ContainerEnchantment.func_75145_c");

	/**
	 * <p>
	 * Name: enchantLevels
	 * </p>
	 */
	public static McObfPair field_75167_g = McMappingDatabase.getSRG("field_75167_g");

	/**
	 * <p>
	 * Name: enchantClue
	 * </p>
	 */
	public static McObfPair field_185001_h = McMappingDatabase.getSRG("field_185001_h");

	/**
	 * <p>
	 * Name: addListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IContainerListener;)V]
	 * </p>
	 */
	public static McObfPair func_75132_a = McMappingDatabase.getSRG("ContainerEnchantment.func_75132_a");

	/**
	 * <p>
	 * Name: updateProgressBar
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_75137_b = McMappingDatabase.getSRG("ContainerEnchantment.func_75137_b");

	/**
	 * <p>
	 * Name: tableInventory
	 * </p>
	 */
	public static McObfPair field_75168_e = McMappingDatabase.getSRG("field_75168_e");

	/**
	 * <p>
	 * Name: getLapisAmount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178147_e = McMappingDatabase.getSRG("ContainerEnchantment.func_178147_e");

	/**
	 * <p>
	 * Name: rand
	 * </p>
	 */
	public static McObfPair field_75169_l = McMappingDatabase.getSRG("field_75169_l");

	/**
	 * <p>
	 * Name: worldClue
	 * </p>
	 */
	public static McObfPair field_185002_i = McMappingDatabase.getSRG("field_185002_i");

	/**
	 * <p>
	 * Name: worldPointer
	 * </p>
	 */
	public static McObfPair field_75172_h = McMappingDatabase.getSRG("field_75172_h");

	/**
	 * <p>
	 * Name: position
	 * </p>
	 */
	public static McObfPair field_178150_j = McMappingDatabase.getSRG("field_178150_j");

	/**
	 * <p>
	 * Name: xpSeed
	 * </p>
	 */
	public static McObfPair field_178149_f = McMappingDatabase.getSRG("field_178149_f");

	/**
	 * <p>
	 * Name: detectAndSendChanges
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75142_b = McMappingDatabase.getSRG("ContainerEnchantment.func_75142_b");

}

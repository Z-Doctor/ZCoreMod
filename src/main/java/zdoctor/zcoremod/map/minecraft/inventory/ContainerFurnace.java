package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerFurnace {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agd";
		else
			return "net/minecraft/inventory/ContainerFurnace";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agd";
		else
			return "ContainerFurnace";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagd;";
		else
			return "Lnet/minecraft/inventory/ContainerFurnace;";
	}

	/**
	 * <p>
	 * Name: transferStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82846_b = McMappingDatabase.getSRG("ContainerFurnace.func_82846_b");

	/**
	 * <p>
	 * Name: totalCookTime
	 * </p>
	 */
	public static McObfPair field_178153_g = McMappingDatabase.getSRG("field_178153_g");

	/**
	 * <p>
	 * Name: tileFurnace
	 * </p>
	 */
	public static McObfPair field_75158_e = McMappingDatabase.getSRG("field_75158_e");

	/**
	 * <p>
	 * Name: updateProgressBar
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_75137_b = McMappingDatabase.getSRG("ContainerFurnace.func_75137_b");

	/**
	 * <p>
	 * Name: addListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IContainerListener;)V]
	 * </p>
	 */
	public static McObfPair func_75132_a = McMappingDatabase.getSRG("ContainerFurnace.func_75132_a");

	/**
	 * <p>
	 * Name: furnaceBurnTime
	 * </p>
	 */
	public static McObfPair field_178154_h = McMappingDatabase.getSRG("field_178154_h");

	/**
	 * <p>
	 * Name: currentItemBurnTime
	 * </p>
	 */
	public static McObfPair field_178155_i = McMappingDatabase.getSRG("field_178155_i");

	/**
	 * <p>
	 * Name: cookTime
	 * </p>
	 */
	public static McObfPair field_178152_f = McMappingDatabase.getSRG("field_178152_f");

	/**
	 * <p>
	 * Name: canInteractWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_75145_c = McMappingDatabase.getSRG("ContainerFurnace.func_75145_c");

	/**
	 * <p>
	 * Name: detectAndSendChanges
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75142_b = McMappingDatabase.getSRG("ContainerFurnace.func_75142_b");

}

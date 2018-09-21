package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerBrewingStand {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afu";
		else
			return "net/minecraft/inventory/ContainerBrewingStand";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afu";
		else
			return "ContainerBrewingStand";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafu;";
		else
			return "Lnet/minecraft/inventory/ContainerBrewingStand;";
	}

	/**
	 * <p>
	 * Name: prevBrewTime
	 * </p>
	 */
	public static McObfPair field_184998_g = McMappingDatabase.getSRG("field_184998_g");

	/**
	 * <p>
	 * Name: prevFuel
	 * </p>
	 */
	public static McObfPair field_184999_h = McMappingDatabase.getSRG("field_184999_h");

	/**
	 * <p>
	 * Name: detectAndSendChanges
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75142_b = McMappingDatabase.getSRG("ContainerBrewingStand.func_75142_b");

	/**
	 * <p>
	 * Name: slot
	 * </p>
	 */
	public static McObfPair field_75186_f = McMappingDatabase.getSRG("field_75186_f");

	/**
	 * <p>
	 * Name: addListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IContainerListener;)V]
	 * </p>
	 */
	public static McObfPair func_75132_a = McMappingDatabase.getSRG("ContainerBrewingStand.func_75132_a");

	/**
	 * <p>
	 * Name: canInteractWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_75145_c = McMappingDatabase.getSRG("ContainerBrewingStand.func_75145_c");

	/**
	 * <p>
	 * Name: updateProgressBar
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_75137_b = McMappingDatabase.getSRG("ContainerBrewingStand.func_75137_b");

	/**
	 * <p>
	 * Name: transferStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82846_b = McMappingDatabase.getSRG("ContainerBrewingStand.func_82846_b");

	/**
	 * <p>
	 * Name: tileBrewingStand
	 * </p>
	 */
	public static McObfPair field_75188_e = McMappingDatabase.getSRG("field_75188_e");

}

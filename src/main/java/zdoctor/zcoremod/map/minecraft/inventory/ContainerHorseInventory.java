package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerHorseInventory {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agh";
		else
			return "net/minecraft/inventory/ContainerHorseInventory";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agh";
		else
			return "ContainerHorseInventory";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagh;";
		else
			return "Lnet/minecraft/inventory/ContainerHorseInventory;";
	}

	/**
	 * <p>
	 * Name: horse
	 * </p>
	 */
	public static McObfPair field_111242_f = McMappingDatabase.getSRG("field_111242_f");

	/**
	 * <p>
	 * Name: transferStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82846_b = McMappingDatabase.getSRG("ContainerHorseInventory.func_82846_b");

	/**
	 * <p>
	 * Name: canInteractWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_75145_c = McMappingDatabase.getSRG("ContainerHorseInventory.func_75145_c");

	/**
	 * <p>
	 * Name: horseInventory
	 * </p>
	 */
	public static McObfPair field_111243_a = McMappingDatabase.getSRG("field_111243_a");

	/**
	 * <p>
	 * Name: onContainerClosed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_75134_a = McMappingDatabase.getSRG("ContainerHorseInventory.func_75134_a");

}

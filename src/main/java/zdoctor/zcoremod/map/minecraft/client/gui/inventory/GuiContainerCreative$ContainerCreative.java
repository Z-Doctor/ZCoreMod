package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiContainerCreative$ContainerCreative {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmp$b";
		else
			return "net/minecraft/client/gui/inventory/GuiContainerCreative$ContainerCreative";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmp$b";
		else
			return "GuiContainerCreative$ContainerCreative";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmp$b;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiContainerCreative$ContainerCreative;";
	}

	/**
	 * <p>
	 * Name: canDragIntoSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Slot;)Z]
	 * </p>
	 */
	public static McObfPair func_94531_b = McMappingDatabase.getSRG("GuiContainerCreative$ContainerCreative.func_94531_b");

	/**
	 * <p>
	 * Name: itemList
	 * </p>
	 */
	public static McObfPair field_148330_a = McMappingDatabase.getSRG("field_148330_a");

	/**
	 * <p>
	 * Name: canScroll
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148328_e = McMappingDatabase.getSRG("GuiContainerCreative$ContainerCreative.func_148328_e");

	/**
	 * <p>
	 * Name: scrollTo
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_148329_a = McMappingDatabase.getSRG("GuiContainerCreative$ContainerCreative.func_148329_a");

	/**
	 * <p>
	 * Name: canMergeSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/inventory/Slot;)Z]
	 * </p>
	 */
	public static McObfPair func_94530_a = McMappingDatabase.getSRG("GuiContainerCreative$ContainerCreative.func_94530_a");

	/**
	 * <p>
	 * Name: canInteractWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_75145_c = McMappingDatabase.getSRG("GuiContainerCreative$ContainerCreative.func_75145_c");

	/**
	 * <p>
	 * Name: transferStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82846_b = McMappingDatabase.getSRG("GuiContainerCreative$ContainerCreative.func_82846_b");

}

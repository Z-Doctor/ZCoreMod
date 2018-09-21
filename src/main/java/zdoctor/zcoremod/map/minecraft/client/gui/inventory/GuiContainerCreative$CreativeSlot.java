package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiContainerCreative$CreativeSlot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmp$c";
		else
			return "net/minecraft/client/gui/inventory/GuiContainerCreative$CreativeSlot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmp$c";
		else
			return "GuiContainerCreative$CreativeSlot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmp$c;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiContainerCreative$CreativeSlot;";
	}

	/**
	 * <p>
	 * Name: putStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_75215_d = McMappingDatabase.getSRG("GuiContainerCreative$CreativeSlot.func_75215_d");

	/**
	 * <p>
	 * Name: getSlotTexture
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_178171_c = McMappingDatabase.getSRG("GuiContainerCreative$CreativeSlot.func_178171_c");

	/**
	 * <p>
	 * Name: getStack
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_75211_c = McMappingDatabase.getSRG("GuiContainerCreative$CreativeSlot.func_75211_c");

	/**
	 * <p>
	 * Name: getItemStackLimit
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_178170_b = McMappingDatabase.getSRG("GuiContainerCreative$CreativeSlot.func_178170_b");

	/**
	 * <p>
	 * Name: isHere
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;I)Z]
	 * </p>
	 */
	public static McObfPair func_75217_a = McMappingDatabase.getSRG("GuiContainerCreative$CreativeSlot.func_75217_a");

	/**
	 * <p>
	 * Name: isItemValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75214_a = McMappingDatabase.getSRG("GuiContainerCreative$CreativeSlot.func_75214_a");

	/**
	 * <p>
	 * Name: canTakeStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_82869_a = McMappingDatabase.getSRG("GuiContainerCreative$CreativeSlot.func_82869_a");

	/**
	 * <p>
	 * Name: onSlotChanged
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75218_e = McMappingDatabase.getSRG("GuiContainerCreative$CreativeSlot.func_75218_e");

	/**
	 * <p>
	 * Name: getHasStack
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75216_d = McMappingDatabase.getSRG("GuiContainerCreative$CreativeSlot.func_75216_d");

	/**
	 * <p>
	 * Name: isEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_111238_b = McMappingDatabase.getSRG("GuiContainerCreative$CreativeSlot.func_111238_b");

	/**
	 * <p>
	 * Name: slot
	 * </p>
	 */
	public static McObfPair field_148332_b = McMappingDatabase.getSRG("field_148332_b");

	/**
	 * <p>
	 * Name: getSlotStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75219_a = McMappingDatabase.getSRG("GuiContainerCreative$CreativeSlot.func_75219_a");

	/**
	 * <p>
	 * Name: onTake
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190901_a = McMappingDatabase.getSRG("GuiContainerCreative$CreativeSlot.func_190901_a");

	/**
	 * <p>
	 * Name: decrStackSize
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_75209_a = McMappingDatabase.getSRG("GuiContainerCreative$CreativeSlot.func_75209_a");

}

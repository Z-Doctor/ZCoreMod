package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiContainerCreative$LockedSlot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmp$a";
		else
			return "net/minecraft/client/gui/inventory/GuiContainerCreative$LockedSlot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmp$a";
		else
			return "GuiContainerCreative$LockedSlot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmp$a;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiContainerCreative$LockedSlot;";
	}

	/**
	 * <p>
	 * Name: canTakeStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_82869_a = McMappingDatabase.getSRG("GuiContainerCreative$LockedSlot.func_82869_a");

}

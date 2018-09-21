package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiEditCommandBlockMinecart$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmz$1";
		else
			return "net/minecraft/client/gui/inventory/GuiEditCommandBlockMinecart$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmz$1";
		else
			return "GuiEditCommandBlockMinecart$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmz$1;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiEditCommandBlockMinecart$1;";
	}

	/**
	 * <p>
	 * Name: getTargetBlockPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_186839_b = McMappingDatabase.getSRG("GuiEditCommandBlockMinecart$1.func_186839_b");

}

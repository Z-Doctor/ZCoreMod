package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiChat$ChatTabCompleter {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkn$a";
		else
			return "net/minecraft/client/gui/GuiChat$ChatTabCompleter";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkn$a";
		else
			return "GuiChat$ChatTabCompleter";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkn$a;";
		else
			return "Lnet/minecraft/client/gui/GuiChat$ChatTabCompleter;";
	}

	/**
	 * <p>
	 * Name: complete
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186841_a = McMappingDatabase.getSRG("GuiChat$ChatTabCompleter.func_186841_a");

	/**
	 * <p>
	 * Name: client
	 * </p>
	 */
	public static McObfPair field_186853_g = McMappingDatabase.getSRG("field_186853_g");

	/**
	 * <p>
	 * Name: getTargetBlockPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_186839_b = McMappingDatabase.getSRG("GuiChat$ChatTabCompleter.func_186839_b");

}

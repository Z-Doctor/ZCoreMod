package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiLockIconButton$Icon {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjl$a";
		else
			return "net/minecraft/client/gui/GuiLockIconButton$Icon";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjl$a";
		else
			return "GuiLockIconButton$Icon";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjl$a;";
		else
			return "Lnet/minecraft/client/gui/GuiLockIconButton$Icon;";
	}

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_178914_g = McMappingDatabase.getSRG("field_178914_g");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178912_b = McMappingDatabase.getSRG("GuiLockIconButton$Icon.func_178912_b");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_178920_h = McMappingDatabase.getSRG("field_178920_h");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178910_a = McMappingDatabase.getSRG("GuiLockIconButton$Icon.func_178910_a");

}

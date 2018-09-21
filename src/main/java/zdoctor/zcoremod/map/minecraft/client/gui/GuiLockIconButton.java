package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiLockIconButton {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjl";
		else
			return "net/minecraft/client/gui/GuiLockIconButton";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjl";
		else
			return "GuiLockIconButton";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjl;";
		else
			return "Lnet/minecraft/client/gui/GuiLockIconButton;";
	}

	/**
	 * <p>
	 * Name: drawButton
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;IIF)V]
	 * </p>
	 */
	public static McObfPair func_191745_a = McMappingDatabase.getSRG("GuiLockIconButton.func_191745_a");

	/**
	 * <p>
	 * Name: setLocked
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_175229_b = McMappingDatabase.getSRG("GuiLockIconButton.func_175229_b");

	/**
	 * <p>
	 * Name: isLocked
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175230_c = McMappingDatabase.getSRG("GuiLockIconButton.func_175230_c");

	/**
	 * <p>
	 * Name: locked
	 * </p>
	 */
	public static McObfPair field_175231_o = McMappingDatabase.getSRG("field_175231_o");

}

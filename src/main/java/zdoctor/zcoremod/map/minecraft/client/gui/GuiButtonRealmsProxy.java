package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiButtonRealmsProxy {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkg";
		else
			return "net/minecraft/client/gui/GuiButtonRealmsProxy";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkg";
		else
			return "GuiButtonRealmsProxy";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkg;";
		else
			return "Lnet/minecraft/client/gui/GuiButtonRealmsProxy;";
	}

	/**
	 * <p>
	 * Name: realmsButton
	 * </p>
	 */
	public static McObfPair field_154318_o = McMappingDatabase.getSRG("field_154318_o");

	/**
	 * <p>
	 * Name: getButtonWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_146117_b = McMappingDatabase.getSRG("GuiButtonRealmsProxy.func_146117_b");

	/**
	 * <p>
	 * Name: getYImage
	 * </p>
	 * <p>
	 * Desc: [(Z)I]
	 * </p>
	 */
	public static McObfPair func_154312_c = McMappingDatabase.getSRG("GuiButtonRealmsProxy.func_154312_c");

	/**
	 * <p>
	 * Name: mousePressed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;II)Z]
	 * </p>
	 */
	public static McObfPair func_146116_c = McMappingDatabase.getSRG("GuiButtonRealmsProxy.func_146116_c");

	/**
	 * <p>
	 * Name: getHoverState
	 * </p>
	 * <p>
	 * Desc: [(Z)I]
	 * </p>
	 */
	public static McObfPair func_146114_a = McMappingDatabase.getSRG("GuiButtonRealmsProxy.func_146114_a");

	/**
	 * <p>
	 * Name: getHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_175232_g = McMappingDatabase.getSRG("GuiButtonRealmsProxy.func_175232_g");

	/**
	 * <p>
	 * Name: mouseDragged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;II)V]
	 * </p>
	 */
	public static McObfPair func_146119_b = McMappingDatabase.getSRG("GuiButtonRealmsProxy.func_146119_b");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_154314_d = McMappingDatabase.getSRG("GuiButtonRealmsProxy.func_154314_d");

	/**
	 * <p>
	 * Name: setText
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_154311_a = McMappingDatabase.getSRG("GuiButtonRealmsProxy.func_154311_a");

	/**
	 * <p>
	 * Name: getEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_154315_e = McMappingDatabase.getSRG("GuiButtonRealmsProxy.func_154315_e");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146118_a = McMappingDatabase.getSRG("GuiButtonRealmsProxy.func_146118_a");

	/**
	 * <p>
	 * Name: getPositionY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_154316_f = McMappingDatabase.getSRG("GuiButtonRealmsProxy.func_154316_f");

	/**
	 * <p>
	 * Name: setEnabled
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_154313_b = McMappingDatabase.getSRG("GuiButtonRealmsProxy.func_154313_b");

	/**
	 * <p>
	 * Name: getRealmsButton
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/realms/RealmsButton;]
	 * </p>
	 */
	public static McObfPair func_154317_g = McMappingDatabase.getSRG("GuiButtonRealmsProxy.func_154317_g");

}

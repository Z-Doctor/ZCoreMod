package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiScreenRealmsProxy {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bki";
		else
			return "net/minecraft/client/gui/GuiScreenRealmsProxy";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bki";
		else
			return "GuiScreenRealmsProxy";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbki;";
		else
			return "Lnet/minecraft/client/gui/GuiScreenRealmsProxy;";
	}

	/**
	 * <p>
	 * Name: getStringWidth
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_154326_c = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_154326_c");

	/**
	 * <p>
	 * Name: handleKeyboardInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146282_l = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_146282_l");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_146281_b");

	/**
	 * <p>
	 * Name: drawHoveringText
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;II)V]
	 * </p>
	 */
	public static McObfPair func_146283_a = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_146283_a");

	/**
	 * <p>
	 * Name: drawGradientRect
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_73733_a = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_73733_a");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146274_d = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_146274_d");

	/**
	 * <p>
	 * Name: drawDefaultBackground
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146276_q_ = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_146276_q_");

	/**
	 * <p>
	 * Name: drawHoveringText
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;II)V]
	 * </p>
	 */
	public static McObfPair func_146279_a = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_146279_a");

	/**
	 * <p>
	 * Name: confirmClicked
	 * </p>
	 * <p>
	 * Desc: [(ZI)V]
	 * </p>
	 */
	public static McObfPair func_73878_a = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_73878_a");

	/**
	 * <p>
	 * Name: mouseClickMove
	 * </p>
	 * <p>
	 * Desc: [(IIIJ)V]
	 * </p>
	 */
	public static McObfPair func_146273_a = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_146273_a");

	/**
	 * <p>
	 * Name: fontDrawShadow
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;III)V]
	 * </p>
	 */
	public static McObfPair func_154319_c = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_154319_c");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_73864_a");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_73863_a");

	/**
	 * <p>
	 * Name: getFontHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_154329_h = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_154329_h");

	/**
	 * <p>
	 * Name: drawTexturedModalRect
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_73729_b = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_73729_b");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_73876_c");

	/**
	 * <p>
	 * Name: proxy
	 * </p>
	 */
	public static McObfPair field_154330_a = McMappingDatabase.getSRG("field_154330_a");

	/**
	 * <p>
	 * Name: buttonsRemove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/realms/RealmsButton;)V]
	 * </p>
	 */
	public static McObfPair func_154328_b = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_154328_b");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_146284_a");

	/**
	 * <p>
	 * Name: getProxy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/realms/RealmsScreen;]
	 * </p>
	 */
	public static McObfPair func_154321_a = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_154321_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_73866_w_");

	/**
	 * <p>
	 * Name: buttonsAdd
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/realms/RealmsButton;)V]
	 * </p>
	 */
	public static McObfPair func_154327_a = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_154327_a");

	/**
	 * <p>
	 * Name: drawCenteredString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;III)V]
	 * </p>
	 */
	public static McObfPair func_154325_a = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_154325_a");

	/**
	 * <p>
	 * Name: doesGuiPauseGame
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73868_f = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_73868_f");

	/**
	 * <p>
	 * Name: drawWorldBackground
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146270_b = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_146270_b");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_73869_a");

	/**
	 * <p>
	 * Name: fontSplit
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_154323_a = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_154323_a");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_146286_b = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_146286_b");

	/**
	 * <p>
	 * Name: buttonsClear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_154324_i = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_154324_i");

	/**
	 * <p>
	 * Name: renderToolTip
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;II)V]
	 * </p>
	 */
	public static McObfPair func_146285_a = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_146285_a");

	/**
	 * <p>
	 * Name: buttons
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_154320_j = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_154320_j");

	/**
	 * <p>
	 * Name: drawString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;IIIZ)V]
	 * </p>
	 */
	public static McObfPair func_154322_b = McMappingDatabase.getSRG("GuiScreenRealmsProxy.func_154322_b");

}

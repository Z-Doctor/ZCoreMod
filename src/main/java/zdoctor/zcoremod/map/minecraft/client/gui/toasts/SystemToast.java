package zdoctor.zcoremod.map.minecraft.client.gui.toasts;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SystemToast {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bka";
		else
			return "net/minecraft/client/gui/toasts/SystemToast";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bka";
		else
			return "SystemToast";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbka;";
		else
			return "Lnet/minecraft/client/gui/toasts/SystemToast;";
	}

	/**
	 * <p>
	 * Name: draw
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/toasts/GuiToast;J)Lnet/minecraft/client/gui/toasts/IToast$Visibility;]
	 * </p>
	 */
	public static McObfPair func_193653_a = McMappingDatabase.getSRG("SystemToast.func_193653_a");

	/**
	 * <p>
	 * Name: setDisplayedText
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_193656_a = McMappingDatabase.getSRG("SystemToast.func_193656_a");

	/**
	 * <p>
	 * Name: addOrUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/toasts/GuiToast;Lnet/minecraft/client/gui/toasts/SystemToast$Type;Lnet/minecraft/util/text/ITextComponent;Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_193657_a = McMappingDatabase.getSRG("SystemToast.func_193657_a");

	/**
	 * <p>
	 * Name: newDisplay
	 * </p>
	 */
	public static McObfPair field_193663_g = McMappingDatabase.getSRG("field_193663_g");

	/**
	 * <p>
	 * Name: title
	 * </p>
	 */
	public static McObfPair field_193660_d = McMappingDatabase.getSRG("field_193660_d");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/toasts/SystemToast$Type;, ()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_193652_b = McMappingDatabase.getSRG("SystemToast.func_193652_b");

	/**
	 * <p>
	 * Name: firstDrawTime
	 * </p>
	 */
	public static McObfPair field_193662_f = McMappingDatabase.getSRG("field_193662_f");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_193659_c = McMappingDatabase.getSRG("field_193659_c");

	/**
	 * <p>
	 * Name: subtitle
	 * </p>
	 */
	public static McObfPair field_193661_e = McMappingDatabase.getSRG("field_193661_e");

}

package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiScreenWorking {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bli";
		else
			return "net/minecraft/client/gui/GuiScreenWorking";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bli";
		else
			return "GuiScreenWorking";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbli;";
		else
			return "Lnet/minecraft/client/gui/GuiScreenWorking;";
	}

	/**
	 * <p>
	 * Name: title
	 * </p>
	 */
	public static McObfPair field_146591_a = McMappingDatabase.getSRG("field_146591_a");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiScreenWorking.func_73863_a");

	/**
	 * <p>
	 * Name: stage
	 * </p>
	 */
	public static McObfPair field_146589_f = McMappingDatabase.getSRG("field_146589_f");

	/**
	 * <p>
	 * Name: displaySavingString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_73720_a = McMappingDatabase.getSRG("GuiScreenWorking.func_73720_a");

	/**
	 * <p>
	 * Name: setDoneWorking
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146586_a = McMappingDatabase.getSRG("GuiScreenWorking.func_146586_a");

	/**
	 * <p>
	 * Name: setLoadingProgress
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_73718_a = McMappingDatabase.getSRG("GuiScreenWorking.func_73718_a");

	/**
	 * <p>
	 * Name: displayLoadingString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_73719_c = McMappingDatabase.getSRG("GuiScreenWorking.func_73719_c");

	/**
	 * <p>
	 * Name: doneWorking
	 * </p>
	 */
	public static McObfPair field_146592_h = McMappingDatabase.getSRG("field_146592_h");

	/**
	 * <p>
	 * Name: progress
	 * </p>
	 */
	public static McObfPair field_146590_g = McMappingDatabase.getSRG("field_146590_g");

	/**
	 * <p>
	 * Name: resetProgressAndMessage
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_73721_b = McMappingDatabase.getSRG("GuiScreenWorking.func_73721_b");

}

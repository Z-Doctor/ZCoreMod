package zdoctor.zcoremod.map.minecraft.server.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MinecraftServerGui {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oc";
		else
			return "net/minecraft/server/gui/MinecraftServerGui";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oc";
		else
			return "MinecraftServerGui";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Loc;";
		else
			return "Lnet/minecraft/server/gui/MinecraftServerGui;";
	}

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_164248_b = McMappingDatabase.getSRG("field_164248_b");

	/**
	 * <p>
	 * Name: getStatsComponent
	 * </p>
	 * <p>
	 * Desc: [()Ljavax/swing/JComponent;]
	 * </p>
	 */
	public static McObfPair func_120019_b = McMappingDatabase.getSRG("MinecraftServerGui.func_120019_b");

	/**
	 * <p>
	 * Name: SERVER_GUI_FONT
	 * </p>
	 */
	public static McObfPair field_164249_a = McMappingDatabase.getSRG("field_164249_a");

	/**
	 * <p>
	 * Name: getLogComponent
	 * </p>
	 * <p>
	 * Desc: [()Ljavax/swing/JComponent;]
	 * </p>
	 */
	public static McObfPair func_120018_d = McMappingDatabase.getSRG("MinecraftServerGui.func_120018_d");

	/**
	 * <p>
	 * Name: appendLine
	 * </p>
	 * <p>
	 * Desc: [(Ljavax/swing/JTextArea;Ljavax/swing/JScrollPane;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_164247_a = McMappingDatabase.getSRG("MinecraftServerGui.func_164247_a");

	/**
	 * <p>
	 * Name: createServerGui
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/dedicated/DedicatedServer;)V]
	 * </p>
	 */
	public static McObfPair func_120016_a = McMappingDatabase.getSRG("MinecraftServerGui.func_120016_a");

	/**
	 * <p>
	 * Name: getPlayerListComponent
	 * </p>
	 * <p>
	 * Desc: [()Ljavax/swing/JComponent;]
	 * </p>
	 */
	public static McObfPair func_120020_c = McMappingDatabase.getSRG("MinecraftServerGui.func_120020_c");

	/**
	 * <p>
	 * Name: server
	 * </p>
	 */
	public static McObfPair field_120021_b = McMappingDatabase.getSRG("field_120021_b");

}

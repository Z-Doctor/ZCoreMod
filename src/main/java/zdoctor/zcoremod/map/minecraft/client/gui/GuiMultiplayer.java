package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiMultiplayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnf";
		else
			return "net/minecraft/client/gui/GuiMultiplayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnf";
		else
			return "GuiMultiplayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnf;";
		else
			return "Lnet/minecraft/client/gui/GuiMultiplayer;";
	}

	/**
	 * <p>
	 * Name: lanServerList
	 * </p>
	 */
	public static McObfPair field_146799_A = McMappingDatabase.getSRG("field_146799_A");

	/**
	 * <p>
	 * Name: editingServer
	 * </p>
	 */
	public static McObfPair field_146805_w = McMappingDatabase.getSRG("field_146805_w");

	/**
	 * <p>
	 * Name: connectToSelected
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146796_h = McMappingDatabase.getSRG("GuiMultiplayer.func_146796_h");

	/**
	 * <p>
	 * Name: getOldServerPinger
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/network/ServerPinger;]
	 * </p>
	 */
	public static McObfPair func_146789_i = McMappingDatabase.getSRG("GuiMultiplayer.func_146789_i");

	/**
	 * <p>
	 * Name: btnSelectServer
	 * </p>
	 */
	public static McObfPair field_146809_s = McMappingDatabase.getSRG("field_146809_s");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiMultiplayer.func_73866_w_");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiMultiplayer.func_73869_a");

	/**
	 * <p>
	 * Name: connectToServer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/ServerData;)V]
	 * </p>
	 */
	public static McObfPair func_146791_a = McMappingDatabase.getSRG("GuiMultiplayer.func_146791_a");

	/**
	 * <p>
	 * Name: btnDeleteServer
	 * </p>
	 */
	public static McObfPair field_146808_t = McMappingDatabase.getSRG("field_146808_t");

	/**
	 * <p>
	 * Name: setHoveringText
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_146793_a = McMappingDatabase.getSRG("GuiMultiplayer.func_146793_a");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiMultiplayer.func_146284_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_146802_a = McMappingDatabase.getSRG("field_146802_a");

	/**
	 * <p>
	 * Name: moveServerUp
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ServerListEntryNormal;IZ)V]
	 * </p>
	 */
	public static McObfPair func_175391_a = McMappingDatabase.getSRG("GuiMultiplayer.func_175391_a");

	/**
	 * <p>
	 * Name: canMoveDown
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ServerListEntryNormal;I)Z]
	 * </p>
	 */
	public static McObfPair func_175394_b = McMappingDatabase.getSRG("GuiMultiplayer.func_175394_b");

	/**
	 * <p>
	 * Name: moveServerDown
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ServerListEntryNormal;IZ)V]
	 * </p>
	 */
	public static McObfPair func_175393_b = McMappingDatabase.getSRG("GuiMultiplayer.func_175393_b");

	/**
	 * <p>
	 * Name: selectedServer
	 * </p>
	 */
	public static McObfPair field_146811_z = McMappingDatabase.getSRG("field_146811_z");

	/**
	 * <p>
	 * Name: getServerList
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/multiplayer/ServerList;]
	 * </p>
	 */
	public static McObfPair func_146795_p = McMappingDatabase.getSRG("GuiMultiplayer.func_146795_p");

	/**
	 * <p>
	 * Name: hoveringText
	 * </p>
	 */
	public static McObfPair field_146812_y = McMappingDatabase.getSRG("field_146812_y");

	/**
	 * <p>
	 * Name: lanServerDetector
	 * </p>
	 */
	public static McObfPair field_146800_B = McMappingDatabase.getSRG("field_146800_B");

	/**
	 * <p>
	 * Name: parentScreen
	 * </p>
	 */
	public static McObfPair field_146798_g = McMappingDatabase.getSRG("field_146798_g");

	/**
	 * <p>
	 * Name: oldServerPinger
	 * </p>
	 */
	public static McObfPair field_146797_f = McMappingDatabase.getSRG("field_146797_f");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiMultiplayer.func_73876_c");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiMultiplayer.func_73863_a");

	/**
	 * <p>
	 * Name: serverListSelector
	 * </p>
	 */
	public static McObfPair field_146803_h = McMappingDatabase.getSRG("field_146803_h");

	/**
	 * <p>
	 * Name: createButtons
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146794_g = McMappingDatabase.getSRG("GuiMultiplayer.func_146794_g");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146274_d = McMappingDatabase.getSRG("GuiMultiplayer.func_146274_d");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiMultiplayer.func_146281_b");

	/**
	 * <p>
	 * Name: deletingServer
	 * </p>
	 */
	public static McObfPair field_146807_u = McMappingDatabase.getSRG("field_146807_u");

	/**
	 * <p>
	 * Name: initialized
	 * </p>
	 */
	public static McObfPair field_146801_C = McMappingDatabase.getSRG("field_146801_C");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiMultiplayer.func_73864_a");

	/**
	 * <p>
	 * Name: btnEditServer
	 * </p>
	 */
	public static McObfPair field_146810_r = McMappingDatabase.getSRG("field_146810_r");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_146286_b = McMappingDatabase.getSRG("GuiMultiplayer.func_146286_b");

	/**
	 * <p>
	 * Name: addingServer
	 * </p>
	 */
	public static McObfPair field_146806_v = McMappingDatabase.getSRG("field_146806_v");

	/**
	 * <p>
	 * Name: savedServerList
	 * </p>
	 */
	public static McObfPair field_146804_i = McMappingDatabase.getSRG("field_146804_i");

	/**
	 * <p>
	 * Name: refreshServerList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146792_q = McMappingDatabase.getSRG("GuiMultiplayer.func_146792_q");

	/**
	 * <p>
	 * Name: canMoveUp
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ServerListEntryNormal;I)Z]
	 * </p>
	 */
	public static McObfPair func_175392_a = McMappingDatabase.getSRG("GuiMultiplayer.func_175392_a");

	/**
	 * <p>
	 * Name: directConnect
	 * </p>
	 */
	public static McObfPair field_146813_x = McMappingDatabase.getSRG("field_146813_x");

	/**
	 * <p>
	 * Name: confirmClicked
	 * </p>
	 * <p>
	 * Desc: [(ZI)V]
	 * </p>
	 */
	public static McObfPair func_73878_a = McMappingDatabase.getSRG("GuiMultiplayer.func_73878_a");

	/**
	 * <p>
	 * Name: selectServer
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146790_a = McMappingDatabase.getSRG("GuiMultiplayer.func_146790_a");

}

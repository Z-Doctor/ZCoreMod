package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiPlayerTabOverlay {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjq";
		else
			return "net/minecraft/client/gui/GuiPlayerTabOverlay";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjq";
		else
			return "GuiPlayerTabOverlay";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjq;";
		else
			return "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;";
	}

	/**
	 * <p>
	 * Name: isBeingRendered
	 * </p>
	 */
	public static McObfPair field_175254_k = McMappingDatabase.getSRG("field_175254_k");

	/**
	 * <p>
	 * Name: setHeader
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_175244_b = McMappingDatabase.getSRG("GuiPlayerTabOverlay.func_175244_b");

	/**
	 * <p>
	 * Name: drawPing
	 * </p>
	 * <p>
	 * Desc: [(IIILnet/minecraft/client/network/NetworkPlayerInfo;)V]
	 * </p>
	 */
	public static McObfPair func_175245_a = McMappingDatabase.getSRG("GuiPlayerTabOverlay.func_175245_a");

	/**
	 * <p>
	 * Name: footer
	 * </p>
	 */
	public static McObfPair field_175255_h = McMappingDatabase.getSRG("field_175255_h");

	/**
	 * <p>
	 * Name: resetFooterHeader
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_181030_a = McMappingDatabase.getSRG("GuiPlayerTabOverlay.func_181030_a");

	/**
	 * <p>
	 * Name: getPlayerName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/network/NetworkPlayerInfo;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_175243_a = McMappingDatabase.getSRG("GuiPlayerTabOverlay.func_175243_a");

	/**
	 * <p>
	 * Name: header
	 * </p>
	 */
	public static McObfPair field_175256_i = McMappingDatabase.getSRG("field_175256_i");

	/**
	 * <p>
	 * Name: ENTRY_ORDERING
	 * </p>
	 */
	public static McObfPair field_175252_a = McMappingDatabase.getSRG("field_175252_a");

	/**
	 * <p>
	 * Name: renderPlayerlist
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/scoreboard/Scoreboard;Lnet/minecraft/scoreboard/ScoreObjective;)V]
	 * </p>
	 */
	public static McObfPair func_175249_a = McMappingDatabase.getSRG("GuiPlayerTabOverlay.func_175249_a");

	/**
	 * <p>
	 * Name: setFooter
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_175248_a = McMappingDatabase.getSRG("GuiPlayerTabOverlay.func_175248_a");

	/**
	 * <p>
	 * Name: guiIngame
	 * </p>
	 */
	public static McObfPair field_175251_g = McMappingDatabase.getSRG("field_175251_g");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_175250_f = McMappingDatabase.getSRG("field_175250_f");

	/**
	 * <p>
	 * Name: drawScoreboardValues
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScoreObjective;ILjava/lang/String;IILnet/minecraft/client/network/NetworkPlayerInfo;)V]
	 * </p>
	 */
	public static McObfPair func_175247_a = McMappingDatabase.getSRG("GuiPlayerTabOverlay.func_175247_a");

	/**
	 * <p>
	 * Name: updatePlayerList
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_175246_a = McMappingDatabase.getSRG("GuiPlayerTabOverlay.func_175246_a");

	/**
	 * <p>
	 * Name: lastTimeOpened
	 * </p>
	 */
	public static McObfPair field_175253_j = McMappingDatabase.getSRG("field_175253_j");

}

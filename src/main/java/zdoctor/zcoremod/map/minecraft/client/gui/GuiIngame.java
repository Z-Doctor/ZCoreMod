package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiIngame {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "biq";
		else
			return "net/minecraft/client/gui/GuiIngame";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "biq";
		else
			return "GuiIngame";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbiq;";
		else
			return "Lnet/minecraft/client/gui/GuiIngame;";
	}

	/**
	 * <p>
	 * Name: renderGameOverlay
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_175180_a = McMappingDatabase.getSRG("GuiIngame.func_175180_a");

	/**
	 * <p>
	 * Name: highlightingItemStack
	 * </p>
	 */
	public static McObfPair field_92016_l = McMappingDatabase.getSRG("field_92016_l");

	/**
	 * <p>
	 * Name: prevVignetteBrightness
	 * </p>
	 */
	public static McObfPair field_73843_a = McMappingDatabase.getSRG("field_73843_a");

	/**
	 * <p>
	 * Name: rand
	 * </p>
	 */
	public static McObfPair field_73842_c = McMappingDatabase.getSRG("field_73842_c");

	/**
	 * <p>
	 * Name: overlayMessage
	 * </p>
	 */
	public static McObfPair field_73838_g = McMappingDatabase.getSRG("field_73838_g");

	/**
	 * <p>
	 * Name: renderDemo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ScaledResolution;)V]
	 * </p>
	 */
	public static McObfPair func_175185_b = McMappingDatabase.getSRG("GuiIngame.func_175185_b");

	/**
	 * <p>
	 * Name: WIDGETS_TEX_PATH
	 * </p>
	 */
	public static McObfPair field_110330_c = McMappingDatabase.getSRG("field_110330_c");

	/**
	 * <p>
	 * Name: overlayMessageTime
	 * </p>
	 */
	public static McObfPair field_73845_h = McMappingDatabase.getSRG("field_73845_h");

	/**
	 * <p>
	 * Name: renderPlayerStats
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ScaledResolution;)V]
	 * </p>
	 */
	public static McObfPair func_180477_d = McMappingDatabase.getSRG("GuiIngame.func_180477_d");

	/**
	 * <p>
	 * Name: overlayPlayerList
	 * </p>
	 */
	public static McObfPair field_175196_v = McMappingDatabase.getSRG("field_175196_v");

	/**
	 * <p>
	 * Name: renderHorseJumpBar
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ScaledResolution;I)V]
	 * </p>
	 */
	public static McObfPair func_175186_a = McMappingDatabase.getSRG("GuiIngame.func_175186_a");

	/**
	 * <p>
	 * Name: setRecordPlayingMessage
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_73833_a = McMappingDatabase.getSRG("GuiIngame.func_73833_a");

	/**
	 * <p>
	 * Name: renderScoreboard
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScoreObjective;Lnet/minecraft/client/gui/ScaledResolution;)V]
	 * </p>
	 */
	public static McObfPair func_180475_a = McMappingDatabase.getSRG("GuiIngame.func_180475_a");

	/**
	 * <p>
	 * Name: displayTitle
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;III)V]
	 * </p>
	 */
	public static McObfPair func_175178_a = McMappingDatabase.getSRG("GuiIngame.func_175178_a");

	/**
	 * <p>
	 * Name: getSpectatorGui
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/GuiSpectator;]
	 * </p>
	 */
	public static McObfPair func_175187_g = McMappingDatabase.getSRG("GuiIngame.func_175187_g");

	/**
	 * <p>
	 * Name: persistantChatGUI
	 * </p>
	 */
	public static McObfPair field_73840_e = McMappingDatabase.getSRG("field_73840_e");

	/**
	 * <p>
	 * Name: displayedSubTitle
	 * </p>
	 */
	public static McObfPair field_175200_y = McMappingDatabase.getSRG("field_175200_y");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_73839_d = McMappingDatabase.getSRG("field_73839_d");

	/**
	 * <p>
	 * Name: renderPotionEffects
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ScaledResolution;)V]
	 * </p>
	 */
	public static McObfPair func_184048_a = McMappingDatabase.getSRG("GuiIngame.func_184048_a");

	/**
	 * <p>
	 * Name: addChatMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ChatType;Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_191742_a = McMappingDatabase.getSRG("GuiIngame.func_191742_a");

	/**
	 * <p>
	 * Name: spectatorGui
	 * </p>
	 */
	public static McObfPair field_175197_u = McMappingDatabase.getSRG("field_175197_u");

	/**
	 * <p>
	 * Name: renderExpBar
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ScaledResolution;I)V]
	 * </p>
	 */
	public static McObfPair func_175176_b = McMappingDatabase.getSRG("GuiIngame.func_175176_b");

	/**
	 * <p>
	 * Name: renderVignette
	 * </p>
	 * <p>
	 * Desc: [(FLnet/minecraft/client/gui/ScaledResolution;)V]
	 * </p>
	 */
	public static McObfPair func_180480_a = McMappingDatabase.getSRG("GuiIngame.func_180480_a");

	/**
	 * <p>
	 * Name: chatListeners
	 * </p>
	 */
	public static McObfPair field_191743_I = McMappingDatabase.getSRG("field_191743_I");

	/**
	 * <p>
	 * Name: overlayDebug
	 * </p>
	 */
	public static McObfPair field_175198_t = McMappingDatabase.getSRG("field_175198_t");

	/**
	 * <p>
	 * Name: healthUpdateCounter
	 * </p>
	 */
	public static McObfPair field_175191_F = McMappingDatabase.getSRG("field_175191_F");

	/**
	 * <p>
	 * Name: titleFadeOut
	 * </p>
	 */
	public static McObfPair field_175193_B = McMappingDatabase.getSRG("field_175193_B");

	/**
	 * <p>
	 * Name: overlaySubtitle
	 * </p>
	 */
	public static McObfPair field_184049_t = McMappingDatabase.getSRG("field_184049_t");

	/**
	 * <p>
	 * Name: setOverlayMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;Z)V]
	 * </p>
	 */
	public static McObfPair func_175188_a = McMappingDatabase.getSRG("GuiIngame.func_175188_a");

	/**
	 * <p>
	 * Name: lastPlayerHealth
	 * </p>
	 */
	public static McObfPair field_175189_D = McMappingDatabase.getSRG("field_175189_D");

	/**
	 * <p>
	 * Name: setDefaultTitlesTimes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175177_a = McMappingDatabase.getSRG("GuiIngame.func_175177_a");

	/**
	 * <p>
	 * Name: renderHotbar
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ScaledResolution;F)V]
	 * </p>
	 */
	public static McObfPair func_180479_a = McMappingDatabase.getSRG("GuiIngame.func_180479_a");

	/**
	 * <p>
	 * Name: renderSelectedItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ScaledResolution;)V]
	 * </p>
	 */
	public static McObfPair func_181551_a = McMappingDatabase.getSRG("GuiIngame.func_181551_a");

	/**
	 * <p>
	 * Name: getTabList
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/GuiPlayerTabOverlay;]
	 * </p>
	 */
	public static McObfPair func_175181_h = McMappingDatabase.getSRG("GuiIngame.func_175181_h");

	/**
	 * <p>
	 * Name: getFontRenderer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/FontRenderer;]
	 * </p>
	 */
	public static McObfPair func_175179_f = McMappingDatabase.getSRG("GuiIngame.func_175179_f");

	/**
	 * <p>
	 * Name: renderAttackIndicator
	 * </p>
	 * <p>
	 * Desc: [(FLnet/minecraft/client/gui/ScaledResolution;)V]
	 * </p>
	 */
	public static McObfPair func_184045_a = McMappingDatabase.getSRG("GuiIngame.func_184045_a");

	/**
	 * <p>
	 * Name: titlesTimer
	 * </p>
	 */
	public static McObfPair field_175195_w = McMappingDatabase.getSRG("field_175195_w");

	/**
	 * <p>
	 * Name: displayedTitle
	 * </p>
	 */
	public static McObfPair field_175201_x = McMappingDatabase.getSRG("field_175201_x");

	/**
	 * <p>
	 * Name: renderHotbarItem
	 * </p>
	 * <p>
	 * Desc: [(IIFLnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_184044_a = McMappingDatabase.getSRG("GuiIngame.func_184044_a");

	/**
	 * <p>
	 * Name: itemRenderer
	 * </p>
	 */
	public static McObfPair field_73841_b = McMappingDatabase.getSRG("field_73841_b");

	/**
	 * <p>
	 * Name: resetPlayersOverlayFooterHeader
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_181029_i = McMappingDatabase.getSRG("GuiIngame.func_181029_i");

	/**
	 * <p>
	 * Name: renderPumpkinOverlay
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ScaledResolution;)V]
	 * </p>
	 */
	public static McObfPair func_180476_e = McMappingDatabase.getSRG("GuiIngame.func_180476_e");

	/**
	 * <p>
	 * Name: setOverlayMessage
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Z)V]
	 * </p>
	 */
	public static McObfPair func_110326_a = McMappingDatabase.getSRG("GuiIngame.func_110326_a");

	/**
	 * <p>
	 * Name: getBossOverlay
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/GuiBossOverlay;]
	 * </p>
	 */
	public static McObfPair func_184046_j = McMappingDatabase.getSRG("GuiIngame.func_184046_j");

	/**
	 * <p>
	 * Name: getChatGUI
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/GuiNewChat;]
	 * </p>
	 */
	public static McObfPair func_146158_b = McMappingDatabase.getSRG("GuiIngame.func_146158_b");

	/**
	 * <p>
	 * Name: renderMountHealth
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ScaledResolution;)V]
	 * </p>
	 */
	public static McObfPair func_184047_e = McMappingDatabase.getSRG("GuiIngame.func_184047_e");

	/**
	 * <p>
	 * Name: VIGNETTE_TEX_PATH
	 * </p>
	 */
	public static McObfPair field_110329_b = McMappingDatabase.getSRG("field_110329_b");

	/**
	 * <p>
	 * Name: updateCounter
	 * </p>
	 */
	public static McObfPair field_73837_f = McMappingDatabase.getSRG("field_73837_f");

	/**
	 * <p>
	 * Name: animateOverlayMessageColor
	 * </p>
	 */
	public static McObfPair field_73844_j = McMappingDatabase.getSRG("field_73844_j");

	/**
	 * <p>
	 * Name: getUpdateCounter
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_73834_c = McMappingDatabase.getSRG("GuiIngame.func_73834_c");

	/**
	 * <p>
	 * Name: renderPortal
	 * </p>
	 * <p>
	 * Desc: [(FLnet/minecraft/client/gui/ScaledResolution;)V]
	 * </p>
	 */
	public static McObfPair func_180474_b = McMappingDatabase.getSRG("GuiIngame.func_180474_b");

	/**
	 * <p>
	 * Name: overlayBoss
	 * </p>
	 */
	public static McObfPair field_184050_w = McMappingDatabase.getSRG("field_184050_w");

	/**
	 * <p>
	 * Name: playerHealth
	 * </p>
	 */
	public static McObfPair field_175194_C = McMappingDatabase.getSRG("field_175194_C");

	/**
	 * <p>
	 * Name: titleDisplayTime
	 * </p>
	 */
	public static McObfPair field_175192_A = McMappingDatabase.getSRG("field_175192_A");

	/**
	 * <p>
	 * Name: PUMPKIN_BLUR_TEX_PATH
	 * </p>
	 */
	public static McObfPair field_110328_d = McMappingDatabase.getSRG("field_110328_d");

	/**
	 * <p>
	 * Name: remainingHighlightTicks
	 * </p>
	 */
	public static McObfPair field_92017_k = McMappingDatabase.getSRG("field_92017_k");

	/**
	 * <p>
	 * Name: lastSystemTime
	 * </p>
	 */
	public static McObfPair field_175190_E = McMappingDatabase.getSRG("field_175190_E");

	/**
	 * <p>
	 * Name: updateTick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73831_a = McMappingDatabase.getSRG("GuiIngame.func_73831_a");

	/**
	 * <p>
	 * Name: titleFadeIn
	 * </p>
	 */
	public static McObfPair field_175199_z = McMappingDatabase.getSRG("field_175199_z");

}

package zdoctor.zcoremod.map.minecraft.client.settings;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GameSettings {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bid";
		else
			return "net/minecraft/client/settings/GameSettings";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bid";
		else
			return "GameSettings";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbid;";
		else
			return "Lnet/minecraft/client/settings/GameSettings;";
	}

	/**
	 * <p>
	 * Name: lastServer
	 * </p>
	 */
	public static McObfPair field_74332_R = McMappingDatabase.getSRG("field_74332_R");

	/**
	 * <p>
	 * Name: narrator
	 * </p>
	 */
	public static McObfPair field_192571_R = McMappingDatabase.getSRG("field_192571_R");

	/**
	 * <p>
	 * Name: limitFramerate
	 * </p>
	 */
	public static McObfPair field_74350_i = McMappingDatabase.getSRG("field_74350_i");

	/**
	 * <p>
	 * Name: showDebugProfilerChart
	 * </p>
	 */
	public static McObfPair field_74329_Q = McMappingDatabase.getSRG("field_74329_Q");

	/**
	 * <p>
	 * Name: realmsNotifications
	 * </p>
	 */
	public static McObfPair field_183509_X = McMappingDatabase.getSRG("field_183509_X");

	/**
	 * <p>
	 * Name: keyBindSaveToolbar
	 * </p>
	 */
	public static McObfPair field_193629_ap = McMappingDatabase.getSRG("field_193629_ap");

	/**
	 * <p>
	 * Name: fovSetting
	 * </p>
	 */
	public static McObfPair field_74334_X = McMappingDatabase.getSRG("field_74334_X");

	/**
	 * <p>
	 * Name: keyBindScreenshot
	 * </p>
	 */
	public static McObfPair field_151447_Z = McMappingDatabase.getSRG("field_151447_Z");

	/**
	 * <p>
	 * Name: mainHand
	 * </p>
	 */
	public static McObfPair field_186715_A = McMappingDatabase.getSRG("field_186715_A");

	/**
	 * <p>
	 * Name: TYPE_LIST_STRING
	 * </p>
	 */
	public static McObfPair field_151449_az = McMappingDatabase.getSRG("field_151449_az");

	/**
	 * <p>
	 * Name: mipmapLevels
	 * </p>
	 */
	public static McObfPair field_151442_I = McMappingDatabase.getSRG("field_151442_I");

	/**
	 * <p>
	 * Name: setModelPartEnabled
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EnumPlayerModelParts;Z)V]
	 * </p>
	 */
	public static McObfPair func_178878_a = McMappingDatabase.getSRG("GameSettings.func_178878_a");

	/**
	 * <p>
	 * Name: getKeyBinding
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/settings/GameSettings$Options;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_74297_c = McMappingDatabase.getSRG("GameSettings.func_74297_c");

	/**
	 * <p>
	 * Name: reducedDebugInfo
	 * </p>
	 */
	public static McObfPair field_178879_v = McMappingDatabase.getSRG("field_178879_v");

	/**
	 * <p>
	 * Name: keyBindTogglePerspective
	 * </p>
	 */
	public static McObfPair field_151457_aa = McMappingDatabase.getSRG("field_151457_aa");

	/**
	 * <p>
	 * Name: keyBindSprint
	 * </p>
	 */
	public static McObfPair field_151444_V = McMappingDatabase.getSRG("field_151444_V");

	/**
	 * <p>
	 * Name: invertMouse
	 * </p>
	 */
	public static McObfPair field_74338_d = McMappingDatabase.getSRG("field_74338_d");

	/**
	 * <p>
	 * Name: getSoundLevel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundCategory;)F]
	 * </p>
	 */
	public static McObfPair func_186711_a = McMappingDatabase.getSRG("GameSettings.func_186711_a");

	/**
	 * <p>
	 * Name: enableVsync
	 * </p>
	 */
	public static McObfPair field_74352_v = McMappingDatabase.getSRG("field_74352_v");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151454_ax = McMappingDatabase.getSRG("field_151454_ax");

	/**
	 * <p>
	 * Name: showDebugInfo
	 * </p>
	 */
	public static McObfPair field_74330_P = McMappingDatabase.getSRG("field_74330_P");

	/**
	 * <p>
	 * Name: setOptionValue
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/settings/GameSettings$Options;I)V]
	 * </p>
	 */
	public static McObfPair func_74306_a = McMappingDatabase.getSRG("GameSettings.func_74306_a");

	/**
	 * <p>
	 * Name: dataFix
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189988_a = McMappingDatabase.getSRG("GameSettings.func_189988_a");

	/**
	 * <p>
	 * Name: isKeyDown
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/settings/KeyBinding;)Z]
	 * </p>
	 */
	public static McObfPair func_100015_a = McMappingDatabase.getSRG("GameSettings.func_100015_a");

	/**
	 * <p>
	 * Name: keyBindInventory
	 * </p>
	 */
	public static McObfPair field_151445_Q = McMappingDatabase.getSRG("field_151445_Q");

	/**
	 * <p>
	 * Name: chatLinksPrompt
	 * </p>
	 */
	public static McObfPair field_74358_q = McMappingDatabase.getSRG("field_74358_q");

	/**
	 * <p>
	 * Name: keyBindPickBlock
	 * </p>
	 */
	public static McObfPair field_74322_I = McMappingDatabase.getSRG("field_74322_I");

	/**
	 * <p>
	 * Name: keyBindChat
	 * </p>
	 */
	public static McObfPair field_74310_D = McMappingDatabase.getSRG("field_74310_D");

	/**
	 * <p>
	 * Name: keyBindPlayerList
	 * </p>
	 */
	public static McObfPair field_74321_H = McMappingDatabase.getSRG("field_74321_H");

	/**
	 * <p>
	 * Name: NARRATOR_MODES
	 * </p>
	 */
	public static McObfPair field_193632_b = McMappingDatabase.getSRG("field_193632_b");

	/**
	 * <p>
	 * Name: setOptionKeyBinding
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/settings/KeyBinding;I)V]
	 * </p>
	 */
	public static McObfPair func_151440_a = McMappingDatabase.getSRG("GameSettings.func_151440_a");

	/**
	 * <p>
	 * Name: useNativeTransport
	 * </p>
	 */
	public static McObfPair field_181150_U = McMappingDatabase.getSRG("field_181150_U");

	/**
	 * <p>
	 * Name: parseFloat
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)F]
	 * </p>
	 */
	public static McObfPair func_74305_a = McMappingDatabase.getSRG("GameSettings.func_74305_a");

	/**
	 * <p>
	 * Name: keyBindJump
	 * </p>
	 */
	public static McObfPair field_74314_A = McMappingDatabase.getSRG("field_74314_A");

	/**
	 * <p>
	 * Name: chatColours
	 * </p>
	 */
	public static McObfPair field_74344_o = McMappingDatabase.getSRG("field_74344_o");

	/**
	 * <p>
	 * Name: tutorialStep
	 * </p>
	 */
	public static McObfPair field_193631_S = McMappingDatabase.getSRG("field_193631_S");

	/**
	 * <p>
	 * Name: keyBindsHotbar
	 * </p>
	 */
	public static McObfPair field_151456_ac = McMappingDatabase.getSRG("field_151456_ac");

	/**
	 * <p>
	 * Name: setModelParts
	 * </p>
	 */
	public static McObfPair field_178882_aU = McMappingDatabase.getSRG("field_178882_aU");

	/**
	 * <p>
	 * Name: saveOptions
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_74303_b = McMappingDatabase.getSRG("GameSettings.func_74303_b");

	/**
	 * <p>
	 * Name: overrideHeight
	 * </p>
	 */
	public static McObfPair field_92119_C = McMappingDatabase.getSRG("field_92119_C");

	/**
	 * <p>
	 * Name: ATTACK_INDICATORS
	 * </p>
	 */
	public static McObfPair field_186713_aK = McMappingDatabase.getSRG("field_186713_aK");

	/**
	 * <p>
	 * Name: keyBindSneak
	 * </p>
	 */
	public static McObfPair field_74311_E = McMappingDatabase.getSRG("field_74311_E");

	/**
	 * <p>
	 * Name: keyBindFullscreen
	 * </p>
	 */
	public static McObfPair field_152395_am = McMappingDatabase.getSRG("field_152395_am");

	/**
	 * <p>
	 * Name: getTranslation
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_74299_a = McMappingDatabase.getSRG("GameSettings.func_74299_a");

	/**
	 * <p>
	 * Name: PARTICLES
	 * </p>
	 */
	public static McObfPair field_74364_ag = McMappingDatabase.getSRG("field_74364_ag");

	/**
	 * <p>
	 * Name: keyBindUseItem
	 * </p>
	 */
	public static McObfPair field_74313_G = McMappingDatabase.getSRG("field_74313_G");

	/**
	 * <p>
	 * Name: getModelParts
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_178876_d = McMappingDatabase.getSRG("GameSettings.func_178876_d");

	/**
	 * <p>
	 * Name: chatLinks
	 * </p>
	 */
	public static McObfPair field_74359_p = McMappingDatabase.getSRG("field_74359_p");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_74317_L = McMappingDatabase.getSRG("field_74317_L");

	/**
	 * <p>
	 * Name: anaglyph
	 * </p>
	 */
	public static McObfPair field_74337_g = McMappingDatabase.getSRG("field_74337_g");

	/**
	 * <p>
	 * Name: mouseSensitivity
	 * </p>
	 */
	public static McObfPair field_74341_c = McMappingDatabase.getSRG("field_74341_c");

	/**
	 * <p>
	 * Name: snooperEnabled
	 * </p>
	 */
	public static McObfPair field_74355_t = McMappingDatabase.getSRG("field_74355_t");

	/**
	 * <p>
	 * Name: ambientOcclusion
	 * </p>
	 */
	public static McObfPair field_74348_k = McMappingDatabase.getSRG("field_74348_k");

	/**
	 * <p>
	 * Name: keyBindAdvancements
	 * </p>
	 */
	public static McObfPair field_194146_ao = McMappingDatabase.getSRG("field_194146_ao");

	/**
	 * <p>
	 * Name: smoothCamera
	 * </p>
	 */
	public static McObfPair field_74326_T = McMappingDatabase.getSRG("field_74326_T");

	/**
	 * <p>
	 * Name: keyBindSmoothCamera
	 * </p>
	 */
	public static McObfPair field_151458_ab = McMappingDatabase.getSRG("field_151458_ab");

	/**
	 * <p>
	 * Name: showSubtitles
	 * </p>
	 */
	public static McObfPair field_186717_N = McMappingDatabase.getSRG("field_186717_N");

	/**
	 * <p>
	 * Name: gammaSetting
	 * </p>
	 */
	public static McObfPair field_74333_Y = McMappingDatabase.getSRG("field_74333_Y");

	/**
	 * <p>
	 * Name: debugCamEnable
	 * </p>
	 */
	public static McObfPair field_74325_U = McMappingDatabase.getSRG("field_74325_U");

	/**
	 * <p>
	 * Name: hideServerAddress
	 * </p>
	 */
	public static McObfPair field_80005_w = McMappingDatabase.getSRG("field_80005_w");

	/**
	 * <p>
	 * Name: setOptionFloatValue
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/settings/GameSettings$Options;F)V]
	 * </p>
	 */
	public static McObfPair func_74304_a = McMappingDatabase.getSRG("GameSettings.func_74304_a");

	/**
	 * <p>
	 * Name: getOptionFloatValue
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/settings/GameSettings$Options;)F]
	 * </p>
	 */
	public static McObfPair func_74296_a = McMappingDatabase.getSRG("GameSettings.func_74296_a");

	/**
	 * <p>
	 * Name: AMBIENT_OCCLUSIONS
	 * </p>
	 */
	public static McObfPair field_98303_au = McMappingDatabase.getSRG("field_98303_au");

	/**
	 * <p>
	 * Name: shouldRenderClouds
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_181147_e = McMappingDatabase.getSRG("GameSettings.func_181147_e");

	/**
	 * <p>
	 * Name: attackIndicator
	 * </p>
	 */
	public static McObfPair field_186716_M = McMappingDatabase.getSRG("field_186716_M");

	/**
	 * <p>
	 * Name: keyBindLeft
	 * </p>
	 */
	public static McObfPair field_74370_x = McMappingDatabase.getSRG("field_74370_x");

	/**
	 * <p>
	 * Name: resourcePacks
	 * </p>
	 */
	public static McObfPair field_151453_l = McMappingDatabase.getSRG("field_151453_l");

	/**
	 * <p>
	 * Name: optionsFile
	 * </p>
	 */
	public static McObfPair field_74354_ai = McMappingDatabase.getSRG("field_74354_ai");

	/**
	 * <p>
	 * Name: autoJump
	 * </p>
	 */
	public static McObfPair field_189989_R = McMappingDatabase.getSRG("field_189989_R");

	/**
	 * <p>
	 * Name: guiScale
	 * </p>
	 */
	public static McObfPair field_74335_Z = McMappingDatabase.getSRG("field_74335_Z");

	/**
	 * <p>
	 * Name: keyBindLoadToolbar
	 * </p>
	 */
	public static McObfPair field_193630_aq = McMappingDatabase.getSRG("field_193630_aq");

	/**
	 * <p>
	 * Name: getKeyDisplayString
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_74298_c = McMappingDatabase.getSRG("GameSettings.func_74298_c");

	/**
	 * <p>
	 * Name: GUISCALES
	 * </p>
	 */
	public static McObfPair field_74367_ae = McMappingDatabase.getSRG("field_74367_ae");

	/**
	 * <p>
	 * Name: incompatibleResourcePacks
	 * </p>
	 */
	public static McObfPair field_183018_l = McMappingDatabase.getSRG("field_183018_l");

	/**
	 * <p>
	 * Name: saturation
	 * </p>
	 */
	public static McObfPair field_151452_as = McMappingDatabase.getSRG("field_151452_as");

	/**
	 * <p>
	 * Name: chatHeightUnfocused
	 * </p>
	 */
	public static McObfPair field_96693_G = McMappingDatabase.getSRG("field_96693_G");

	/**
	 * <p>
	 * Name: keyBindSpectatorOutlines
	 * </p>
	 */
	public static McObfPair field_178883_an = McMappingDatabase.getSRG("field_178883_an");

	/**
	 * <p>
	 * Name: hideGUI
	 * </p>
	 */
	public static McObfPair field_74319_N = McMappingDatabase.getSRG("field_74319_N");

	/**
	 * <p>
	 * Name: keyBindBack
	 * </p>
	 */
	public static McObfPair field_74368_y = McMappingDatabase.getSRG("field_74368_y");

	/**
	 * <p>
	 * Name: thirdPersonView
	 * </p>
	 */
	public static McObfPair field_74320_O = McMappingDatabase.getSRG("field_74320_O");

	/**
	 * <p>
	 * Name: advancedItemTooltips
	 * </p>
	 */
	public static McObfPair field_82882_x = McMappingDatabase.getSRG("field_82882_x");

	/**
	 * <p>
	 * Name: soundLevels
	 * </p>
	 */
	public static McObfPair field_186714_aM = McMappingDatabase.getSRG("field_186714_aM");

	/**
	 * <p>
	 * Name: showLagometer
	 * </p>
	 */
	public static McObfPair field_181657_aC = McMappingDatabase.getSRG("field_181657_aC");

	/**
	 * <p>
	 * Name: fboEnable
	 * </p>
	 */
	public static McObfPair field_151448_g = McMappingDatabase.getSRG("field_151448_g");

	/**
	 * <p>
	 * Name: keyBindDrop
	 * </p>
	 */
	public static McObfPair field_74316_C = McMappingDatabase.getSRG("field_74316_C");

	/**
	 * <p>
	 * Name: chatScale
	 * </p>
	 */
	public static McObfPair field_96691_E = McMappingDatabase.getSRG("field_96691_E");

	/**
	 * <p>
	 * Name: keyBindSwapHands
	 * </p>
	 */
	public static McObfPair field_186718_X = McMappingDatabase.getSRG("field_186718_X");

	/**
	 * <p>
	 * Name: fancyGraphics
	 * </p>
	 */
	public static McObfPair field_74347_j = McMappingDatabase.getSRG("field_74347_j");

	/**
	 * <p>
	 * Name: setSoundLevel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundCategory;F)V]
	 * </p>
	 */
	public static McObfPair func_186712_a = McMappingDatabase.getSRG("GameSettings.func_186712_a");

	/**
	 * <p>
	 * Name: heldItemTooltips
	 * </p>
	 */
	public static McObfPair field_92117_D = McMappingDatabase.getSRG("field_92117_D");

	/**
	 * <p>
	 * Name: language
	 * </p>
	 */
	public static McObfPair field_74363_ab = McMappingDatabase.getSRG("field_74363_ab");

	/**
	 * <p>
	 * Name: sendSettingsToServer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_82879_c = McMappingDatabase.getSRG("GameSettings.func_82879_c");

	/**
	 * <p>
	 * Name: chatHeightFocused
	 * </p>
	 */
	public static McObfPair field_96694_H = McMappingDatabase.getSRG("field_96694_H");

	/**
	 * <p>
	 * Name: COLON_SPLITTER
	 * </p>
	 */
	public static McObfPair field_189990_a = McMappingDatabase.getSRG("field_189990_a");

	/**
	 * <p>
	 * Name: viewBobbing
	 * </p>
	 */
	public static McObfPair field_74336_f = McMappingDatabase.getSRG("field_74336_f");

	/**
	 * <p>
	 * Name: difficulty
	 * </p>
	 */
	public static McObfPair field_74318_M = McMappingDatabase.getSRG("field_74318_M");

	/**
	 * <p>
	 * Name: forceUnicodeFont
	 * </p>
	 */
	public static McObfPair field_151455_aw = McMappingDatabase.getSRG("field_151455_aw");

	/**
	 * <p>
	 * Name: overrideWidth
	 * </p>
	 */
	public static McObfPair field_92118_B = McMappingDatabase.getSRG("field_92118_B");

	/**
	 * <p>
	 * Name: chatWidth
	 * </p>
	 */
	public static McObfPair field_96692_F = McMappingDatabase.getSRG("field_96692_F");

	/**
	 * <p>
	 * Name: enableWeakAttacks
	 * </p>
	 */
	public static McObfPair field_189422_N = McMappingDatabase.getSRG("field_189422_N");

	/**
	 * <p>
	 * Name: chatOpacity
	 * </p>
	 */
	public static McObfPair field_74357_r = McMappingDatabase.getSRG("field_74357_r");

	/**
	 * <p>
	 * Name: keyBindRight
	 * </p>
	 */
	public static McObfPair field_74366_z = McMappingDatabase.getSRG("field_74366_z");

	/**
	 * <p>
	 * Name: chatVisibility
	 * </p>
	 */
	public static McObfPair field_74343_n = McMappingDatabase.getSRG("field_74343_n");

	/**
	 * <p>
	 * Name: particleSetting
	 * </p>
	 */
	public static McObfPair field_74362_aa = McMappingDatabase.getSRG("field_74362_aa");

	/**
	 * <p>
	 * Name: entityShadows
	 * </p>
	 */
	public static McObfPair field_181151_V = McMappingDatabase.getSRG("field_181151_V");

	/**
	 * <p>
	 * Name: getOptionOrdinalValue
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/settings/GameSettings$Options;)Z]
	 * </p>
	 */
	public static McObfPair func_74308_b = McMappingDatabase.getSRG("GameSettings.func_74308_b");

	/**
	 * <p>
	 * Name: fullScreen
	 * </p>
	 */
	public static McObfPair field_74353_u = McMappingDatabase.getSRG("field_74353_u");

	/**
	 * <p>
	 * Name: keyBindings
	 * </p>
	 */
	public static McObfPair field_74324_K = McMappingDatabase.getSRG("field_74324_K");

	/**
	 * <p>
	 * Name: keyBindCommand
	 * </p>
	 */
	public static McObfPair field_74323_J = McMappingDatabase.getSRG("field_74323_J");

	/**
	 * <p>
	 * Name: switchModelPartEnabled
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EnumPlayerModelParts;)V]
	 * </p>
	 */
	public static McObfPair func_178877_a = McMappingDatabase.getSRG("GameSettings.func_178877_a");

	/**
	 * <p>
	 * Name: loadOptions
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_74300_a = McMappingDatabase.getSRG("GameSettings.func_74300_a");

	/**
	 * <p>
	 * Name: GSON
	 * </p>
	 */
	public static McObfPair field_151450_ay = McMappingDatabase.getSRG("field_151450_ay");

	/**
	 * <p>
	 * Name: CLOUDS_TYPES
	 * </p>
	 */
	public static McObfPair field_181149_aW = McMappingDatabase.getSRG("field_181149_aW");

	/**
	 * <p>
	 * Name: keyBindForward
	 * </p>
	 */
	public static McObfPair field_74351_w = McMappingDatabase.getSRG("field_74351_w");

	/**
	 * <p>
	 * Name: pauseOnLostFocus
	 * </p>
	 */
	public static McObfPair field_82881_y = McMappingDatabase.getSRG("field_82881_y");

	/**
	 * <p>
	 * Name: keyBindAttack
	 * </p>
	 */
	public static McObfPair field_74312_F = McMappingDatabase.getSRG("field_74312_F");

	/**
	 * <p>
	 * Name: useVbo
	 * </p>
	 */
	public static McObfPair field_178881_t = McMappingDatabase.getSRG("field_178881_t");

	/**
	 * <p>
	 * Name: touchscreen
	 * </p>
	 */
	public static McObfPair field_85185_A = McMappingDatabase.getSRG("field_85185_A");

	/**
	 * <p>
	 * Name: clouds
	 * </p>
	 */
	public static McObfPair field_74345_l = McMappingDatabase.getSRG("field_74345_l");

	/**
	 * <p>
	 * Name: renderDistanceChunks
	 * </p>
	 */
	public static McObfPair field_151451_c = McMappingDatabase.getSRG("field_151451_c");

	/**
	 * <p>
	 * Name: isUsingNativeTransport
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_181148_f = McMappingDatabase.getSRG("GameSettings.func_181148_f");

}

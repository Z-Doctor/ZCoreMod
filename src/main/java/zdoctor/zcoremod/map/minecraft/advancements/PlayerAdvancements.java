package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlayerAdvancements {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "np";
		else
			return "net/minecraft/advancements/PlayerAdvancements";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "np";
		else
			return "PlayerAdvancements";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnp;";
		else
			return "Lnet/minecraft/advancements/PlayerAdvancements;";
	}

	/**
	 * <p>
	 * Name: grantCriterion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_192750_a = McMappingDatabase.getSRG("PlayerAdvancements.func_192750_a");

	/**
	 * <p>
	 * Name: registerListeners
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192751_c = McMappingDatabase.getSRG("PlayerAdvancements.func_192751_c");

	/**
	 * <p>
	 * Name: lastSelectedTab
	 * </p>
	 */
	public static McObfPair field_194221_k = McMappingDatabase.getSRG("field_194221_k");

	/**
	 * <p>
	 * Name: progressChanged
	 * </p>
	 */
	public static McObfPair field_192761_i = McMappingDatabase.getSRG("field_192761_i");

	/**
	 * <p>
	 * Name: shouldBeVisible
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)Z]
	 * </p>
	 */
	public static McObfPair func_192738_c = McMappingDatabase.getSRG("PlayerAdvancements.func_192738_c");

	/**
	 * <p>
	 * Name: flushDirty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_192741_b = McMappingDatabase.getSRG("PlayerAdvancements.func_192741_b");

	/**
	 * <p>
	 * Name: startProgress
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;Lnet/minecraft/advancements/AdvancementProgress;)V]
	 * </p>
	 */
	public static McObfPair func_192743_a = McMappingDatabase.getSRG("PlayerAdvancements.func_192743_a");

	/**
	 * <p>
	 * Name: dispose
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192745_a = McMappingDatabase.getSRG("PlayerAdvancements.func_192745_a");

	/**
	 * <p>
	 * Name: MAP_TOKEN
	 * </p>
	 */
	public static McObfPair field_192755_c = McMappingDatabase.getSRG("field_192755_c");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_192762_j = McMappingDatabase.getSRG("field_192762_j");

	/**
	 * <p>
	 * Name: ensureAllVisible
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192752_d = McMappingDatabase.getSRG("PlayerAdvancements.func_192752_d");

	/**
	 * <p>
	 * Name: getProgress
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)Lnet/minecraft/advancements/AdvancementProgress;]
	 * </p>
	 */
	public static McObfPair func_192747_a = McMappingDatabase.getSRG("PlayerAdvancements.func_192747_a");

	/**
	 * <p>
	 * Name: setSelectedTab
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_194220_a = McMappingDatabase.getSRG("PlayerAdvancements.func_194220_a");

	/**
	 * <p>
	 * Name: ensureVisibility
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_192742_b = McMappingDatabase.getSRG("PlayerAdvancements.func_192742_b");

	/**
	 * <p>
	 * Name: load
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192740_f = McMappingDatabase.getSRG("PlayerAdvancements.func_192740_f");

	/**
	 * <p>
	 * Name: revokeCriterion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_192744_b = McMappingDatabase.getSRG("PlayerAdvancements.func_192744_b");

	/**
	 * <p>
	 * Name: progressFile
	 * </p>
	 */
	public static McObfPair field_192757_e = McMappingDatabase.getSRG("field_192757_e");

	/**
	 * <p>
	 * Name: server
	 * </p>
	 */
	public static McObfPair field_192756_d = McMappingDatabase.getSRG("field_192756_d");

	/**
	 * <p>
	 * Name: checkForAutomaticTriggers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192748_e = McMappingDatabase.getSRG("PlayerAdvancements.func_192748_e");

	/**
	 * <p>
	 * Name: setPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_192739_a = McMappingDatabase.getSRG("PlayerAdvancements.func_192739_a");

	/**
	 * <p>
	 * Name: reload
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193766_b = McMappingDatabase.getSRG("PlayerAdvancements.func_193766_b");

	/**
	 * <p>
	 * Name: visible
	 * </p>
	 */
	public static McObfPair field_192759_g = McMappingDatabase.getSRG("field_192759_g");

	/**
	 * <p>
	 * Name: registerListeners
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_193764_b = McMappingDatabase.getSRG("PlayerAdvancements.func_193764_b");

	/**
	 * <p>
	 * Name: visibilityChanged
	 * </p>
	 */
	public static McObfPair field_192760_h = McMappingDatabase.getSRG("field_192760_h");

	/**
	 * <p>
	 * Name: hasCompletedChildrenOrSelf
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)Z]
	 * </p>
	 */
	public static McObfPair func_192746_d = McMappingDatabase.getSRG("PlayerAdvancements.func_192746_d");

	/**
	 * <p>
	 * Name: progress
	 * </p>
	 */
	public static McObfPair field_192758_f = McMappingDatabase.getSRG("field_192758_f");

	/**
	 * <p>
	 * Name: unregisterListeners
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_193765_c = McMappingDatabase.getSRG("PlayerAdvancements.func_193765_c");

	/**
	 * <p>
	 * Name: isFirstPacket
	 * </p>
	 */
	public static McObfPair field_192763_k = McMappingDatabase.getSRG("field_192763_k");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_192753_a = McMappingDatabase.getSRG("field_192753_a");

	/**
	 * <p>
	 * Name: save
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192749_b = McMappingDatabase.getSRG("PlayerAdvancements.func_192749_b");

	/**
	 * <p>
	 * Name: GSON
	 * </p>
	 */
	public static McObfPair field_192754_b = McMappingDatabase.getSRG("field_192754_b");

}

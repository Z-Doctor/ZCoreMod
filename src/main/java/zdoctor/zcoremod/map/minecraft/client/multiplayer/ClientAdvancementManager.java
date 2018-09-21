package zdoctor.zcoremod.map.minecraft.client.multiplayer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ClientAdvancementManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brw";
		else
			return "net/minecraft/client/multiplayer/ClientAdvancementManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brw";
		else
			return "ClientAdvancementManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrw;";
		else
			return "Lnet/minecraft/client/multiplayer/ClientAdvancementManager;";
	}

	/**
	 * <p>
	 * Name: setListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/ClientAdvancementManager$IListener;)V]
	 * </p>
	 */
	public static McObfPair func_192798_a = McMappingDatabase.getSRG("ClientAdvancementManager.func_192798_a");

	/**
	 * <p>
	 * Name: advancementList
	 * </p>
	 */
	public static McObfPair field_192802_c = McMappingDatabase.getSRG("field_192802_c");

	/**
	 * <p>
	 * Name: selectedTab
	 * </p>
	 */
	public static McObfPair field_194231_f = McMappingDatabase.getSRG("field_194231_f");

	/**
	 * <p>
	 * Name: listener
	 * </p>
	 */
	public static McObfPair field_192804_e = McMappingDatabase.getSRG("field_192804_e");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_192800_a = McMappingDatabase.getSRG("field_192800_a");

	/**
	 * <p>
	 * Name: advancementToProgress
	 * </p>
	 */
	public static McObfPair field_192803_d = McMappingDatabase.getSRG("field_192803_d");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketAdvancementInfo;)V]
	 * </p>
	 */
	public static McObfPair func_192799_a = McMappingDatabase.getSRG("ClientAdvancementManager.func_192799_a");

	/**
	 * <p>
	 * Name: getAdvancementList
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/advancements/AdvancementList;]
	 * </p>
	 */
	public static McObfPair func_194229_a = McMappingDatabase.getSRG("ClientAdvancementManager.func_194229_a");

	/**
	 * <p>
	 * Name: setSelectedTab
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;Z)V]
	 * </p>
	 */
	public static McObfPair func_194230_a = McMappingDatabase.getSRG("ClientAdvancementManager.func_194230_a");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_192801_b = McMappingDatabase.getSRG("field_192801_b");

}

package zdoctor.zcoremod.map.minecraft.client.settings;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CreativeSettings {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhw";
		else
			return "net/minecraft/client/settings/CreativeSettings";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhw";
		else
			return "CreativeSettings";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhw;";
		else
			return "Lnet/minecraft/client/settings/CreativeSettings;";
	}

	/**
	 * <p>
	 * Name: minecraft
	 * </p>
	 */
	public static McObfPair field_192565_a = McMappingDatabase.getSRG("field_192565_a");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192564_b = McMappingDatabase.getSRG("CreativeSettings.func_192564_b");

	/**
	 * <p>
	 * Name: dataFile
	 * </p>
	 */
	public static McObfPair field_192567_c = McMappingDatabase.getSRG("field_192567_c");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192562_a = McMappingDatabase.getSRG("CreativeSettings.func_192562_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_192566_b = McMappingDatabase.getSRG("field_192566_b");

	/**
	 * <p>
	 * Name: getHotbarSnapshot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/settings/HotbarSnapshot;]
	 * </p>
	 */
	public static McObfPair func_192563_a = McMappingDatabase.getSRG("CreativeSettings.func_192563_a");

	/**
	 * <p>
	 * Name: hotbarSnapshots
	 * </p>
	 */
	public static McObfPair field_192568_d = McMappingDatabase.getSRG("field_192568_d");

}

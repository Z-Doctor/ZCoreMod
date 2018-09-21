package zdoctor.zcoremod.map.minecraft.server.dedicated;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PropertyManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nw";
		else
			return "net/minecraft/server/dedicated/PropertyManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nw";
		else
			return "PropertyManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnw;";
		else
			return "Lnet/minecraft/server/dedicated/PropertyManager;";
	}

	/**
	 * <p>
	 * Name: serverPropertiesFile
	 * </p>
	 */
	public static McObfPair field_73673_c = McMappingDatabase.getSRG("field_73673_c");

	/**
	 * <p>
	 * Name: generateNewProperties
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73666_a = McMappingDatabase.getSRG("PropertyManager.func_73666_a");

	/**
	 * <p>
	 * Name: getPropertiesFile
	 * </p>
	 * <p>
	 * Desc: [()Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_73665_c = McMappingDatabase.getSRG("PropertyManager.func_73665_c");

	/**
	 * <p>
	 * Name: saveProperties
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73668_b = McMappingDatabase.getSRG("PropertyManager.func_73668_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_164440_a = McMappingDatabase.getSRG("field_164440_a");

	/**
	 * <p>
	 * Name: hasProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_187239_a = McMappingDatabase.getSRG("PropertyManager.func_187239_a");

	/**
	 * <p>
	 * Name: getBooleanProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Z)Z]
	 * </p>
	 */
	public static McObfPair func_73670_a = McMappingDatabase.getSRG("PropertyManager.func_73670_a");

	/**
	 * <p>
	 * Name: removeProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_187238_b = McMappingDatabase.getSRG("PropertyManager.func_187238_b");

	/**
	 * <p>
	 * Name: getIntProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)I]
	 * </p>
	 */
	public static McObfPair func_73669_a = McMappingDatabase.getSRG("PropertyManager.func_73669_a");

	/**
	 * <p>
	 * Name: setProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_73667_a = McMappingDatabase.getSRG("PropertyManager.func_73667_a");

	/**
	 * <p>
	 * Name: serverProperties
	 * </p>
	 */
	public static McObfPair field_73672_b = McMappingDatabase.getSRG("field_73672_b");

	/**
	 * <p>
	 * Name: getStringProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_73671_a = McMappingDatabase.getSRG("PropertyManager.func_73671_a");

	/**
	 * <p>
	 * Name: getLongProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;J)J]
	 * </p>
	 */
	public static McObfPair func_179885_a = McMappingDatabase.getSRG("PropertyManager.func_179885_a");

}

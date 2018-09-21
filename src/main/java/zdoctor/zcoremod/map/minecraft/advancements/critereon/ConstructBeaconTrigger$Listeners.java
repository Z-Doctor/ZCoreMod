package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ConstructBeaconTrigger$Listeners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "y$a";
		else
			return "net/minecraft/advancements/critereon/ConstructBeaconTrigger$Listeners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "y$a";
		else
			return "ConstructBeaconTrigger$Listeners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ly$a;";
		else
			return "Lnet/minecraft/advancements/critereon/ConstructBeaconTrigger$Listeners;";
	}

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192353_b = McMappingDatabase.getSRG("ConstructBeaconTrigger$Listeners.func_192353_b");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_192357_b = McMappingDatabase.getSRG("field_192357_b");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192355_a = McMappingDatabase.getSRG("ConstructBeaconTrigger$Listeners.func_192355_a");

	/**
	 * <p>
	 * Name: playerAdvancements
	 * </p>
	 */
	public static McObfPair field_192356_a = McMappingDatabase.getSRG("field_192356_a");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntityBeacon;)V]
	 * </p>
	 */
	public static McObfPair func_192352_a = McMappingDatabase.getSRG("ConstructBeaconTrigger$Listeners.func_192352_a");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192354_a = McMappingDatabase.getSRG("ConstructBeaconTrigger$Listeners.func_192354_a");

}

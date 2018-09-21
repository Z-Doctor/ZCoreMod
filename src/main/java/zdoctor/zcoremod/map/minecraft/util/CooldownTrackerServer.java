package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CooldownTrackerServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajk";
		else
			return "net/minecraft/util/CooldownTrackerServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajk";
		else
			return "CooldownTrackerServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lajk;";
		else
			return "Lnet/minecraft/util/CooldownTrackerServer;";
	}

	/**
	 * <p>
	 * Name: notifyOnSet
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;I)V]
	 * </p>
	 */
	public static McObfPair func_185140_b = McMappingDatabase.getSRG("CooldownTrackerServer.func_185140_b");

	/**
	 * <p>
	 * Name: notifyOnRemove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)V]
	 * </p>
	 */
	public static McObfPair func_185146_c = McMappingDatabase.getSRG("CooldownTrackerServer.func_185146_c");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_185149_a = McMappingDatabase.getSRG("field_185149_a");

}

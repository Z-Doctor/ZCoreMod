package zdoctor.zcoremod.map.minecraft.client.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LanServerDetector {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chg";
		else
			return "net/minecraft/client/network/LanServerDetector";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chg";
		else
			return "LanServerDetector";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchg;";
		else
			return "Lnet/minecraft/client/network/LanServerDetector;";
	}

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_148550_b = McMappingDatabase.getSRG("field_148550_b");

	/**
	 * <p>
	 * Name: ATOMIC_COUNTER
	 * </p>
	 */
	public static McObfPair field_148551_a = McMappingDatabase.getSRG("field_148551_a");

}

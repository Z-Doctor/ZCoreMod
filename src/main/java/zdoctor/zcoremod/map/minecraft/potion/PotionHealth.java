package zdoctor.zcoremod.map.minecraft.potion;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PotionHealth {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uy";
		else
			return "net/minecraft/potion/PotionHealth";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uy";
		else
			return "PotionHealth";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Luy;";
		else
			return "Lnet/minecraft/potion/PotionHealth;";
	}

	/**
	 * <p>
	 * Name: isInstant
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76403_b = McMappingDatabase.getSRG("PotionHealth.func_76403_b");

	/**
	 * <p>
	 * Name: isReady
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_76397_a = McMappingDatabase.getSRG("PotionHealth.func_76397_a");

}

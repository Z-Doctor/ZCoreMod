package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CombatRules {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "up";
		else
			return "net/minecraft/util/CombatRules";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "up";
		else
			return "CombatRules";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lup;";
		else
			return "Lnet/minecraft/util/CombatRules;";
	}

	/**
	 * <p>
	 * Name: getDamageAfterMagicAbsorb
	 * </p>
	 * <p>
	 * Desc: [(FF)F]
	 * </p>
	 */
	public static McObfPair func_188401_b = McMappingDatabase.getSRG("CombatRules.func_188401_b");

	/**
	 * <p>
	 * Name: getDamageAfterAbsorb
	 * </p>
	 * <p>
	 * Desc: [(FFF)F]
	 * </p>
	 */
	public static McObfPair func_189427_a = McMappingDatabase.getSRG("CombatRules.func_189427_a");

}

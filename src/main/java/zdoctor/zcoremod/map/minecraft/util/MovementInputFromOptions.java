package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MovementInputFromOptions {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buc";
		else
			return "net/minecraft/util/MovementInputFromOptions";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buc";
		else
			return "MovementInputFromOptions";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbuc;";
		else
			return "Lnet/minecraft/util/MovementInputFromOptions;";
	}

	/**
	 * <p>
	 * Name: updatePlayerMoveState
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78898_a = McMappingDatabase.getSRG("MovementInputFromOptions.func_78898_a");

	/**
	 * <p>
	 * Name: gameSettings
	 * </p>
	 */
	public static McObfPair field_78903_e = McMappingDatabase.getSRG("field_78903_e");

}

package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MovementInput {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bub";
		else
			return "net/minecraft/util/MovementInput";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bub";
		else
			return "MovementInput";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbub;";
		else
			return "Lnet/minecraft/util/MovementInput;";
	}

	/**
	 * <p>
	 * Name: backKeyDown
	 * </p>
	 */
	public static McObfPair field_187256_d = McMappingDatabase.getSRG("field_187256_d");

	/**
	 * <p>
	 * Name: getMoveVector
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec2f;]
	 * </p>
	 */
	public static McObfPair func_190020_b = McMappingDatabase.getSRG("MovementInput.func_190020_b");

	/**
	 * <p>
	 * Name: jump
	 * </p>
	 */
	public static McObfPair field_78901_c = McMappingDatabase.getSRG("field_78901_c");

	/**
	 * <p>
	 * Name: forwardKeyDown
	 * </p>
	 */
	public static McObfPair field_187255_c = McMappingDatabase.getSRG("field_187255_c");

	/**
	 * <p>
	 * Name: moveStrafe
	 * </p>
	 */
	public static McObfPair field_78902_a = McMappingDatabase.getSRG("field_78902_a");

	/**
	 * <p>
	 * Name: moveForward
	 * </p>
	 */
	public static McObfPair field_192832_b = McMappingDatabase.getSRG("field_192832_b");

	/**
	 * <p>
	 * Name: updatePlayerMoveState
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78898_a = McMappingDatabase.getSRG("MovementInput.func_78898_a");

	/**
	 * <p>
	 * Name: sneak
	 * </p>
	 */
	public static McObfPair field_78899_d = McMappingDatabase.getSRG("field_78899_d");

	/**
	 * <p>
	 * Name: rightKeyDown
	 * </p>
	 */
	public static McObfPair field_187258_f = McMappingDatabase.getSRG("field_187258_f");

	/**
	 * <p>
	 * Name: leftKeyDown
	 * </p>
	 */
	public static McObfPair field_187257_e = McMappingDatabase.getSRG("field_187257_e");

}

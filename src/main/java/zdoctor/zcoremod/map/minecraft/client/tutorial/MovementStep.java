package zdoctor.zcoremod.map.minecraft.client.tutorial;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MovementStep {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chw";
		else
			return "net/minecraft/client/tutorial/MovementStep";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chw";
		else
			return "MovementStep";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchw;";
		else
			return "Lnet/minecraft/client/tutorial/MovementStep;";
	}

	/**
	 * <p>
	 * Name: MOVE_DESCRIPTION
	 * </p>
	 */
	public static McObfPair field_193255_b = McMappingDatabase.getSRG("field_193255_b");

	/**
	 * <p>
	 * Name: timeMoved
	 * </p>
	 */
	public static McObfPair field_193262_i = McMappingDatabase.getSRG("field_193262_i");

	/**
	 * <p>
	 * Name: lookToast
	 * </p>
	 */
	public static McObfPair field_193260_g = McMappingDatabase.getSRG("field_193260_g");

	/**
	 * <p>
	 * Name: handleMovement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/MovementInput;)V]
	 * </p>
	 */
	public static McObfPair func_193247_a = McMappingDatabase.getSRG("MovementStep.func_193247_a");

	/**
	 * <p>
	 * Name: LOOK_TITLE
	 * </p>
	 */
	public static McObfPair field_193256_c = McMappingDatabase.getSRG("field_193256_c");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193245_a = McMappingDatabase.getSRG("MovementStep.func_193245_a");

	/**
	 * <p>
	 * Name: timeLooked
	 * </p>
	 */
	public static McObfPair field_193263_j = McMappingDatabase.getSRG("field_193263_j");

	/**
	 * <p>
	 * Name: timeWaiting
	 * </p>
	 */
	public static McObfPair field_193261_h = McMappingDatabase.getSRG("field_193261_h");

	/**
	 * <p>
	 * Name: tutorial
	 * </p>
	 */
	public static McObfPair field_193258_e = McMappingDatabase.getSRG("field_193258_e");

	/**
	 * <p>
	 * Name: onStop
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193248_b = McMappingDatabase.getSRG("MovementStep.func_193248_b");

	/**
	 * <p>
	 * Name: LOOK_DESCRIPTION
	 * </p>
	 */
	public static McObfPair field_193257_d = McMappingDatabase.getSRG("field_193257_d");

	/**
	 * <p>
	 * Name: turned
	 * </p>
	 */
	public static McObfPair field_193265_l = McMappingDatabase.getSRG("field_193265_l");

	/**
	 * <p>
	 * Name: moveCompleted
	 * </p>
	 */
	public static McObfPair field_193266_m = McMappingDatabase.getSRG("field_193266_m");

	/**
	 * <p>
	 * Name: handleMouse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/MouseHelper;)V]
	 * </p>
	 */
	public static McObfPair func_193249_a = McMappingDatabase.getSRG("MovementStep.func_193249_a");

	/**
	 * <p>
	 * Name: moved
	 * </p>
	 */
	public static McObfPair field_193264_k = McMappingDatabase.getSRG("field_193264_k");

	/**
	 * <p>
	 * Name: moveToast
	 * </p>
	 */
	public static McObfPair field_193259_f = McMappingDatabase.getSRG("field_193259_f");

	/**
	 * <p>
	 * Name: lookCompleted
	 * </p>
	 */
	public static McObfPair field_193267_n = McMappingDatabase.getSRG("field_193267_n");

	/**
	 * <p>
	 * Name: MOVE_TITLE
	 * </p>
	 */
	public static McObfPair field_193254_a = McMappingDatabase.getSRG("field_193254_a");

}

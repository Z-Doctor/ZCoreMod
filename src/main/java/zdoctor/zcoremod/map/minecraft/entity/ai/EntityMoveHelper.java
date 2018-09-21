package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityMoveHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wq";
		else
			return "net/minecraft/entity/ai/EntityMoveHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wq";
		else
			return "EntityMoveHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwq;";
		else
			return "Lnet/minecraft/entity/ai/EntityMoveHelper;";
	}

	/**
	 * <p>
	 * Name: speed
	 * </p>
	 */
	public static McObfPair field_75645_e = McMappingDatabase.getSRG("field_75645_e");

	/**
	 * <p>
	 * Name: moveForward
	 * </p>
	 */
	public static McObfPair field_188489_f = McMappingDatabase.getSRG("field_188489_f");

	/**
	 * <p>
	 * Name: limitAngle
	 * </p>
	 * <p>
	 * Desc: [(FFF)F]
	 * </p>
	 */
	public static McObfPair func_75639_a = McMappingDatabase.getSRG("EntityMoveHelper.func_75639_a");

	/**
	 * <p>
	 * Name: posZ
	 * </p>
	 */
	public static McObfPair field_75644_d = McMappingDatabase.getSRG("field_75644_d");

	/**
	 * <p>
	 * Name: action
	 * </p>
	 */
	public static McObfPair field_188491_h = McMappingDatabase.getSRG("field_188491_h");

	/**
	 * <p>
	 * Name: posY
	 * </p>
	 */
	public static McObfPair field_75647_c = McMappingDatabase.getSRG("field_75647_c");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/EntityMoveHelper;)V]
	 * </p>
	 */
	public static McObfPair func_188487_a = McMappingDatabase.getSRG("EntityMoveHelper.func_188487_a");

	/**
	 * <p>
	 * Name: isUpdating
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75640_a = McMappingDatabase.getSRG("EntityMoveHelper.func_75640_a");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_75648_a = McMappingDatabase.getSRG("field_75648_a");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_179918_f = McMappingDatabase.getSRG("EntityMoveHelper.func_179918_f");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_179917_d = McMappingDatabase.getSRG("EntityMoveHelper.func_179917_d");

	/**
	 * <p>
	 * Name: moveStrafe
	 * </p>
	 */
	public static McObfPair field_188490_g = McMappingDatabase.getSRG("field_188490_g");

	/**
	 * <p>
	 * Name: posX
	 * </p>
	 */
	public static McObfPair field_75646_b = McMappingDatabase.getSRG("field_75646_b");

	/**
	 * <p>
	 * Name: strafe
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_188488_a = McMappingDatabase.getSRG("EntityMoveHelper.func_188488_a");

	/**
	 * <p>
	 * Name: getSpeed
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_75638_b = McMappingDatabase.getSRG("EntityMoveHelper.func_75638_b");

	/**
	 * <p>
	 * Name: setMoveTo
	 * </p>
	 * <p>
	 * Desc: [(DDDD)V]
	 * </p>
	 */
	public static McObfPair func_75642_a = McMappingDatabase.getSRG("EntityMoveHelper.func_75642_a");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_179919_e = McMappingDatabase.getSRG("EntityMoveHelper.func_179919_e");

	/**
	 * <p>
	 * Name: onUpdateMoveHelper
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75641_c = McMappingDatabase.getSRG("EntityMoveHelper.func_75641_c");

}

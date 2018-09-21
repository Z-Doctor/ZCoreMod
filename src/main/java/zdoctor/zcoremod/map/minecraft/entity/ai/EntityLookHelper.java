package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityLookHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wp";
		else
			return "net/minecraft/entity/ai/EntityLookHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wp";
		else
			return "EntityLookHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwp;";
		else
			return "Lnet/minecraft/entity/ai/EntityLookHelper;";
	}

	/**
	 * <p>
	 * Name: isLooking
	 * </p>
	 */
	public static McObfPair field_75655_d = McMappingDatabase.getSRG("field_75655_d");

	/**
	 * <p>
	 * Name: deltaLookPitch
	 * </p>
	 */
	public static McObfPair field_75658_c = McMappingDatabase.getSRG("field_75658_c");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_75659_a = McMappingDatabase.getSRG("field_75659_a");

	/**
	 * <p>
	 * Name: posX
	 * </p>
	 */
	public static McObfPair field_75656_e = McMappingDatabase.getSRG("field_75656_e");

	/**
	 * <p>
	 * Name: setLookPosition
	 * </p>
	 * <p>
	 * Desc: [(DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_75650_a = McMappingDatabase.getSRG("EntityLookHelper.func_75650_a");

	/**
	 * <p>
	 * Name: getIsLooking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_180424_b = McMappingDatabase.getSRG("EntityLookHelper.func_180424_b");

	/**
	 * <p>
	 * Name: setLookPositionWithEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FF)V]
	 * </p>
	 */
	public static McObfPair func_75651_a = McMappingDatabase.getSRG("EntityLookHelper.func_75651_a");

	/**
	 * <p>
	 * Name: getLookPosY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_180422_f = McMappingDatabase.getSRG("EntityLookHelper.func_180422_f");

	/**
	 * <p>
	 * Name: posZ
	 * </p>
	 */
	public static McObfPair field_75654_g = McMappingDatabase.getSRG("field_75654_g");

	/**
	 * <p>
	 * Name: onUpdateLook
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75649_a = McMappingDatabase.getSRG("EntityLookHelper.func_75649_a");

	/**
	 * <p>
	 * Name: updateRotation
	 * </p>
	 * <p>
	 * Desc: [(FFF)F]
	 * </p>
	 */
	public static McObfPair func_75652_a = McMappingDatabase.getSRG("EntityLookHelper.func_75652_a");

	/**
	 * <p>
	 * Name: posY
	 * </p>
	 */
	public static McObfPair field_75653_f = McMappingDatabase.getSRG("field_75653_f");

	/**
	 * <p>
	 * Name: getLookPosZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_180421_g = McMappingDatabase.getSRG("EntityLookHelper.func_180421_g");

	/**
	 * <p>
	 * Name: deltaLookYaw
	 * </p>
	 */
	public static McObfPair field_75657_b = McMappingDatabase.getSRG("field_75657_b");

	/**
	 * <p>
	 * Name: getLookPosX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_180423_e = McMappingDatabase.getSRG("EntityLookHelper.func_180423_e");

}

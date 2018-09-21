package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelIronGolem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brf";
		else
			return "net/minecraft/client/model/ModelIronGolem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brf";
		else
			return "ModelIronGolem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrf;";
		else
			return "Lnet/minecraft/client/model/ModelIronGolem;";
	}

	/**
	 * <p>
	 * Name: ironGolemLeftArm
	 * </p>
	 */
	public static McObfPair field_78174_d = McMappingDatabase.getSRG("field_78174_d");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelIronGolem.func_78088_a");

	/**
	 * <p>
	 * Name: ironGolemRightArm
	 * </p>
	 */
	public static McObfPair field_78177_c = McMappingDatabase.getSRG("field_78177_c");

	/**
	 * <p>
	 * Name: triangleWave
	 * </p>
	 * <p>
	 * Desc: [(FF)F]
	 * </p>
	 */
	public static McObfPair func_78172_a = McMappingDatabase.getSRG("ModelIronGolem.func_78172_a");

	/**
	 * <p>
	 * Name: ironGolemRightLeg
	 * </p>
	 */
	public static McObfPair field_78173_f = McMappingDatabase.getSRG("field_78173_f");

	/**
	 * <p>
	 * Name: setLivingAnimations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_78086_a = McMappingDatabase.getSRG("ModelIronGolem.func_78086_a");

	/**
	 * <p>
	 * Name: ironGolemLeftLeg
	 * </p>
	 */
	public static McObfPair field_78175_e = McMappingDatabase.getSRG("field_78175_e");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelIronGolem.func_78087_a");

	/**
	 * <p>
	 * Name: ironGolemBody
	 * </p>
	 */
	public static McObfPair field_78176_b = McMappingDatabase.getSRG("field_78176_b");

	/**
	 * <p>
	 * Name: ironGolemHead
	 * </p>
	 */
	public static McObfPair field_78178_a = McMappingDatabase.getSRG("field_78178_a");

}

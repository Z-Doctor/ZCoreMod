package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelOcelot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqg";
		else
			return "net/minecraft/client/model/ModelOcelot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqg";
		else
			return "ModelOcelot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqg;";
		else
			return "Lnet/minecraft/client/model/ModelOcelot;";
	}

	/**
	 * <p>
	 * Name: setLivingAnimations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_78086_a = McMappingDatabase.getSRG("ModelOcelot.func_78086_a");

	/**
	 * <p>
	 * Name: ocelotFrontLeftLeg
	 * </p>
	 */
	public static McObfPair field_78160_c = McMappingDatabase.getSRG("field_78160_c");

	/**
	 * <p>
	 * Name: ocelotBody
	 * </p>
	 */
	public static McObfPair field_78162_h = McMappingDatabase.getSRG("field_78162_h");

	/**
	 * <p>
	 * Name: ocelotFrontRightLeg
	 * </p>
	 */
	public static McObfPair field_78157_d = McMappingDatabase.getSRG("field_78157_d");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelOcelot.func_78087_a");

	/**
	 * <p>
	 * Name: state
	 * </p>
	 */
	public static McObfPair field_78163_i = McMappingDatabase.getSRG("field_78163_i");

	/**
	 * <p>
	 * Name: ocelotBackLeftLeg
	 * </p>
	 */
	public static McObfPair field_78161_a = McMappingDatabase.getSRG("field_78161_a");

	/**
	 * <p>
	 * Name: ocelotTail
	 * </p>
	 */
	public static McObfPair field_78158_e = McMappingDatabase.getSRG("field_78158_e");

	/**
	 * <p>
	 * Name: ocelotBackRightLeg
	 * </p>
	 */
	public static McObfPair field_78159_b = McMappingDatabase.getSRG("field_78159_b");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelOcelot.func_78088_a");

	/**
	 * <p>
	 * Name: ocelotHead
	 * </p>
	 */
	public static McObfPair field_78156_g = McMappingDatabase.getSRG("field_78156_g");

	/**
	 * <p>
	 * Name: ocelotTail2
	 * </p>
	 */
	public static McObfPair field_78155_f = McMappingDatabase.getSRG("field_78155_f");

}

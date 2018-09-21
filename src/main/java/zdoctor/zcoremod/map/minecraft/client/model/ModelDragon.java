package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelDragon {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brn";
		else
			return "net/minecraft/client/model/ModelDragon";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brn";
		else
			return "ModelDragon";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrn;";
		else
			return "Lnet/minecraft/client/model/ModelDragon;";
	}

	/**
	 * <p>
	 * Name: rearFoot
	 * </p>
	 */
	public static McObfPair field_78227_i = McMappingDatabase.getSRG("field_78227_i");

	/**
	 * <p>
	 * Name: wingTip
	 * </p>
	 */
	public static McObfPair field_78222_l = McMappingDatabase.getSRG("field_78222_l");

	/**
	 * <p>
	 * Name: frontLeg
	 * </p>
	 */
	public static McObfPair field_78215_f = McMappingDatabase.getSRG("field_78215_f");

	/**
	 * <p>
	 * Name: setLivingAnimations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_78086_a = McMappingDatabase.getSRG("ModelDragon.func_78086_a");

	/**
	 * <p>
	 * Name: jaw
	 * </p>
	 */
	public static McObfPair field_78220_c = McMappingDatabase.getSRG("field_78220_c");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelDragon.func_78088_a");

	/**
	 * <p>
	 * Name: rearLeg
	 * </p>
	 */
	public static McObfPair field_78218_e = McMappingDatabase.getSRG("field_78218_e");

	/**
	 * <p>
	 * Name: frontLegTip
	 * </p>
	 */
	public static McObfPair field_78226_h = McMappingDatabase.getSRG("field_78226_h");

	/**
	 * <p>
	 * Name: spine
	 * </p>
	 */
	public static McObfPair field_78219_b = McMappingDatabase.getSRG("field_78219_b");

	/**
	 * <p>
	 * Name: rearLegTip
	 * </p>
	 */
	public static McObfPair field_78216_g = McMappingDatabase.getSRG("field_78216_g");

	/**
	 * <p>
	 * Name: frontFoot
	 * </p>
	 */
	public static McObfPair field_78224_j = McMappingDatabase.getSRG("field_78224_j");

	/**
	 * <p>
	 * Name: updateRotations
	 * </p>
	 * <p>
	 * Desc: [(D)F]
	 * </p>
	 */
	public static McObfPair func_78214_a = McMappingDatabase.getSRG("ModelDragon.func_78214_a");

	/**
	 * <p>
	 * Name: head
	 * </p>
	 */
	public static McObfPair field_78221_a = McMappingDatabase.getSRG("field_78221_a");

	/**
	 * <p>
	 * Name: wing
	 * </p>
	 */
	public static McObfPair field_78225_k = McMappingDatabase.getSRG("field_78225_k");

	/**
	 * <p>
	 * Name: partialTicks
	 * </p>
	 */
	public static McObfPair field_78223_m = McMappingDatabase.getSRG("field_78223_m");

	/**
	 * <p>
	 * Name: body
	 * </p>
	 */
	public static McObfPair field_78217_d = McMappingDatabase.getSRG("field_78217_d");

}

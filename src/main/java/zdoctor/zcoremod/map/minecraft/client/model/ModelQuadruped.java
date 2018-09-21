package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelQuadruped {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqm";
		else
			return "net/minecraft/client/model/ModelQuadruped";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqm";
		else
			return "ModelQuadruped";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqm;";
		else
			return "Lnet/minecraft/client/model/ModelQuadruped;";
	}

	/**
	 * <p>
	 * Name: leg2
	 * </p>
	 */
	public static McObfPair field_78146_d = McMappingDatabase.getSRG("field_78146_d");

	/**
	 * <p>
	 * Name: childYOffset
	 * </p>
	 */
	public static McObfPair field_78145_g = McMappingDatabase.getSRG("field_78145_g");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelQuadruped.func_78088_a");

	/**
	 * <p>
	 * Name: head
	 * </p>
	 */
	public static McObfPair field_78150_a = McMappingDatabase.getSRG("field_78150_a");

	/**
	 * <p>
	 * Name: leg1
	 * </p>
	 */
	public static McObfPair field_78149_c = McMappingDatabase.getSRG("field_78149_c");

	/**
	 * <p>
	 * Name: leg4
	 * </p>
	 */
	public static McObfPair field_78144_f = McMappingDatabase.getSRG("field_78144_f");

	/**
	 * <p>
	 * Name: childZOffset
	 * </p>
	 */
	public static McObfPair field_78151_h = McMappingDatabase.getSRG("field_78151_h");

	/**
	 * <p>
	 * Name: leg3
	 * </p>
	 */
	public static McObfPair field_78147_e = McMappingDatabase.getSRG("field_78147_e");

	/**
	 * <p>
	 * Name: body
	 * </p>
	 */
	public static McObfPair field_78148_b = McMappingDatabase.getSRG("field_78148_b");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelQuadruped.func_78087_a");

}

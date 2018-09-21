package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelIllager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpy";
		else
			return "net/minecraft/client/model/ModelIllager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpy";
		else
			return "ModelIllager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpy;";
		else
			return "Lnet/minecraft/client/model/ModelIllager;";
	}

	/**
	 * <p>
	 * Name: leftArm
	 * </p>
	 */
	public static McObfPair field_191224_h = McMappingDatabase.getSRG("field_191224_h");

	/**
	 * <p>
	 * Name: getArm
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumHandSide;)Lnet/minecraft/client/model/ModelRenderer;]
	 * </p>
	 */
	public static McObfPair func_191216_a = McMappingDatabase.getSRG("ModelIllager.func_191216_a");

	/**
	 * <p>
	 * Name: body
	 * </p>
	 */
	public static McObfPair field_191218_b = McMappingDatabase.getSRG("field_191218_b");

	/**
	 * <p>
	 * Name: hat
	 * </p>
	 */
	public static McObfPair field_193775_b = McMappingDatabase.getSRG("field_193775_b");

	/**
	 * <p>
	 * Name: leg1
	 * </p>
	 */
	public static McObfPair field_191221_e = McMappingDatabase.getSRG("field_191221_e");

	/**
	 * <p>
	 * Name: leg0
	 * </p>
	 */
	public static McObfPair field_191220_d = McMappingDatabase.getSRG("field_191220_d");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelIllager.func_78088_a");

	/**
	 * <p>
	 * Name: rightArm
	 * </p>
	 */
	public static McObfPair field_191223_g = McMappingDatabase.getSRG("field_191223_g");

	/**
	 * <p>
	 * Name: head
	 * </p>
	 */
	public static McObfPair field_191217_a = McMappingDatabase.getSRG("field_191217_a");

	/**
	 * <p>
	 * Name: nose
	 * </p>
	 */
	public static McObfPair field_191222_f = McMappingDatabase.getSRG("field_191222_f");

	/**
	 * <p>
	 * Name: arms
	 * </p>
	 */
	public static McObfPair field_191219_c = McMappingDatabase.getSRG("field_191219_c");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelIllager.func_78087_a");

}

package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelSnowMan {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqz";
		else
			return "net/minecraft/client/model/ModelSnowMan";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqz";
		else
			return "ModelSnowMan";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqz;";
		else
			return "Lnet/minecraft/client/model/ModelSnowMan;";
	}

	/**
	 * <p>
	 * Name: head
	 * </p>
	 */
	public static McObfPair field_78195_c = McMappingDatabase.getSRG("field_78195_c");

	/**
	 * <p>
	 * Name: rightHand
	 * </p>
	 */
	public static McObfPair field_78192_d = McMappingDatabase.getSRG("field_78192_d");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelSnowMan.func_78088_a");

	/**
	 * <p>
	 * Name: bottomBody
	 * </p>
	 */
	public static McObfPair field_78194_b = McMappingDatabase.getSRG("field_78194_b");

	/**
	 * <p>
	 * Name: leftHand
	 * </p>
	 */
	public static McObfPair field_78193_e = McMappingDatabase.getSRG("field_78193_e");

	/**
	 * <p>
	 * Name: body
	 * </p>
	 */
	public static McObfPair field_78196_a = McMappingDatabase.getSRG("field_78196_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelSnowMan.func_78087_a");

}

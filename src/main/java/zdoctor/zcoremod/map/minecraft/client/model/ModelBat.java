package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpg";
		else
			return "net/minecraft/client/model/ModelBat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpg";
		else
			return "ModelBat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpg;";
		else
			return "Lnet/minecraft/client/model/ModelBat;";
	}

	/**
	 * <p>
	 * Name: batRightWing
	 * </p>
	 */
	public static McObfPair field_82894_c = McMappingDatabase.getSRG("field_82894_c");

	/**
	 * <p>
	 * Name: batHead
	 * </p>
	 */
	public static McObfPair field_82895_a = McMappingDatabase.getSRG("field_82895_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelBat.func_78087_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelBat.func_78088_a");

	/**
	 * <p>
	 * Name: batBody
	 * </p>
	 */
	public static McObfPair field_82893_b = McMappingDatabase.getSRG("field_82893_b");

	/**
	 * <p>
	 * Name: batOuterLeftWing
	 * </p>
	 */
	public static McObfPair field_82890_f = McMappingDatabase.getSRG("field_82890_f");

	/**
	 * <p>
	 * Name: batLeftWing
	 * </p>
	 */
	public static McObfPair field_82891_d = McMappingDatabase.getSRG("field_82891_d");

	/**
	 * <p>
	 * Name: batOuterRightWing
	 * </p>
	 */
	public static McObfPair field_82892_e = McMappingDatabase.getSRG("field_82892_e");

}

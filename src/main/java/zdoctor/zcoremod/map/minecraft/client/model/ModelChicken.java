package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelChicken {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpm";
		else
			return "net/minecraft/client/model/ModelChicken";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpm";
		else
			return "ModelChicken";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpm;";
		else
			return "Lnet/minecraft/client/model/ModelChicken;";
	}

	/**
	 * <p>
	 * Name: leftWing
	 * </p>
	 */
	public static McObfPair field_78136_f = McMappingDatabase.getSRG("field_78136_f");

	/**
	 * <p>
	 * Name: bill
	 * </p>
	 */
	public static McObfPair field_78137_g = McMappingDatabase.getSRG("field_78137_g");

	/**
	 * <p>
	 * Name: head
	 * </p>
	 */
	public static McObfPair field_78142_a = McMappingDatabase.getSRG("field_78142_a");

	/**
	 * <p>
	 * Name: chin
	 * </p>
	 */
	public static McObfPair field_78143_h = McMappingDatabase.getSRG("field_78143_h");

	/**
	 * <p>
	 * Name: rightLeg
	 * </p>
	 */
	public static McObfPair field_78141_c = McMappingDatabase.getSRG("field_78141_c");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelChicken.func_78087_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelChicken.func_78088_a");

	/**
	 * <p>
	 * Name: leftLeg
	 * </p>
	 */
	public static McObfPair field_78138_d = McMappingDatabase.getSRG("field_78138_d");

	/**
	 * <p>
	 * Name: body
	 * </p>
	 */
	public static McObfPair field_78140_b = McMappingDatabase.getSRG("field_78140_b");

	/**
	 * <p>
	 * Name: rightWing
	 * </p>
	 */
	public static McObfPair field_78139_e = McMappingDatabase.getSRG("field_78139_e");

}

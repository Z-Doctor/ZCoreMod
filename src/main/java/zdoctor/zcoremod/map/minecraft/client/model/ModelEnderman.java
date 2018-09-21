package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelEnderman {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpq";
		else
			return "net/minecraft/client/model/ModelEnderman";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpq";
		else
			return "ModelEnderman";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpq;";
		else
			return "Lnet/minecraft/client/model/ModelEnderman;";
	}

	/**
	 * <p>
	 * Name: isCarrying
	 * </p>
	 */
	public static McObfPair field_78126_a = McMappingDatabase.getSRG("field_78126_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelEnderman.func_78087_a");

	/**
	 * <p>
	 * Name: isAttacking
	 * </p>
	 */
	public static McObfPair field_78125_b = McMappingDatabase.getSRG("field_78125_b");

}

package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelShield {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqq";
		else
			return "net/minecraft/client/model/ModelShield";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqq";
		else
			return "ModelShield";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqq;";
		else
			return "Lnet/minecraft/client/model/ModelShield;";
	}

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187062_a = McMappingDatabase.getSRG("ModelShield.func_187062_a");

	/**
	 * <p>
	 * Name: handle
	 * </p>
	 */
	public static McObfPair field_187064_b = McMappingDatabase.getSRG("field_187064_b");

	/**
	 * <p>
	 * Name: plate
	 * </p>
	 */
	public static McObfPair field_187063_a = McMappingDatabase.getSRG("field_187063_a");

}

package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelEvokerFangs {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bps";
		else
			return "net/minecraft/client/model/ModelEvokerFangs";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bps";
		else
			return "ModelEvokerFangs";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbps;";
		else
			return "Lnet/minecraft/client/model/ModelEvokerFangs;";
	}

	/**
	 * <p>
	 * Name: upperJaw
	 * </p>
	 */
	public static McObfPair field_191214_b = McMappingDatabase.getSRG("field_191214_b");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelEvokerFangs.func_78088_a");

	/**
	 * <p>
	 * Name: lowerJaw
	 * </p>
	 */
	public static McObfPair field_191215_c = McMappingDatabase.getSRG("field_191215_c");

	/**
	 * <p>
	 * Name: base
	 * </p>
	 */
	public static McObfPair field_191213_a = McMappingDatabase.getSRG("field_191213_a");

}

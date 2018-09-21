package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelLlama {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqc";
		else
			return "net/minecraft/client/model/ModelLlama";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqc";
		else
			return "ModelLlama";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqc;";
		else
			return "Lnet/minecraft/client/model/ModelLlama;";
	}

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelLlama.func_78088_a");

	/**
	 * <p>
	 * Name: chest1
	 * </p>
	 */
	public static McObfPair field_191226_i = McMappingDatabase.getSRG("field_191226_i");

	/**
	 * <p>
	 * Name: chest2
	 * </p>
	 */
	public static McObfPair field_191227_j = McMappingDatabase.getSRG("field_191227_j");

}

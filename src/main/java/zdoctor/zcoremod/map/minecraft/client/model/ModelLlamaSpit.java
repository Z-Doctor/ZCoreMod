package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelLlamaSpit {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqd";
		else
			return "net/minecraft/client/model/ModelLlamaSpit";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqd";
		else
			return "ModelLlamaSpit";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqd;";
		else
			return "Lnet/minecraft/client/model/ModelLlamaSpit;";
	}

	/**
	 * <p>
	 * Name: main
	 * </p>
	 */
	public static McObfPair field_191225_a = McMappingDatabase.getSRG("field_191225_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelLlamaSpit.func_78088_a");

}

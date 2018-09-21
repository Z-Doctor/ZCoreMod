package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelDragonHead {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brm";
		else
			return "net/minecraft/client/model/ModelDragonHead";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brm";
		else
			return "ModelDragonHead";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrm;";
		else
			return "Lnet/minecraft/client/model/ModelDragonHead;";
	}

	/**
	 * <p>
	 * Name: jaw
	 * </p>
	 */
	public static McObfPair field_187071_b = McMappingDatabase.getSRG("field_187071_b");

	/**
	 * <p>
	 * Name: head
	 * </p>
	 */
	public static McObfPair field_187070_a = McMappingDatabase.getSRG("field_187070_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelDragonHead.func_78088_a");

}

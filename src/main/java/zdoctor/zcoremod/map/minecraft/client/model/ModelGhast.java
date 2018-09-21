package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelGhast {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpt";
		else
			return "net/minecraft/client/model/ModelGhast";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpt";
		else
			return "ModelGhast";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpt;";
		else
			return "Lnet/minecraft/client/model/ModelGhast;";
	}

	/**
	 * <p>
	 * Name: body
	 * </p>
	 */
	public static McObfPair field_78128_a = McMappingDatabase.getSRG("field_78128_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelGhast.func_78087_a");

	/**
	 * <p>
	 * Name: tentacles
	 * </p>
	 */
	public static McObfPair field_78127_b = McMappingDatabase.getSRG("field_78127_b");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelGhast.func_78088_a");

}

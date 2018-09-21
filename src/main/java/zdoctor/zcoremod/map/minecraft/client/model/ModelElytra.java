package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelElytra {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpp";
		else
			return "net/minecraft/client/model/ModelElytra";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpp";
		else
			return "ModelElytra";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpp;";
		else
			return "Lnet/minecraft/client/model/ModelElytra;";
	}

	/**
	 * <p>
	 * Name: rightWing
	 * </p>
	 */
	public static McObfPair field_187060_a = McMappingDatabase.getSRG("field_187060_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelElytra.func_78087_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelElytra.func_78088_a");

	/**
	 * <p>
	 * Name: leftWing
	 * </p>
	 */
	public static McObfPair field_187061_b = McMappingDatabase.getSRG("field_187061_b");

}

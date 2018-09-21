package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelVex {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bre";
		else
			return "net/minecraft/client/model/ModelVex";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bre";
		else
			return "ModelVex";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbre;";
		else
			return "Lnet/minecraft/client/model/ModelVex;";
	}

	/**
	 * <p>
	 * Name: leftWing
	 * </p>
	 */
	public static McObfPair field_191229_a = McMappingDatabase.getSRG("field_191229_a");

	/**
	 * <p>
	 * Name: getModelVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_191228_a = McMappingDatabase.getSRG("ModelVex.func_191228_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelVex.func_78088_a");

	/**
	 * <p>
	 * Name: rightWing
	 * </p>
	 */
	public static McObfPair field_191230_b = McMappingDatabase.getSRG("field_191230_b");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelVex.func_78087_a");

}

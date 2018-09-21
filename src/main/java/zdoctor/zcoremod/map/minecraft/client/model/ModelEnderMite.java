package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelEnderMite {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpr";
		else
			return "net/minecraft/client/model/ModelEnderMite";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpr";
		else
			return "ModelEnderMite";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpr;";
		else
			return "Lnet/minecraft/client/model/ModelEnderMite;";
	}

	/**
	 * <p>
	 * Name: bodyParts
	 * </p>
	 */
	public static McObfPair field_178713_d = McMappingDatabase.getSRG("field_178713_d");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelEnderMite.func_78088_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelEnderMite.func_78087_a");

	/**
	 * <p>
	 * Name: BODY_COUNT
	 * </p>
	 */
	public static McObfPair field_178715_c = McMappingDatabase.getSRG("field_178715_c");

	/**
	 * <p>
	 * Name: BODY_TEXS
	 * </p>
	 */
	public static McObfPair field_178714_b = McMappingDatabase.getSRG("field_178714_b");

	/**
	 * <p>
	 * Name: BODY_SIZES
	 * </p>
	 */
	public static McObfPair field_178716_a = McMappingDatabase.getSRG("field_178716_a");

}

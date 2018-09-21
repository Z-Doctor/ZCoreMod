package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelPlayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqj";
		else
			return "net/minecraft/client/model/ModelPlayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqj";
		else
			return "ModelPlayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqj;";
		else
			return "Lnet/minecraft/client/model/ModelPlayer;";
	}

	/**
	 * <p>
	 * Name: bipedBodyWear
	 * </p>
	 */
	public static McObfPair field_178730_v = McMappingDatabase.getSRG("field_178730_v");

	/**
	 * <p>
	 * Name: renderDeadmau5Head
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_178727_b = McMappingDatabase.getSRG("ModelPlayer.func_178727_b");

	/**
	 * <p>
	 * Name: bipedLeftLegwear
	 * </p>
	 */
	public static McObfPair field_178733_c = McMappingDatabase.getSRG("field_178733_c");

	/**
	 * <p>
	 * Name: setVisible
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_178719_a = McMappingDatabase.getSRG("ModelPlayer.func_178719_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelPlayer.func_78088_a");

	/**
	 * <p>
	 * Name: bipedRightLegwear
	 * </p>
	 */
	public static McObfPair field_178731_d = McMappingDatabase.getSRG("field_178731_d");

	/**
	 * <p>
	 * Name: renderCape
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_178728_c = McMappingDatabase.getSRG("ModelPlayer.func_178728_c");

	/**
	 * <p>
	 * Name: bipedRightArmwear
	 * </p>
	 */
	public static McObfPair field_178732_b = McMappingDatabase.getSRG("field_178732_b");

	/**
	 * <p>
	 * Name: bipedCape
	 * </p>
	 */
	public static McObfPair field_178729_w = McMappingDatabase.getSRG("field_178729_w");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelPlayer.func_78087_a");

	/**
	 * <p>
	 * Name: postRenderArm
	 * </p>
	 * <p>
	 * Desc: [(FLnet/minecraft/util/EnumHandSide;)V]
	 * </p>
	 */
	public static McObfPair func_187073_a = McMappingDatabase.getSRG("ModelPlayer.func_187073_a");

	/**
	 * <p>
	 * Name: bipedLeftArmwear
	 * </p>
	 */
	public static McObfPair field_178734_a = McMappingDatabase.getSRG("field_178734_a");

	/**
	 * <p>
	 * Name: smallArms
	 * </p>
	 */
	public static McObfPair field_178735_y = McMappingDatabase.getSRG("field_178735_y");

	/**
	 * <p>
	 * Name: bipedDeadmau5Head
	 * </p>
	 */
	public static McObfPair field_178736_x = McMappingDatabase.getSRG("field_178736_x");

}

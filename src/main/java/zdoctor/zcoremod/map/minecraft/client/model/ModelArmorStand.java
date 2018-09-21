package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelArmorStand {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpe";
		else
			return "net/minecraft/client/model/ModelArmorStand";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpe";
		else
			return "ModelArmorStand";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpe;";
		else
			return "Lnet/minecraft/client/model/ModelArmorStand;";
	}

	/**
	 * <p>
	 * Name: postRenderArm
	 * </p>
	 * <p>
	 * Desc: [(FLnet/minecraft/util/EnumHandSide;)V]
	 * </p>
	 */
	public static McObfPair func_187073_a = McMappingDatabase.getSRG("ModelArmorStand.func_187073_a");

	/**
	 * <p>
	 * Name: standBase
	 * </p>
	 */
	public static McObfPair field_178737_d = McMappingDatabase.getSRG("field_178737_d");

	/**
	 * <p>
	 * Name: standRightSide
	 * </p>
	 */
	public static McObfPair field_178740_a = McMappingDatabase.getSRG("field_178740_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelArmorStand.func_78087_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelArmorStand.func_78088_a");

	/**
	 * <p>
	 * Name: standLeftSide
	 * </p>
	 */
	public static McObfPair field_178738_b = McMappingDatabase.getSRG("field_178738_b");

	/**
	 * <p>
	 * Name: standWaist
	 * </p>
	 */
	public static McObfPair field_178739_c = McMappingDatabase.getSRG("field_178739_c");

}

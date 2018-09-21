package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelSpider {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bra";
		else
			return "net/minecraft/client/model/ModelSpider";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bra";
		else
			return "ModelSpider";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbra;";
		else
			return "Lnet/minecraft/client/model/ModelSpider;";
	}

	/**
	 * <p>
	 * Name: spiderLeg7
	 * </p>
	 */
	public static McObfPair field_78210_j = McMappingDatabase.getSRG("field_78210_j");

	/**
	 * <p>
	 * Name: spiderLeg4
	 * </p>
	 */
	public static McObfPair field_78204_g = McMappingDatabase.getSRG("field_78204_g");

	/**
	 * <p>
	 * Name: spiderLeg1
	 * </p>
	 */
	public static McObfPair field_78205_d = McMappingDatabase.getSRG("field_78205_d");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelSpider.func_78088_a");

	/**
	 * <p>
	 * Name: spiderLeg8
	 * </p>
	 */
	public static McObfPair field_78211_k = McMappingDatabase.getSRG("field_78211_k");

	/**
	 * <p>
	 * Name: spiderLeg6
	 * </p>
	 */
	public static McObfPair field_78213_i = McMappingDatabase.getSRG("field_78213_i");

	/**
	 * <p>
	 * Name: spiderLeg5
	 * </p>
	 */
	public static McObfPair field_78212_h = McMappingDatabase.getSRG("field_78212_h");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelSpider.func_78087_a");

	/**
	 * <p>
	 * Name: spiderLeg3
	 * </p>
	 */
	public static McObfPair field_78203_f = McMappingDatabase.getSRG("field_78203_f");

	/**
	 * <p>
	 * Name: spiderHead
	 * </p>
	 */
	public static McObfPair field_78209_a = McMappingDatabase.getSRG("field_78209_a");

	/**
	 * <p>
	 * Name: spiderLeg2
	 * </p>
	 */
	public static McObfPair field_78206_e = McMappingDatabase.getSRG("field_78206_e");

	/**
	 * <p>
	 * Name: spiderNeck
	 * </p>
	 */
	public static McObfPair field_78207_b = McMappingDatabase.getSRG("field_78207_b");

	/**
	 * <p>
	 * Name: spiderBody
	 * </p>
	 */
	public static McObfPair field_78208_c = McMappingDatabase.getSRG("field_78208_c");

}

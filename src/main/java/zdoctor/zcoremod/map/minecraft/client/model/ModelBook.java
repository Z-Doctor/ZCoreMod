package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBook {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpk";
		else
			return "net/minecraft/client/model/ModelBook";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpk";
		else
			return "ModelBook";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpk;";
		else
			return "Lnet/minecraft/client/model/ModelBook;";
	}

	/**
	 * <p>
	 * Name: flippingPageLeft
	 * </p>
	 */
	public static McObfPair field_78096_f = McMappingDatabase.getSRG("field_78096_f");

	/**
	 * <p>
	 * Name: coverLeft
	 * </p>
	 */
	public static McObfPair field_78100_b = McMappingDatabase.getSRG("field_78100_b");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelBook.func_78087_a");

	/**
	 * <p>
	 * Name: bookSpine
	 * </p>
	 */
	public static McObfPair field_78097_g = McMappingDatabase.getSRG("field_78097_g");

	/**
	 * <p>
	 * Name: pagesRight
	 * </p>
	 */
	public static McObfPair field_78101_c = McMappingDatabase.getSRG("field_78101_c");

	/**
	 * <p>
	 * Name: coverRight
	 * </p>
	 */
	public static McObfPair field_78102_a = McMappingDatabase.getSRG("field_78102_a");

	/**
	 * <p>
	 * Name: pagesLeft
	 * </p>
	 */
	public static McObfPair field_78098_d = McMappingDatabase.getSRG("field_78098_d");

	/**
	 * <p>
	 * Name: flippingPageRight
	 * </p>
	 */
	public static McObfPair field_78099_e = McMappingDatabase.getSRG("field_78099_e");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelBook.func_78088_a");

}

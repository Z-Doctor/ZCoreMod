package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelSlime {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqy";
		else
			return "net/minecraft/client/model/ModelSlime";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqy";
		else
			return "ModelSlime";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqy;";
		else
			return "Lnet/minecraft/client/model/ModelSlime;";
	}

	/**
	 * <p>
	 * Name: slimeRightEye
	 * </p>
	 */
	public static McObfPair field_78198_b = McMappingDatabase.getSRG("field_78198_b");

	/**
	 * <p>
	 * Name: slimeMouth
	 * </p>
	 */
	public static McObfPair field_78197_d = McMappingDatabase.getSRG("field_78197_d");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelSlime.func_78088_a");

	/**
	 * <p>
	 * Name: slimeLeftEye
	 * </p>
	 */
	public static McObfPair field_78199_c = McMappingDatabase.getSRG("field_78199_c");

	/**
	 * <p>
	 * Name: slimeBodies
	 * </p>
	 */
	public static McObfPair field_78200_a = McMappingDatabase.getSRG("field_78200_a");

}

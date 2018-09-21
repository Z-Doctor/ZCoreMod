package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelMagmaCube {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqa";
		else
			return "net/minecraft/client/model/ModelMagmaCube";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqa";
		else
			return "ModelMagmaCube";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqa;";
		else
			return "Lnet/minecraft/client/model/ModelMagmaCube;";
	}

	/**
	 * <p>
	 * Name: core
	 * </p>
	 */
	public static McObfPair field_78108_b = McMappingDatabase.getSRG("field_78108_b");

	/**
	 * <p>
	 * Name: setLivingAnimations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_78086_a = McMappingDatabase.getSRG("ModelMagmaCube.func_78086_a");

	/**
	 * <p>
	 * Name: segments
	 * </p>
	 */
	public static McObfPair field_78109_a = McMappingDatabase.getSRG("field_78109_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelMagmaCube.func_78088_a");

}

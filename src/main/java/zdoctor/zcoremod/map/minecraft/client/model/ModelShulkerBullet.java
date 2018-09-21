package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelShulkerBullet {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqr";
		else
			return "net/minecraft/client/model/ModelShulkerBullet";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqr";
		else
			return "ModelShulkerBullet";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqr;";
		else
			return "Lnet/minecraft/client/model/ModelShulkerBullet;";
	}

	/**
	 * <p>
	 * Name: renderer
	 * </p>
	 */
	public static McObfPair field_187069_a = McMappingDatabase.getSRG("field_187069_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelShulkerBullet.func_78087_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelShulkerBullet.func_78088_a");

}

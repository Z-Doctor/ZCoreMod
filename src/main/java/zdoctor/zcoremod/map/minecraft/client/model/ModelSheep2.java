package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelSheep2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqp";
		else
			return "net/minecraft/client/model/ModelSheep2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqp";
		else
			return "ModelSheep2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqp;";
		else
			return "Lnet/minecraft/client/model/ModelSheep2;";
	}

	/**
	 * <p>
	 * Name: headRotationAngleX
	 * </p>
	 */
	public static McObfPair field_78153_i = McMappingDatabase.getSRG("field_78153_i");

	/**
	 * <p>
	 * Name: setLivingAnimations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_78086_a = McMappingDatabase.getSRG("ModelSheep2.func_78086_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelSheep2.func_78087_a");

}

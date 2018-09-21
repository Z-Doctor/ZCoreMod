package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelSkeleton {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqw";
		else
			return "net/minecraft/client/model/ModelSkeleton";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqw";
		else
			return "ModelSkeleton";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqw;";
		else
			return "Lnet/minecraft/client/model/ModelSkeleton;";
	}

	/**
	 * <p>
	 * Name: postRenderArm
	 * </p>
	 * <p>
	 * Desc: [(FLnet/minecraft/util/EnumHandSide;)V]
	 * </p>
	 */
	public static McObfPair func_187073_a = McMappingDatabase.getSRG("ModelSkeleton.func_187073_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelSkeleton.func_78087_a");

	/**
	 * <p>
	 * Name: setLivingAnimations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_78086_a = McMappingDatabase.getSRG("ModelSkeleton.func_78086_a");

}

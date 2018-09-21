package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ProjectileHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aeq";
		else
			return "net/minecraft/entity/projectile/ProjectileHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aeq";
		else
			return "ProjectileHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laeq;";
		else
			return "Lnet/minecraft/entity/projectile/ProjectileHelper;";
	}

	/**
	 * <p>
	 * Name: rotateTowardsMovement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;F)V]
	 * </p>
	 */
	public static McObfPair func_188803_a = McMappingDatabase.getSRG("ProjectileHelper.func_188803_a");

	/**
	 * <p>
	 * Name: forwardsRaycast
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;ZZLnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/RayTraceResult;]
	 * </p>
	 */
	public static McObfPair func_188802_a = McMappingDatabase.getSRG("ProjectileHelper.func_188802_a");

}

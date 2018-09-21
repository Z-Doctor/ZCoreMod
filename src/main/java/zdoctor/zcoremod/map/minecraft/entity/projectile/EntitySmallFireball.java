package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySmallFireball {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aes";
		else
			return "net/minecraft/entity/projectile/EntitySmallFireball";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aes";
		else
			return "EntitySmallFireball";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laes;";
		else
			return "Lnet/minecraft/entity/projectile/EntitySmallFireball;";
	}

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntitySmallFireball.func_70097_a");

	/**
	 * <p>
	 * Name: canBeCollidedWith
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70067_L = McMappingDatabase.getSRG("EntitySmallFireball.func_70067_L");

	/**
	 * <p>
	 * Name: registerFixesSmallFireball
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189745_a = McMappingDatabase.getSRG("EntitySmallFireball.func_189745_a");

	/**
	 * <p>
	 * Name: onImpact
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/RayTraceResult;)V]
	 * </p>
	 */
	public static McObfPair func_70227_a = McMappingDatabase.getSRG("EntitySmallFireball.func_70227_a");

}

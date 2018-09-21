package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityDragonFireball {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aei";
		else
			return "net/minecraft/entity/projectile/EntityDragonFireball";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aei";
		else
			return "EntityDragonFireball";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laei;";
		else
			return "Lnet/minecraft/entity/projectile/EntityDragonFireball;";
	}

	/**
	 * <p>
	 * Name: onImpact
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/RayTraceResult;)V]
	 * </p>
	 */
	public static McObfPair func_70227_a = McMappingDatabase.getSRG("EntityDragonFireball.func_70227_a");

	/**
	 * <p>
	 * Name: registerFixesDragonFireball
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189747_a = McMappingDatabase.getSRG("EntityDragonFireball.func_189747_a");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityDragonFireball.func_70097_a");

	/**
	 * <p>
	 * Name: getParticleType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumParticleTypes;]
	 * </p>
	 */
	public static McObfPair func_184563_j = McMappingDatabase.getSRG("EntityDragonFireball.func_184563_j");

	/**
	 * <p>
	 * Name: isFireballFiery
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184564_k = McMappingDatabase.getSRG("EntityDragonFireball.func_184564_k");

	/**
	 * <p>
	 * Name: canBeCollidedWith
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70067_L = McMappingDatabase.getSRG("EntityDragonFireball.func_70067_L");

}

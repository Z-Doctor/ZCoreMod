package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityWitherSkull {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afb";
		else
			return "net/minecraft/entity/projectile/EntityWitherSkull";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afb";
		else
			return "EntityWitherSkull";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafb;";
		else
			return "Lnet/minecraft/entity/projectile/EntityWitherSkull;";
	}

	/**
	 * <p>
	 * Name: INVULNERABLE
	 * </p>
	 */
	public static McObfPair field_184565_e = McMappingDatabase.getSRG("field_184565_e");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityWitherSkull.func_70088_a");

	/**
	 * <p>
	 * Name: registerFixesWitherSkull
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189746_a = McMappingDatabase.getSRG("EntityWitherSkull.func_189746_a");

	/**
	 * <p>
	 * Name: onImpact
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/RayTraceResult;)V]
	 * </p>
	 */
	public static McObfPair func_70227_a = McMappingDatabase.getSRG("EntityWitherSkull.func_70227_a");

	/**
	 * <p>
	 * Name: getExplosionResistance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/Explosion;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)F]
	 * </p>
	 */
	public static McObfPair func_180428_a = McMappingDatabase.getSRG("EntityWitherSkull.func_180428_a");

	/**
	 * <p>
	 * Name: getMotionFactor
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_82341_c = McMappingDatabase.getSRG("EntityWitherSkull.func_82341_c");

	/**
	 * <p>
	 * Name: isBurning
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70027_ad = McMappingDatabase.getSRG("EntityWitherSkull.func_70027_ad");

	/**
	 * <p>
	 * Name: isFireballFiery
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184564_k = McMappingDatabase.getSRG("EntityWitherSkull.func_184564_k");

	/**
	 * <p>
	 * Name: isInvulnerable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82342_d = McMappingDatabase.getSRG("EntityWitherSkull.func_82342_d");

	/**
	 * <p>
	 * Name: setInvulnerable
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_82343_e = McMappingDatabase.getSRG("EntityWitherSkull.func_82343_e");

	/**
	 * <p>
	 * Name: canBeCollidedWith
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70067_L = McMappingDatabase.getSRG("EntityWitherSkull.func_70067_L");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityWitherSkull.func_70097_a");

}

package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityFireball {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ael";
		else
			return "net/minecraft/entity/projectile/EntityFireball";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ael";
		else
			return "EntityFireball";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lael;";
		else
			return "Lnet/minecraft/entity/projectile/EntityFireball;";
	}

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityFireball.func_70014_b");

	/**
	 * <p>
	 * Name: getMotionFactor
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_82341_c = McMappingDatabase.getSRG("EntityFireball.func_82341_c");

	/**
	 * <p>
	 * Name: accelerationX
	 * </p>
	 */
	public static McObfPair field_70232_b = McMappingDatabase.getSRG("field_70232_b");

	/**
	 * <p>
	 * Name: isInRangeToRenderDist
	 * </p>
	 * <p>
	 * Desc: [(D)Z]
	 * </p>
	 */
	public static McObfPair func_70112_a = McMappingDatabase.getSRG("EntityFireball.func_70112_a");

	/**
	 * <p>
	 * Name: ticksAlive
	 * </p>
	 */
	public static McObfPair field_70236_j = McMappingDatabase.getSRG("field_70236_j");

	/**
	 * <p>
	 * Name: getParticleType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumParticleTypes;]
	 * </p>
	 */
	public static McObfPair func_184563_j = McMappingDatabase.getSRG("EntityFireball.func_184563_j");

	/**
	 * <p>
	 * Name: getBrightness
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70013_c = McMappingDatabase.getSRG("EntityFireball.func_70013_c");

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70070_b = McMappingDatabase.getSRG("EntityFireball.func_70070_b");

	/**
	 * <p>
	 * Name: ticksInAir
	 * </p>
	 */
	public static McObfPair field_70234_an = McMappingDatabase.getSRG("field_70234_an");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityFireball.func_70071_h_");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityFireball.func_70037_a");

	/**
	 * <p>
	 * Name: onImpact
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/RayTraceResult;)V]
	 * </p>
	 */
	public static McObfPair func_70227_a = McMappingDatabase.getSRG("EntityFireball.func_70227_a");

	/**
	 * <p>
	 * Name: accelerationZ
	 * </p>
	 */
	public static McObfPair field_70230_d = McMappingDatabase.getSRG("field_70230_d");

	/**
	 * <p>
	 * Name: accelerationY
	 * </p>
	 */
	public static McObfPair field_70233_c = McMappingDatabase.getSRG("field_70233_c");

	/**
	 * <p>
	 * Name: shootingEntity
	 * </p>
	 */
	public static McObfPair field_70235_a = McMappingDatabase.getSRG("field_70235_a");

	/**
	 * <p>
	 * Name: registerFixesFireball
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_189743_a = McMappingDatabase.getSRG("EntityFireball.func_189743_a");

	/**
	 * <p>
	 * Name: getCollisionBorderSize
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70111_Y = McMappingDatabase.getSRG("EntityFireball.func_70111_Y");

	/**
	 * <p>
	 * Name: isFireballFiery
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184564_k = McMappingDatabase.getSRG("EntityFireball.func_184564_k");

	/**
	 * <p>
	 * Name: canBeCollidedWith
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70067_L = McMappingDatabase.getSRG("EntityFireball.func_70067_L");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityFireball.func_70088_a");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityFireball.func_70097_a");

}

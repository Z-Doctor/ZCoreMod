package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityThrowable {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aev";
		else
			return "net/minecraft/entity/projectile/EntityThrowable";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aev";
		else
			return "EntityThrowable";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laev;";
		else
			return "Lnet/minecraft/entity/projectile/EntityThrowable;";
	}

	/**
	 * <p>
	 * Name: throwerName
	 * </p>
	 */
	public static McObfPair field_85053_h = McMappingDatabase.getSRG("field_85053_h");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityThrowable.func_70088_a");

	/**
	 * <p>
	 * Name: inGround
	 * </p>
	 */
	public static McObfPair field_174854_a = McMappingDatabase.getSRG("field_174854_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityThrowable.func_70071_h_");

	/**
	 * <p>
	 * Name: onImpact
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/RayTraceResult;)V]
	 * </p>
	 */
	public static McObfPair func_70184_a = McMappingDatabase.getSRG("EntityThrowable.func_70184_a");

	/**
	 * <p>
	 * Name: yTile
	 * </p>
	 */
	public static McObfPair field_145786_d = McMappingDatabase.getSRG("field_145786_d");

	/**
	 * <p>
	 * Name: inTile
	 * </p>
	 */
	public static McObfPair field_174853_f = McMappingDatabase.getSRG("field_174853_f");

	/**
	 * <p>
	 * Name: throwableShake
	 * </p>
	 */
	public static McObfPair field_70191_b = McMappingDatabase.getSRG("field_70191_b");

	/**
	 * <p>
	 * Name: xTile
	 * </p>
	 */
	public static McObfPair field_145788_c = McMappingDatabase.getSRG("field_145788_c");

	/**
	 * <p>
	 * Name: shoot
	 * </p>
	 * <p>
	 * Desc: [(DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_70186_c = McMappingDatabase.getSRG("EntityThrowable.func_70186_c");

	/**
	 * <p>
	 * Name: ignoreEntity
	 * </p>
	 */
	public static McObfPair field_184539_c = McMappingDatabase.getSRG("field_184539_c");

	/**
	 * <p>
	 * Name: getThrower
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityLivingBase;]
	 * </p>
	 */
	public static McObfPair func_85052_h = McMappingDatabase.getSRG("EntityThrowable.func_85052_h");

	/**
	 * <p>
	 * Name: setVelocity
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_70016_h = McMappingDatabase.getSRG("EntityThrowable.func_70016_h");

	/**
	 * <p>
	 * Name: shoot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFF)V]
	 * </p>
	 */
	public static McObfPair func_184538_a = McMappingDatabase.getSRG("EntityThrowable.func_184538_a");

	/**
	 * <p>
	 * Name: ticksInAir
	 * </p>
	 */
	public static McObfPair field_70195_i = McMappingDatabase.getSRG("field_70195_i");

	/**
	 * <p>
	 * Name: getGravityVelocity
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70185_h = McMappingDatabase.getSRG("EntityThrowable.func_70185_h");

	/**
	 * <p>
	 * Name: ticksInGround
	 * </p>
	 */
	public static McObfPair field_70194_h = McMappingDatabase.getSRG("field_70194_h");

	/**
	 * <p>
	 * Name: thrower
	 * </p>
	 */
	public static McObfPair field_70192_c = McMappingDatabase.getSRG("field_70192_c");

	/**
	 * <p>
	 * Name: zTile
	 * </p>
	 */
	public static McObfPair field_145787_e = McMappingDatabase.getSRG("field_145787_e");

	/**
	 * <p>
	 * Name: ignoreTime
	 * </p>
	 */
	public static McObfPair field_184540_av = McMappingDatabase.getSRG("field_184540_av");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityThrowable.func_70014_b");

	/**
	 * <p>
	 * Name: isInRangeToRenderDist
	 * </p>
	 * <p>
	 * Desc: [(D)Z]
	 * </p>
	 */
	public static McObfPair func_70112_a = McMappingDatabase.getSRG("EntityThrowable.func_70112_a");

	/**
	 * <p>
	 * Name: registerFixesThrowable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_189661_a = McMappingDatabase.getSRG("EntityThrowable.func_189661_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityThrowable.func_70037_a");

}

package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityLlamaSpit {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aeo";
		else
			return "net/minecraft/entity/projectile/EntityLlamaSpit";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aeo";
		else
			return "EntityLlamaSpit";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laeo;";
		else
			return "Lnet/minecraft/entity/projectile/EntityLlamaSpit;";
	}

	/**
	 * <p>
	 * Name: shoot
	 * </p>
	 * <p>
	 * Desc: [(DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_70186_c = McMappingDatabase.getSRG("EntityLlamaSpit.func_70186_c");

	/**
	 * <p>
	 * Name: getHitEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_190538_a = McMappingDatabase.getSRG("EntityLlamaSpit.func_190538_a");

	/**
	 * <p>
	 * Name: owner
	 * </p>
	 */
	public static McObfPair field_190539_a = McMappingDatabase.getSRG("field_190539_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityLlamaSpit.func_70088_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityLlamaSpit.func_70071_h_");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityLlamaSpit.func_70037_a");

	/**
	 * <p>
	 * Name: setVelocity
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_70016_h = McMappingDatabase.getSRG("EntityLlamaSpit.func_70016_h");

	/**
	 * <p>
	 * Name: ownerNbt
	 * </p>
	 */
	public static McObfPair field_190540_b = McMappingDatabase.getSRG("field_190540_b");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityLlamaSpit.func_70014_b");

	/**
	 * <p>
	 * Name: restoreOwnerFromSave
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190537_j = McMappingDatabase.getSRG("EntityLlamaSpit.func_190537_j");

	/**
	 * <p>
	 * Name: onHit
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/RayTraceResult;)V]
	 * </p>
	 */
	public static McObfPair func_190536_a = McMappingDatabase.getSRG("EntityLlamaSpit.func_190536_a");

}

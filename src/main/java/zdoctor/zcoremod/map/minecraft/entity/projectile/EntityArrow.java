package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityArrow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aeh";
		else
			return "net/minecraft/entity/projectile/EntityArrow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aeh";
		else
			return "EntityArrow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laeh;";
		else
			return "Lnet/minecraft/entity/projectile/EntityArrow;";
	}

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityArrow.func_70047_e");

	/**
	 * <p>
	 * Name: shootingEntity
	 * </p>
	 */
	public static McObfPair field_70250_c = McMappingDatabase.getSRG("field_70250_c");

	/**
	 * <p>
	 * Name: setPositionAndRotationDirect
	 * </p>
	 * <p>
	 * Desc: [(DDDFFIZ)V]
	 * </p>
	 */
	public static McObfPair func_180426_a = McMappingDatabase.getSRG("EntityArrow.func_180426_a");

	/**
	 * <p>
	 * Name: arrowShake
	 * </p>
	 */
	public static McObfPair field_70249_b = McMappingDatabase.getSRG("field_70249_b");

	/**
	 * <p>
	 * Name: arrowHit
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_184548_a = McMappingDatabase.getSRG("EntityArrow.func_184548_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityArrow.func_70088_a");

	/**
	 * <p>
	 * Name: canBeAttackedWithItem
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70075_an = McMappingDatabase.getSRG("EntityArrow.func_70075_an");

	/**
	 * <p>
	 * Name: pickupStatus
	 * </p>
	 */
	public static McObfPair field_70251_a = McMappingDatabase.getSRG("field_70251_a");

	/**
	 * <p>
	 * Name: move
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/MoverType;DDD)V]
	 * </p>
	 */
	public static McObfPair func_70091_d = McMappingDatabase.getSRG("EntityArrow.func_70091_d");

	/**
	 * <p>
	 * Name: onHit
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/RayTraceResult;)V]
	 * </p>
	 */
	public static McObfPair func_184549_a = McMappingDatabase.getSRG("EntityArrow.func_184549_a");

	/**
	 * <p>
	 * Name: isInRangeToRenderDist
	 * </p>
	 * <p>
	 * Desc: [(D)Z]
	 * </p>
	 */
	public static McObfPair func_70112_a = McMappingDatabase.getSRG("EntityArrow.func_70112_a");

	/**
	 * <p>
	 * Name: getIsCritical
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70241_g = McMappingDatabase.getSRG("EntityArrow.func_70241_g");

	/**
	 * <p>
	 * Name: shoot
	 * </p>
	 * <p>
	 * Desc: [(DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_70186_c = McMappingDatabase.getSRG("EntityArrow.func_70186_c");

	/**
	 * <p>
	 * Name: registerFixesArrow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_189657_a = McMappingDatabase.getSRG("EntityArrow.func_189657_a");

	/**
	 * <p>
	 * Name: getDamage
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_70242_d = McMappingDatabase.getSRG("EntityArrow.func_70242_d");

	/**
	 * <p>
	 * Name: setEnchantmentEffectsFromEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_190547_a = McMappingDatabase.getSRG("EntityArrow.func_190547_a");

	/**
	 * <p>
	 * Name: ARROW_TARGETS
	 * </p>
	 */
	public static McObfPair field_184553_f = McMappingDatabase.getSRG("field_184553_f");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityArrow.func_70071_h_");

	/**
	 * <p>
	 * Name: findEntityOnPath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_184551_a = McMappingDatabase.getSRG("EntityArrow.func_184551_a");

	/**
	 * <p>
	 * Name: inTile
	 * </p>
	 */
	public static McObfPair field_145790_g = McMappingDatabase.getSRG("field_145790_g");

	/**
	 * <p>
	 * Name: onCollideWithPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_70100_b_ = McMappingDatabase.getSRG("EntityArrow.func_70100_b_");

	/**
	 * <p>
	 * Name: xTile
	 * </p>
	 */
	public static McObfPair field_145791_d = McMappingDatabase.getSRG("field_145791_d");

	/**
	 * <p>
	 * Name: setKnockbackStrength
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70240_a = McMappingDatabase.getSRG("EntityArrow.func_70240_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityArrow.func_70037_a");

	/**
	 * <p>
	 * Name: timeInGround
	 * </p>
	 */
	public static McObfPair field_184552_b = McMappingDatabase.getSRG("field_184552_b");

	/**
	 * <p>
	 * Name: yTile
	 * </p>
	 */
	public static McObfPair field_145792_e = McMappingDatabase.getSRG("field_145792_e");

	/**
	 * <p>
	 * Name: knockbackStrength
	 * </p>
	 */
	public static McObfPair field_70256_ap = McMappingDatabase.getSRG("field_70256_ap");

	/**
	 * <p>
	 * Name: setIsCritical
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70243_d = McMappingDatabase.getSRG("EntityArrow.func_70243_d");

	/**
	 * <p>
	 * Name: setVelocity
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_70016_h = McMappingDatabase.getSRG("EntityArrow.func_70016_h");

	/**
	 * <p>
	 * Name: CRITICAL
	 * </p>
	 */
	public static McObfPair field_184554_g = McMappingDatabase.getSRG("field_184554_g");

	/**
	 * <p>
	 * Name: zTile
	 * </p>
	 */
	public static McObfPair field_145789_f = McMappingDatabase.getSRG("field_145789_f");

	/**
	 * <p>
	 * Name: registerFixesArrow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189658_a = McMappingDatabase.getSRG("EntityArrow.func_189658_a");

	/**
	 * <p>
	 * Name: inGround
	 * </p>
	 */
	public static McObfPair field_70254_i = McMappingDatabase.getSRG("field_70254_i");

	/**
	 * <p>
	 * Name: inData
	 * </p>
	 */
	public static McObfPair field_70253_h = McMappingDatabase.getSRG("field_70253_h");

	/**
	 * <p>
	 * Name: ticksInGround
	 * </p>
	 */
	public static McObfPair field_70252_j = McMappingDatabase.getSRG("field_70252_j");

	/**
	 * <p>
	 * Name: setDamage
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_70239_b = McMappingDatabase.getSRG("EntityArrow.func_70239_b");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityArrow.func_70014_b");

	/**
	 * <p>
	 * Name: shoot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFF)V]
	 * </p>
	 */
	public static McObfPair func_184547_a = McMappingDatabase.getSRG("EntityArrow.func_184547_a");

	/**
	 * <p>
	 * Name: damage
	 * </p>
	 */
	public static McObfPair field_70255_ao = McMappingDatabase.getSRG("field_70255_ao");

	/**
	 * <p>
	 * Name: getArrowStack
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184550_j = McMappingDatabase.getSRG("EntityArrow.func_184550_j");

	/**
	 * <p>
	 * Name: ticksInAir
	 * </p>
	 */
	public static McObfPair field_70257_an = McMappingDatabase.getSRG("field_70257_an");

	/**
	 * <p>
	 * Name: canTriggerWalking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70041_e_ = McMappingDatabase.getSRG("EntityArrow.func_70041_e_");

}

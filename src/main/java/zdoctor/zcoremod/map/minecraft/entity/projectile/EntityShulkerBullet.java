package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityShulkerBullet {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aer";
		else
			return "net/minecraft/entity/projectile/EntityShulkerBullet";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aer";
		else
			return "EntityShulkerBullet";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laer;";
		else
			return "Lnet/minecraft/entity/projectile/EntityShulkerBullet;";
	}

	/**
	 * <p>
	 * Name: isBurning
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70027_ad = McMappingDatabase.getSRG("EntityShulkerBullet.func_70027_ad");

	/**
	 * <p>
	 * Name: target
	 * </p>
	 */
	public static McObfPair field_184571_b = McMappingDatabase.getSRG("field_184571_b");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityShulkerBullet.func_70088_a");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityShulkerBullet.func_70097_a");

	/**
	 * <p>
	 * Name: targetDeltaX
	 * </p>
	 */
	public static McObfPair field_184577_e = McMappingDatabase.getSRG("field_184577_e");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityShulkerBullet.func_70037_a");

	/**
	 * <p>
	 * Name: direction
	 * </p>
	 */
	public static McObfPair field_184573_c = McMappingDatabase.getSRG("field_184573_c");

	/**
	 * <p>
	 * Name: targetBlockPos
	 * </p>
	 */
	public static McObfPair field_184576_au = McMappingDatabase.getSRG("field_184576_au");

	/**
	 * <p>
	 * Name: getSoundCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundCategory;]
	 * </p>
	 */
	public static McObfPair func_184176_by = McMappingDatabase.getSRG("EntityShulkerBullet.func_184176_by");

	/**
	 * <p>
	 * Name: ownerUniqueId
	 * </p>
	 */
	public static McObfPair field_184580_h = McMappingDatabase.getSRG("field_184580_h");

	/**
	 * <p>
	 * Name: canBeCollidedWith
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70067_L = McMappingDatabase.getSRG("EntityShulkerBullet.func_70067_L");

	/**
	 * <p>
	 * Name: owner
	 * </p>
	 */
	public static McObfPair field_184570_a = McMappingDatabase.getSRG("field_184570_a");

	/**
	 * <p>
	 * Name: ownerBlockPos
	 * </p>
	 */
	public static McObfPair field_184572_as = McMappingDatabase.getSRG("field_184572_as");

	/**
	 * <p>
	 * Name: steps
	 * </p>
	 */
	public static McObfPair field_184575_d = McMappingDatabase.getSRG("field_184575_d");

	/**
	 * <p>
	 * Name: targetDeltaY
	 * </p>
	 */
	public static McObfPair field_184578_f = McMappingDatabase.getSRG("field_184578_f");

	/**
	 * <p>
	 * Name: targetUniqueId
	 * </p>
	 */
	public static McObfPair field_184574_at = McMappingDatabase.getSRG("field_184574_at");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityShulkerBullet.func_70014_b");

	/**
	 * <p>
	 * Name: selectNextMoveDirection
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing$Axis;)V]
	 * </p>
	 */
	public static McObfPair func_184569_a = McMappingDatabase.getSRG("EntityShulkerBullet.func_184569_a");

	/**
	 * <p>
	 * Name: getBrightness
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70013_c = McMappingDatabase.getSRG("EntityShulkerBullet.func_70013_c");

	/**
	 * <p>
	 * Name: setDirection
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_184568_a = McMappingDatabase.getSRG("EntityShulkerBullet.func_184568_a");

	/**
	 * <p>
	 * Name: bulletHit
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/RayTraceResult;)V]
	 * </p>
	 */
	public static McObfPair func_184567_a = McMappingDatabase.getSRG("EntityShulkerBullet.func_184567_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityShulkerBullet.func_70071_h_");

	/**
	 * <p>
	 * Name: targetDeltaZ
	 * </p>
	 */
	public static McObfPair field_184579_g = McMappingDatabase.getSRG("field_184579_g");

	/**
	 * <p>
	 * Name: isInRangeToRenderDist
	 * </p>
	 * <p>
	 * Desc: [(D)Z]
	 * </p>
	 */
	public static McObfPair func_70112_a = McMappingDatabase.getSRG("EntityShulkerBullet.func_70112_a");

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70070_b = McMappingDatabase.getSRG("EntityShulkerBullet.func_70070_b");

}

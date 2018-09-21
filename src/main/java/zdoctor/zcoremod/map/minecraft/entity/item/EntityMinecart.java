package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityMinecart {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afe";
		else
			return "net/minecraft/entity/item/EntityMinecart";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afe";
		else
			return "EntityMinecart";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafe;";
		else
			return "Lnet/minecraft/entity/item/EntityMinecart;";
	}

	/**
	 * <p>
	 * Name: minecartPitch
	 * </p>
	 */
	public static McObfPair field_70513_ap = McMappingDatabase.getSRG("field_70513_ap");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;DDDLnet/minecraft/entity/item/EntityMinecart$Type;)Lnet/minecraft/entity/item/EntityMinecart;]
	 * </p>
	 */
	public static McObfPair func_184263_a = McMappingDatabase.getSRG("EntityMinecart.func_184263_a");

	/**
	 * <p>
	 * Name: minecartZ
	 * </p>
	 */
	public static McObfPair field_70514_an = McMappingDatabase.getSRG("field_70514_an");

	/**
	 * <p>
	 * Name: getDisplayTileOffset
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_94099_q = McMappingDatabase.getSRG("EntityMinecart.func_94099_q");

	/**
	 * <p>
	 * Name: DISPLAY_TILE
	 * </p>
	 */
	public static McObfPair field_184268_d = McMappingDatabase.getSRG("field_184268_d");

	/**
	 * <p>
	 * Name: setDisplayTileOffset
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_94086_l = McMappingDatabase.getSRG("EntityMinecart.func_94086_l");

	/**
	 * <p>
	 * Name: getMountedYOffset
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_70042_X = McMappingDatabase.getSRG("EntityMinecart.func_70042_X");

	/**
	 * <p>
	 * Name: getRenderBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_184177_bl = McMappingDatabase.getSRG("EntityMinecart.func_184177_bl");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/item/EntityMinecart$Type;]
	 * </p>
	 */
	public static McObfPair func_184264_v = McMappingDatabase.getSRG("EntityMinecart.func_184264_v");

	/**
	 * <p>
	 * Name: setPosition
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_70107_b = McMappingDatabase.getSRG("EntityMinecart.func_70107_b");

	/**
	 * <p>
	 * Name: turnProgress
	 * </p>
	 */
	public static McObfPair field_70510_h = McMappingDatabase.getSRG("field_70510_h");

	/**
	 * <p>
	 * Name: minecartYaw
	 * </p>
	 */
	public static McObfPair field_70512_ao = McMappingDatabase.getSRG("field_70512_ao");

	/**
	 * <p>
	 * Name: moveAlongTrack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_180460_a = McMappingDatabase.getSRG("EntityMinecart.func_180460_a");

	/**
	 * <p>
	 * Name: isInReverse
	 * </p>
	 */
	public static McObfPair field_70499_f = McMappingDatabase.getSRG("field_70499_f");

	/**
	 * <p>
	 * Name: getRollingAmplitude
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70496_j = McMappingDatabase.getSRG("EntityMinecart.func_70496_j");

	/**
	 * <p>
	 * Name: getAdjustedHorizontalFacing
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_184172_bi = McMappingDatabase.getSRG("EntityMinecart.func_184172_bi");

	/**
	 * <p>
	 * Name: canBePushed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70104_M = McMappingDatabase.getSRG("EntityMinecart.func_70104_M");

	/**
	 * <p>
	 * Name: onActivatorRailPass
	 * </p>
	 * <p>
	 * Desc: [(IIIZ)V]
	 * </p>
	 */
	public static McObfPair func_96095_a = McMappingDatabase.getSRG("EntityMinecart.func_96095_a");

	/**
	 * <p>
	 * Name: setDamage
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_70492_c = McMappingDatabase.getSRG("EntityMinecart.func_70492_c");

	/**
	 * <p>
	 * Name: DAMAGE
	 * </p>
	 */
	public static McObfPair field_184267_c = McMappingDatabase.getSRG("field_184267_c");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityMinecart.func_70071_h_");

	/**
	 * <p>
	 * Name: moveDerailedMinecart
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_180459_n = McMappingDatabase.getSRG("EntityMinecart.func_180459_n");

	/**
	 * <p>
	 * Name: canBeCollidedWith
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70067_L = McMappingDatabase.getSRG("EntityMinecart.func_70067_L");

	/**
	 * <p>
	 * Name: ROLLING_AMPLITUDE
	 * </p>
	 */
	public static McObfPair field_184265_a = McMappingDatabase.getSRG("field_184265_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityMinecart.func_70037_a");

	/**
	 * <p>
	 * Name: canTriggerWalking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70041_e_ = McMappingDatabase.getSRG("EntityMinecart.func_70041_e_");

	/**
	 * <p>
	 * Name: hasDisplayTile
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_94100_s = McMappingDatabase.getSRG("EntityMinecart.func_94100_s");

	/**
	 * <p>
	 * Name: SHOW_BLOCK
	 * </p>
	 */
	public static McObfPair field_184270_f = McMappingDatabase.getSRG("field_184270_f");

	/**
	 * <p>
	 * Name: applyEntityCollision
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_70108_f = McMappingDatabase.getSRG("EntityMinecart.func_70108_f");

	/**
	 * <p>
	 * Name: velocityX
	 * </p>
	 */
	public static McObfPair field_70508_aq = McMappingDatabase.getSRG("field_70508_aq");

	/**
	 * <p>
	 * Name: minecartY
	 * </p>
	 */
	public static McObfPair field_70509_j = McMappingDatabase.getSRG("field_70509_j");

	/**
	 * <p>
	 * Name: getDefaultDisplayTileOffset
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_94085_r = McMappingDatabase.getSRG("EntityMinecart.func_94085_r");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityMinecart.func_70014_b");

	/**
	 * <p>
	 * Name: getDefaultDisplayTile
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180457_u = McMappingDatabase.getSRG("EntityMinecart.func_180457_u");

	/**
	 * <p>
	 * Name: MATRIX
	 * </p>
	 */
	public static McObfPair field_70500_g = McMappingDatabase.getSRG("field_70500_g");

	/**
	 * <p>
	 * Name: performHurtAnimation
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70057_ab = McMappingDatabase.getSRG("EntityMinecart.func_70057_ab");

	/**
	 * <p>
	 * Name: getDamage
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70491_i = McMappingDatabase.getSRG("EntityMinecart.func_70491_i");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityMinecart.func_70088_a");

	/**
	 * <p>
	 * Name: getRollingDirection
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70493_k = McMappingDatabase.getSRG("EntityMinecart.func_70493_k");

	/**
	 * <p>
	 * Name: DISPLAY_TILE_OFFSET
	 * </p>
	 */
	public static McObfPair field_184269_e = McMappingDatabase.getSRG("field_184269_e");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityMinecart.func_70097_a");

	/**
	 * <p>
	 * Name: getMaximumSpeed
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_174898_m = McMappingDatabase.getSRG("EntityMinecart.func_174898_m");

	/**
	 * <p>
	 * Name: velocityZ
	 * </p>
	 */
	public static McObfPair field_70506_as = McMappingDatabase.getSRG("field_70506_as");

	/**
	 * <p>
	 * Name: registerFixesMinecart
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;Ljava/lang/Class;)V]
	 * </p>
	 */
	public static McObfPair func_189669_a = McMappingDatabase.getSRG("EntityMinecart.func_189669_a");

	/**
	 * <p>
	 * Name: getDisplayTile
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_174897_t = McMappingDatabase.getSRG("EntityMinecart.func_174897_t");

	/**
	 * <p>
	 * Name: setRollingDirection
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70494_i = McMappingDatabase.getSRG("EntityMinecart.func_70494_i");

	/**
	 * <p>
	 * Name: getPosOffset
	 * </p>
	 * <p>
	 * Desc: [(DDDD)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_70495_a = McMappingDatabase.getSRG("EntityMinecart.func_70495_a");

	/**
	 * <p>
	 * Name: setPositionAndRotationDirect
	 * </p>
	 * <p>
	 * Desc: [(DDDFFIZ)V]
	 * </p>
	 */
	public static McObfPair func_180426_a = McMappingDatabase.getSRG("EntityMinecart.func_180426_a");

	/**
	 * <p>
	 * Name: setRollingAmplitude
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70497_h = McMappingDatabase.getSRG("EntityMinecart.func_70497_h");

	/**
	 * <p>
	 * Name: setHasDisplayTile
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_94096_e = McMappingDatabase.getSRG("EntityMinecart.func_94096_e");

	/**
	 * <p>
	 * Name: applyDrag
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_94101_h = McMappingDatabase.getSRG("EntityMinecart.func_94101_h");

	/**
	 * <p>
	 * Name: setVelocity
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_70016_h = McMappingDatabase.getSRG("EntityMinecart.func_70016_h");

	/**
	 * <p>
	 * Name: killMinecart
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_94095_a = McMappingDatabase.getSRG("EntityMinecart.func_94095_a");

	/**
	 * <p>
	 * Name: setDisplayTile
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_174899_a = McMappingDatabase.getSRG("EntityMinecart.func_174899_a");

	/**
	 * <p>
	 * Name: ROLLING_DIRECTION
	 * </p>
	 */
	public static McObfPair field_184266_b = McMappingDatabase.getSRG("field_184266_b");

	/**
	 * <p>
	 * Name: velocityY
	 * </p>
	 */
	public static McObfPair field_70507_ar = McMappingDatabase.getSRG("field_70507_ar");

	/**
	 * <p>
	 * Name: getCollisionBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_70114_g = McMappingDatabase.getSRG("EntityMinecart.func_70114_g");

	/**
	 * <p>
	 * Name: getPos
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_70489_a = McMappingDatabase.getSRG("EntityMinecart.func_70489_a");

	/**
	 * <p>
	 * Name: getCollisionBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_70046_E = McMappingDatabase.getSRG("EntityMinecart.func_70046_E");

	/**
	 * <p>
	 * Name: minecartX
	 * </p>
	 */
	public static McObfPair field_70511_i = McMappingDatabase.getSRG("field_70511_i");

}

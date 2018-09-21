package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityFallingBlock {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ack";
		else
			return "net/minecraft/entity/item/EntityFallingBlock";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ack";
		else
			return "EntityFallingBlock";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lack;";
		else
			return "Lnet/minecraft/entity/item/EntityFallingBlock;";
	}

	/**
	 * <p>
	 * Name: fallTile
	 * </p>
	 */
	public static McObfPair field_175132_d = McMappingDatabase.getSRG("field_175132_d");

	/**
	 * <p>
	 * Name: dontSetBlock
	 * </p>
	 */
	public static McObfPair field_145808_f = McMappingDatabase.getSRG("field_145808_f");

	/**
	 * <p>
	 * Name: canTriggerWalking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70041_e_ = McMappingDatabase.getSRG("EntityFallingBlock.func_70041_e_");

	/**
	 * <p>
	 * Name: canBeAttackedWithItem
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70075_an = McMappingDatabase.getSRG("EntityFallingBlock.func_70075_an");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityFallingBlock.func_70014_b");

	/**
	 * <p>
	 * Name: tileEntityData
	 * </p>
	 */
	public static McObfPair field_145810_d = McMappingDatabase.getSRG("field_145810_d");

	/**
	 * <p>
	 * Name: addEntityCrashInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/crash/CrashReportCategory;)V]
	 * </p>
	 */
	public static McObfPair func_85029_a = McMappingDatabase.getSRG("EntityFallingBlock.func_85029_a");

	/**
	 * <p>
	 * Name: canBeCollidedWith
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70067_L = McMappingDatabase.getSRG("EntityFallingBlock.func_70067_L");

	/**
	 * <p>
	 * Name: shouldDropItem
	 * </p>
	 */
	public static McObfPair field_145813_c = McMappingDatabase.getSRG("field_145813_c");

	/**
	 * <p>
	 * Name: ORIGIN
	 * </p>
	 */
	public static McObfPair field_184532_d = McMappingDatabase.getSRG("field_184532_d");

	/**
	 * <p>
	 * Name: getOrigin
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_184531_j = McMappingDatabase.getSRG("EntityFallingBlock.func_184531_j");

	/**
	 * <p>
	 * Name: registerFixesFallingBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189741_a = McMappingDatabase.getSRG("EntityFallingBlock.func_189741_a");

	/**
	 * <p>
	 * Name: hurtEntities
	 * </p>
	 */
	public static McObfPair field_145809_g = McMappingDatabase.getSRG("field_145809_g");

	/**
	 * <p>
	 * Name: ignoreItemEntityData
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184213_bq = McMappingDatabase.getSRG("EntityFallingBlock.func_184213_bq");

	/**
	 * <p>
	 * Name: fall
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_180430_e = McMappingDatabase.getSRG("EntityFallingBlock.func_180430_e");

	/**
	 * <p>
	 * Name: fallHurtAmount
	 * </p>
	 */
	public static McObfPair field_145816_i = McMappingDatabase.getSRG("field_145816_i");

	/**
	 * <p>
	 * Name: canRenderOnFire
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_90999_ad = McMappingDatabase.getSRG("EntityFallingBlock.func_90999_ad");

	/**
	 * <p>
	 * Name: setOrigin
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184530_a = McMappingDatabase.getSRG("EntityFallingBlock.func_184530_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityFallingBlock.func_70088_a");

	/**
	 * <p>
	 * Name: fallTime
	 * </p>
	 */
	public static McObfPair field_145812_b = McMappingDatabase.getSRG("field_145812_b");

	/**
	 * <p>
	 * Name: fallHurtMax
	 * </p>
	 */
	public static McObfPair field_145815_h = McMappingDatabase.getSRG("field_145815_h");

	/**
	 * <p>
	 * Name: getBlock
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_175131_l = McMappingDatabase.getSRG("EntityFallingBlock.func_175131_l");

	/**
	 * <p>
	 * Name: getWorldObj
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_145807_e = McMappingDatabase.getSRG("EntityFallingBlock.func_145807_e");

	/**
	 * <p>
	 * Name: setHurtEntities
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_145806_a = McMappingDatabase.getSRG("EntityFallingBlock.func_145806_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityFallingBlock.func_70037_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityFallingBlock.func_70071_h_");

}

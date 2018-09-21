package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityShulker {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adi";
		else
			return "net/minecraft/entity/monster/EntityShulker";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adi";
		else
			return "EntityShulker";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladi;";
		else
			return "Lnet/minecraft/entity/monster/EntityShulker;";
	}

	/**
	 * <p>
	 * Name: COLOR
	 * </p>
	 */
	public static McObfPair field_190770_bw = McMappingDatabase.getSRG("field_190770_bw");

	/**
	 * <p>
	 * Name: DEFAULT_COLOR
	 * </p>
	 */
	public static McObfPair field_190771_bx = McMappingDatabase.getSRG("field_190771_bx");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityShulker.func_110147_ax");

	/**
	 * <p>
	 * Name: clientSideTeleportInterpolation
	 * </p>
	 */
	public static McObfPair field_184708_bA = McMappingDatabase.getSRG("field_184708_bA");

	/**
	 * <p>
	 * Name: getCollisionBorderSize
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70111_Y = McMappingDatabase.getSRG("EntityShulker.func_70111_Y");

	/**
	 * <p>
	 * Name: setAttachmentPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184694_g = McMappingDatabase.getSRG("EntityShulker.func_184694_g");

	/**
	 * <p>
	 * Name: currentAttachmentPosition
	 * </p>
	 */
	public static McObfPair field_184707_bz = McMappingDatabase.getSRG("field_184707_bz");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("EntityShulker.func_184206_a");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityShulker.func_184647_J");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/EnumDyeColor;]
	 * </p>
	 */
	public static McObfPair func_190769_dn = McMappingDatabase.getSRG("EntityShulker.func_190769_dn");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityShulker.func_70037_a");

	/**
	 * <p>
	 * Name: tryTeleportToNewPosition
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184689_o = McMappingDatabase.getSRG("EntityShulker.func_184689_o");

	/**
	 * <p>
	 * Name: updateArmorModifier
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_184691_a = McMappingDatabase.getSRG("EntityShulker.func_184691_a");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityShulker.func_70097_a");

	/**
	 * <p>
	 * Name: peekAmount
	 * </p>
	 */
	public static McObfPair field_184706_by = McMappingDatabase.getSRG("field_184706_by");

	/**
	 * <p>
	 * Name: getAttachmentPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_184699_da = McMappingDatabase.getSRG("EntityShulker.func_184699_da");

	/**
	 * <p>
	 * Name: getPeekTick
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184684_db = McMappingDatabase.getSRG("EntityShulker.func_184684_db");

	/**
	 * <p>
	 * Name: getClientPeekAmount
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_184688_a = McMappingDatabase.getSRG("EntityShulker.func_184688_a");

	/**
	 * <p>
	 * Name: isClosed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184686_df = McMappingDatabase.getSRG("EntityShulker.func_184686_df");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityShulker.func_70014_b");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityShulker.func_184601_bQ");

	/**
	 * <p>
	 * Name: getAttachmentFacing
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_184696_cZ = McMappingDatabase.getSRG("EntityShulker.func_184696_cZ");

	/**
	 * <p>
	 * Name: ATTACHED_BLOCK_POS
	 * </p>
	 */
	public static McObfPair field_184701_b = McMappingDatabase.getSRG("field_184701_b");

	/**
	 * <p>
	 * Name: PEEK_TICK
	 * </p>
	 */
	public static McObfPair field_184702_c = McMappingDatabase.getSRG("field_184702_c");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityShulker.func_70047_e");

	/**
	 * <p>
	 * Name: setPositionAndRotationDirect
	 * </p>
	 * <p>
	 * Desc: [(DDDFFIZ)V]
	 * </p>
	 */
	public static McObfPair func_180426_a = McMappingDatabase.getSRG("EntityShulker.func_180426_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityShulker.func_70071_h_");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityShulker.func_70636_d");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("EntityShulker.func_180482_a");

	/**
	 * <p>
	 * Name: getCollisionBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_70046_E = McMappingDatabase.getSRG("EntityShulker.func_70046_E");

	/**
	 * <p>
	 * Name: ATTACHED_FACE
	 * </p>
	 */
	public static McObfPair field_184700_a = McMappingDatabase.getSRG("field_184700_a");

	/**
	 * <p>
	 * Name: COVERED_ARMOR_BONUS_ID
	 * </p>
	 */
	public static McObfPair field_184703_bv = McMappingDatabase.getSRG("field_184703_bv");

	/**
	 * <p>
	 * Name: getSoundCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundCategory;]
	 * </p>
	 */
	public static McObfPair func_184176_by = McMappingDatabase.getSRG("EntityShulker.func_184176_by");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityShulker.func_184615_bR");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityShulker.func_70088_a");

	/**
	 * <p>
	 * Name: getHorizontalFaceSpeed
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184649_cE = McMappingDatabase.getSRG("EntityShulker.func_184649_cE");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityShulker.func_184639_G");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityShulker.func_184651_r");

	/**
	 * <p>
	 * Name: prevPeekAmount
	 * </p>
	 */
	public static McObfPair field_184705_bx = McMappingDatabase.getSRG("field_184705_bx");

	/**
	 * <p>
	 * Name: playLivingSound
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70642_aH = McMappingDatabase.getSRG("EntityShulker.func_70642_aH");

	/**
	 * <p>
	 * Name: registerFixesShulker
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189757_b = McMappingDatabase.getSRG("EntityShulker.func_189757_b");

	/**
	 * <p>
	 * Name: setPosition
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_70107_b = McMappingDatabase.getSRG("EntityShulker.func_70107_b");

	/**
	 * <p>
	 * Name: applyEntityCollision
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_70108_f = McMappingDatabase.getSRG("EntityShulker.func_70108_f");

	/**
	 * <p>
	 * Name: canTriggerWalking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70041_e_ = McMappingDatabase.getSRG("EntityShulker.func_70041_e_");

	/**
	 * <p>
	 * Name: isAttachedToBlock
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184697_de = McMappingDatabase.getSRG("EntityShulker.func_184697_de");

	/**
	 * <p>
	 * Name: getVerticalFaceSpeed
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70646_bf = McMappingDatabase.getSRG("EntityShulker.func_70646_bf");

	/**
	 * <p>
	 * Name: getClientTeleportInterp
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184693_dc = McMappingDatabase.getSRG("EntityShulker.func_184693_dc");

	/**
	 * <p>
	 * Name: COVERED_ARMOR_BONUS_MODIFIER
	 * </p>
	 */
	public static McObfPair field_184704_bw = McMappingDatabase.getSRG("field_184704_bw");

	/**
	 * <p>
	 * Name: getOldAttachPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_184692_dd = McMappingDatabase.getSRG("EntityShulker.func_184692_dd");

	/**
	 * <p>
	 * Name: createBodyHelper
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityBodyHelper;]
	 * </p>
	 */
	public static McObfPair func_184650_s = McMappingDatabase.getSRG("EntityShulker.func_184650_s");

	/**
	 * <p>
	 * Name: move
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/MoverType;DDD)V]
	 * </p>
	 */
	public static McObfPair func_70091_d = McMappingDatabase.getSRG("EntityShulker.func_70091_d");

}

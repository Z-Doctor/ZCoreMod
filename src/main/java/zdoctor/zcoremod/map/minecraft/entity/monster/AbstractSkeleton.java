package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AbstractSkeleton {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acp";
		else
			return "net/minecraft/entity/monster/AbstractSkeleton";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acp";
		else
			return "AbstractSkeleton";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacp;";
		else
			return "Lnet/minecraft/entity/monster/AbstractSkeleton;";
	}

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("AbstractSkeleton.func_184651_r");

	/**
	 * <p>
	 * Name: aiArrowAttack
	 * </p>
	 */
	public static McObfPair field_85037_d = McMappingDatabase.getSRG("field_85037_d");

	/**
	 * <p>
	 * Name: setSwingingArms
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184724_a = McMappingDatabase.getSRG("AbstractSkeleton.func_184724_a");

	/**
	 * <p>
	 * Name: attackEntityWithRangedAttack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_82196_d = McMappingDatabase.getSRG("AbstractSkeleton.func_82196_d");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("AbstractSkeleton.func_70047_e");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("AbstractSkeleton.func_110147_ax");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("AbstractSkeleton.func_70037_a");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("AbstractSkeleton.func_70636_d");

	/**
	 * <p>
	 * Name: updateRidden
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70098_U = McMappingDatabase.getSRG("AbstractSkeleton.func_70098_U");

	/**
	 * <p>
	 * Name: SWINGING_ARMS
	 * </p>
	 */
	public static McObfPair field_184728_b = McMappingDatabase.getSRG("field_184728_b");

	/**
	 * <p>
	 * Name: setEquipmentBasedOnDifficulty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;)V]
	 * </p>
	 */
	public static McObfPair func_180481_a = McMappingDatabase.getSRG("AbstractSkeleton.func_180481_a");

	/**
	 * <p>
	 * Name: playStepSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_180429_a = McMappingDatabase.getSRG("AbstractSkeleton.func_180429_a");

	/**
	 * <p>
	 * Name: getArrow
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/entity/projectile/EntityArrow;]
	 * </p>
	 */
	public static McObfPair func_190726_a = McMappingDatabase.getSRG("AbstractSkeleton.func_190726_a");

	/**
	 * <p>
	 * Name: getStepSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_190727_o = McMappingDatabase.getSRG("AbstractSkeleton.func_190727_o");

	/**
	 * <p>
	 * Name: aiAttackOnCollide
	 * </p>
	 */
	public static McObfPair field_85038_e = McMappingDatabase.getSRG("field_85038_e");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("AbstractSkeleton.func_180482_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("AbstractSkeleton.func_70088_a");

	/**
	 * <p>
	 * Name: isSwingingArms
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184725_db = McMappingDatabase.getSRG("AbstractSkeleton.func_184725_db");

	/**
	 * <p>
	 * Name: getCreatureAttribute
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EnumCreatureAttribute;]
	 * </p>
	 */
	public static McObfPair func_70668_bt = McMappingDatabase.getSRG("AbstractSkeleton.func_70668_bt");

	/**
	 * <p>
	 * Name: setCombatTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_85036_m = McMappingDatabase.getSRG("AbstractSkeleton.func_85036_m");

	/**
	 * <p>
	 * Name: setItemStackToSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_184201_a = McMappingDatabase.getSRG("AbstractSkeleton.func_184201_a");

	/**
	 * <p>
	 * Name: getYOffset
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_70033_W = McMappingDatabase.getSRG("AbstractSkeleton.func_70033_W");

}

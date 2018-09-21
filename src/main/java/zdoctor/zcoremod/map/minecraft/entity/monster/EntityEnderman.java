package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityEnderman {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acu";
		else
			return "net/minecraft/entity/monster/EntityEnderman";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acu";
		else
			return "EntityEnderman";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacu;";
		else
			return "Lnet/minecraft/entity/monster/EntityEnderman;";
	}

	/**
	 * <p>
	 * Name: CARRIABLE_BLOCKS
	 * </p>
	 */
	public static McObfPair field_70827_d = McMappingDatabase.getSRG("field_70827_d");

	/**
	 * <p>
	 * Name: setAttackTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_70624_b = McMappingDatabase.getSRG("EntityEnderman.func_70624_b");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityEnderman.func_70014_b");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("EntityEnderman.func_184206_a");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityEnderman.func_184651_r");

	/**
	 * <p>
	 * Name: getHeldBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_175489_ck = McMappingDatabase.getSRG("EntityEnderman.func_175489_ck");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityEnderman.func_184639_G");

	/**
	 * <p>
	 * Name: ATTACKING_SPEED_BOOST
	 * </p>
	 */
	public static McObfPair field_110193_bq = McMappingDatabase.getSRG("field_110193_bq");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityEnderman.func_70037_a");

	/**
	 * <p>
	 * Name: SCREAMING
	 * </p>
	 */
	public static McObfPair field_184719_bw = McMappingDatabase.getSRG("field_184719_bw");

	/**
	 * <p>
	 * Name: setHeldBlockState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_175490_a = McMappingDatabase.getSRG("EntityEnderman.func_175490_a");

	/**
	 * <p>
	 * Name: playEndermanSound
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184716_o = McMappingDatabase.getSRG("EntityEnderman.func_184716_o");

	/**
	 * <p>
	 * Name: CARRIED_BLOCK
	 * </p>
	 */
	public static McObfPair field_184718_bv = McMappingDatabase.getSRG("field_184718_bv");

	/**
	 * <p>
	 * Name: teleportTo
	 * </p>
	 * <p>
	 * Desc: [(DDD)Z]
	 * </p>
	 */
	public static McObfPair func_70825_j = McMappingDatabase.getSRG("EntityEnderman.func_70825_j");

	/**
	 * <p>
	 * Name: isScreaming
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70823_r = McMappingDatabase.getSRG("EntityEnderman.func_70823_r");

	/**
	 * <p>
	 * Name: updateAITasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70619_bc = McMappingDatabase.getSRG("EntityEnderman.func_70619_bc");

	/**
	 * <p>
	 * Name: shouldAttackPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_70821_d = McMappingDatabase.getSRG("EntityEnderman.func_70821_d");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityEnderman.func_70636_d");

	/**
	 * <p>
	 * Name: registerFixesEnderman
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189763_b = McMappingDatabase.getSRG("EntityEnderman.func_189763_b");

	/**
	 * <p>
	 * Name: dropEquipment
	 * </p>
	 * <p>
	 * Desc: [(ZI)V]
	 * </p>
	 */
	public static McObfPair func_82160_b = McMappingDatabase.getSRG("EntityEnderman.func_82160_b");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityEnderman.func_184647_J");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityEnderman.func_110147_ax");

	/**
	 * <p>
	 * Name: ATTACKING_SPEED_BOOST_ID
	 * </p>
	 */
	public static McObfPair field_110192_bp = McMappingDatabase.getSRG("field_110192_bp");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityEnderman.func_184615_bR");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityEnderman.func_70047_e");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityEnderman.func_184601_bQ");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityEnderman.func_70088_a");

	/**
	 * <p>
	 * Name: teleportToEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_70816_c = McMappingDatabase.getSRG("EntityEnderman.func_70816_c");

	/**
	 * <p>
	 * Name: targetChangeTime
	 * </p>
	 */
	public static McObfPair field_184721_by = McMappingDatabase.getSRG("field_184721_by");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityEnderman.func_70097_a");

	/**
	 * <p>
	 * Name: teleportRandomly
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70820_n = McMappingDatabase.getSRG("EntityEnderman.func_70820_n");

	/**
	 * <p>
	 * Name: lastCreepySound
	 * </p>
	 */
	public static McObfPair field_184720_bx = McMappingDatabase.getSRG("field_184720_bx");

}

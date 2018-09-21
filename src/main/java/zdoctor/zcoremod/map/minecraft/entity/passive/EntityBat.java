package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityBat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zt";
		else
			return "net/minecraft/entity/passive/EntityBat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zt";
		else
			return "EntityBat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lzt;";
		else
			return "Lnet/minecraft/entity/passive/EntityBat;";
	}

	/**
	 * <p>
	 * Name: setIsBatHanging
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_82236_f = McMappingDatabase.getSRG("EntityBat.func_82236_f");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityBat.func_70037_a");

	/**
	 * <p>
	 * Name: collideWithNearbyEntities
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_85033_bc = McMappingDatabase.getSRG("EntityBat.func_85033_bc");

	/**
	 * <p>
	 * Name: updateFallState
	 * </p>
	 * <p>
	 * Desc: [(DZLnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184231_a = McMappingDatabase.getSRG("EntityBat.func_184231_a");

	/**
	 * <p>
	 * Name: canTriggerWalking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70041_e_ = McMappingDatabase.getSRG("EntityBat.func_70041_e_");

	/**
	 * <p>
	 * Name: isDateAroundHalloween
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Calendar;)Z]
	 * </p>
	 */
	public static McObfPair func_175569_a = McMappingDatabase.getSRG("EntityBat.func_175569_a");

	/**
	 * <p>
	 * Name: HANGING
	 * </p>
	 */
	public static McObfPair field_184660_a = McMappingDatabase.getSRG("field_184660_a");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityBat.func_110147_ax");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityBat.func_184647_J");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityBat.func_70047_e");

	/**
	 * <p>
	 * Name: spawnPosition
	 * </p>
	 */
	public static McObfPair field_82237_a = McMappingDatabase.getSRG("field_82237_a");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityBat.func_184601_bQ");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityBat.func_184615_bR");

	/**
	 * <p>
	 * Name: getCanSpawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70601_bi = McMappingDatabase.getSRG("EntityBat.func_70601_bi");

	/**
	 * <p>
	 * Name: canBePushed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70104_M = McMappingDatabase.getSRG("EntityBat.func_70104_M");

	/**
	 * <p>
	 * Name: fall
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_180430_e = McMappingDatabase.getSRG("EntityBat.func_180430_e");

	/**
	 * <p>
	 * Name: doesEntityNotTriggerPressurePlate
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145773_az = McMappingDatabase.getSRG("EntityBat.func_145773_az");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityBat.func_70088_a");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityBat.func_70097_a");

	/**
	 * <p>
	 * Name: updateAITasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70619_bc = McMappingDatabase.getSRG("EntityBat.func_70619_bc");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityBat.func_70014_b");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityBat.func_70071_h_");

	/**
	 * <p>
	 * Name: getIsBatHanging
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82235_h = McMappingDatabase.getSRG("EntityBat.func_82235_h");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityBat.func_184639_G");

	/**
	 * <p>
	 * Name: registerFixesBat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189754_b = McMappingDatabase.getSRG("EntityBat.func_189754_b");

	/**
	 * <p>
	 * Name: getSoundVolume
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70599_aP = McMappingDatabase.getSRG("EntityBat.func_70599_aP");

	/**
	 * <p>
	 * Name: getSoundPitch
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70647_i = McMappingDatabase.getSRG("EntityBat.func_70647_i");

	/**
	 * <p>
	 * Name: collideWithEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_82167_n = McMappingDatabase.getSRG("EntityBat.func_82167_n");

}

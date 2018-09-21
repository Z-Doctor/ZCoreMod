package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityVex {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adp";
		else
			return "net/minecraft/entity/monster/EntityVex";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adp";
		else
			return "EntityVex";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladp;";
		else
			return "Lnet/minecraft/entity/monster/EntityVex;";
	}

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityVex.func_184615_bR");

	/**
	 * <p>
	 * Name: move
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/MoverType;DDD)V]
	 * </p>
	 */
	public static McObfPair func_70091_d = McMappingDatabase.getSRG("EntityVex.func_70091_d");

	/**
	 * <p>
	 * Name: getBrightness
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70013_c = McMappingDatabase.getSRG("EntityVex.func_70013_c");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityVex.func_70037_a");

	/**
	 * <p>
	 * Name: limitedLifespan
	 * </p>
	 */
	public static McObfPair field_190667_bw = McMappingDatabase.getSRG("field_190667_bw");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityVex.func_184647_J");

	/**
	 * <p>
	 * Name: getOwner
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityLiving;]
	 * </p>
	 */
	public static McObfPair func_190645_o = McMappingDatabase.getSRG("EntityVex.func_190645_o");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("EntityVex.func_180482_a");

	/**
	 * <p>
	 * Name: setOwner
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLiving;)V]
	 * </p>
	 */
	public static McObfPair func_190658_a = McMappingDatabase.getSRG("EntityVex.func_190658_a");

	/**
	 * <p>
	 * Name: owner
	 * </p>
	 */
	public static McObfPair field_190665_b = McMappingDatabase.getSRG("field_190665_b");

	/**
	 * <p>
	 * Name: setLimitedLife
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_190653_a = McMappingDatabase.getSRG("EntityVex.func_190653_a");

	/**
	 * <p>
	 * Name: setVexFlag
	 * </p>
	 * <p>
	 * Desc: [(IZ)V]
	 * </p>
	 */
	public static McObfPair func_190660_a = McMappingDatabase.getSRG("EntityVex.func_190660_a");

	/**
	 * <p>
	 * Name: getVexFlag
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_190656_b = McMappingDatabase.getSRG("EntityVex.func_190656_b");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityVex.func_184639_G");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityVex.func_184651_r");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityVex.func_70088_a");

	/**
	 * <p>
	 * Name: registerFixesVex
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_190663_b = McMappingDatabase.getSRG("EntityVex.func_190663_b");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityVex.func_110147_ax");

	/**
	 * <p>
	 * Name: limitedLifeTicks
	 * </p>
	 */
	public static McObfPair field_190668_bx = McMappingDatabase.getSRG("field_190668_bx");

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70070_b = McMappingDatabase.getSRG("EntityVex.func_70070_b");

	/**
	 * <p>
	 * Name: setBoundOrigin
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_190651_g = McMappingDatabase.getSRG("EntityVex.func_190651_g");

	/**
	 * <p>
	 * Name: setCharging
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_190648_a = McMappingDatabase.getSRG("EntityVex.func_190648_a");

	/**
	 * <p>
	 * Name: VEX_FLAGS
	 * </p>
	 */
	public static McObfPair field_190664_a = McMappingDatabase.getSRG("field_190664_a");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityVex.func_184601_bQ");

	/**
	 * <p>
	 * Name: isCharging
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190647_dj = McMappingDatabase.getSRG("EntityVex.func_190647_dj");

	/**
	 * <p>
	 * Name: boundOrigin
	 * </p>
	 */
	public static McObfPair field_190666_c = McMappingDatabase.getSRG("field_190666_c");

	/**
	 * <p>
	 * Name: setEquipmentBasedOnDifficulty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;)V]
	 * </p>
	 */
	public static McObfPair func_180481_a = McMappingDatabase.getSRG("EntityVex.func_180481_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityVex.func_70014_b");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityVex.func_70071_h_");

	/**
	 * <p>
	 * Name: getBoundOrigin
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_190646_di = McMappingDatabase.getSRG("EntityVex.func_190646_di");

}

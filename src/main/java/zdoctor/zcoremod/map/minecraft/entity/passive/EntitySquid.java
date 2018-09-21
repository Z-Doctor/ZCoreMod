package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySquid {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaj";
		else
			return "net/minecraft/entity/passive/EntitySquid";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaj";
		else
			return "EntitySquid";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laaj;";
		else
			return "Lnet/minecraft/entity/passive/EntitySquid;";
	}

	/**
	 * <p>
	 * Name: randomMotionSpeed
	 * </p>
	 */
	public static McObfPair field_70863_bz = McMappingDatabase.getSRG("field_70863_bz");

	/**
	 * <p>
	 * Name: randomMotionVecZ
	 * </p>
	 */
	public static McObfPair field_70870_bE = McMappingDatabase.getSRG("field_70870_bE");

	/**
	 * <p>
	 * Name: randomMotionVecX
	 * </p>
	 */
	public static McObfPair field_70872_bC = McMappingDatabase.getSRG("field_70872_bC");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntitySquid.func_184639_G");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntitySquid.func_184601_bQ");

	/**
	 * <p>
	 * Name: getSoundVolume
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70599_aP = McMappingDatabase.getSRG("EntitySquid.func_70599_aP");

	/**
	 * <p>
	 * Name: travel
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_191986_a = McMappingDatabase.getSRG("EntitySquid.func_191986_a");

	/**
	 * <p>
	 * Name: tentacleAngle
	 * </p>
	 */
	public static McObfPair field_70866_j = McMappingDatabase.getSRG("field_70866_j");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntitySquid.func_70047_e");

	/**
	 * <p>
	 * Name: hasMovementVector
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175567_n = McMappingDatabase.getSRG("EntitySquid.func_175567_n");

	/**
	 * <p>
	 * Name: squidYaw
	 * </p>
	 */
	public static McObfPair field_70859_f = McMappingDatabase.getSRG("field_70859_f");

	/**
	 * <p>
	 * Name: lastTentacleAngle
	 * </p>
	 */
	public static McObfPair field_70865_by = McMappingDatabase.getSRG("field_70865_by");

	/**
	 * <p>
	 * Name: squidRotation
	 * </p>
	 */
	public static McObfPair field_70867_h = McMappingDatabase.getSRG("field_70867_h");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntitySquid.func_184651_r");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntitySquid.func_184647_J");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntitySquid.func_70103_a");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntitySquid.func_70636_d");

	/**
	 * <p>
	 * Name: randomMotionVecY
	 * </p>
	 */
	public static McObfPair field_70869_bD = McMappingDatabase.getSRG("field_70869_bD");

	/**
	 * <p>
	 * Name: registerFixesSquid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189804_b = McMappingDatabase.getSRG("EntitySquid.func_189804_b");

	/**
	 * <p>
	 * Name: squidPitch
	 * </p>
	 */
	public static McObfPair field_70861_d = McMappingDatabase.getSRG("field_70861_d");

	/**
	 * <p>
	 * Name: prevSquidRotation
	 * </p>
	 */
	public static McObfPair field_70868_i = McMappingDatabase.getSRG("field_70868_i");

	/**
	 * <p>
	 * Name: rotateSpeed
	 * </p>
	 */
	public static McObfPair field_70871_bB = McMappingDatabase.getSRG("field_70871_bB");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntitySquid.func_184615_bR");

	/**
	 * <p>
	 * Name: prevSquidYaw
	 * </p>
	 */
	public static McObfPair field_70860_g = McMappingDatabase.getSRG("field_70860_g");

	/**
	 * <p>
	 * Name: rotationVelocity
	 * </p>
	 */
	public static McObfPair field_70864_bA = McMappingDatabase.getSRG("field_70864_bA");

	/**
	 * <p>
	 * Name: getCanSpawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70601_bi = McMappingDatabase.getSRG("EntitySquid.func_70601_bi");

	/**
	 * <p>
	 * Name: prevSquidPitch
	 * </p>
	 */
	public static McObfPair field_70862_e = McMappingDatabase.getSRG("field_70862_e");

	/**
	 * <p>
	 * Name: canTriggerWalking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70041_e_ = McMappingDatabase.getSRG("EntitySquid.func_70041_e_");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntitySquid.func_110147_ax");

	/**
	 * <p>
	 * Name: setMovementVector
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_175568_b = McMappingDatabase.getSRG("EntitySquid.func_175568_b");

}

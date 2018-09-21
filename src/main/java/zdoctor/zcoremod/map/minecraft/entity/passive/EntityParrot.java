package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityParrot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aac";
		else
			return "net/minecraft/entity/passive/EntityParrot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aac";
		else
			return "EntityParrot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laac;";
		else
			return "Lnet/minecraft/entity/passive/EntityParrot;";
	}

	/**
	 * <p>
	 * Name: getImitatedSound
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_191999_g = McMappingDatabase.getSRG("EntityParrot.func_191999_g");

	/**
	 * <p>
	 * Name: fall
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_180430_e = McMappingDatabase.getSRG("EntityParrot.func_180430_e");

	/**
	 * <p>
	 * Name: VARIANT
	 * </p>
	 */
	public static McObfPair field_192013_bG = McMappingDatabase.getSRG("field_192013_bG");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityParrot.func_70097_a");

	/**
	 * <p>
	 * Name: playStepSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_180429_a = McMappingDatabase.getSRG("EntityParrot.func_180429_a");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("EntityParrot.func_180482_a");

	/**
	 * <p>
	 * Name: jukeboxPosition
	 * </p>
	 */
	public static McObfPair field_192019_bM = McMappingDatabase.getSRG("field_192019_bM");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityParrot.func_70037_a");

	/**
	 * <p>
	 * Name: getSoundCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundCategory;]
	 * </p>
	 */
	public static McObfPair func_184176_by = McMappingDatabase.getSRG("EntityParrot.func_184176_by");

	/**
	 * <p>
	 * Name: flapSpeed
	 * </p>
	 */
	public static McObfPair field_192009_bC = McMappingDatabase.getSRG("field_192009_bC");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityParrot.func_70047_e");

	/**
	 * <p>
	 * Name: makeFlySound
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191957_ae = McMappingDatabase.getSRG("EntityParrot.func_191957_ae");

	/**
	 * <p>
	 * Name: getSoundPitch
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70647_i = McMappingDatabase.getSRG("EntityParrot.func_70647_i");

	/**
	 * <p>
	 * Name: createNavigator
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)Lnet/minecraft/pathfinding/PathNavigate;]
	 * </p>
	 */
	public static McObfPair func_175447_b = McMappingDatabase.getSRG("EntityParrot.func_175447_b");

	/**
	 * <p>
	 * Name: createChild
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;]
	 * </p>
	 */
	public static McObfPair func_90011_a = McMappingDatabase.getSRG("EntityParrot.func_90011_a");

	/**
	 * <p>
	 * Name: processInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184645_a = McMappingDatabase.getSRG("EntityParrot.func_184645_a");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityParrot.func_184651_r");

	/**
	 * <p>
	 * Name: isBreedingItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_70877_b = McMappingDatabase.getSRG("EntityParrot.func_70877_b");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityParrot.func_70014_b");

	/**
	 * <p>
	 * Name: getCanSpawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70601_bi = McMappingDatabase.getSRG("EntityParrot.func_70601_bi");

	/**
	 * <p>
	 * Name: updateFallState
	 * </p>
	 * <p>
	 * Desc: [(DZLnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184231_a = McMappingDatabase.getSRG("EntityParrot.func_184231_a");

	/**
	 * <p>
	 * Name: flapping
	 * </p>
	 */
	public static McObfPair field_192012_bF = McMappingDatabase.getSRG("field_192012_bF");

	/**
	 * <p>
	 * Name: collideWithEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_82167_n = McMappingDatabase.getSRG("EntityParrot.func_82167_n");

	/**
	 * <p>
	 * Name: DEADLY_ITEM
	 * </p>
	 */
	public static McObfPair field_192015_bI = McMappingDatabase.getSRG("field_192015_bI");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityParrot.func_110147_ax");

	/**
	 * <p>
	 * Name: playAmbientSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_192005_a = McMappingDatabase.getSRG("EntityParrot.func_192005_a");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityParrot.func_184639_G");

	/**
	 * <p>
	 * Name: oFlapSpeed
	 * </p>
	 */
	public static McObfPair field_192010_bD = McMappingDatabase.getSRG("field_192010_bD");

	/**
	 * <p>
	 * Name: CAN_MIMIC
	 * </p>
	 */
	public static McObfPair field_192014_bH = McMappingDatabase.getSRG("field_192014_bH");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityParrot.func_184601_bQ");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityParrot.func_184615_bR");

	/**
	 * <p>
	 * Name: playFlySound
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_191954_d = McMappingDatabase.getSRG("EntityParrot.func_191954_d");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityParrot.func_70636_d");

	/**
	 * <p>
	 * Name: getPitch
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)F]
	 * </p>
	 */
	public static McObfPair func_192000_b = McMappingDatabase.getSRG("EntityParrot.func_192000_b");

	/**
	 * <p>
	 * Name: calculateFlapping
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192001_dv = McMappingDatabase.getSRG("EntityParrot.func_192001_dv");

	/**
	 * <p>
	 * Name: setVariant
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_191997_m = McMappingDatabase.getSRG("EntityParrot.func_191997_m");

	/**
	 * <p>
	 * Name: flap
	 * </p>
	 */
	public static McObfPair field_192008_bB = McMappingDatabase.getSRG("field_192008_bB");

	/**
	 * <p>
	 * Name: canBePushed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70104_M = McMappingDatabase.getSRG("EntityParrot.func_70104_M");

	/**
	 * <p>
	 * Name: getVariant
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_191998_ds = McMappingDatabase.getSRG("EntityParrot.func_191998_ds");

	/**
	 * <p>
	 * Name: isFlying
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192002_a = McMappingDatabase.getSRG("EntityParrot.func_192002_a");

	/**
	 * <p>
	 * Name: IMITATION_SOUND_EVENTS
	 * </p>
	 */
	public static McObfPair field_192017_bK = McMappingDatabase.getSRG("field_192017_bK");

	/**
	 * <p>
	 * Name: setPartying
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Z)V]
	 * </p>
	 */
	public static McObfPair func_191987_a = McMappingDatabase.getSRG("EntityParrot.func_191987_a");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityParrot.func_184647_J");

	/**
	 * <p>
	 * Name: isPartying
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192004_dr = McMappingDatabase.getSRG("EntityParrot.func_192004_dr");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityParrot.func_70088_a");

	/**
	 * <p>
	 * Name: canMateWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityAnimal;)Z]
	 * </p>
	 */
	public static McObfPair func_70878_b = McMappingDatabase.getSRG("EntityParrot.func_70878_b");

	/**
	 * <p>
	 * Name: TAME_ITEMS
	 * </p>
	 */
	public static McObfPair field_192016_bJ = McMappingDatabase.getSRG("field_192016_bJ");

	/**
	 * <p>
	 * Name: oFlap
	 * </p>
	 */
	public static McObfPair field_192011_bE = McMappingDatabase.getSRG("field_192011_bE");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_192003_a = McMappingDatabase.getSRG("EntityParrot.func_192003_a");

	/**
	 * <p>
	 * Name: attackEntityAsMob
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_70652_k = McMappingDatabase.getSRG("EntityParrot.func_70652_k");

	/**
	 * <p>
	 * Name: playMimicSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_192006_b = McMappingDatabase.getSRG("EntityParrot.func_192006_b");

	/**
	 * <p>
	 * Name: partyParrot
	 * </p>
	 */
	public static McObfPair field_192018_bL = McMappingDatabase.getSRG("field_192018_bL");

}

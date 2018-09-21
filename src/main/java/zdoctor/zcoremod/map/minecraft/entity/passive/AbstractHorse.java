package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AbstractHorse {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aao";
		else
			return "net/minecraft/entity/passive/AbstractHorse";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aao";
		else
			return "AbstractHorse";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laao;";
		else
			return "Lnet/minecraft/entity/passive/AbstractHorse;";
	}

	/**
	 * <p>
	 * Name: moveTail
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110210_cH = McMappingDatabase.getSRG("AbstractHorse.func_110210_cH");

	/**
	 * <p>
	 * Name: onLeashDistance
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_142017_o = McMappingDatabase.getSRG("AbstractHorse.func_142017_o");

	/**
	 * <p>
	 * Name: onDeath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_70645_a = McMappingDatabase.getSRG("AbstractHorse.func_70645_a");

	/**
	 * <p>
	 * Name: horseChest
	 * </p>
	 */
	public static McObfPair field_110296_bG = McMappingDatabase.getSRG("field_110296_bG");

	/**
	 * <p>
	 * Name: getHorseWatchableBoolean
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_110233_w = McMappingDatabase.getSRG("AbstractHorse.func_110233_w");

	/**
	 * <p>
	 * Name: followMother
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190679_dD = McMappingDatabase.getSRG("AbstractHorse.func_190679_dD");

	/**
	 * <p>
	 * Name: isTame
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110248_bS = McMappingDatabase.getSRG("AbstractHorse.func_110248_bS");

	/**
	 * <p>
	 * Name: updateHorseSlots
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110232_cE = McMappingDatabase.getSRG("AbstractHorse.func_110232_cE");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("AbstractHorse.func_70636_d");

	/**
	 * <p>
	 * Name: prevHeadLean
	 * </p>
	 */
	public static McObfPair field_110284_bK = McMappingDatabase.getSRG("field_110284_bK");

	/**
	 * <p>
	 * Name: getClosestHorse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;D)Lnet/minecraft/entity/passive/AbstractHorse;]
	 * </p>
	 */
	public static McObfPair func_110250_a = McMappingDatabase.getSRG("AbstractHorse.func_110250_a");

	/**
	 * <p>
	 * Name: canJump
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184776_b = McMappingDatabase.getSRG("AbstractHorse.func_184776_b");

	/**
	 * <p>
	 * Name: getTemper
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110252_cg = McMappingDatabase.getSRG("AbstractHorse.func_110252_cg");

	/**
	 * <p>
	 * Name: getHorseSize
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_110254_bY = McMappingDatabase.getSRG("AbstractHorse.func_110254_bY");

	/**
	 * <p>
	 * Name: getHorseJumpStrength
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_110215_cj = McMappingDatabase.getSRG("AbstractHorse.func_110215_cj");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("AbstractHorse.func_70097_a");

	/**
	 * <p>
	 * Name: getTalkInterval
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70627_aG = McMappingDatabase.getSRG("AbstractHorse.func_70627_aG");

	/**
	 * <p>
	 * Name: tailCounter
	 * </p>
	 */
	public static McObfPair field_110278_bp = McMappingDatabase.getSRG("field_110278_bp");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("AbstractHorse.func_180482_a");

	/**
	 * <p>
	 * Name: isEatingHaystack
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110204_cc = McMappingDatabase.getSRG("AbstractHorse.func_110204_cc");

	/**
	 * <p>
	 * Name: canGallop
	 * </p>
	 */
	public static McObfPair field_190688_bE = McMappingDatabase.getSRG("field_190688_bE");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("AbstractHorse.func_110147_ax");

	/**
	 * <p>
	 * Name: horseJumping
	 * </p>
	 */
	public static McObfPair field_110275_br = McMappingDatabase.getSRG("field_110275_br");

	/**
	 * <p>
	 * Name: setHorseTamed
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_110234_j = McMappingDatabase.getSRG("AbstractHorse.func_110234_j");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("AbstractHorse.func_184601_bQ");

	/**
	 * <p>
	 * Name: sprintCounter
	 * </p>
	 */
	public static McObfPair field_110279_bq = McMappingDatabase.getSRG("field_110279_bq");

	/**
	 * <p>
	 * Name: canBePushed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70104_M = McMappingDatabase.getSRG("AbstractHorse.func_70104_M");

	/**
	 * <p>
	 * Name: canBeSteered
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82171_bF = McMappingDatabase.getSRG("AbstractHorse.func_82171_bF");

	/**
	 * <p>
	 * Name: getSoundVolume
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70599_aP = McMappingDatabase.getSRG("AbstractHorse.func_70599_aP");

	/**
	 * <p>
	 * Name: playGallopSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/SoundType;)V]
	 * </p>
	 */
	public static McObfPair func_190680_a = McMappingDatabase.getSRG("AbstractHorse.func_190680_a");

	/**
	 * <p>
	 * Name: getRearingAmount
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_110223_p = McMappingDatabase.getSRG("AbstractHorse.func_110223_p");

	/**
	 * <p>
	 * Name: headLean
	 * </p>
	 */
	public static McObfPair field_110283_bJ = McMappingDatabase.getSRG("field_110283_bJ");

	/**
	 * <p>
	 * Name: setTamedBy
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_110263_g = McMappingDatabase.getSRG("AbstractHorse.func_110263_g");

	/**
	 * <p>
	 * Name: setOffspringAttributes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityAgeable;Lnet/minecraft/entity/passive/AbstractHorse;)V]
	 * </p>
	 */
	public static McObfPair func_190681_a = McMappingDatabase.getSRG("AbstractHorse.func_190681_a");

	/**
	 * <p>
	 * Name: isHorseSaddled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110257_ck = McMappingDatabase.getSRG("AbstractHorse.func_110257_ck");

	/**
	 * <p>
	 * Name: setHorseWatchableBoolean
	 * </p>
	 * <p>
	 * Desc: [(IZ)V]
	 * </p>
	 */
	public static McObfPair func_110208_b = McMappingDatabase.getSRG("AbstractHorse.func_110208_b");

	/**
	 * <p>
	 * Name: prevMouthOpenness
	 * </p>
	 */
	public static McObfPair field_110288_bO = McMappingDatabase.getSRG("field_110288_bO");

	/**
	 * <p>
	 * Name: isArmor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_190682_f = McMappingDatabase.getSRG("AbstractHorse.func_190682_f");

	/**
	 * <p>
	 * Name: setRearing
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_110219_q = McMappingDatabase.getSRG("AbstractHorse.func_110219_q");

	/**
	 * <p>
	 * Name: getModifiedMaxHealth
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_110267_cL = McMappingDatabase.getSRG("AbstractHorse.func_110267_cL");

	/**
	 * <p>
	 * Name: initHorseChest
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110226_cD = McMappingDatabase.getSRG("AbstractHorse.func_110226_cD");

	/**
	 * <p>
	 * Name: isBreeding
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110205_ce = McMappingDatabase.getSRG("AbstractHorse.func_110205_ce");

	/**
	 * <p>
	 * Name: setTemper
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_110238_s = McMappingDatabase.getSRG("AbstractHorse.func_110238_s");

	/**
	 * <p>
	 * Name: isMovementBlocked
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70610_aX = McMappingDatabase.getSRG("AbstractHorse.func_70610_aX");

	/**
	 * <p>
	 * Name: rearingAmount
	 * </p>
	 */
	public static McObfPair field_110281_bL = McMappingDatabase.getSRG("field_110281_bL");

	/**
	 * <p>
	 * Name: STATUS
	 * </p>
	 */
	public static McObfPair field_184787_bE = McMappingDatabase.getSRG("field_184787_bE");

	/**
	 * <p>
	 * Name: getAngrySound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184785_dv = McMappingDatabase.getSRG("AbstractHorse.func_184785_dv");

	/**
	 * <p>
	 * Name: playStepSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_180429_a = McMappingDatabase.getSRG("AbstractHorse.func_180429_a");

	/**
	 * <p>
	 * Name: setOwnerUniqueId
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)V]
	 * </p>
	 */
	public static McObfPair func_184779_b = McMappingDatabase.getSRG("AbstractHorse.func_184779_b");

	/**
	 * <p>
	 * Name: mountTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_110237_h = McMappingDatabase.getSRG("AbstractHorse.func_110237_h");

	/**
	 * <p>
	 * Name: setScaleForAge
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_98054_a = McMappingDatabase.getSRG("AbstractHorse.func_98054_a");

	/**
	 * <p>
	 * Name: isOnLadder
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70617_f_ = McMappingDatabase.getSRG("AbstractHorse.func_70617_f_");

	/**
	 * <p>
	 * Name: getModifiedJumpStrength
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_110245_cM = McMappingDatabase.getSRG("AbstractHorse.func_110245_cM");

	/**
	 * <p>
	 * Name: getInventorySize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190686_di = McMappingDatabase.getSRG("AbstractHorse.func_190686_di");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("AbstractHorse.func_70037_a");

	/**
	 * <p>
	 * Name: isRearing
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110209_cd = McMappingDatabase.getSRG("AbstractHorse.func_110209_cd");

	/**
	 * <p>
	 * Name: createChild
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;]
	 * </p>
	 */
	public static McObfPair func_90011_a = McMappingDatabase.getSRG("AbstractHorse.func_90011_a");

	/**
	 * <p>
	 * Name: JUMP_STRENGTH
	 * </p>
	 */
	public static McObfPair field_110271_bv = McMappingDatabase.getSRG("field_110271_bv");

	/**
	 * <p>
	 * Name: onInventoryChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_76316_a = McMappingDatabase.getSRG("AbstractHorse.func_76316_a");

	/**
	 * <p>
	 * Name: allowStandSliding
	 * </p>
	 */
	public static McObfPair field_110294_bI = McMappingDatabase.getSRG("field_110294_bI");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("AbstractHorse.func_184639_G");

	/**
	 * <p>
	 * Name: openGUI
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_110199_f = McMappingDatabase.getSRG("AbstractHorse.func_110199_f");

	/**
	 * <p>
	 * Name: isHorseJumping
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110246_bZ = McMappingDatabase.getSRG("AbstractHorse.func_110246_bZ");

	/**
	 * <p>
	 * Name: canBeSaddled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190685_dA = McMappingDatabase.getSRG("AbstractHorse.func_190685_dA");

	/**
	 * <p>
	 * Name: setHorseSaddled
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_110251_o = McMappingDatabase.getSRG("AbstractHorse.func_110251_o");

	/**
	 * <p>
	 * Name: getGrassEatingAmount
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_110258_o = McMappingDatabase.getSRG("AbstractHorse.func_110258_o");

	/**
	 * <p>
	 * Name: eatingCounter
	 * </p>
	 */
	public static McObfPair field_190689_bJ = McMappingDatabase.getSRG("field_190689_bJ");

	/**
	 * <p>
	 * Name: prevRearingAmount
	 * </p>
	 */
	public static McObfPair field_110282_bM = McMappingDatabase.getSRG("field_110282_bM");

	/**
	 * <p>
	 * Name: eatingHorse
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110266_cB = McMappingDatabase.getSRG("AbstractHorse.func_110266_cB");

	/**
	 * <p>
	 * Name: updatePassenger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_184232_k = McMappingDatabase.getSRG("AbstractHorse.func_184232_k");

	/**
	 * <p>
	 * Name: canMateWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityAnimal;)Z]
	 * </p>
	 */
	public static McObfPair func_70878_b = McMappingDatabase.getSRG("AbstractHorse.func_70878_b");

	/**
	 * <p>
	 * Name: handleEating
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_190678_b = McMappingDatabase.getSRG("AbstractHorse.func_190678_b");

	/**
	 * <p>
	 * Name: temper
	 * </p>
	 */
	public static McObfPair field_110274_bs = McMappingDatabase.getSRG("field_110274_bs");

	/**
	 * <p>
	 * Name: isBreedingItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_70877_b = McMappingDatabase.getSRG("AbstractHorse.func_70877_b");

	/**
	 * <p>
	 * Name: getMouthOpennessAngle
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_110201_q = McMappingDatabase.getSRG("AbstractHorse.func_110201_q");

	/**
	 * <p>
	 * Name: setHorseJumping
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_110255_k = McMappingDatabase.getSRG("AbstractHorse.func_110255_k");

	/**
	 * <p>
	 * Name: gallopTime
	 * </p>
	 */
	public static McObfPair field_110285_bP = McMappingDatabase.getSRG("field_110285_bP");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("AbstractHorse.func_184651_r");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("AbstractHorse.func_70071_h_");

	/**
	 * <p>
	 * Name: jumpRearingCounter
	 * </p>
	 */
	public static McObfPair field_110295_bF = McMappingDatabase.getSRG("field_110295_bF");

	/**
	 * <p>
	 * Name: handleStartJump
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_184775_b = McMappingDatabase.getSRG("AbstractHorse.func_184775_b");

	/**
	 * <p>
	 * Name: wearsArmor
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190677_dK = McMappingDatabase.getSRG("AbstractHorse.func_190677_dK");

	/**
	 * <p>
	 * Name: getMaxSpawnedInChunk
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70641_bl = McMappingDatabase.getSRG("AbstractHorse.func_70641_bl");

	/**
	 * <p>
	 * Name: getOwnerUniqueId
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_184780_dh = McMappingDatabase.getSRG("AbstractHorse.func_184780_dh");

	/**
	 * <p>
	 * Name: replaceItemInInventory
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_174820_d = McMappingDatabase.getSRG("AbstractHorse.func_174820_d");

	/**
	 * <p>
	 * Name: spawnHorseParticles
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_110216_r = McMappingDatabase.getSRG("AbstractHorse.func_110216_r");

	/**
	 * <p>
	 * Name: canBeLeashedTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_184652_a = McMappingDatabase.getSRG("AbstractHorse.func_184652_a");

	/**
	 * <p>
	 * Name: getModifiedMovementSpeed
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_110203_cN = McMappingDatabase.getSRG("AbstractHorse.func_110203_cN");

	/**
	 * <p>
	 * Name: OWNER_UNIQUE_ID
	 * </p>
	 */
	public static McObfPair field_184790_bH = McMappingDatabase.getSRG("field_184790_bH");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("AbstractHorse.func_70047_e");

	/**
	 * <p>
	 * Name: openMouthCounter
	 * </p>
	 */
	public static McObfPair field_110290_bE = McMappingDatabase.getSRG("field_110290_bE");

	/**
	 * <p>
	 * Name: getControllingPassenger
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_184179_bs = McMappingDatabase.getSRG("AbstractHorse.func_184179_bs");

	/**
	 * <p>
	 * Name: setEatingHaystack
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_110227_p = McMappingDatabase.getSRG("AbstractHorse.func_110227_p");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("AbstractHorse.func_184615_bR");

	/**
	 * <p>
	 * Name: mouthOpenness
	 * </p>
	 */
	public static McObfPair field_110287_bN = McMappingDatabase.getSRG("field_110287_bN");

	/**
	 * <p>
	 * Name: canMate
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110200_cJ = McMappingDatabase.getSRG("AbstractHorse.func_110200_cJ");

	/**
	 * <p>
	 * Name: makeMad
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190687_dF = McMappingDatabase.getSRG("AbstractHorse.func_190687_dF");

	/**
	 * <p>
	 * Name: jumpPower
	 * </p>
	 */
	public static McObfPair field_110277_bt = McMappingDatabase.getSRG("field_110277_bt");

	/**
	 * <p>
	 * Name: travel
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_191986_a = McMappingDatabase.getSRG("AbstractHorse.func_191986_a");

	/**
	 * <p>
	 * Name: getMaxTemper
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190676_dC = McMappingDatabase.getSRG("AbstractHorse.func_190676_dC");

	/**
	 * <p>
	 * Name: canEatGrass
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190684_dE = McMappingDatabase.getSRG("AbstractHorse.func_190684_dE");

	/**
	 * <p>
	 * Name: setJumpPower
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_110206_u = McMappingDatabase.getSRG("AbstractHorse.func_110206_u");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("AbstractHorse.func_70103_a");

	/**
	 * <p>
	 * Name: registerFixesAbstractHorse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;Ljava/lang/Class;)V]
	 * </p>
	 */
	public static McObfPair func_190683_c = McMappingDatabase.getSRG("AbstractHorse.func_190683_c");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("AbstractHorse.func_70088_a");

	/**
	 * <p>
	 * Name: handleStopJump
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184777_r_ = McMappingDatabase.getSRG("AbstractHorse.func_184777_r_");

	/**
	 * <p>
	 * Name: fall
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_180430_e = McMappingDatabase.getSRG("AbstractHorse.func_180430_e");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("AbstractHorse.func_70014_b");

	/**
	 * <p>
	 * Name: openHorseMouth
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110249_cI = McMappingDatabase.getSRG("AbstractHorse.func_110249_cI");

	/**
	 * <p>
	 * Name: IS_HORSE_BREEDING
	 * </p>
	 */
	public static McObfPair field_110276_bu = McMappingDatabase.getSRG("field_110276_bu");

	/**
	 * <p>
	 * Name: increaseTemper
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_110198_t = McMappingDatabase.getSRG("AbstractHorse.func_110198_t");

	/**
	 * <p>
	 * Name: makeHorseRear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110220_cK = McMappingDatabase.getSRG("AbstractHorse.func_110220_cK");

	/**
	 * <p>
	 * Name: setBreeding
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_110242_l = McMappingDatabase.getSRG("AbstractHorse.func_110242_l");

}

package zdoctor.zcoremod.map.minecraft.entity.boss;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityDragon {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abd";
		else
			return "net/minecraft/entity/boss/EntityDragon";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abd";
		else
			return "EntityDragon";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labd;";
		else
			return "Lnet/minecraft/entity/boss/EntityDragon;";
	}

	/**
	 * <p>
	 * Name: sittingDamageReceived
	 * </p>
	 */
	public static McObfPair field_184679_bL = McMappingDatabase.getSRG("field_184679_bL");

	/**
	 * <p>
	 * Name: dragonPartTail1
	 * </p>
	 */
	public static McObfPair field_70985_j = McMappingDatabase.getSRG("field_70985_j");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityDragon.func_70097_a");

	/**
	 * <p>
	 * Name: attackEntityFromPart
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/MultiPartEntityPart;Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70965_a = McMappingDatabase.getSRG("EntityDragon.func_70965_a");

	/**
	 * <p>
	 * Name: addPotionEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;)V]
	 * </p>
	 */
	public static McObfPair func_70690_d = McMappingDatabase.getSRG("EntityDragon.func_70690_d");

	/**
	 * <p>
	 * Name: getPhaseManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/boss/dragon/phase/PhaseManager;]
	 * </p>
	 */
	public static McObfPair func_184670_cT = McMappingDatabase.getSRG("EntityDragon.func_184670_cT");

	/**
	 * <p>
	 * Name: simplifyAngle
	 * </p>
	 * <p>
	 * Desc: [(D)F]
	 * </p>
	 */
	public static McObfPair func_70973_b = McMappingDatabase.getSRG("EntityDragon.func_70973_b");

	/**
	 * <p>
	 * Name: onDeathUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70609_aI = McMappingDatabase.getSRG("EntityDragon.func_70609_aI");

	/**
	 * <p>
	 * Name: ringBuffer
	 * </p>
	 */
	public static McObfPair field_70979_e = McMappingDatabase.getSRG("field_70979_e");

	/**
	 * <p>
	 * Name: pathPoints
	 * </p>
	 */
	public static McObfPair field_184680_bM = McMappingDatabase.getSRG("field_184680_bM");

	/**
	 * <p>
	 * Name: getParts
	 * </p>
	 * <p>
	 * Desc: [()[Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_70021_al = McMappingDatabase.getSRG("EntityDragon.func_70021_al");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityDragon.func_184639_G");

	/**
	 * <p>
	 * Name: attackEntitiesInList
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_70971_b = McMappingDatabase.getSRG("EntityDragon.func_70971_b");

	/**
	 * <p>
	 * Name: dragonPartTail3
	 * </p>
	 */
	public static McObfPair field_70982_bz = McMappingDatabase.getSRG("field_70982_bz");

	/**
	 * <p>
	 * Name: findPath
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/pathfinding/PathPoint;)Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_184666_a = McMappingDatabase.getSRG("EntityDragon.func_184666_a");

	/**
	 * <p>
	 * Name: attackDragonFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_82195_e = McMappingDatabase.getSRG("EntityDragon.func_82195_e");

	/**
	 * <p>
	 * Name: getHeadYOffset
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_184662_q = McMappingDatabase.getSRG("EntityDragon.func_184662_q");

	/**
	 * <p>
	 * Name: dropExperience
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_184668_a = McMappingDatabase.getSRG("EntityDragon.func_184668_a");

	/**
	 * <p>
	 * Name: makePath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/pathfinding/PathPoint;Lnet/minecraft/pathfinding/PathPoint;)Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_184669_a = McMappingDatabase.getSRG("EntityDragon.func_184669_a");

	/**
	 * <p>
	 * Name: getMovementOffsets
	 * </p>
	 * <p>
	 * Desc: [(IF)[D]
	 * </p>
	 */
	public static McObfPair func_70974_a = McMappingDatabase.getSRG("EntityDragon.func_70974_a");

	/**
	 * <p>
	 * Name: getNearestPpIdx
	 * </p>
	 * <p>
	 * Desc: [(DDD)I]
	 * </p>
	 */
	public static McObfPair func_184663_l = McMappingDatabase.getSRG("EntityDragon.func_184663_l");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityDragon.func_184647_J");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityDragon.func_70014_b");

	/**
	 * <p>
	 * Name: collideWithEntities
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_70970_a = McMappingDatabase.getSRG("EntityDragon.func_70970_a");

	/**
	 * <p>
	 * Name: onKillCommand
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174812_G = McMappingDatabase.getSRG("EntityDragon.func_174812_G");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_184675_bH = McMappingDatabase.getSRG("field_184675_bH");

	/**
	 * <p>
	 * Name: isNonBoss
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184222_aU = McMappingDatabase.getSRG("EntityDragon.func_184222_aU");

	/**
	 * <p>
	 * Name: despawnEntity
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70623_bb = McMappingDatabase.getSRG("EntityDragon.func_70623_bb");

	/**
	 * <p>
	 * Name: dragonPartHead
	 * </p>
	 */
	public static McObfPair field_70986_h = McMappingDatabase.getSRG("field_70986_h");

	/**
	 * <p>
	 * Name: canBeCollidedWith
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70067_L = McMappingDatabase.getSRG("EntityDragon.func_70067_L");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityDragon.func_70088_a");

	/**
	 * <p>
	 * Name: deathTicks
	 * </p>
	 */
	public static McObfPair field_70995_bG = McMappingDatabase.getSRG("field_70995_bG");

	/**
	 * <p>
	 * Name: growlTime
	 * </p>
	 */
	public static McObfPair field_184678_bK = McMappingDatabase.getSRG("field_184678_bK");

	/**
	 * <p>
	 * Name: getSoundVolume
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70599_aP = McMappingDatabase.getSRG("EntityDragon.func_70599_aP");

	/**
	 * <p>
	 * Name: healingEnderCrystal
	 * </p>
	 */
	public static McObfPair field_70992_bH = McMappingDatabase.getSRG("field_70992_bH");

	/**
	 * <p>
	 * Name: prevAnimTime
	 * </p>
	 */
	public static McObfPair field_70991_bC = McMappingDatabase.getSRG("field_70991_bC");

	/**
	 * <p>
	 * Name: animTime
	 * </p>
	 */
	public static McObfPair field_70988_bD = McMappingDatabase.getSRG("field_70988_bD");

	/**
	 * <p>
	 * Name: initPathPoints
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184671_o = McMappingDatabase.getSRG("EntityDragon.func_184671_o");

	/**
	 * <p>
	 * Name: phaseManager
	 * </p>
	 */
	public static McObfPair field_184677_bJ = McMappingDatabase.getSRG("field_184677_bJ");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityDragon.func_184601_bQ");

	/**
	 * <p>
	 * Name: getSoundCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundCategory;]
	 * </p>
	 */
	public static McObfPair func_184176_by = McMappingDatabase.getSRG("EntityDragon.func_184176_by");

	/**
	 * <p>
	 * Name: dragonPartArray
	 * </p>
	 */
	public static McObfPair field_70977_g = McMappingDatabase.getSRG("field_70977_g");

	/**
	 * <p>
	 * Name: dragonPartWing2
	 * </p>
	 */
	public static McObfPair field_70990_bB = McMappingDatabase.getSRG("field_70990_bB");

	/**
	 * <p>
	 * Name: ringBufferIndex
	 * </p>
	 */
	public static McObfPair field_70976_f = McMappingDatabase.getSRG("field_70976_f");

	/**
	 * <p>
	 * Name: dragonPartNeck
	 * </p>
	 */
	public static McObfPair field_184673_bv = McMappingDatabase.getSRG("field_184673_bv");

	/**
	 * <p>
	 * Name: getWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_82194_d = McMappingDatabase.getSRG("EntityDragon.func_82194_d");

	/**
	 * <p>
	 * Name: slowed
	 * </p>
	 */
	public static McObfPair field_70994_bF = McMappingDatabase.getSRG("field_70994_bF");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityDragon.func_110147_ax");

	/**
	 * <p>
	 * Name: registerFixesDragon
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189755_b = McMappingDatabase.getSRG("EntityDragon.func_189755_b");

	/**
	 * <p>
	 * Name: dragonPartBody
	 * </p>
	 */
	public static McObfPair field_70987_i = McMappingDatabase.getSRG("field_70987_i");

	/**
	 * <p>
	 * Name: PHASE
	 * </p>
	 */
	public static McObfPair field_184674_a = McMappingDatabase.getSRG("field_184674_a");

	/**
	 * <p>
	 * Name: getHeadPartYOffset
	 * </p>
	 * <p>
	 * Desc: [(I[D[D)F]
	 * </p>
	 */
	public static McObfPair func_184667_a = McMappingDatabase.getSRG("EntityDragon.func_184667_a");

	/**
	 * <p>
	 * Name: dragonPartWing1
	 * </p>
	 */
	public static McObfPair field_70983_bA = McMappingDatabase.getSRG("field_70983_bA");

	/**
	 * <p>
	 * Name: updateDragonEnderCrystal
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70969_j = McMappingDatabase.getSRG("EntityDragon.func_70969_j");

	/**
	 * <p>
	 * Name: destroyBlocksInAABB
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;)Z]
	 * </p>
	 */
	public static McObfPair func_70972_a = McMappingDatabase.getSRG("EntityDragon.func_70972_a");

	/**
	 * <p>
	 * Name: getHeadLookVec
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_184665_a = McMappingDatabase.getSRG("EntityDragon.func_184665_a");

	/**
	 * <p>
	 * Name: pathFindQueue
	 * </p>
	 */
	public static McObfPair field_184682_bO = McMappingDatabase.getSRG("field_184682_bO");

	/**
	 * <p>
	 * Name: getFightManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/end/DragonFightManager;]
	 * </p>
	 */
	public static McObfPair func_184664_cU = McMappingDatabase.getSRG("EntityDragon.func_184664_cU");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("EntityDragon.func_184206_a");

	/**
	 * <p>
	 * Name: fightManager
	 * </p>
	 */
	public static McObfPair field_184676_bI = McMappingDatabase.getSRG("field_184676_bI");

	/**
	 * <p>
	 * Name: dragonPartTail2
	 * </p>
	 */
	public static McObfPair field_70984_by = McMappingDatabase.getSRG("field_70984_by");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityDragon.func_70037_a");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityDragon.func_70636_d");

	/**
	 * <p>
	 * Name: neighbors
	 * </p>
	 */
	public static McObfPair field_184681_bN = McMappingDatabase.getSRG("field_184681_bN");

	/**
	 * <p>
	 * Name: canBeRidden
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_184228_n = McMappingDatabase.getSRG("EntityDragon.func_184228_n");

	/**
	 * <p>
	 * Name: onCrystalDestroyed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityEnderCrystal;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_184672_a = McMappingDatabase.getSRG("EntityDragon.func_184672_a");

}

package zdoctor.zcoremod.map.minecraft.entity.player;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPlayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aed";
		else
			return "net/minecraft/entity/player/EntityPlayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aed";
		else
			return "EntityPlayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laed;";
		else
			return "Lnet/minecraft/entity/player/EntityPlayer;";
	}

	/**
	 * <p>
	 * Name: addExperience
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_71023_q = McMappingDatabase.getSRG("EntityPlayer.func_71023_q");

	/**
	 * <p>
	 * Name: getItemStackFromSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184582_a = McMappingDatabase.getSRG("EntityPlayer.func_184582_a");

	/**
	 * <p>
	 * Name: renderOffsetZ
	 * </p>
	 */
	public static McObfPair field_71089_bV = McMappingDatabase.getSRG("field_71089_bV");

	/**
	 * <p>
	 * Name: displayGUIChest
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_71007_a = McMappingDatabase.getSRG("EntityPlayer.func_71007_a");

	/**
	 * <p>
	 * Name: playShoulderEntityAmbientSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_192028_j = McMappingDatabase.getSRG("EntityPlayer.func_192028_j");

	/**
	 * <p>
	 * Name: isUser
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175144_cb = McMappingDatabase.getSRG("EntityPlayer.func_175144_cb");

	/**
	 * <p>
	 * Name: addItemStackToInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_191521_c = McMappingDatabase.getSRG("EntityPlayer.func_191521_c");

	/**
	 * <p>
	 * Name: isPushedByWater
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_96092_aw = McMappingDatabase.getSRG("EntityPlayer.func_96092_aw");

	/**
	 * <p>
	 * Name: preparePlayerToSpawn
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70065_x = McMappingDatabase.getSRG("EntityPlayer.func_70065_x");

	/**
	 * <p>
	 * Name: getFallSound
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184588_d = McMappingDatabase.getSRG("EntityPlayer.func_184588_d");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityPlayer.func_184601_bQ");

	/**
	 * <p>
	 * Name: unlockRecipes
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/util/ResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_193102_a = McMappingDatabase.getSRG("EntityPlayer.func_193102_a");

	/**
	 * <p>
	 * Name: PLAYER_SCORE
	 * </p>
	 */
	public static McObfPair field_184830_b = McMappingDatabase.getSRG("field_184830_b");

	/**
	 * <p>
	 * Name: experienceTotal
	 * </p>
	 */
	public static McObfPair field_71067_cb = McMappingDatabase.getSRG("field_71067_cb");

	/**
	 * <p>
	 * Name: addShoulderEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Z]
	 * </p>
	 */
	public static McObfPair func_192027_g = McMappingDatabase.getSRG("EntityPlayer.func_192027_g");

	/**
	 * <p>
	 * Name: getAbsorptionAmount
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_110139_bj = McMappingDatabase.getSRG("EntityPlayer.func_110139_bj");

	/**
	 * <p>
	 * Name: trySleep
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/entity/player/EntityPlayer$SleepResult;]
	 * </p>
	 */
	public static McObfPair func_180469_a = McMappingDatabase.getSRG("EntityPlayer.func_180469_a");

	/**
	 * <p>
	 * Name: createCooldownTracker
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/CooldownTracker;]
	 * </p>
	 */
	public static McObfPair func_184815_l = McMappingDatabase.getSRG("EntityPlayer.func_184815_l");

	/**
	 * <p>
	 * Name: sendStatusMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;Z)V]
	 * </p>
	 */
	public static McObfPair func_146105_b = McMappingDatabase.getSRG("EntityPlayer.func_146105_b");

	/**
	 * <p>
	 * Name: canTriggerWalking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70041_e_ = McMappingDatabase.getSRG("EntityPlayer.func_70041_e_");

	/**
	 * <p>
	 * Name: sendCommandFeedback
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174792_t_ = McMappingDatabase.getSRG("EntityPlayer.func_174792_t_");

	/**
	 * <p>
	 * Name: dropItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;]
	 * </p>
	 */
	public static McObfPair func_146097_a = McMappingDatabase.getSRG("EntityPlayer.func_146097_a");

	/**
	 * <p>
	 * Name: RIGHT_SHOULDER_ENTITY
	 * </p>
	 */
	public static McObfPair field_192033_bu = McMappingDatabase.getSRG("field_192033_bu");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("EntityPlayer.func_70005_c_");

	/**
	 * <p>
	 * Name: prevChasingPosZ
	 * </p>
	 */
	public static McObfPair field_71097_bO = McMappingDatabase.getSRG("field_71097_bO");

	/**
	 * <p>
	 * Name: getOfflineUUID
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_175147_b = McMappingDatabase.getSRG("EntityPlayer.func_175147_b");

	/**
	 * <p>
	 * Name: getWorldScoreboard
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/Scoreboard;]
	 * </p>
	 */
	public static McObfPair func_96123_co = McMappingDatabase.getSRG("EntityPlayer.func_96123_co");

	/**
	 * <p>
	 * Name: getCooldownPeriod
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_184818_cX = McMappingDatabase.getSRG("EntityPlayer.func_184818_cX");

	/**
	 * <p>
	 * Name: attackTargetEntityWithCurrentItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_71059_n = McMappingDatabase.getSRG("EntityPlayer.func_71059_n");

	/**
	 * <p>
	 * Name: updateSize
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184808_cD = McMappingDatabase.getSRG("EntityPlayer.func_184808_cD");

	/**
	 * <p>
	 * Name: spawnShoulderEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_192026_k = McMappingDatabase.getSRG("EntityPlayer.func_192026_k");

	/**
	 * <p>
	 * Name: foodStats
	 * </p>
	 */
	public static McObfPair field_71100_bB = McMappingDatabase.getSRG("field_71100_bB");

	/**
	 * <p>
	 * Name: addExhaustion
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_71020_j = McMappingDatabase.getSRG("EntityPlayer.func_71020_j");

	/**
	 * <p>
	 * Name: getRightShoulderEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_192025_dl = McMappingDatabase.getSRG("EntityPlayer.func_192025_dl");

	/**
	 * <p>
	 * Name: isEntityInsideOpaqueBlock
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70094_T = McMappingDatabase.getSRG("EntityPlayer.func_70094_T");

	/**
	 * <p>
	 * Name: experienceLevel
	 * </p>
	 */
	public static McObfPair field_71068_ca = McMappingDatabase.getSRG("field_71068_ca");

	/**
	 * <p>
	 * Name: getGameProfile
	 * </p>
	 * <p>
	 * Desc: [()Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_146103_bH = McMappingDatabase.getSRG("EntityPlayer.func_146103_bH");

	/**
	 * <p>
	 * Name: takeStat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/stats/StatBase;)V]
	 * </p>
	 */
	public static McObfPair func_175145_a = McMappingDatabase.getSRG("EntityPlayer.func_175145_a");

	/**
	 * <p>
	 * Name: inventory
	 * </p>
	 */
	public static McObfPair field_71071_by = McMappingDatabase.getSRG("field_71071_by");

	/**
	 * <p>
	 * Name: bedLocation
	 * </p>
	 */
	public static McObfPair field_71081_bT = McMappingDatabase.getSRG("field_71081_bT");

	/**
	 * <p>
	 * Name: getSwimSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184184_Z = McMappingDatabase.getSRG("EntityPlayer.func_184184_Z");

	/**
	 * <p>
	 * Name: cooldownTracker
	 * </p>
	 */
	public static McObfPair field_184832_bU = McMappingDatabase.getSRG("field_184832_bU");

	/**
	 * <p>
	 * Name: setScore
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_85040_s = McMappingDatabase.getSRG("EntityPlayer.func_85040_s");

	/**
	 * <p>
	 * Name: canEat
	 * </p>
	 * <p>
	 * Desc: [(Z)Z]
	 * </p>
	 */
	public static McObfPair func_71043_e = McMappingDatabase.getSRG("EntityPlayer.func_71043_e");

	/**
	 * <p>
	 * Name: getSplashSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184181_aa = McMappingDatabase.getSRG("EntityPlayer.func_184181_aa");

	/**
	 * <p>
	 * Name: displayVillagerTradeGui
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/IMerchant;)V]
	 * </p>
	 */
	public static McObfPair func_180472_a = McMappingDatabase.getSRG("EntityPlayer.func_180472_a");

	/**
	 * <p>
	 * Name: setInWeb
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70110_aj = McMappingDatabase.getSRG("EntityPlayer.func_70110_aj");

	/**
	 * <p>
	 * Name: getScore
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_71037_bA = McMappingDatabase.getSRG("EntityPlayer.func_71037_bA");

	/**
	 * <p>
	 * Name: addMountedMovementStat
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_71015_k = McMappingDatabase.getSRG("EntityPlayer.func_71015_k");

	/**
	 * <p>
	 * Name: hasReducedDebug
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175140_cp = McMappingDatabase.getSRG("EntityPlayer.func_175140_cp");

	/**
	 * <p>
	 * Name: isSpawnForced
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82245_bX = McMappingDatabase.getSRG("EntityPlayer.func_82245_bX");

	/**
	 * <p>
	 * Name: replaceItemInInventory
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_174820_d = McMappingDatabase.getSRG("EntityPlayer.func_174820_d");

	/**
	 * <p>
	 * Name: isInBed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175143_p = McMappingDatabase.getSRG("EntityPlayer.func_175143_p");

	/**
	 * <p>
	 * Name: isAllowEdit
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175142_cm = McMappingDatabase.getSRG("EntityPlayer.func_175142_cm");

	/**
	 * <p>
	 * Name: setLeftShoulderEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_192029_h = McMappingDatabase.getSRG("EntityPlayer.func_192029_h");

	/**
	 * <p>
	 * Name: setPrimaryHand
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumHandSide;)V]
	 * </p>
	 */
	public static McObfPair func_184819_a = McMappingDatabase.getSRG("EntityPlayer.func_184819_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityPlayer.func_70014_b");

	/**
	 * <p>
	 * Name: dropItem
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/entity/item/EntityItem;]
	 * </p>
	 */
	public static McObfPair func_71040_bB = McMappingDatabase.getSRG("EntityPlayer.func_71040_bB");

	/**
	 * <p>
	 * Name: lastXPSound
	 * </p>
	 */
	public static McObfPair field_82249_h = McMappingDatabase.getSRG("field_82249_h");

	/**
	 * <p>
	 * Name: displayGuiCommandBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntityCommandBlock;)V]
	 * </p>
	 */
	public static McObfPair func_184824_a = McMappingDatabase.getSRG("EntityPlayer.func_184824_a");

	/**
	 * <p>
	 * Name: getBedLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180470_cg = McMappingDatabase.getSRG("EntityPlayer.func_180470_cg");

	/**
	 * <p>
	 * Name: isWearing
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EnumPlayerModelParts;)Z]
	 * </p>
	 */
	public static McObfPair func_175148_a = McMappingDatabase.getSRG("EntityPlayer.func_175148_a");

	/**
	 * <p>
	 * Name: dropItemAndGetStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityItem;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184816_a = McMappingDatabase.getSRG("EntityPlayer.func_184816_a");

	/**
	 * <p>
	 * Name: spawnShoulderEntities
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192030_dh = McMappingDatabase.getSRG("EntityPlayer.func_192030_dh");

	/**
	 * <p>
	 * Name: getExperiencePoints
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)I]
	 * </p>
	 */
	public static McObfPair func_70693_a = McMappingDatabase.getSRG("EntityPlayer.func_70693_a");

	/**
	 * <p>
	 * Name: xpCooldown
	 * </p>
	 */
	public static McObfPair field_71090_bL = McMappingDatabase.getSRG("field_71090_bL");

	/**
	 * <p>
	 * Name: damageArmor
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_70675_k = McMappingDatabase.getSRG("EntityPlayer.func_70675_k");

	/**
	 * <p>
	 * Name: onKillEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_70074_a = McMappingDatabase.getSRG("EntityPlayer.func_70074_a");

	/**
	 * <p>
	 * Name: isPlayerFullyAsleep
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71026_bH = McMappingDatabase.getSRG("EntityPlayer.func_71026_bH");

	/**
	 * <p>
	 * Name: canOpen
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/LockCode;)Z]
	 * </p>
	 */
	public static McObfPair func_175146_a = McMappingDatabase.getSRG("EntityPlayer.func_175146_a");

	/**
	 * <p>
	 * Name: gameProfile
	 * </p>
	 */
	public static McObfPair field_146106_i = McMappingDatabase.getSRG("field_146106_i");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityPlayer.func_70047_e");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityPlayer.func_70088_a");

	/**
	 * <p>
	 * Name: isInvisibleToPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_98034_c = McMappingDatabase.getSRG("EntityPlayer.func_98034_c");

	/**
	 * <p>
	 * Name: addScore
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_85039_t = McMappingDatabase.getSRG("EntityPlayer.func_85039_t");

	/**
	 * <p>
	 * Name: canPlayerEdit
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_175151_a = McMappingDatabase.getSRG("EntityPlayer.func_175151_a");

	/**
	 * <p>
	 * Name: flyToggleTimer
	 * </p>
	 */
	public static McObfPair field_71101_bC = McMappingDatabase.getSRG("field_71101_bC");

	/**
	 * <p>
	 * Name: isPlayer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70684_aJ = McMappingDatabase.getSRG("EntityPlayer.func_70684_aJ");

	/**
	 * <p>
	 * Name: sendPlayerAbilities
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71016_p = McMappingDatabase.getSRG("EntityPlayer.func_71016_p");

	/**
	 * <p>
	 * Name: enderChest
	 * </p>
	 */
	public static McObfPair field_71078_a = McMappingDatabase.getSRG("field_71078_a");

	/**
	 * <p>
	 * Name: sleepTimer
	 * </p>
	 */
	public static McObfPair field_71076_b = McMappingDatabase.getSRG("field_71076_b");

	/**
	 * <p>
	 * Name: chasingPosY
	 * </p>
	 */
	public static McObfPair field_71095_bQ = McMappingDatabase.getSRG("field_71095_bQ");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityPlayer.func_70636_d");

	/**
	 * <p>
	 * Name: openEditStructure
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntityStructure;)V]
	 * </p>
	 */
	public static McObfPair func_189807_a = McMappingDatabase.getSRG("EntityPlayer.func_189807_a");

	/**
	 * <p>
	 * Name: getAlwaysRenderNameTagForRender
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_94059_bO = McMappingDatabase.getSRG("EntityPlayer.func_94059_bO");

	/**
	 * <p>
	 * Name: PLAYER_MODEL_FLAG
	 * </p>
	 */
	public static McObfPair field_184827_bp = McMappingDatabase.getSRG("field_184827_bp");

	/**
	 * <p>
	 * Name: renderOffsetX
	 * </p>
	 */
	public static McObfPair field_71079_bU = McMappingDatabase.getSRG("field_71079_bU");

	/**
	 * <p>
	 * Name: isSpectator
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175149_v = McMappingDatabase.getSRG("EntityPlayer.func_175149_v");

	/**
	 * <p>
	 * Name: isCreative
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184812_l_ = McMappingDatabase.getSRG("EntityPlayer.func_184812_l_");

	/**
	 * <p>
	 * Name: openEditSign
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntitySign;)V]
	 * </p>
	 */
	public static McObfPair func_175141_a = McMappingDatabase.getSRG("EntityPlayer.func_175141_a");

	/**
	 * <p>
	 * Name: damageShield
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_184590_k = McMappingDatabase.getSRG("EntityPlayer.func_184590_k");

	/**
	 * <p>
	 * Name: xpBarCap
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_71050_bK = McMappingDatabase.getSRG("EntityPlayer.func_71050_bK");

	/**
	 * <p>
	 * Name: addStat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/stats/StatBase;I)V]
	 * </p>
	 */
	public static McObfPair func_71064_a = McMappingDatabase.getSRG("EntityPlayer.func_71064_a");

	/**
	 * <p>
	 * Name: getFoodStats
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/FoodStats;]
	 * </p>
	 */
	public static McObfPair func_71024_bL = McMappingDatabase.getSRG("EntityPlayer.func_71024_bL");

	/**
	 * <p>
	 * Name: spawnSweepParticles
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184810_cG = McMappingDatabase.getSRG("EntityPlayer.func_184810_cG");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityPlayer.func_70097_a");

	/**
	 * <p>
	 * Name: isPlayerSleeping
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70608_bn = McMappingDatabase.getSRG("EntityPlayer.func_70608_bn");

	/**
	 * <p>
	 * Name: getCooledAttackStrength
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_184825_o = McMappingDatabase.getSRG("EntityPlayer.func_184825_o");

	/**
	 * <p>
	 * Name: xpSeed
	 * </p>
	 */
	public static McObfPair field_175152_f = McMappingDatabase.getSRG("field_175152_f");

	/**
	 * <p>
	 * Name: getInventoryEnderChest
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/inventory/InventoryEnderChest;]
	 * </p>
	 */
	public static McObfPair func_71005_bN = McMappingDatabase.getSRG("EntityPlayer.func_71005_bN");

	/**
	 * <p>
	 * Name: doWaterSplashEffect
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71061_d_ = McMappingDatabase.getSRG("EntityPlayer.func_71061_d_");

	/**
	 * <p>
	 * Name: inventoryContainer
	 * </p>
	 */
	public static McObfPair field_71069_bz = McMappingDatabase.getSRG("field_71069_bz");

	/**
	 * <p>
	 * Name: canAttackPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_96122_a = McMappingDatabase.getSRG("EntityPlayer.func_96122_a");

	/**
	 * <p>
	 * Name: capabilities
	 * </p>
	 */
	public static McObfPair field_71075_bZ = McMappingDatabase.getSRG("field_71075_bZ");

	/**
	 * <p>
	 * Name: getXPSeed
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_175138_ci = McMappingDatabase.getSRG("EntityPlayer.func_175138_ci");

	/**
	 * <p>
	 * Name: playSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundEvent;FF)V]
	 * </p>
	 */
	public static McObfPair func_184185_a = McMappingDatabase.getSRG("EntityPlayer.func_184185_a");

	/**
	 * <p>
	 * Name: getTeam
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/Team;]
	 * </p>
	 */
	public static McObfPair func_96124_cp = McMappingDatabase.getSRG("EntityPlayer.func_96124_cp");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityPlayer.func_184615_bR");

	/**
	 * <p>
	 * Name: addStat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/stats/StatBase;)V]
	 * </p>
	 */
	public static McObfPair func_71029_a = McMappingDatabase.getSRG("EntityPlayer.func_71029_a");

	/**
	 * <p>
	 * Name: getUUID
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_146094_a = McMappingDatabase.getSRG("EntityPlayer.func_146094_a");

	/**
	 * <p>
	 * Name: updateRidden
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70098_U = McMappingDatabase.getSRG("EntityPlayer.func_70098_U");

	/**
	 * <p>
	 * Name: prevCameraYaw
	 * </p>
	 */
	public static McObfPair field_71107_bF = McMappingDatabase.getSRG("field_71107_bF");

	/**
	 * <p>
	 * Name: spawnForced
	 * </p>
	 */
	public static McObfPair field_82248_d = McMappingDatabase.getSRG("field_82248_d");

	/**
	 * <p>
	 * Name: shouldHeal
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70996_bM = McMappingDatabase.getSRG("EntityPlayer.func_70996_bM");

	/**
	 * <p>
	 * Name: blockUsingShield
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_190629_c = McMappingDatabase.getSRG("EntityPlayer.func_190629_c");

	/**
	 * <p>
	 * Name: getBedOrientationInDegrees
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_71051_bG = McMappingDatabase.getSRG("EntityPlayer.func_71051_bG");

	/**
	 * <p>
	 * Name: destroyVanishingCursedItems
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190776_cN = McMappingDatabase.getSRG("EntityPlayer.func_190776_cN");

	/**
	 * <p>
	 * Name: resetRecipes
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_192022_b = McMappingDatabase.getSRG("EntityPlayer.func_192022_b");

	/**
	 * <p>
	 * Name: MAIN_HAND
	 * </p>
	 */
	public static McObfPair field_184828_bq = McMappingDatabase.getSRG("field_184828_bq");

	/**
	 * <p>
	 * Name: getBedSpawnLocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180467_a = McMappingDatabase.getSRG("EntityPlayer.func_180467_a");

	/**
	 * <p>
	 * Name: registerFixesPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189806_a = McMappingDatabase.getSRG("EntityPlayer.func_189806_a");

	/**
	 * <p>
	 * Name: dismountRidingEntity
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184210_p = McMappingDatabase.getSRG("EntityPlayer.func_184210_p");

	/**
	 * <p>
	 * Name: fishEntity
	 * </p>
	 */
	public static McObfPair field_71104_cf = McMappingDatabase.getSRG("field_71104_cf");

	/**
	 * <p>
	 * Name: getHeldEquipment
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_184214_aD = McMappingDatabase.getSRG("EntityPlayer.func_184214_aD");

	/**
	 * <p>
	 * Name: interactOn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_190775_a = McMappingDatabase.getSRG("EntityPlayer.func_190775_a");

	/**
	 * <p>
	 * Name: displayGuiEditCommandCart
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/CommandBlockBaseLogic;)V]
	 * </p>
	 */
	public static McObfPair func_184809_a = McMappingDatabase.getSRG("EntityPlayer.func_184809_a");

	/**
	 * <p>
	 * Name: setRenderOffsetForSleep
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_175139_a = McMappingDatabase.getSRG("EntityPlayer.func_175139_a");

	/**
	 * <p>
	 * Name: openBook
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumHand;)V]
	 * </p>
	 */
	public static McObfPair func_184814_a = McMappingDatabase.getSRG("EntityPlayer.func_184814_a");

	/**
	 * <p>
	 * Name: collideWithPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_71044_o = McMappingDatabase.getSRG("EntityPlayer.func_71044_o");

	/**
	 * <p>
	 * Name: updateEntityActionState
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70626_be = McMappingDatabase.getSRG("EntityPlayer.func_70626_be");

	/**
	 * <p>
	 * Name: getAIMoveSpeed
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70689_ay = McMappingDatabase.getSRG("EntityPlayer.func_70689_ay");

	/**
	 * <p>
	 * Name: setGameType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/GameType;)V]
	 * </p>
	 */
	public static McObfPair func_71033_a = McMappingDatabase.getSRG("EntityPlayer.func_71033_a");

	/**
	 * <p>
	 * Name: cameraYaw
	 * </p>
	 */
	public static McObfPair field_71109_bG = McMappingDatabase.getSRG("field_71109_bG");

	/**
	 * <p>
	 * Name: getArmorVisibility
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_82243_bO = McMappingDatabase.getSRG("EntityPlayer.func_82243_bO");

	/**
	 * <p>
	 * Name: fall
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_180430_e = McMappingDatabase.getSRG("EntityPlayer.func_180430_e");

	/**
	 * <p>
	 * Name: getLeftShoulderEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_192023_dk = McMappingDatabase.getSRG("EntityPlayer.func_192023_dk");

	/**
	 * <p>
	 * Name: isMovementBlocked
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70610_aX = McMappingDatabase.getSRG("EntityPlayer.func_70610_aX");

	/**
	 * <p>
	 * Name: sleeping
	 * </p>
	 */
	public static McObfPair field_71083_bS = McMappingDatabase.getSRG("field_71083_bS");

	/**
	 * <p>
	 * Name: applyEntityCollision
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_70108_f = McMappingDatabase.getSRG("EntityPlayer.func_70108_f");

	/**
	 * <p>
	 * Name: canHarvestBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_184823_b = McMappingDatabase.getSRG("EntityPlayer.func_184823_b");

	/**
	 * <p>
	 * Name: onCriticalHit
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_71009_b = McMappingDatabase.getSRG("EntityPlayer.func_71009_b");

	/**
	 * <p>
	 * Name: chasingPosX
	 * </p>
	 */
	public static McObfPair field_71094_bP = McMappingDatabase.getSRG("field_71094_bP");

	/**
	 * <p>
	 * Name: getPrimaryHand
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumHandSide;]
	 * </p>
	 */
	public static McObfPair func_184591_cq = McMappingDatabase.getSRG("EntityPlayer.func_184591_cq");

	/**
	 * <p>
	 * Name: getLuck
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_184817_da = McMappingDatabase.getSRG("EntityPlayer.func_184817_da");

	/**
	 * <p>
	 * Name: LEFT_SHOULDER_ENTITY
	 * </p>
	 */
	public static McObfPair field_192032_bt = McMappingDatabase.getSRG("field_192032_bt");

	/**
	 * <p>
	 * Name: setReducedDebug
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_175150_k = McMappingDatabase.getSRG("EntityPlayer.func_175150_k");

	/**
	 * <p>
	 * Name: bedInRange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_190774_a = McMappingDatabase.getSRG("EntityPlayer.func_190774_a");

	/**
	 * <p>
	 * Name: resetCooldown
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184821_cY = McMappingDatabase.getSRG("EntityPlayer.func_184821_cY");

	/**
	 * <p>
	 * Name: onEnchantmentCritical
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_71047_c = McMappingDatabase.getSRG("EntityPlayer.func_71047_c");

	/**
	 * <p>
	 * Name: getSoundCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundCategory;]
	 * </p>
	 */
	public static McObfPair func_184176_by = McMappingDatabase.getSRG("EntityPlayer.func_184176_by");

	/**
	 * <p>
	 * Name: jump
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70664_aZ = McMappingDatabase.getSRG("EntityPlayer.func_70664_aZ");

	/**
	 * <p>
	 * Name: travel
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_191986_a = McMappingDatabase.getSRG("EntityPlayer.func_191986_a");

	/**
	 * <p>
	 * Name: openGuiHorseInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/AbstractHorse;Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_184826_a = McMappingDatabase.getSRG("EntityPlayer.func_184826_a");

	/**
	 * <p>
	 * Name: disableShield
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_190777_m = McMappingDatabase.getSRG("EntityPlayer.func_190777_m");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityPlayer.func_70071_h_");

	/**
	 * <p>
	 * Name: getCooldownTracker
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/CooldownTracker;]
	 * </p>
	 */
	public static McObfPair func_184811_cZ = McMappingDatabase.getSRG("EntityPlayer.func_184811_cZ");

	/**
	 * <p>
	 * Name: spawnPos
	 * </p>
	 */
	public static McObfPair field_71077_c = McMappingDatabase.getSRG("field_71077_c");

	/**
	 * <p>
	 * Name: prevChasingPosY
	 * </p>
	 */
	public static McObfPair field_71096_bN = McMappingDatabase.getSRG("field_71096_bN");

	/**
	 * <p>
	 * Name: speedInAir
	 * </p>
	 */
	public static McObfPair field_71102_ce = McMappingDatabase.getSRG("field_71102_ce");

	/**
	 * <p>
	 * Name: getArmorInventoryList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_184193_aE = McMappingDatabase.getSRG("EntityPlayer.func_184193_aE");

	/**
	 * <p>
	 * Name: getFireImmuneTicks
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190531_bD = McMappingDatabase.getSRG("EntityPlayer.func_190531_bD");

	/**
	 * <p>
	 * Name: wakeUpPlayer
	 * </p>
	 * <p>
	 * Desc: [(ZZZ)V]
	 * </p>
	 */
	public static McObfPair func_70999_a = McMappingDatabase.getSRG("EntityPlayer.func_70999_a");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("EntityPlayer.func_145748_c_");

	/**
	 * <p>
	 * Name: addExperienceLevel
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_82242_a = McMappingDatabase.getSRG("EntityPlayer.func_82242_a");

	/**
	 * <p>
	 * Name: damageEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)V]
	 * </p>
	 */
	public static McObfPair func_70665_d = McMappingDatabase.getSRG("EntityPlayer.func_70665_d");

	/**
	 * <p>
	 * Name: closeScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71053_j = McMappingDatabase.getSRG("EntityPlayer.func_71053_j");

	/**
	 * <p>
	 * Name: getSleepTimer
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_71060_bI = McMappingDatabase.getSRG("EntityPlayer.func_71060_bI");

	/**
	 * <p>
	 * Name: onEnchant
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;I)V]
	 * </p>
	 */
	public static McObfPair func_192024_a = McMappingDatabase.getSRG("EntityPlayer.func_192024_a");

	/**
	 * <p>
	 * Name: openContainer
	 * </p>
	 */
	public static McObfPair field_71070_bA = McMappingDatabase.getSRG("field_71070_bA");

	/**
	 * <p>
	 * Name: setSpawnPoint
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Z)V]
	 * </p>
	 */
	public static McObfPair func_180473_a = McMappingDatabase.getSRG("EntityPlayer.func_180473_a");

	/**
	 * <p>
	 * Name: displayGui
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IInteractionObject;)V]
	 * </p>
	 */
	public static McObfPair func_180468_a = McMappingDatabase.getSRG("EntityPlayer.func_180468_a");

	/**
	 * <p>
	 * Name: renderOffsetY
	 * </p>
	 */
	public static McObfPair field_71082_cx = McMappingDatabase.getSRG("field_71082_cx");

	/**
	 * <p>
	 * Name: unlockRecipes
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_192021_a = McMappingDatabase.getSRG("EntityPlayer.func_192021_a");

	/**
	 * <p>
	 * Name: getYOffset
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_70033_W = McMappingDatabase.getSRG("EntityPlayer.func_70033_W");

	/**
	 * <p>
	 * Name: itemStackMainHand
	 * </p>
	 */
	public static McObfPair field_184831_bT = McMappingDatabase.getSRG("field_184831_bT");

	/**
	 * <p>
	 * Name: setAbsorptionAmount
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_110149_m = McMappingDatabase.getSRG("EntityPlayer.func_110149_m");

	/**
	 * <p>
	 * Name: ABSORPTION
	 * </p>
	 */
	public static McObfPair field_184829_a = McMappingDatabase.getSRG("field_184829_a");

	/**
	 * <p>
	 * Name: updateCape
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184820_o = McMappingDatabase.getSRG("EntityPlayer.func_184820_o");

	/**
	 * <p>
	 * Name: onDeath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_70645_a = McMappingDatabase.getSRG("EntityPlayer.func_70645_a");

	/**
	 * <p>
	 * Name: experience
	 * </p>
	 */
	public static McObfPair field_71106_cc = McMappingDatabase.getSRG("field_71106_cc");

	/**
	 * <p>
	 * Name: setItemStackToSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_184201_a = McMappingDatabase.getSRG("EntityPlayer.func_184201_a");

	/**
	 * <p>
	 * Name: chasingPosZ
	 * </p>
	 */
	public static McObfPair field_71085_bR = McMappingDatabase.getSRG("field_71085_bR");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityPlayer.func_110147_ax");

	/**
	 * <p>
	 * Name: hasReducedDebug
	 * </p>
	 */
	public static McObfPair field_175153_bG = McMappingDatabase.getSRG("field_175153_bG");

	/**
	 * <p>
	 * Name: canUseCommandBlock
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_189808_dh = McMappingDatabase.getSRG("EntityPlayer.func_189808_dh");

	/**
	 * <p>
	 * Name: getPortalCooldown
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82147_ab = McMappingDatabase.getSRG("EntityPlayer.func_82147_ab");

	/**
	 * <p>
	 * Name: getMaxInPortalTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82145_z = McMappingDatabase.getSRG("EntityPlayer.func_82145_z");

	/**
	 * <p>
	 * Name: addMovementStat
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_71000_j = McMappingDatabase.getSRG("EntityPlayer.func_71000_j");

	/**
	 * <p>
	 * Name: setRightShoulderEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_192031_i = McMappingDatabase.getSRG("EntityPlayer.func_192031_i");

	/**
	 * <p>
	 * Name: getDigSpeed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)F]
	 * </p>
	 */
	public static McObfPair func_184813_a = McMappingDatabase.getSRG("EntityPlayer.func_184813_a");

	/**
	 * <p>
	 * Name: dropItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Z)Lnet/minecraft/entity/item/EntityItem;]
	 * </p>
	 */
	public static McObfPair func_71019_a = McMappingDatabase.getSRG("EntityPlayer.func_71019_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityPlayer.func_70037_a");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityPlayer.func_70103_a");

	/**
	 * <p>
	 * Name: setDead
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70106_y = McMappingDatabase.getSRG("EntityPlayer.func_70106_y");

	/**
	 * <p>
	 * Name: prevChasingPosX
	 * </p>
	 */
	public static McObfPair field_71091_bM = McMappingDatabase.getSRG("field_71091_bM");

	/**
	 * <p>
	 * Name: respawnPlayer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71004_bE = McMappingDatabase.getSRG("EntityPlayer.func_71004_bE");

}

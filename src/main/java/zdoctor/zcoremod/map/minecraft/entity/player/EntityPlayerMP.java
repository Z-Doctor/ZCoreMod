package zdoctor.zcoremod.map.minecraft.entity.player;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPlayerMP {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oq";
		else
			return "net/minecraft/entity/player/EntityPlayerMP";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oq";
		else
			return "EntityPlayerMP";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Loq;";
		else
			return "Lnet/minecraft/entity/player/EntityPlayerMP;";
	}

	/**
	 * <p>
	 * Name: statsFile
	 * </p>
	 */
	public static McObfPair field_147103_bO = McMappingDatabase.getSRG("field_147103_bO");

	/**
	 * <p>
	 * Name: lastAirScore
	 * </p>
	 */
	public static McObfPair field_184853_bW = McMappingDatabase.getSRG("field_184853_bW");

	/**
	 * <p>
	 * Name: getChatVisibility
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/player/EntityPlayer$EnumChatVisibility;]
	 * </p>
	 */
	public static McObfPair func_147096_v = McMappingDatabase.getSRG("EntityPlayerMP.func_147096_v");

	/**
	 * <p>
	 * Name: awardTeamKillScores
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_192038_E = McMappingDatabase.getSRG("EntityPlayerMP.func_192038_E");

	/**
	 * <p>
	 * Name: clearElytraFlying
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189103_N = McMappingDatabase.getSRG("EntityPlayerMP.func_189103_N");

	/**
	 * <p>
	 * Name: canPlayersAttack
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175400_cq = McMappingDatabase.getSRG("EntityPlayerMP.func_175400_cq");

	/**
	 * <p>
	 * Name: openEditSign
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntitySign;)V]
	 * </p>
	 */
	public static McObfPair func_175141_a = McMappingDatabase.getSRG("EntityPlayerMP.func_175141_a");

	/**
	 * <p>
	 * Name: getEnteredNetherPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_193106_Q = McMappingDatabase.getSRG("EntityPlayerMP.func_193106_Q");

	/**
	 * <p>
	 * Name: handleClientSettings
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketClientSettings;)V]
	 * </p>
	 */
	public static McObfPair func_147100_a = McMappingDatabase.getSRG("EntityPlayerMP.func_147100_a");

	/**
	 * <p>
	 * Name: clearInvulnerableDimensionChange
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184846_L = McMappingDatabase.getSRG("EntityPlayerMP.func_184846_L");

	/**
	 * <p>
	 * Name: getServerWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/WorldServer;]
	 * </p>
	 */
	public static McObfPair func_71121_q = McMappingDatabase.getSRG("EntityPlayerMP.func_71121_q");

	/**
	 * <p>
	 * Name: takeStat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/stats/StatBase;)V]
	 * </p>
	 */
	public static McObfPair func_175145_a = McMappingDatabase.getSRG("EntityPlayerMP.func_175145_a");

	/**
	 * <p>
	 * Name: copyFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Z)V]
	 * </p>
	 */
	public static McObfPair func_193104_a = McMappingDatabase.getSRG("EntityPlayerMP.func_193104_a");

	/**
	 * <p>
	 * Name: onEnchantmentCritical
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_71047_c = McMappingDatabase.getSRG("EntityPlayerMP.func_71047_c");

	/**
	 * <p>
	 * Name: onItemUseFinish
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71036_o = McMappingDatabase.getSRG("EntityPlayerMP.func_71036_o");

	/**
	 * <p>
	 * Name: lastExperience
	 * </p>
	 */
	public static McObfPair field_71144_ck = McMappingDatabase.getSRG("field_71144_ck");

	/**
	 * <p>
	 * Name: openGuiHorseInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/AbstractHorse;Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_184826_a = McMappingDatabase.getSRG("EntityPlayerMP.func_184826_a");

	/**
	 * <p>
	 * Name: lastFoodLevel
	 * </p>
	 */
	public static McObfPair field_71146_ci = McMappingDatabase.getSRG("field_71146_ci");

	/**
	 * <p>
	 * Name: ping
	 * </p>
	 */
	public static McObfPair field_71138_i = McMappingDatabase.getSRG("field_71138_i");

	/**
	 * <p>
	 * Name: onUpdateEntity
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71127_g = McMappingDatabase.getSRG("EntityPlayerMP.func_71127_g");

	/**
	 * <p>
	 * Name: connection
	 * </p>
	 */
	public static McObfPair field_71135_a = McMappingDatabase.getSRG("field_71135_a");

	/**
	 * <p>
	 * Name: frostWalk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184594_b = McMappingDatabase.getSRG("EntityPlayerMP.func_184594_b");

	/**
	 * <p>
	 * Name: getAdvancements
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/advancements/PlayerAdvancements;]
	 * </p>
	 */
	public static McObfPair func_192039_O = McMappingDatabase.getSRG("EntityPlayerMP.func_192039_O");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityPlayerMP.func_70037_a");

	/**
	 * <p>
	 * Name: displayGui
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IInteractionObject;)V]
	 * </p>
	 */
	public static McObfPair func_180468_a = McMappingDatabase.getSRG("EntityPlayerMP.func_180468_a");

	/**
	 * <p>
	 * Name: sendTileEntityUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;)V]
	 * </p>
	 */
	public static McObfPair func_147097_b = McMappingDatabase.getSRG("EntityPlayerMP.func_147097_b");

	/**
	 * <p>
	 * Name: handleFalling
	 * </p>
	 * <p>
	 * Desc: [(DZ)V]
	 * </p>
	 */
	public static McObfPair func_71122_b = McMappingDatabase.getSRG("EntityPlayerMP.func_71122_b");

	/**
	 * <p>
	 * Name: markPlayerActive
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_143004_u = McMappingDatabase.getSRG("EntityPlayerMP.func_143004_u");

	/**
	 * <p>
	 * Name: seenCredits
	 * </p>
	 */
	public static McObfPair field_192040_cp = McMappingDatabase.getSRG("field_192040_cp");

	/**
	 * <p>
	 * Name: openBook
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumHand;)V]
	 * </p>
	 */
	public static McObfPair func_184814_a = McMappingDatabase.getSRG("EntityPlayerMP.func_184814_a");

	/**
	 * <p>
	 * Name: unlockRecipes
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_192021_a = McMappingDatabase.getSRG("EntityPlayerMP.func_192021_a");

	/**
	 * <p>
	 * Name: lastLevelScore
	 * </p>
	 */
	public static McObfPair field_184855_bY = McMappingDatabase.getSRG("field_184855_bY");

	/**
	 * <p>
	 * Name: startRiding
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Z)Z]
	 * </p>
	 */
	public static McObfPair func_184205_a = McMappingDatabase.getSRG("EntityPlayerMP.func_184205_a");

	/**
	 * <p>
	 * Name: lastExperienceScore
	 * </p>
	 */
	public static McObfPair field_184856_bZ = McMappingDatabase.getSRG("field_184856_bZ");

	/**
	 * <p>
	 * Name: removeEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_152339_d = McMappingDatabase.getSRG("EntityPlayerMP.func_152339_d");

	/**
	 * <p>
	 * Name: isEntityInvulnerable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Z]
	 * </p>
	 */
	public static McObfPair func_180431_b = McMappingDatabase.getSRG("EntityPlayerMP.func_180431_b");

	/**
	 * <p>
	 * Name: sendEndCombat
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152112_bu = McMappingDatabase.getSRG("EntityPlayerMP.func_152112_bu");

	/**
	 * <p>
	 * Name: swingArm
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumHand;)V]
	 * </p>
	 */
	public static McObfPair func_184609_a = McMappingDatabase.getSRG("EntityPlayerMP.func_184609_a");

	/**
	 * <p>
	 * Name: onItemPickup
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;I)V]
	 * </p>
	 */
	public static McObfPair func_71001_a = McMappingDatabase.getSRG("EntityPlayerMP.func_71001_a");

	/**
	 * <p>
	 * Name: lastFoodScore
	 * </p>
	 */
	public static McObfPair field_184852_bV = McMappingDatabase.getSRG("field_184852_bV");

	/**
	 * <p>
	 * Name: displayGuiCommandBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntityCommandBlock;)V]
	 * </p>
	 */
	public static McObfPair func_184824_a = McMappingDatabase.getSRG("EntityPlayerMP.func_184824_a");

	/**
	 * <p>
	 * Name: onChangedPotionEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;Z)V]
	 * </p>
	 */
	public static McObfPair func_70695_b = McMappingDatabase.getSRG("EntityPlayerMP.func_70695_b");

	/**
	 * <p>
	 * Name: addStat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/stats/StatBase;I)V]
	 * </p>
	 */
	public static McObfPair func_71064_a = McMappingDatabase.getSRG("EntityPlayerMP.func_71064_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityPlayerMP.func_70071_h_");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180425_c = McMappingDatabase.getSRG("EntityPlayerMP.func_180425_c");

	/**
	 * <p>
	 * Name: getStatFile
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/stats/StatisticsManagerServer;]
	 * </p>
	 */
	public static McObfPair func_147099_x = McMappingDatabase.getSRG("EntityPlayerMP.func_147099_x");

	/**
	 * <p>
	 * Name: managedPosX
	 * </p>
	 */
	public static McObfPair field_71131_d = McMappingDatabase.getSRG("field_71131_d");

	/**
	 * <p>
	 * Name: setElytraFlying
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184847_M = McMappingDatabase.getSRG("EntityPlayerMP.func_184847_M");

	/**
	 * <p>
	 * Name: getLastActiveTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_154331_x = McMappingDatabase.getSRG("EntityPlayerMP.func_154331_x");

	/**
	 * <p>
	 * Name: sendAllWindowProperties
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_175173_a = McMappingDatabase.getSRG("EntityPlayerMP.func_175173_a");

	/**
	 * <p>
	 * Name: sendMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_145747_a = McMappingDatabase.getSRG("EntityPlayerMP.func_145747_a");

	/**
	 * <p>
	 * Name: isInvulnerableDimensionChange
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184850_K = McMappingDatabase.getSRG("EntityPlayerMP.func_184850_K");

	/**
	 * <p>
	 * Name: mountEntityAndWakeUp
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71123_m = McMappingDatabase.getSRG("EntityPlayerMP.func_71123_m");

	/**
	 * <p>
	 * Name: interactionManager
	 * </p>
	 */
	public static McObfPair field_71134_c = McMappingDatabase.getSRG("field_71134_c");

	/**
	 * <p>
	 * Name: onNewPotionEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;)V]
	 * </p>
	 */
	public static McObfPair func_70670_a = McMappingDatabase.getSRG("EntityPlayerMP.func_70670_a");

	/**
	 * <p>
	 * Name: sendContainerToPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;)V]
	 * </p>
	 */
	public static McObfPair func_71120_a = McMappingDatabase.getSRG("EntityPlayerMP.func_71120_a");

	/**
	 * <p>
	 * Name: canUseCommand
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_70003_b = McMappingDatabase.getSRG("EntityPlayerMP.func_70003_b");

	/**
	 * <p>
	 * Name: getSpectatingEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_175398_C = McMappingDatabase.getSRG("EntityPlayerMP.func_175398_C");

	/**
	 * <p>
	 * Name: sendPlayerAbilities
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71016_p = McMappingDatabase.getSRG("EntityPlayerMP.func_71016_p");

	/**
	 * <p>
	 * Name: addSelfToInternalCraftingInventory
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71116_b = McMappingDatabase.getSRG("EntityPlayerMP.func_71116_b");

	/**
	 * <p>
	 * Name: managedPosZ
	 * </p>
	 */
	public static McObfPair field_71132_e = McMappingDatabase.getSRG("field_71132_e");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityPlayerMP.func_70014_b");

	/**
	 * <p>
	 * Name: onInsideBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_191955_a = McMappingDatabase.getSRG("EntityPlayerMP.func_191955_a");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityPlayerMP.func_70097_a");

	/**
	 * <p>
	 * Name: addEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_184848_d = McMappingDatabase.getSRG("EntityPlayerMP.func_184848_d");

	/**
	 * <p>
	 * Name: resetRecipes
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_192022_b = McMappingDatabase.getSRG("EntityPlayerMP.func_192022_b");

	/**
	 * <p>
	 * Name: levitatingSince
	 * </p>
	 */
	public static McObfPair field_193108_cu = McMappingDatabase.getSRG("field_193108_cu");

	/**
	 * <p>
	 * Name: setPlayerHealthUpdated
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71118_n = McMappingDatabase.getSRG("EntityPlayerMP.func_71118_n");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147102_bM = McMappingDatabase.getSRG("field_147102_bM");

	/**
	 * <p>
	 * Name: playerLastActiveTime
	 * </p>
	 */
	public static McObfPair field_143005_bX = McMappingDatabase.getSRG("field_143005_bX");

	/**
	 * <p>
	 * Name: addExperienceLevel
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_82242_a = McMappingDatabase.getSRG("EntityPlayerMP.func_82242_a");

	/**
	 * <p>
	 * Name: updateScorePoints
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/IScoreCriteria;I)V]
	 * </p>
	 */
	public static McObfPair func_184849_a = McMappingDatabase.getSRG("EntityPlayerMP.func_184849_a");

	/**
	 * <p>
	 * Name: dismountRidingEntity
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184210_p = McMappingDatabase.getSRG("EntityPlayerMP.func_184210_p");

	/**
	 * <p>
	 * Name: lastHealthScore
	 * </p>
	 */
	public static McObfPair field_130068_bO = McMappingDatabase.getSRG("field_130068_bO");

	/**
	 * <p>
	 * Name: lastHealth
	 * </p>
	 */
	public static McObfPair field_71149_ch = McMappingDatabase.getSRG("field_71149_ch");

	/**
	 * <p>
	 * Name: closeScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71053_j = McMappingDatabase.getSRG("EntityPlayerMP.func_71053_j");

	/**
	 * <p>
	 * Name: setSpectatingEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_175399_e = McMappingDatabase.getSRG("EntityPlayerMP.func_175399_e");

	/**
	 * <p>
	 * Name: setPositionAndUpdate
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_70634_a = McMappingDatabase.getSRG("EntityPlayerMP.func_70634_a");

	/**
	 * <p>
	 * Name: awardKillScore
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;ILnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_191956_a = McMappingDatabase.getSRG("EntityPlayerMP.func_191956_a");

	/**
	 * <p>
	 * Name: sendStatusMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;Z)V]
	 * </p>
	 */
	public static McObfPair func_146105_b = McMappingDatabase.getSRG("EntityPlayerMP.func_146105_b");

	/**
	 * <p>
	 * Name: updateHeldItem
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71113_k = McMappingDatabase.getSRG("EntityPlayerMP.func_71113_k");

	/**
	 * <p>
	 * Name: language
	 * </p>
	 */
	public static McObfPair field_71148_cg = McMappingDatabase.getSRG("field_71148_cg");

	/**
	 * <p>
	 * Name: lastArmorScore
	 * </p>
	 */
	public static McObfPair field_184854_bX = McMappingDatabase.getSRG("field_184854_bX");

	/**
	 * <p>
	 * Name: setGameType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/GameType;)V]
	 * </p>
	 */
	public static McObfPair func_71033_a = McMappingDatabase.getSRG("EntityPlayerMP.func_71033_a");

	/**
	 * <p>
	 * Name: sendSlotContents
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_71111_a = McMappingDatabase.getSRG("EntityPlayerMP.func_71111_a");

	/**
	 * <p>
	 * Name: displayVillagerTradeGui
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/IMerchant;)V]
	 * </p>
	 */
	public static McObfPair func_180472_a = McMappingDatabase.getSRG("EntityPlayerMP.func_180472_a");

	/**
	 * <p>
	 * Name: invulnerableDimensionChange
	 * </p>
	 */
	public static McObfPair field_184851_cj = McMappingDatabase.getSRG("field_184851_cj");

	/**
	 * <p>
	 * Name: getNextWindowId
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71117_bO = McMappingDatabase.getSRG("EntityPlayerMP.func_71117_bO");

	/**
	 * <p>
	 * Name: wasHungry
	 * </p>
	 */
	public static McObfPair field_71147_cj = McMappingDatabase.getSRG("field_71147_cj");

	/**
	 * <p>
	 * Name: isCreative
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184812_l_ = McMappingDatabase.getSRG("EntityPlayerMP.func_184812_l_");

	/**
	 * <p>
	 * Name: decrementTimeUntilPortal
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184173_H = McMappingDatabase.getSRG("EntityPlayerMP.func_184173_H");

	/**
	 * <p>
	 * Name: getPlayerIP
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71114_r = McMappingDatabase.getSRG("EntityPlayerMP.func_71114_r");

	/**
	 * <p>
	 * Name: wakeUpPlayer
	 * </p>
	 * <p>
	 * Desc: [(ZZZ)V]
	 * </p>
	 */
	public static McObfPair func_70999_a = McMappingDatabase.getSRG("EntityPlayerMP.func_70999_a");

	/**
	 * <p>
	 * Name: sendEnterCombat
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152111_bt = McMappingDatabase.getSRG("EntityPlayerMP.func_152111_bt");

	/**
	 * <p>
	 * Name: updatePotionMetadata
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175135_B = McMappingDatabase.getSRG("EntityPlayerMP.func_175135_B");

	/**
	 * <p>
	 * Name: chatVisibility
	 * </p>
	 */
	public static McObfPair field_71143_cn = McMappingDatabase.getSRG("field_71143_cn");

	/**
	 * <p>
	 * Name: changeDimension
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_184204_a = McMappingDatabase.getSRG("EntityPlayerMP.func_184204_a");

	/**
	 * <p>
	 * Name: spectatingEntity
	 * </p>
	 */
	public static McObfPair field_175401_bS = McMappingDatabase.getSRG("field_175401_bS");

	/**
	 * <p>
	 * Name: unlockRecipes
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/util/ResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_193102_a = McMappingDatabase.getSRG("EntityPlayerMP.func_193102_a");

	/**
	 * <p>
	 * Name: displayGUIChest
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_71007_a = McMappingDatabase.getSRG("EntityPlayerMP.func_71007_a");

	/**
	 * <p>
	 * Name: closeContainer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71128_l = McMappingDatabase.getSRG("EntityPlayerMP.func_71128_l");

	/**
	 * <p>
	 * Name: chatColours
	 * </p>
	 */
	public static McObfPair field_71140_co = McMappingDatabase.getSRG("field_71140_co");

	/**
	 * <p>
	 * Name: sendWindowProperty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;II)V]
	 * </p>
	 */
	public static McObfPair func_71112_a = McMappingDatabase.getSRG("EntityPlayerMP.func_71112_a");

	/**
	 * <p>
	 * Name: onCriticalHit
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_71009_b = McMappingDatabase.getSRG("EntityPlayerMP.func_71009_b");

	/**
	 * <p>
	 * Name: canAttackPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_96122_a = McMappingDatabase.getSRG("EntityPlayerMP.func_96122_a");

	/**
	 * <p>
	 * Name: getRecipeBook
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/stats/RecipeBookServer;]
	 * </p>
	 */
	public static McObfPair func_192037_E = McMappingDatabase.getSRG("EntityPlayerMP.func_192037_E");

	/**
	 * <p>
	 * Name: mcServer
	 * </p>
	 */
	public static McObfPair field_71133_b = McMappingDatabase.getSRG("field_71133_b");

	/**
	 * <p>
	 * Name: onFinishedPotionEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;)V]
	 * </p>
	 */
	public static McObfPair func_70688_c = McMappingDatabase.getSRG("EntityPlayerMP.func_70688_c");

	/**
	 * <p>
	 * Name: isSpectator
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175149_v = McMappingDatabase.getSRG("EntityPlayerMP.func_175149_v");

	/**
	 * <p>
	 * Name: createCooldownTracker
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/CooldownTracker;]
	 * </p>
	 */
	public static McObfPair func_184815_l = McMappingDatabase.getSRG("EntityPlayerMP.func_184815_l");

	/**
	 * <p>
	 * Name: loadResourcePack
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_175397_a = McMappingDatabase.getSRG("EntityPlayerMP.func_175397_a");

	/**
	 * <p>
	 * Name: setEntityActionState
	 * </p>
	 * <p>
	 * Desc: [(FFZZ)V]
	 * </p>
	 */
	public static McObfPair func_110430_a = McMappingDatabase.getSRG("EntityPlayerMP.func_110430_a");

	/**
	 * <p>
	 * Name: sendAllContents
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_71110_a = McMappingDatabase.getSRG("EntityPlayerMP.func_71110_a");

	/**
	 * <p>
	 * Name: currentWindowId
	 * </p>
	 */
	public static McObfPair field_71139_cq = McMappingDatabase.getSRG("field_71139_cq");

	/**
	 * <p>
	 * Name: onEnchant
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;I)V]
	 * </p>
	 */
	public static McObfPair func_192024_a = McMappingDatabase.getSRG("EntityPlayerMP.func_192024_a");

	/**
	 * <p>
	 * Name: getTabListDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_175396_E = McMappingDatabase.getSRG("EntityPlayerMP.func_175396_E");

	/**
	 * <p>
	 * Name: enteredNetherPosition
	 * </p>
	 */
	public static McObfPair field_193110_cw = McMappingDatabase.getSRG("field_193110_cw");

	/**
	 * <p>
	 * Name: recipeBook
	 * </p>
	 */
	public static McObfPair field_192041_cq = McMappingDatabase.getSRG("field_192041_cq");

	/**
	 * <p>
	 * Name: isChangingQuantityOnly
	 * </p>
	 */
	public static McObfPair field_71137_h = McMappingDatabase.getSRG("field_71137_h");

	/**
	 * <p>
	 * Name: trySleep
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/entity/player/EntityPlayer$SleepResult;]
	 * </p>
	 */
	public static McObfPair func_180469_a = McMappingDatabase.getSRG("EntityPlayerMP.func_180469_a");

	/**
	 * <p>
	 * Name: updateFallState
	 * </p>
	 * <p>
	 * Desc: [(DZLnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184231_a = McMappingDatabase.getSRG("EntityPlayerMP.func_184231_a");

	/**
	 * <p>
	 * Name: respawnInvulnerabilityTicks
	 * </p>
	 */
	public static McObfPair field_147101_bU = McMappingDatabase.getSRG("field_147101_bU");

	/**
	 * <p>
	 * Name: onDeath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_70645_a = McMappingDatabase.getSRG("EntityPlayerMP.func_70645_a");

	/**
	 * <p>
	 * Name: attackTargetEntityWithCurrentItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_71059_n = McMappingDatabase.getSRG("EntityPlayerMP.func_71059_n");

	/**
	 * <p>
	 * Name: levitationStartPos
	 * </p>
	 */
	public static McObfPair field_193107_ct = McMappingDatabase.getSRG("field_193107_ct");

	/**
	 * <p>
	 * Name: entityRemoveQueue
	 * </p>
	 */
	public static McObfPair field_71130_g = McMappingDatabase.getSRG("field_71130_g");

	/**
	 * <p>
	 * Name: disconnected
	 * </p>
	 */
	public static McObfPair field_193109_cv = McMappingDatabase.getSRG("field_193109_cv");

	/**
	 * <p>
	 * Name: registerFixesPlayerMP
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_191522_a = McMappingDatabase.getSRG("EntityPlayerMP.func_191522_a");

	/**
	 * <p>
	 * Name: advancements
	 * </p>
	 */
	public static McObfPair field_192042_bX = McMappingDatabase.getSRG("field_192042_bX");

	/**
	 * <p>
	 * Name: hasDisconnected
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193105_t = McMappingDatabase.getSRG("EntityPlayerMP.func_193105_t");

	/**
	 * <p>
	 * Name: queuedEndExit
	 * </p>
	 */
	public static McObfPair field_71136_j = McMappingDatabase.getSRG("field_71136_j");

	/**
	 * <p>
	 * Name: isSpectatedByPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)Z]
	 * </p>
	 */
	public static McObfPair func_174827_a = McMappingDatabase.getSRG("EntityPlayerMP.func_174827_a");

}

package zdoctor.zcoremod.map.minecraft.client.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPlayerSP {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bud";
		else
			return "net/minecraft/client/entity/EntityPlayerSP";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bud";
		else
			return "EntityPlayerSP";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbud;";
		else
			return "Lnet/minecraft/client/entity/EntityPlayerSP;";
	}

	/**
	 * <p>
	 * Name: autoJumpTime
	 * </p>
	 */
	public static McObfPair field_189812_cs = McMappingDatabase.getSRG("field_189812_cs");

	/**
	 * <p>
	 * Name: getStatFileWriter
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/stats/StatisticsManager;]
	 * </p>
	 */
	public static McObfPair func_146107_m = McMappingDatabase.getSRG("EntityPlayerSP.func_146107_m");

	/**
	 * <p>
	 * Name: heal
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_70691_i = McMappingDatabase.getSRG("EntityPlayerSP.func_70691_i");

	/**
	 * <p>
	 * Name: respawnPlayer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71004_bE = McMappingDatabase.getSRG("EntityPlayerSP.func_71004_bE");

	/**
	 * <p>
	 * Name: lastReportedPosX
	 * </p>
	 */
	public static McObfPair field_175172_bI = McMappingDatabase.getSRG("field_175172_bI");

	/**
	 * <p>
	 * Name: damageEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)V]
	 * </p>
	 */
	public static McObfPair func_70665_d = McMappingDatabase.getSRG("EntityPlayerSP.func_70665_d");

	/**
	 * <p>
	 * Name: removeRecipeHighlight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;)V]
	 * </p>
	 */
	public static McObfPair func_193103_a = McMappingDatabase.getSRG("EntityPlayerSP.func_193103_a");

	/**
	 * <p>
	 * Name: addStat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/stats/StatBase;I)V]
	 * </p>
	 */
	public static McObfPair func_71064_a = McMappingDatabase.getSRG("EntityPlayerSP.func_71064_a");

	/**
	 * <p>
	 * Name: canUseCommand
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_70003_b = McMappingDatabase.getSRG("EntityPlayerSP.func_70003_b");

	/**
	 * <p>
	 * Name: autoJumpEnabled
	 * </p>
	 */
	public static McObfPair field_189811_cr = McMappingDatabase.getSRG("field_189811_cr");

	/**
	 * <p>
	 * Name: setSprinting
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70031_b = McMappingDatabase.getSRG("EntityPlayerSP.func_70031_b");

	/**
	 * <p>
	 * Name: lastReportedYaw
	 * </p>
	 */
	public static McObfPair field_175164_bL = McMappingDatabase.getSRG("field_175164_bL");

	/**
	 * <p>
	 * Name: recipeBook
	 * </p>
	 */
	public static McObfPair field_192036_cb = McMappingDatabase.getSRG("field_192036_cb");

	/**
	 * <p>
	 * Name: displayGUIChest
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_71007_a = McMappingDatabase.getSRG("EntityPlayerSP.func_71007_a");

	/**
	 * <p>
	 * Name: activeHand
	 * </p>
	 */
	public static McObfPair field_184843_cn = McMappingDatabase.getSRG("field_184843_cn");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityPlayerSP.func_70636_d");

	/**
	 * <p>
	 * Name: isOpenBlockSpace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175162_d = McMappingDatabase.getSRG("EntityPlayerSP.func_175162_d");

	/**
	 * <p>
	 * Name: setServerBrand
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_175158_f = McMappingDatabase.getSRG("EntityPlayerSP.func_175158_f");

	/**
	 * <p>
	 * Name: getPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184840_I = McMappingDatabase.getSRG("EntityPlayerSP.func_184840_I");

	/**
	 * <p>
	 * Name: horseJumpPowerCounter
	 * </p>
	 */
	public static McObfPair field_110320_a = McMappingDatabase.getSRG("field_110320_a");

	/**
	 * <p>
	 * Name: displayGui
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IInteractionObject;)V]
	 * </p>
	 */
	public static McObfPair func_180468_a = McMappingDatabase.getSRG("EntityPlayerSP.func_180468_a");

	/**
	 * <p>
	 * Name: sprintingTicksLeft
	 * </p>
	 */
	public static McObfPair field_71157_e = McMappingDatabase.getSRG("field_71157_e");

	/**
	 * <p>
	 * Name: openGuiHorseInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/AbstractHorse;Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_184826_a = McMappingDatabase.getSRG("EntityPlayerSP.func_184826_a");

	/**
	 * <p>
	 * Name: timeInPortal
	 * </p>
	 */
	public static McObfPair field_71086_bY = McMappingDatabase.getSRG("field_71086_bY");

	/**
	 * <p>
	 * Name: move
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/MoverType;DDD)V]
	 * </p>
	 */
	public static McObfPair func_70091_d = McMappingDatabase.getSRG("EntityPlayerSP.func_70091_d");

	/**
	 * <p>
	 * Name: prevRenderArmPitch
	 * </p>
	 */
	public static McObfPair field_71164_i = McMappingDatabase.getSRG("field_71164_i");

	/**
	 * <p>
	 * Name: prevTimeInPortal
	 * </p>
	 */
	public static McObfPair field_71080_cy = McMappingDatabase.getSRG("field_71080_cy");

	/**
	 * <p>
	 * Name: isCurrentViewEntity
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175160_A = McMappingDatabase.getSRG("EntityPlayerSP.func_175160_A");

	/**
	 * <p>
	 * Name: isUser
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175144_cb = McMappingDatabase.getSRG("EntityPlayerSP.func_175144_cb");

	/**
	 * <p>
	 * Name: setActiveHand
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumHand;)V]
	 * </p>
	 */
	public static McObfPair func_184598_c = McMappingDatabase.getSRG("EntityPlayerSP.func_184598_c");

	/**
	 * <p>
	 * Name: displayVillagerTradeGui
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/IMerchant;)V]
	 * </p>
	 */
	public static McObfPair func_180472_a = McMappingDatabase.getSRG("EntityPlayerSP.func_180472_a");

	/**
	 * <p>
	 * Name: getLook
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_70676_i = McMappingDatabase.getSRG("EntityPlayerSP.func_70676_i");

	/**
	 * <p>
	 * Name: isServerWorld
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70613_aW = McMappingDatabase.getSRG("EntityPlayerSP.func_70613_aW");

	/**
	 * <p>
	 * Name: onUpdateWalkingPlayer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175161_p = McMappingDatabase.getSRG("EntityPlayerSP.func_175161_p");

	/**
	 * <p>
	 * Name: wasFallFlying
	 * </p>
	 */
	public static McObfPair field_189813_ct = McMappingDatabase.getSRG("field_189813_ct");

	/**
	 * <p>
	 * Name: onEnchantmentCritical
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_71047_c = McMappingDatabase.getSRG("EntityPlayerSP.func_71047_c");

	/**
	 * <p>
	 * Name: playSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundEvent;FF)V]
	 * </p>
	 */
	public static McObfPair func_184185_a = McMappingDatabase.getSRG("EntityPlayerSP.func_184185_a");

	/**
	 * <p>
	 * Name: dropItemAndGetStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityItem;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184816_a = McMappingDatabase.getSRG("EntityPlayerSP.func_184816_a");

	/**
	 * <p>
	 * Name: dismountRidingEntity
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184210_p = McMappingDatabase.getSRG("EntityPlayerSP.func_184210_p");

	/**
	 * <p>
	 * Name: isSneaking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70093_af = McMappingDatabase.getSRG("EntityPlayerSP.func_70093_af");

	/**
	 * <p>
	 * Name: resetActiveHand
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184602_cy = McMappingDatabase.getSRG("EntityPlayerSP.func_184602_cy");

	/**
	 * <p>
	 * Name: isHandActive
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184587_cr = McMappingDatabase.getSRG("EntityPlayerSP.func_184587_cr");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("EntityPlayerSP.func_184206_a");

	/**
	 * <p>
	 * Name: serverSprintState
	 * </p>
	 */
	public static McObfPair field_175171_bO = McMappingDatabase.getSRG("field_175171_bO");

	/**
	 * <p>
	 * Name: lastReportedPosY
	 * </p>
	 */
	public static McObfPair field_175166_bJ = McMappingDatabase.getSRG("field_175166_bJ");

	/**
	 * <p>
	 * Name: openEditStructure
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntityStructure;)V]
	 * </p>
	 */
	public static McObfPair func_189807_a = McMappingDatabase.getSRG("EntityPlayerSP.func_189807_a");

	/**
	 * <p>
	 * Name: handActive
	 * </p>
	 */
	public static McObfPair field_184842_cm = McMappingDatabase.getSRG("field_184842_cm");

	/**
	 * <p>
	 * Name: setPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_184839_n = McMappingDatabase.getSRG("EntityPlayerSP.func_184839_n");

	/**
	 * <p>
	 * Name: horseJumpPower
	 * </p>
	 */
	public static McObfPair field_110321_bQ = McMappingDatabase.getSRG("field_110321_bQ");

	/**
	 * <p>
	 * Name: closeScreenAndDropStack
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175159_q = McMappingDatabase.getSRG("EntityPlayerSP.func_175159_q");

	/**
	 * <p>
	 * Name: sendPlayerAbilities
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71016_p = McMappingDatabase.getSRG("EntityPlayerSP.func_71016_p");

	/**
	 * <p>
	 * Name: positionUpdateTicks
	 * </p>
	 */
	public static McObfPair field_175168_bP = McMappingDatabase.getSRG("field_175168_bP");

	/**
	 * <p>
	 * Name: setXPStats
	 * </p>
	 * <p>
	 * Desc: [(FII)V]
	 * </p>
	 */
	public static McObfPair func_71152_a = McMappingDatabase.getSRG("EntityPlayerSP.func_71152_a");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_71159_c = McMappingDatabase.getSRG("field_71159_c");

	/**
	 * <p>
	 * Name: getServerBrand
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_142021_k = McMappingDatabase.getSRG("EntityPlayerSP.func_142021_k");

	/**
	 * <p>
	 * Name: updateAutoJump
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_189810_i = McMappingDatabase.getSRG("EntityPlayerSP.func_189810_i");

	/**
	 * <p>
	 * Name: updateRidden
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70098_U = McMappingDatabase.getSRG("EntityPlayerSP.func_70098_U");

	/**
	 * <p>
	 * Name: movementInput
	 * </p>
	 */
	public static McObfPair field_71158_b = McMappingDatabase.getSRG("field_71158_b");

	/**
	 * <p>
	 * Name: lastReportedPitch
	 * </p>
	 */
	public static McObfPair field_175165_bM = McMappingDatabase.getSRG("field_175165_bM");

	/**
	 * <p>
	 * Name: isRidingHorse
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110317_t = McMappingDatabase.getSRG("EntityPlayerSP.func_110317_t");

	/**
	 * <p>
	 * Name: displayGuiCommandBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntityCommandBlock;)V]
	 * </p>
	 */
	public static McObfPair func_184824_a = McMappingDatabase.getSRG("EntityPlayerSP.func_184824_a");

	/**
	 * <p>
	 * Name: swingArm
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumHand;)V]
	 * </p>
	 */
	public static McObfPair func_184609_a = McMappingDatabase.getSRG("EntityPlayerSP.func_184609_a");

	/**
	 * <p>
	 * Name: sendStatusMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;Z)V]
	 * </p>
	 */
	public static McObfPair func_146105_b = McMappingDatabase.getSRG("EntityPlayerSP.func_146105_b");

	/**
	 * <p>
	 * Name: openBook
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumHand;)V]
	 * </p>
	 */
	public static McObfPair func_184814_a = McMappingDatabase.getSRG("EntityPlayerSP.func_184814_a");

	/**
	 * <p>
	 * Name: sendHorseJump
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110318_g = McMappingDatabase.getSRG("EntityPlayerSP.func_110318_g");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityPlayerSP.func_70103_a");

	/**
	 * <p>
	 * Name: removeActivePotionEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/Potion;)Lnet/minecraft/potion/PotionEffect;]
	 * </p>
	 */
	public static McObfPair func_184596_c = McMappingDatabase.getSRG("EntityPlayerSP.func_184596_c");

	/**
	 * <p>
	 * Name: sendMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_145747_a = McMappingDatabase.getSRG("EntityPlayerSP.func_145747_a");

	/**
	 * <p>
	 * Name: sendChatMessage
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71165_d = McMappingDatabase.getSRG("EntityPlayerSP.func_71165_d");

	/**
	 * <p>
	 * Name: renderArmYaw
	 * </p>
	 */
	public static McObfPair field_71154_f = McMappingDatabase.getSRG("field_71154_f");

	/**
	 * <p>
	 * Name: connection
	 * </p>
	 */
	public static McObfPair field_71174_a = McMappingDatabase.getSRG("field_71174_a");

	/**
	 * <p>
	 * Name: isRowingBoat
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184838_M = McMappingDatabase.getSRG("EntityPlayerSP.func_184838_M");

	/**
	 * <p>
	 * Name: statWriter
	 * </p>
	 */
	public static McObfPair field_146108_bO = McMappingDatabase.getSRG("field_146108_bO");

	/**
	 * <p>
	 * Name: updateEntityActionState
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70626_be = McMappingDatabase.getSRG("EntityPlayerSP.func_70626_be");

	/**
	 * <p>
	 * Name: openEditSign
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntitySign;)V]
	 * </p>
	 */
	public static McObfPair func_175141_a = McMappingDatabase.getSRG("EntityPlayerSP.func_175141_a");

	/**
	 * <p>
	 * Name: setPlayerSPHealth
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_71150_b = McMappingDatabase.getSRG("EntityPlayerSP.func_71150_b");

	/**
	 * <p>
	 * Name: pushOutOfBlocks
	 * </p>
	 * <p>
	 * Desc: [(DDD)Z]
	 * </p>
	 */
	public static McObfPair func_145771_j = McMappingDatabase.getSRG("EntityPlayerSP.func_145771_j");

	/**
	 * <p>
	 * Name: isAutoJumpEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_189809_N = McMappingDatabase.getSRG("EntityPlayerSP.func_189809_N");

	/**
	 * <p>
	 * Name: dropItem
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/entity/item/EntityItem;]
	 * </p>
	 */
	public static McObfPair func_71040_bB = McMappingDatabase.getSRG("EntityPlayerSP.func_71040_bB");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180425_c = McMappingDatabase.getSRG("EntityPlayerSP.func_180425_c");

	/**
	 * <p>
	 * Name: rowingBoat
	 * </p>
	 */
	public static McObfPair field_184844_co = McMappingDatabase.getSRG("field_184844_co");

	/**
	 * <p>
	 * Name: hasValidHealth
	 * </p>
	 */
	public static McObfPair field_175169_bQ = McMappingDatabase.getSRG("field_175169_bQ");

	/**
	 * <p>
	 * Name: prevOnGround
	 * </p>
	 */
	public static McObfPair field_184841_cd = McMappingDatabase.getSRG("field_184841_cd");

	/**
	 * <p>
	 * Name: sendHorseInventory
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175163_u = McMappingDatabase.getSRG("EntityPlayerSP.func_175163_u");

	/**
	 * <p>
	 * Name: sprintToggleTimer
	 * </p>
	 */
	public static McObfPair field_71156_d = McMappingDatabase.getSRG("field_71156_d");

	/**
	 * <p>
	 * Name: lastReportedPosZ
	 * </p>
	 */
	public static McObfPair field_175167_bK = McMappingDatabase.getSRG("field_175167_bK");

	/**
	 * <p>
	 * Name: serverBrand
	 * </p>
	 */
	public static McObfPair field_142022_ce = McMappingDatabase.getSRG("field_142022_ce");

	/**
	 * <p>
	 * Name: getRecipeBook
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/stats/RecipeBook;]
	 * </p>
	 */
	public static McObfPair func_192035_E = McMappingDatabase.getSRG("EntityPlayerSP.func_192035_E");

	/**
	 * <p>
	 * Name: onCriticalHit
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_71009_b = McMappingDatabase.getSRG("EntityPlayerSP.func_71009_b");

	/**
	 * <p>
	 * Name: startRiding
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Z)Z]
	 * </p>
	 */
	public static McObfPair func_184205_a = McMappingDatabase.getSRG("EntityPlayerSP.func_184205_a");

	/**
	 * <p>
	 * Name: prevRenderArmYaw
	 * </p>
	 */
	public static McObfPair field_71163_h = McMappingDatabase.getSRG("field_71163_h");

	/**
	 * <p>
	 * Name: getHorseJumpPower
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_110319_bJ = McMappingDatabase.getSRG("EntityPlayerSP.func_110319_bJ");

	/**
	 * <p>
	 * Name: closeScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71053_j = McMappingDatabase.getSRG("EntityPlayerSP.func_71053_j");

	/**
	 * <p>
	 * Name: getActiveHand
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumHand;]
	 * </p>
	 */
	public static McObfPair func_184600_cs = McMappingDatabase.getSRG("EntityPlayerSP.func_184600_cs");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityPlayerSP.func_70097_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityPlayerSP.func_70071_h_");

	/**
	 * <p>
	 * Name: serverSneakState
	 * </p>
	 */
	public static McObfPair field_175170_bN = McMappingDatabase.getSRG("field_175170_bN");

	/**
	 * <p>
	 * Name: renderArmPitch
	 * </p>
	 */
	public static McObfPair field_71155_g = McMappingDatabase.getSRG("field_71155_g");

	/**
	 * <p>
	 * Name: permissionLevel
	 * </p>
	 */
	public static McObfPair field_184845_bX = McMappingDatabase.getSRG("field_184845_bX");

	/**
	 * <p>
	 * Name: displayGuiEditCommandCart
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/CommandBlockBaseLogic;)V]
	 * </p>
	 */
	public static McObfPair func_184809_a = McMappingDatabase.getSRG("EntityPlayerSP.func_184809_a");

}

package zdoctor.zcoremod.map.minecraft.client.multiplayer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlayerControllerMP {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsa";
		else
			return "net/minecraft/client/multiplayer/PlayerControllerMP";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsa";
		else
			return "PlayerControllerMP";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsa;";
		else
			return "Lnet/minecraft/client/multiplayer/PlayerControllerMP;";
	}

	/**
	 * <p>
	 * Name: curBlockDamageMP
	 * </p>
	 */
	public static McObfPair field_78770_f = McMappingDatabase.getSRG("field_78770_f");

	/**
	 * <p>
	 * Name: stepSoundTickCounter
	 * </p>
	 */
	public static McObfPair field_78780_h = McMappingDatabase.getSRG("field_78780_h");

	/**
	 * <p>
	 * Name: onPlayerDamageBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_180512_c = McMappingDatabase.getSRG("PlayerControllerMP.func_180512_c");

	/**
	 * <p>
	 * Name: processRightClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_187101_a = McMappingDatabase.getSRG("PlayerControllerMP.func_187101_a");

	/**
	 * <p>
	 * Name: windowClick
	 * </p>
	 * <p>
	 * Desc: [(IIILnet/minecraft/inventory/ClickType;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_187098_a = McMappingDatabase.getSRG("PlayerControllerMP.func_187098_a");

	/**
	 * <p>
	 * Name: currentItemHittingBlock
	 * </p>
	 */
	public static McObfPair field_85183_f = McMappingDatabase.getSRG("field_85183_f");

	/**
	 * <p>
	 * Name: processRightClickBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_187099_a = McMappingDatabase.getSRG("PlayerControllerMP.func_187099_a");

	/**
	 * <p>
	 * Name: shouldDrawHUD
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_78755_b = McMappingDatabase.getSRG("PlayerControllerMP.func_78755_b");

	/**
	 * <p>
	 * Name: clickBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_180511_b = McMappingDatabase.getSRG("PlayerControllerMP.func_180511_b");

	/**
	 * <p>
	 * Name: resetBlockRemoving
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78767_c = McMappingDatabase.getSRG("PlayerControllerMP.func_78767_c");

	/**
	 * <p>
	 * Name: sendPacketDropItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_78752_a = McMappingDatabase.getSRG("PlayerControllerMP.func_78752_a");

	/**
	 * <p>
	 * Name: onStoppedUsingItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_78766_c = McMappingDatabase.getSRG("PlayerControllerMP.func_78766_c");

	/**
	 * <p>
	 * Name: interactWithEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/RayTraceResult;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_187102_a = McMappingDatabase.getSRG("PlayerControllerMP.func_187102_a");

	/**
	 * <p>
	 * Name: clickBlockCreative
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/multiplayer/PlayerControllerMP;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_178891_a = McMappingDatabase.getSRG("PlayerControllerMP.func_178891_a");

	/**
	 * <p>
	 * Name: extendedReach
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_78749_i = McMappingDatabase.getSRG("PlayerControllerMP.func_78749_i");

	/**
	 * <p>
	 * Name: onPlayerDestroyBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_187103_a = McMappingDatabase.getSRG("PlayerControllerMP.func_187103_a");

	/**
	 * <p>
	 * Name: isSpectatorMode
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178887_k = McMappingDatabase.getSRG("PlayerControllerMP.func_178887_k");

	/**
	 * <p>
	 * Name: flipPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_78745_b = McMappingDatabase.getSRG("PlayerControllerMP.func_78745_b");

	/**
	 * <p>
	 * Name: isHittingBlock
	 * </p>
	 */
	public static McObfPair field_78778_j = McMappingDatabase.getSRG("field_78778_j");

	/**
	 * <p>
	 * Name: currentPlayerItem
	 * </p>
	 */
	public static McObfPair field_78777_l = McMappingDatabase.getSRG("field_78777_l");

	/**
	 * <p>
	 * Name: sendEnchantPacket
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_78756_a = McMappingDatabase.getSRG("PlayerControllerMP.func_78756_a");

	/**
	 * <p>
	 * Name: isHittingPosition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_178893_a = McMappingDatabase.getSRG("PlayerControllerMP.func_178893_a");

	/**
	 * <p>
	 * Name: isSpectator
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_78747_a = McMappingDatabase.getSRG("PlayerControllerMP.func_78747_a");

	/**
	 * <p>
	 * Name: blockHitDelay
	 * </p>
	 */
	public static McObfPair field_78781_i = McMappingDatabase.getSRG("field_78781_i");

	/**
	 * <p>
	 * Name: currentGameType
	 * </p>
	 */
	public static McObfPair field_78779_k = McMappingDatabase.getSRG("field_78779_k");

	/**
	 * <p>
	 * Name: createPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/stats/StatisticsManager;Lnet/minecraft/stats/RecipeBook;)Lnet/minecraft/client/entity/EntityPlayerSP;]
	 * </p>
	 */
	public static McObfPair func_192830_a = McMappingDatabase.getSRG("PlayerControllerMP.func_192830_a");

	/**
	 * <p>
	 * Name: getIsHittingBlock
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_181040_m = McMappingDatabase.getSRG("PlayerControllerMP.func_181040_m");

	/**
	 * <p>
	 * Name: updateController
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78765_e = McMappingDatabase.getSRG("PlayerControllerMP.func_78765_e");

	/**
	 * <p>
	 * Name: gameIsSurvivalOrAdventure
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_78763_f = McMappingDatabase.getSRG("PlayerControllerMP.func_78763_f");

	/**
	 * <p>
	 * Name: setGameType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/GameType;)V]
	 * </p>
	 */
	public static McObfPair func_78746_a = McMappingDatabase.getSRG("PlayerControllerMP.func_78746_a");

	/**
	 * <p>
	 * Name: isNotCreative
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_78762_g = McMappingDatabase.getSRG("PlayerControllerMP.func_78762_g");

	/**
	 * <p>
	 * Name: attackEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78764_a = McMappingDatabase.getSRG("PlayerControllerMP.func_78764_a");

	/**
	 * <p>
	 * Name: isInCreativeMode
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_78758_h = McMappingDatabase.getSRG("PlayerControllerMP.func_78758_h");

	/**
	 * <p>
	 * Name: connection
	 * </p>
	 */
	public static McObfPair field_78774_b = McMappingDatabase.getSRG("field_78774_b");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_78776_a = McMappingDatabase.getSRG("field_78776_a");

	/**
	 * <p>
	 * Name: setPlayerCapabilities
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_78748_a = McMappingDatabase.getSRG("PlayerControllerMP.func_78748_a");

	/**
	 * <p>
	 * Name: currentBlock
	 * </p>
	 */
	public static McObfPair field_178895_c = McMappingDatabase.getSRG("field_178895_c");

	/**
	 * <p>
	 * Name: pickItem
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_187100_a = McMappingDatabase.getSRG("PlayerControllerMP.func_187100_a");

	/**
	 * <p>
	 * Name: interactWithEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_187097_a = McMappingDatabase.getSRG("PlayerControllerMP.func_187097_a");

	/**
	 * <p>
	 * Name: sendSlotPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;I)V]
	 * </p>
	 */
	public static McObfPair func_78761_a = McMappingDatabase.getSRG("PlayerControllerMP.func_78761_a");

	/**
	 * <p>
	 * Name: isRidingHorse
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110738_j = McMappingDatabase.getSRG("PlayerControllerMP.func_110738_j");

	/**
	 * <p>
	 * Name: getBlockReachDistance
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_78757_d = McMappingDatabase.getSRG("PlayerControllerMP.func_78757_d");

	/**
	 * <p>
	 * Name: getCurrentGameType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_178889_l = McMappingDatabase.getSRG("PlayerControllerMP.func_178889_l");

	/**
	 * <p>
	 * Name: syncCurrentPlayItem
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78750_j = McMappingDatabase.getSRG("PlayerControllerMP.func_78750_j");

}

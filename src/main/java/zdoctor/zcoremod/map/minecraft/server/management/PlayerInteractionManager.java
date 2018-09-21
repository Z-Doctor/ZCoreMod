package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlayerInteractionManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "or";
		else
			return "net/minecraft/server/management/PlayerInteractionManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "or";
		else
			return "PlayerInteractionManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lor;";
		else
			return "Lnet/minecraft/server/management/PlayerInteractionManager;";
	}

	/**
	 * <p>
	 * Name: tryHarvestBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180237_b = McMappingDatabase.getSRG("PlayerInteractionManager.func_180237_b");

	/**
	 * <p>
	 * Name: initialDamage
	 * </p>
	 */
	public static McObfPair field_73089_e = McMappingDatabase.getSRG("field_73089_e");

	/**
	 * <p>
	 * Name: curblockDamage
	 * </p>
	 */
	public static McObfPair field_73100_i = McMappingDatabase.getSRG("field_73100_i");

	/**
	 * <p>
	 * Name: destroyPos
	 * </p>
	 */
	public static McObfPair field_180240_f = McMappingDatabase.getSRG("field_180240_f");

	/**
	 * <p>
	 * Name: initializeGameType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/GameType;)V]
	 * </p>
	 */
	public static McObfPair func_73077_b = McMappingDatabase.getSRG("PlayerInteractionManager.func_73077_b");

	/**
	 * <p>
	 * Name: processRightClickBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_187251_a = McMappingDatabase.getSRG("PlayerInteractionManager.func_187251_a");

	/**
	 * <p>
	 * Name: isDestroyingBlock
	 * </p>
	 */
	public static McObfPair field_73088_d = McMappingDatabase.getSRG("field_73088_d");

	/**
	 * <p>
	 * Name: setWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldServer;)V]
	 * </p>
	 */
	public static McObfPair func_73080_a = McMappingDatabase.getSRG("PlayerInteractionManager.func_73080_a");

	/**
	 * <p>
	 * Name: survivalOrAdventure
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_180239_c = McMappingDatabase.getSRG("PlayerInteractionManager.func_180239_c");

	/**
	 * <p>
	 * Name: removeBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180235_c = McMappingDatabase.getSRG("PlayerInteractionManager.func_180235_c");

	/**
	 * <p>
	 * Name: gameType
	 * </p>
	 */
	public static McObfPair field_73091_c = McMappingDatabase.getSRG("field_73091_c");

	/**
	 * <p>
	 * Name: cancelDestroyingBlock
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_180238_e = McMappingDatabase.getSRG("PlayerInteractionManager.func_180238_e");

	/**
	 * <p>
	 * Name: setGameType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/GameType;)V]
	 * </p>
	 */
	public static McObfPair func_73076_a = McMappingDatabase.getSRG("PlayerInteractionManager.func_73076_a");

	/**
	 * <p>
	 * Name: updateBlockRemoving
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73075_a = McMappingDatabase.getSRG("PlayerInteractionManager.func_73075_a");

	/**
	 * <p>
	 * Name: processRightClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_187250_a = McMappingDatabase.getSRG("PlayerInteractionManager.func_187250_a");

	/**
	 * <p>
	 * Name: receivedFinishDiggingPacket
	 * </p>
	 */
	public static McObfPair field_73097_j = McMappingDatabase.getSRG("field_73097_j");

	/**
	 * <p>
	 * Name: isCreative
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73083_d = McMappingDatabase.getSRG("PlayerInteractionManager.func_73083_d");

	/**
	 * <p>
	 * Name: getGameType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_73081_b = McMappingDatabase.getSRG("PlayerInteractionManager.func_73081_b");

	/**
	 * <p>
	 * Name: onBlockClicked
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_180784_a = McMappingDatabase.getSRG("PlayerInteractionManager.func_180784_a");

	/**
	 * <p>
	 * Name: initialBlockDamage
	 * </p>
	 */
	public static McObfPair field_73093_n = McMappingDatabase.getSRG("field_73093_n");

	/**
	 * <p>
	 * Name: blockRemoving
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180785_a = McMappingDatabase.getSRG("PlayerInteractionManager.func_180785_a");

	/**
	 * <p>
	 * Name: durabilityRemainingOnBlock
	 * </p>
	 */
	public static McObfPair field_73094_o = McMappingDatabase.getSRG("field_73094_o");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_73092_a = McMappingDatabase.getSRG("field_73092_a");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_73090_b = McMappingDatabase.getSRG("field_73090_b");

	/**
	 * <p>
	 * Name: delayedDestroyPos
	 * </p>
	 */
	public static McObfPair field_180241_i = McMappingDatabase.getSRG("field_180241_i");

}

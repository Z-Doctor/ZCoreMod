package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerWorldEventHandler {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "op";
		else
			return "net/minecraft/world/ServerWorldEventHandler";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "op";
		else
			return "ServerWorldEventHandler";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lop;";
		else
			return "Lnet/minecraft/world/ServerWorldEventHandler;";
	}

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_72782_b = McMappingDatabase.getSRG("field_72782_b");

	/**
	 * <p>
	 * Name: sendBlockBreakProgress
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_180441_b = McMappingDatabase.getSRG("ServerWorldEventHandler.func_180441_b");

	/**
	 * <p>
	 * Name: playRecord
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundEvent;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184377_a = McMappingDatabase.getSRG("ServerWorldEventHandler.func_184377_a");

	/**
	 * <p>
	 * Name: notifyBlockUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/block/state/IBlockState;I)V]
	 * </p>
	 */
	public static McObfPair func_184376_a = McMappingDatabase.getSRG("ServerWorldEventHandler.func_184376_a");

	/**
	 * <p>
	 * Name: notifyLightSet
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_174959_b = McMappingDatabase.getSRG("ServerWorldEventHandler.func_174959_b");

	/**
	 * <p>
	 * Name: playSoundToAllNearExcept
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/SoundEvent;Lnet/minecraft/util/SoundCategory;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_184375_a = McMappingDatabase.getSRG("ServerWorldEventHandler.func_184375_a");

	/**
	 * <p>
	 * Name: broadcastSound
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_180440_a = McMappingDatabase.getSRG("ServerWorldEventHandler.func_180440_a");

	/**
	 * <p>
	 * Name: onEntityAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72703_a = McMappingDatabase.getSRG("ServerWorldEventHandler.func_72703_a");

	/**
	 * <p>
	 * Name: playEvent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_180439_a = McMappingDatabase.getSRG("ServerWorldEventHandler.func_180439_a");

	/**
	 * <p>
	 * Name: spawnParticle
	 * </p>
	 * <p>
	 * Desc: [(IZDDDDDD[I)V]
	 * </p>
	 */
	public static McObfPair func_180442_a = McMappingDatabase.getSRG("ServerWorldEventHandler.func_180442_a");

	/**
	 * <p>
	 * Name: onEntityRemoved
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72709_b = McMappingDatabase.getSRG("ServerWorldEventHandler.func_72709_b");

	/**
	 * <p>
	 * Name: markBlockRangeForRenderUpdate
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_147585_a = McMappingDatabase.getSRG("ServerWorldEventHandler.func_147585_a");

	/**
	 * <p>
	 * Name: mcServer
	 * </p>
	 */
	public static McObfPair field_72783_a = McMappingDatabase.getSRG("field_72783_a");

	/**
	 * <p>
	 * Name: spawnParticle
	 * </p>
	 * <p>
	 * Desc: [(IZZDDDDDD[I)V]
	 * </p>
	 */
	public static McObfPair func_190570_a = McMappingDatabase.getSRG("ServerWorldEventHandler.func_190570_a");

}

package zdoctor.zcoremod.map.minecraft.pathfinding;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PathWorldListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zf";
		else
			return "net/minecraft/pathfinding/PathWorldListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zf";
		else
			return "PathWorldListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lzf;";
		else
			return "Lnet/minecraft/pathfinding/PathWorldListener;";
	}

	/**
	 * <p>
	 * Name: spawnParticle
	 * </p>
	 * <p>
	 * Desc: [(IZZDDDDDD[I)V]
	 * </p>
	 */
	public static McObfPair func_190570_a = McMappingDatabase.getSRG("PathWorldListener.func_190570_a");

	/**
	 * <p>
	 * Name: onEntityRemoved
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72709_b = McMappingDatabase.getSRG("PathWorldListener.func_72709_b");

	/**
	 * <p>
	 * Name: didBlockChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_184378_a = McMappingDatabase.getSRG("PathWorldListener.func_184378_a");

	/**
	 * <p>
	 * Name: playRecord
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundEvent;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184377_a = McMappingDatabase.getSRG("PathWorldListener.func_184377_a");

	/**
	 * <p>
	 * Name: spawnParticle
	 * </p>
	 * <p>
	 * Desc: [(IZDDDDDD[I)V]
	 * </p>
	 */
	public static McObfPair func_180442_a = McMappingDatabase.getSRG("PathWorldListener.func_180442_a");

	/**
	 * <p>
	 * Name: broadcastSound
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_180440_a = McMappingDatabase.getSRG("PathWorldListener.func_180440_a");

	/**
	 * <p>
	 * Name: onEntityAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72703_a = McMappingDatabase.getSRG("PathWorldListener.func_72703_a");

	/**
	 * <p>
	 * Name: sendBlockBreakProgress
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_180441_b = McMappingDatabase.getSRG("PathWorldListener.func_180441_b");

	/**
	 * <p>
	 * Name: markBlockRangeForRenderUpdate
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_147585_a = McMappingDatabase.getSRG("PathWorldListener.func_147585_a");

	/**
	 * <p>
	 * Name: playEvent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_180439_a = McMappingDatabase.getSRG("PathWorldListener.func_180439_a");

	/**
	 * <p>
	 * Name: notifyBlockUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/block/state/IBlockState;I)V]
	 * </p>
	 */
	public static McObfPair func_184376_a = McMappingDatabase.getSRG("PathWorldListener.func_184376_a");

	/**
	 * <p>
	 * Name: playSoundToAllNearExcept
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/SoundEvent;Lnet/minecraft/util/SoundCategory;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_184375_a = McMappingDatabase.getSRG("PathWorldListener.func_184375_a");

	/**
	 * <p>
	 * Name: notifyLightSet
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_174959_b = McMappingDatabase.getSRG("PathWorldListener.func_174959_b");

	/**
	 * <p>
	 * Name: navigations
	 * </p>
	 */
	public static McObfPair field_189519_a = McMappingDatabase.getSRG("field_189519_a");

}

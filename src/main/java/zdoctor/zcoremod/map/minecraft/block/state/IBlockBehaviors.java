package zdoctor.zcoremod.map.minecraft.block.state;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IBlockBehaviors {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awq";
		else
			return "net/minecraft/block/state/IBlockBehaviors";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awq";
		else
			return "IBlockBehaviors";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawq;";
		else
			return "Lnet/minecraft/block/state/IBlockBehaviors;";
	}

	/**
	 * <p>
	 * Name: neighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_189546_a = McMappingDatabase.getSRG("IBlockBehaviors.func_189546_a");

	/**
	 * <p>
	 * Name: onBlockEventReceived
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;II)Z]
	 * </p>
	 */
	public static McObfPair func_189547_a = McMappingDatabase.getSRG("IBlockBehaviors.func_189547_a");

}

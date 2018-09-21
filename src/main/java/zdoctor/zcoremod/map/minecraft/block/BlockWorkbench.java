package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockWorkbench {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "apr";
		else
			return "net/minecraft/block/BlockWorkbench";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "apr";
		else
			return "BlockWorkbench";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lapr;";
		else
			return "Lnet/minecraft/block/BlockWorkbench;";
	}

	/**
	 * <p>
	 * Name: onBlockActivated
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Z]
	 * </p>
	 */
	public static McObfPair func_180639_a = McMappingDatabase.getSRG("BlockWorkbench.func_180639_a");

}

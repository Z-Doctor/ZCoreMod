package zdoctor.zcoremod.map.minecraft.client.renderer.color;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockColors$3 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bik$6";
		else
			return "net/minecraft/client/renderer/color/BlockColors$3";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bik$6";
		else
			return "BlockColors$3";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbik$6;";
		else
			return "Lnet/minecraft/client/renderer/color/BlockColors$3;";
	}

	/**
	 * <p>
	 * Name: colorMultiplier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;I)I]
	 * </p>
	 */
	public static McObfPair func_186720_a = McMappingDatabase.getSRG("BlockColors$3.func_186720_a");

}

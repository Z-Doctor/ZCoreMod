package zdoctor.zcoremod.map.minecraft.client.renderer.color;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockColors$12 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bik$4";
		else
			return "net/minecraft/client/renderer/color/BlockColors$12";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bik$4";
		else
			return "BlockColors$12";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbik$4;";
		else
			return "Lnet/minecraft/client/renderer/color/BlockColors$12;";
	}

	/**
	 * <p>
	 * Name: colorMultiplier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;I)I]
	 * </p>
	 */
	public static McObfPair func_186720_a = McMappingDatabase.getSRG("BlockColors$12.func_186720_a");

}

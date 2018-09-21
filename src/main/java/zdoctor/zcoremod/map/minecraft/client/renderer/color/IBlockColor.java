package zdoctor.zcoremod.map.minecraft.client.renderer.color;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IBlockColor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bij";
		else
			return "net/minecraft/client/renderer/color/IBlockColor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bij";
		else
			return "IBlockColor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbij;";
		else
			return "Lnet/minecraft/client/renderer/color/IBlockColor;";
	}

	/**
	 * <p>
	 * Name: colorMultiplier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;I)I]
	 * </p>
	 */
	public static McObfPair func_186720_a = McMappingDatabase.getSRG("IBlockColor.func_186720_a");

}

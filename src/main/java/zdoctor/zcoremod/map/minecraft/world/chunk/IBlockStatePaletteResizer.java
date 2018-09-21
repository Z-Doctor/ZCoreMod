package zdoctor.zcoremod.map.minecraft.world.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IBlockStatePaletteResizer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayb";
		else
			return "net/minecraft/world/chunk/IBlockStatePaletteResizer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayb";
		else
			return "IBlockStatePaletteResizer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layb;";
		else
			return "Lnet/minecraft/world/chunk/IBlockStatePaletteResizer;";
	}

	/**
	 * <p>
	 * Name: onResize
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_186008_a = McMappingDatabase.getSRG("IBlockStatePaletteResizer.func_186008_a");

}

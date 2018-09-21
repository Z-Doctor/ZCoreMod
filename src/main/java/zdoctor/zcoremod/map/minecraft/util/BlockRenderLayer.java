package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockRenderLayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amm";
		else
			return "net/minecraft/util/BlockRenderLayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amm";
		else
			return "BlockRenderLayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamm;";
		else
			return "Lnet/minecraft/util/BlockRenderLayer;";
	}

	/**
	 * <p>
	 * Name: layerName
	 * </p>
	 */
	public static McObfPair field_180338_e = McMappingDatabase.getSRG("field_180338_e");

}

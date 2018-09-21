package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChestRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvk";
		else
			return "net/minecraft/client/renderer/ChestRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvk";
		else
			return "ChestRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvk;";
		else
			return "Lnet/minecraft/client/renderer/ChestRenderer;";
	}

	/**
	 * <p>
	 * Name: renderChestBrightness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;F)V]
	 * </p>
	 */
	public static McObfPair func_178175_a = McMappingDatabase.getSRG("ChestRenderer.func_178175_a");

}

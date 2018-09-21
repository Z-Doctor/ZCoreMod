package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bva";
		else
			return "net/minecraft/client/renderer/RenderList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bva";
		else
			return "RenderList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbva;";
		else
			return "Lnet/minecraft/client/renderer/RenderList;";
	}

	/**
	 * <p>
	 * Name: renderChunkLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/BlockRenderLayer;)V]
	 * </p>
	 */
	public static McObfPair func_178001_a = McMappingDatabase.getSRG("RenderList.func_178001_a");

}

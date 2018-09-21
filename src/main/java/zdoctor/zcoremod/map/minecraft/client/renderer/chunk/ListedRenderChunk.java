package zdoctor.zcoremod.map.minecraft.client.renderer.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ListedRenderChunk {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxq";
		else
			return "net/minecraft/client/renderer/chunk/ListedRenderChunk";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxq";
		else
			return "ListedRenderChunk";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxq;";
		else
			return "Lnet/minecraft/client/renderer/chunk/ListedRenderChunk;";
	}

	/**
	 * <p>
	 * Name: deleteGlResources
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178566_a = McMappingDatabase.getSRG("ListedRenderChunk.func_178566_a");

	/**
	 * <p>
	 * Name: baseDisplayList
	 * </p>
	 */
	public static McObfPair field_178601_d = McMappingDatabase.getSRG("field_178601_d");

	/**
	 * <p>
	 * Name: getDisplayList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/BlockRenderLayer;Lnet/minecraft/client/renderer/chunk/CompiledChunk;)I]
	 * </p>
	 */
	public static McObfPair func_178600_a = McMappingDatabase.getSRG("ListedRenderChunk.func_178600_a");

}

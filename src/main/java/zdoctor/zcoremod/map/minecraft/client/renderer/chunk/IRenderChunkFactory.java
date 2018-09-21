package zdoctor.zcoremod.map.minecraft.client.renderer.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IRenderChunkFactory {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxs";
		else
			return "net/minecraft/client/renderer/chunk/IRenderChunkFactory";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxs";
		else
			return "IRenderChunkFactory";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxs;";
		else
			return "Lnet/minecraft/client/renderer/chunk/IRenderChunkFactory;";
	}

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/client/renderer/RenderGlobal;I)Lnet/minecraft/client/renderer/chunk/RenderChunk;]
	 * </p>
	 */
	public static McObfPair func_189565_a = McMappingDatabase.getSRG("IRenderChunkFactory.func_189565_a");

}

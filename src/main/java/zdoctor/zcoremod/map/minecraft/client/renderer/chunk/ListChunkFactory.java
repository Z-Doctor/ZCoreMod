package zdoctor.zcoremod.map.minecraft.client.renderer.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ListChunkFactory {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxp";
		else
			return "net/minecraft/client/renderer/chunk/ListChunkFactory";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxp";
		else
			return "ListChunkFactory";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxp;";
		else
			return "Lnet/minecraft/client/renderer/chunk/ListChunkFactory;";
	}

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/client/renderer/RenderGlobal;I)Lnet/minecraft/client/renderer/chunk/RenderChunk;]
	 * </p>
	 */
	public static McObfPair func_189565_a = McMappingDatabase.getSRG("ListChunkFactory.func_189565_a");

}

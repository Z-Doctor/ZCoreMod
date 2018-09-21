package zdoctor.zcoremod.map.minecraft.client.renderer.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CompiledChunk$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxo$1";
		else
			return "net/minecraft/client/renderer/chunk/CompiledChunk$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxo$1";
		else
			return "CompiledChunk$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxo$1;";
		else
			return "Lnet/minecraft/client/renderer/chunk/CompiledChunk$1;";
	}

	/**
	 * <p>
	 * Name: isVisible
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_178495_a = McMappingDatabase.getSRG("CompiledChunk$1.func_178495_a");

	/**
	 * <p>
	 * Name: setLayerUsed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/BlockRenderLayer;)V]
	 * </p>
	 */
	public static McObfPair func_178486_a = McMappingDatabase.getSRG("CompiledChunk$1.func_178486_a");

	/**
	 * <p>
	 * Name: setLayerStarted
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/BlockRenderLayer;)V]
	 * </p>
	 */
	public static McObfPair func_178493_c = McMappingDatabase.getSRG("CompiledChunk$1.func_178493_c");

}

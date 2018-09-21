package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class VboRenderList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvf";
		else
			return "net/minecraft/client/renderer/VboRenderList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvf";
		else
			return "VboRenderList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvf;";
		else
			return "Lnet/minecraft/client/renderer/VboRenderList;";
	}

	/**
	 * <p>
	 * Name: setupArrayPointers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178010_a = McMappingDatabase.getSRG("VboRenderList.func_178010_a");

	/**
	 * <p>
	 * Name: renderChunkLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/BlockRenderLayer;)V]
	 * </p>
	 */
	public static McObfPair func_178001_a = McMappingDatabase.getSRG("VboRenderList.func_178001_a");

}

package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BakedQuadRetextured {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvw";
		else
			return "net/minecraft/client/renderer/block/model/BakedQuadRetextured";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvw";
		else
			return "BakedQuadRetextured";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvw;";
		else
			return "Lnet/minecraft/client/renderer/block/model/BakedQuadRetextured;";
	}

	/**
	 * <p>
	 * Name: texture
	 * </p>
	 */
	public static McObfPair field_178218_d = McMappingDatabase.getSRG("field_178218_d");

	/**
	 * <p>
	 * Name: remapQuad
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178217_e = McMappingDatabase.getSRG("BakedQuadRetextured.func_178217_e");

}

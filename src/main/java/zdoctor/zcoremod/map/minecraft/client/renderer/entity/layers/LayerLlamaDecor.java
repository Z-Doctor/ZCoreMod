package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerLlamaDecor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccd";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerLlamaDecor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccd";
		else
			return "LayerLlamaDecor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lccd;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerLlamaDecor;";
	}

	/**
	 * <p>
	 * Name: model
	 * </p>
	 */
	public static McObfPair field_191366_c = McMappingDatabase.getSRG("field_191366_c");

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerLlamaDecor.func_177142_b");

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityLlama;FFFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerLlamaDecor.func_177141_a");

	/**
	 * <p>
	 * Name: LLAMA_DECOR_TEXTURES
	 * </p>
	 */
	public static McObfPair field_191364_a = McMappingDatabase.getSRG("field_191364_a");

	/**
	 * <p>
	 * Name: renderer
	 * </p>
	 */
	public static McObfPair field_191365_b = McMappingDatabase.getSRG("field_191365_b");

}

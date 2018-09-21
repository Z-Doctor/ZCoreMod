package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerStrayClothing {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccl";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerStrayClothing";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccl";
		else
			return "LayerStrayClothing";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lccl;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerStrayClothing;";
	}

	/**
	 * <p>
	 * Name: layerModel
	 * </p>
	 */
	public static McObfPair field_190094_c = McMappingDatabase.getSRG("field_190094_c");

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityStray;FFFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerStrayClothing.func_177141_a");

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerStrayClothing.func_177142_b");

	/**
	 * <p>
	 * Name: STRAY_CLOTHES_TEXTURES
	 * </p>
	 */
	public static McObfPair field_190092_a = McMappingDatabase.getSRG("field_190092_a");

	/**
	 * <p>
	 * Name: renderer
	 * </p>
	 */
	public static McObfPair field_190093_b = McMappingDatabase.getSRG("field_190093_b");

}

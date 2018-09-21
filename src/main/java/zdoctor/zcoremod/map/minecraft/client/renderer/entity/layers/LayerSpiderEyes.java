package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerSpiderEyes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cck";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerSpiderEyes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cck";
		else
			return "LayerSpiderEyes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcck;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerSpiderEyes;";
	}

	/**
	 * <p>
	 * Name: SPIDER_EYES
	 * </p>
	 */
	public static McObfPair field_177150_a = McMappingDatabase.getSRG("field_177150_a");

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerSpiderEyes.func_177142_b");

	/**
	 * <p>
	 * Name: spiderRenderer
	 * </p>
	 */
	public static McObfPair field_177149_b = McMappingDatabase.getSRG("field_177149_b");

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntitySpider;FFFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerSpiderEyes.func_177141_a");

}

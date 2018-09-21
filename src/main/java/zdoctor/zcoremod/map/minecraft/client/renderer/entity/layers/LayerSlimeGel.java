package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerSlimeGel {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cci";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerSlimeGel";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cci";
		else
			return "LayerSlimeGel";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcci;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerSlimeGel;";
	}

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerSlimeGel.func_177142_b");

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntitySlime;FFFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerSlimeGel.func_177141_a");

	/**
	 * <p>
	 * Name: slimeRenderer
	 * </p>
	 */
	public static McObfPair field_177161_a = McMappingDatabase.getSRG("field_177161_a");

	/**
	 * <p>
	 * Name: slimeModel
	 * </p>
	 */
	public static McObfPair field_177160_b = McMappingDatabase.getSRG("field_177160_b");

}

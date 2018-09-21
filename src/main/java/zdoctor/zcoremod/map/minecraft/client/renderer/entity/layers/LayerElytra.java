package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerElytra {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbw";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerElytra";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbw";
		else
			return "LayerElytra";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbw;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerElytra;";
	}

	/**
	 * <p>
	 * Name: TEXTURE_ELYTRA
	 * </p>
	 */
	public static McObfPair field_188355_a = McMappingDatabase.getSRG("field_188355_a");

	/**
	 * <p>
	 * Name: renderPlayer
	 * </p>
	 */
	public static McObfPair field_188356_b = McMappingDatabase.getSRG("field_188356_b");

	/**
	 * <p>
	 * Name: modelElytra
	 * </p>
	 */
	public static McObfPair field_188357_c = McMappingDatabase.getSRG("field_188357_c");

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerElytra.func_177142_b");

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerElytra.func_177141_a");

}

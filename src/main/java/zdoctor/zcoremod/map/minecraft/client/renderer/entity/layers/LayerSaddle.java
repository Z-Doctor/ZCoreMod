package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerSaddle {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccf";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerSaddle";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccf";
		else
			return "LayerSaddle";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lccf;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerSaddle;";
	}

	/**
	 * <p>
	 * Name: pigRenderer
	 * </p>
	 */
	public static McObfPair field_177156_b = McMappingDatabase.getSRG("field_177156_b");

	/**
	 * <p>
	 * Name: pigModel
	 * </p>
	 */
	public static McObfPair field_177157_c = McMappingDatabase.getSRG("field_177157_c");

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerSaddle.func_177142_b");

	/**
	 * <p>
	 * Name: TEXTURE
	 * </p>
	 */
	public static McObfPair field_177158_a = McMappingDatabase.getSRG("field_177158_a");

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityPig;FFFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerSaddle.func_177141_a");

}

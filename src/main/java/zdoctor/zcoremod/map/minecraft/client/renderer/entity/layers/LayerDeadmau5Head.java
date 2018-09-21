package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerDeadmau5Head {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbv";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerDeadmau5Head";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbv";
		else
			return "LayerDeadmau5Head";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbv;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerDeadmau5Head;";
	}

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/entity/AbstractClientPlayer;FFFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerDeadmau5Head.func_177141_a");

	/**
	 * <p>
	 * Name: playerRenderer
	 * </p>
	 */
	public static McObfPair field_177208_a = McMappingDatabase.getSRG("field_177208_a");

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerDeadmau5Head.func_177142_b");

}

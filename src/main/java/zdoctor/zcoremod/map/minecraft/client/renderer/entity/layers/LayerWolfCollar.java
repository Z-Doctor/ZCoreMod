package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerWolfCollar {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccq";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerWolfCollar";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccq";
		else
			return "LayerWolfCollar";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lccq;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerWolfCollar;";
	}

	/**
	 * <p>
	 * Name: WOLF_COLLAR
	 * </p>
	 */
	public static McObfPair field_177147_a = McMappingDatabase.getSRG("field_177147_a");

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerWolfCollar.func_177142_b");

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityWolf;FFFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerWolfCollar.func_177141_a");

	/**
	 * <p>
	 * Name: wolfRenderer
	 * </p>
	 */
	public static McObfPair field_177146_b = McMappingDatabase.getSRG("field_177146_b");

}

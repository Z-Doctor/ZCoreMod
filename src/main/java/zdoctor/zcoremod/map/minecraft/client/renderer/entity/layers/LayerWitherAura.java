package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerWitherAura {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccp";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerWitherAura";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccp";
		else
			return "LayerWitherAura";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lccp;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerWitherAura;";
	}

	/**
	 * <p>
	 * Name: witherModel
	 * </p>
	 */
	public static McObfPair field_177216_c = McMappingDatabase.getSRG("field_177216_c");

	/**
	 * <p>
	 * Name: witherRenderer
	 * </p>
	 */
	public static McObfPair field_177215_b = McMappingDatabase.getSRG("field_177215_b");

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerWitherAura.func_177142_b");

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/boss/EntityWither;FFFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerWitherAura.func_177141_a");

	/**
	 * <p>
	 * Name: WITHER_ARMOR
	 * </p>
	 */
	public static McObfPair field_177217_a = McMappingDatabase.getSRG("field_177217_a");

}

package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerHeldItemWitch {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cco";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerHeldItemWitch";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cco";
		else
			return "LayerHeldItemWitch";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcco;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerHeldItemWitch;";
	}

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerHeldItemWitch.func_177142_b");

	/**
	 * <p>
	 * Name: witchRenderer
	 * </p>
	 */
	public static McObfPair field_177144_a = McMappingDatabase.getSRG("field_177144_a");

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityWitch;FFFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerHeldItemWitch.func_177141_a");

}

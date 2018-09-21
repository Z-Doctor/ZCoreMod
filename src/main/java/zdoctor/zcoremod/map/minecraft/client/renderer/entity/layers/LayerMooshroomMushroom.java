package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerMooshroomMushroom {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cce";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerMooshroomMushroom";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cce";
		else
			return "LayerMooshroomMushroom";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcce;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerMooshroomMushroom;";
	}

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityMooshroom;FFFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerMooshroomMushroom.func_177141_a");

	/**
	 * <p>
	 * Name: mooshroomRenderer
	 * </p>
	 */
	public static McObfPair field_177205_a = McMappingDatabase.getSRG("field_177205_a");

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerMooshroomMushroom.func_177142_b");

}

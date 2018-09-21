package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerCreeperCharge {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbt";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerCreeperCharge";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbt";
		else
			return "LayerCreeperCharge";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbt;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerCreeperCharge;";
	}

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerCreeperCharge.func_177142_b");

	/**
	 * <p>
	 * Name: LIGHTNING_TEXTURE
	 * </p>
	 */
	public static McObfPair field_177172_a = McMappingDatabase.getSRG("field_177172_a");

	/**
	 * <p>
	 * Name: creeperModel
	 * </p>
	 */
	public static McObfPair field_177171_c = McMappingDatabase.getSRG("field_177171_c");

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityCreeper;FFFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerCreeperCharge.func_177141_a");

	/**
	 * <p>
	 * Name: creeperRenderer
	 * </p>
	 */
	public static McObfPair field_177170_b = McMappingDatabase.getSRG("field_177170_b");

}

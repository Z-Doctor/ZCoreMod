package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerEndermanEyes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbz";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerEndermanEyes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbz";
		else
			return "LayerEndermanEyes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbz;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerEndermanEyes;";
	}

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityEnderman;FFFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerEndermanEyes.func_177141_a");

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerEndermanEyes.func_177142_b");

	/**
	 * <p>
	 * Name: RES_ENDERMAN_EYES
	 * </p>
	 */
	public static McObfPair field_177203_a = McMappingDatabase.getSRG("field_177203_a");

	/**
	 * <p>
	 * Name: endermanRenderer
	 * </p>
	 */
	public static McObfPair field_177202_b = McMappingDatabase.getSRG("field_177202_b");

}

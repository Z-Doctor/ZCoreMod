package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerEnderDragonEyes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cby";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerEnderDragonEyes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cby";
		else
			return "LayerEnderDragonEyes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcby;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerEnderDragonEyes;";
	}

	/**
	 * <p>
	 * Name: TEXTURE
	 * </p>
	 */
	public static McObfPair field_177212_a = McMappingDatabase.getSRG("field_177212_a");

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerEnderDragonEyes.func_177141_a");

	/**
	 * <p>
	 * Name: dragonRenderer
	 * </p>
	 */
	public static McObfPair field_177211_b = McMappingDatabase.getSRG("field_177211_b");

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerEnderDragonEyes.func_177142_b");

}

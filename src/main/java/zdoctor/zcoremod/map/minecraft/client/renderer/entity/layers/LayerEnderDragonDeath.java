package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerEnderDragonDeath {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbx";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerEnderDragonDeath";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbx";
		else
			return "LayerEnderDragonDeath";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbx;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerEnderDragonDeath;";
	}

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerEnderDragonDeath.func_177141_a");

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerEnderDragonDeath.func_177142_b");

}

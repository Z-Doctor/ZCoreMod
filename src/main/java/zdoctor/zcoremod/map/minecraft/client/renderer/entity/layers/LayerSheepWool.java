package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerSheepWool {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cch";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerSheepWool";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cch";
		else
			return "LayerSheepWool";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcch;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerSheepWool;";
	}

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerSheepWool.func_177142_b");

	/**
	 * <p>
	 * Name: TEXTURE
	 * </p>
	 */
	public static McObfPair field_177165_a = McMappingDatabase.getSRG("field_177165_a");

	/**
	 * <p>
	 * Name: sheepModel
	 * </p>
	 */
	public static McObfPair field_177164_c = McMappingDatabase.getSRG("field_177164_c");

	/**
	 * <p>
	 * Name: sheepRenderer
	 * </p>
	 */
	public static McObfPair field_177163_b = McMappingDatabase.getSRG("field_177163_b");

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntitySheep;FFFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerSheepWool.func_177141_a");

}

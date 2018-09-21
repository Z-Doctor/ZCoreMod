package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerHeldItem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccc";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerHeldItem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccc";
		else
			return "LayerHeldItem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lccc;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerHeldItem;";
	}

	/**
	 * <p>
	 * Name: livingEntityRenderer
	 * </p>
	 */
	public static McObfPair field_177206_a = McMappingDatabase.getSRG("field_177206_a");

	/**
	 * <p>
	 * Name: renderHeldItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;Lnet/minecraft/util/EnumHandSide;)V]
	 * </p>
	 */
	public static McObfPair func_188358_a = McMappingDatabase.getSRG("LayerHeldItem.func_188358_a");

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerHeldItem.func_177142_b");

	/**
	 * <p>
	 * Name: translateToHand
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumHandSide;)V]
	 * </p>
	 */
	public static McObfPair func_191361_a = McMappingDatabase.getSRG("LayerHeldItem.func_191361_a");

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerHeldItem.func_177141_a");

}

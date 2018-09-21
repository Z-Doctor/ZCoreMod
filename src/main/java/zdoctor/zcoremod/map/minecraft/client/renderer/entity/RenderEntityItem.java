package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderEntityItem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzu";
		else
			return "net/minecraft/client/renderer/entity/RenderEntityItem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzu";
		else
			return "RenderEntityItem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzu;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderEntityItem;";
	}

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityItem;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderEntityItem.func_76986_a");

	/**
	 * <p>
	 * Name: getModelCount
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_177078_a = McMappingDatabase.getSRG("RenderEntityItem.func_177078_a");

	/**
	 * <p>
	 * Name: random
	 * </p>
	 */
	public static McObfPair field_177079_e = McMappingDatabase.getSRG("field_177079_e");

	/**
	 * <p>
	 * Name: itemRenderer
	 * </p>
	 */
	public static McObfPair field_177080_a = McMappingDatabase.getSRG("field_177080_a");

	/**
	 * <p>
	 * Name: transformModelCount
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityItem;DDDFLnet/minecraft/client/renderer/block/model/IBakedModel;)I]
	 * </p>
	 */
	public static McObfPair func_177077_a = McMappingDatabase.getSRG("RenderEntityItem.func_177077_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityItem;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderEntityItem.func_110775_a");

}

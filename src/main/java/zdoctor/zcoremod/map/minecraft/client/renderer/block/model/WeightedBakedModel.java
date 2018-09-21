package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WeightedBakedModel {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgg";
		else
			return "net/minecraft/client/renderer/block/model/WeightedBakedModel";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgg";
		else
			return "WeightedBakedModel";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgg;";
		else
			return "Lnet/minecraft/client/renderer/block/model/WeightedBakedModel;";
	}

	/**
	 * <p>
	 * Name: getOverrides
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/ItemOverrideList;]
	 * </p>
	 */
	public static McObfPair func_188617_f = McMappingDatabase.getSRG("WeightedBakedModel.func_188617_f");

	/**
	 * <p>
	 * Name: getParticleTexture
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;]
	 * </p>
	 */
	public static McObfPair func_177554_e = McMappingDatabase.getSRG("WeightedBakedModel.func_177554_e");

	/**
	 * <p>
	 * Name: getQuads
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/EnumFacing;J)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_188616_a = McMappingDatabase.getSRG("WeightedBakedModel.func_188616_a");

	/**
	 * <p>
	 * Name: getRandomModel
	 * </p>
	 * <p>
	 * Desc: [(J)Lnet/minecraft/client/renderer/block/model/IBakedModel;]
	 * </p>
	 */
	public static McObfPair func_188627_a = McMappingDatabase.getSRG("WeightedBakedModel.func_188627_a");

	/**
	 * <p>
	 * Name: isAmbientOcclusion
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177555_b = McMappingDatabase.getSRG("WeightedBakedModel.func_177555_b");

	/**
	 * <p>
	 * Name: isGui3d
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177556_c = McMappingDatabase.getSRG("WeightedBakedModel.func_177556_c");

	/**
	 * <p>
	 * Name: baseModel
	 * </p>
	 */
	public static McObfPair field_177566_c = McMappingDatabase.getSRG("field_177566_c");

	/**
	 * <p>
	 * Name: totalWeight
	 * </p>
	 */
	public static McObfPair field_177567_a = McMappingDatabase.getSRG("field_177567_a");

	/**
	 * <p>
	 * Name: getItemCameraTransforms
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms;]
	 * </p>
	 */
	public static McObfPair func_177552_f = McMappingDatabase.getSRG("WeightedBakedModel.func_177552_f");

	/**
	 * <p>
	 * Name: models
	 * </p>
	 */
	public static McObfPair field_177565_b = McMappingDatabase.getSRG("field_177565_b");

	/**
	 * <p>
	 * Name: isBuiltInRenderer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188618_c = McMappingDatabase.getSRG("WeightedBakedModel.func_188618_c");

}

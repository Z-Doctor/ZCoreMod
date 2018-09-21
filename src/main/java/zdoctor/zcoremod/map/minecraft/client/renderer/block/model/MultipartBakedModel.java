package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MultipartBakedModel {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cge";
		else
			return "net/minecraft/client/renderer/block/model/MultipartBakedModel";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cge";
		else
			return "MultipartBakedModel";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcge;";
		else
			return "Lnet/minecraft/client/renderer/block/model/MultipartBakedModel;";
	}

	/**
	 * <p>
	 * Name: isAmbientOcclusion
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177555_b = McMappingDatabase.getSRG("MultipartBakedModel.func_177555_b");

	/**
	 * <p>
	 * Name: gui3D
	 * </p>
	 */
	public static McObfPair field_188622_b = McMappingDatabase.getSRG("field_188622_b");

	/**
	 * <p>
	 * Name: overrides
	 * </p>
	 */
	public static McObfPair field_188625_e = McMappingDatabase.getSRG("field_188625_e");

	/**
	 * <p>
	 * Name: selectors
	 * </p>
	 */
	public static McObfPair field_188626_f = McMappingDatabase.getSRG("field_188626_f");

	/**
	 * <p>
	 * Name: isBuiltInRenderer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188618_c = McMappingDatabase.getSRG("MultipartBakedModel.func_188618_c");

	/**
	 * <p>
	 * Name: getOverrides
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/ItemOverrideList;]
	 * </p>
	 */
	public static McObfPair func_188617_f = McMappingDatabase.getSRG("MultipartBakedModel.func_188617_f");

	/**
	 * <p>
	 * Name: getParticleTexture
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;]
	 * </p>
	 */
	public static McObfPair func_177554_e = McMappingDatabase.getSRG("MultipartBakedModel.func_177554_e");

	/**
	 * <p>
	 * Name: particleTexture
	 * </p>
	 */
	public static McObfPair field_188623_c = McMappingDatabase.getSRG("field_188623_c");

	/**
	 * <p>
	 * Name: ambientOcclusion
	 * </p>
	 */
	public static McObfPair field_188621_a = McMappingDatabase.getSRG("field_188621_a");

	/**
	 * <p>
	 * Name: getQuads
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/EnumFacing;J)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_188616_a = McMappingDatabase.getSRG("MultipartBakedModel.func_188616_a");

	/**
	 * <p>
	 * Name: getItemCameraTransforms
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms;]
	 * </p>
	 */
	public static McObfPair func_177552_f = McMappingDatabase.getSRG("MultipartBakedModel.func_177552_f");

	/**
	 * <p>
	 * Name: isGui3d
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177556_c = McMappingDatabase.getSRG("MultipartBakedModel.func_177556_c");

	/**
	 * <p>
	 * Name: cameraTransforms
	 * </p>
	 */
	public static McObfPair field_188624_d = McMappingDatabase.getSRG("field_188624_d");

}

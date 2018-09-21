package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SimpleBakedModel {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgf";
		else
			return "net/minecraft/client/renderer/block/model/SimpleBakedModel";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgf";
		else
			return "SimpleBakedModel";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgf;";
		else
			return "Lnet/minecraft/client/renderer/block/model/SimpleBakedModel;";
	}

	/**
	 * <p>
	 * Name: gui3d
	 * </p>
	 */
	public static McObfPair field_177559_d = McMappingDatabase.getSRG("field_177559_d");

	/**
	 * <p>
	 * Name: generalQuads
	 * </p>
	 */
	public static McObfPair field_177563_a = McMappingDatabase.getSRG("field_177563_a");

	/**
	 * <p>
	 * Name: isBuiltInRenderer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188618_c = McMappingDatabase.getSRG("SimpleBakedModel.func_188618_c");

	/**
	 * <p>
	 * Name: faceQuads
	 * </p>
	 */
	public static McObfPair field_177561_b = McMappingDatabase.getSRG("field_177561_b");

	/**
	 * <p>
	 * Name: cameraTransforms
	 * </p>
	 */
	public static McObfPair field_177558_f = McMappingDatabase.getSRG("field_177558_f");

	/**
	 * <p>
	 * Name: getOverrides
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/ItemOverrideList;]
	 * </p>
	 */
	public static McObfPair func_188617_f = McMappingDatabase.getSRG("SimpleBakedModel.func_188617_f");

	/**
	 * <p>
	 * Name: ambientOcclusion
	 * </p>
	 */
	public static McObfPair field_177562_c = McMappingDatabase.getSRG("field_177562_c");

	/**
	 * <p>
	 * Name: isAmbientOcclusion
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177555_b = McMappingDatabase.getSRG("SimpleBakedModel.func_177555_b");

	/**
	 * <p>
	 * Name: texture
	 * </p>
	 */
	public static McObfPair field_177560_e = McMappingDatabase.getSRG("field_177560_e");

	/**
	 * <p>
	 * Name: getItemCameraTransforms
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms;]
	 * </p>
	 */
	public static McObfPair func_177552_f = McMappingDatabase.getSRG("SimpleBakedModel.func_177552_f");

	/**
	 * <p>
	 * Name: itemOverrideList
	 * </p>
	 */
	public static McObfPair field_188620_g = McMappingDatabase.getSRG("field_188620_g");

	/**
	 * <p>
	 * Name: isGui3d
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177556_c = McMappingDatabase.getSRG("SimpleBakedModel.func_177556_c");

	/**
	 * <p>
	 * Name: getQuads
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/EnumFacing;J)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_188616_a = McMappingDatabase.getSRG("SimpleBakedModel.func_188616_a");

	/**
	 * <p>
	 * Name: getParticleTexture
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;]
	 * </p>
	 */
	public static McObfPair func_177554_e = McMappingDatabase.getSRG("SimpleBakedModel.func_177554_e");

}

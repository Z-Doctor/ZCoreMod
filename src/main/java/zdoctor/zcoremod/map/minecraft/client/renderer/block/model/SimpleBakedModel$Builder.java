package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SimpleBakedModel$Builder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgf$a";
		else
			return "net/minecraft/client/renderer/block/model/SimpleBakedModel$Builder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgf$a";
		else
			return "SimpleBakedModel$Builder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgf$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/SimpleBakedModel$Builder;";
	}

	/**
	 * <p>
	 * Name: builderCameraTransforms
	 * </p>
	 */
	public static McObfPair field_177651_f = McMappingDatabase.getSRG("field_177651_f");

	/**
	 * <p>
	 * Name: addGeneralQuads
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/client/renderer/block/model/IBakedModel;Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;J)V]
	 * </p>
	 */
	public static McObfPair func_188645_a = McMappingDatabase.getSRG("SimpleBakedModel$Builder.func_188645_a");

	/**
	 * <p>
	 * Name: addFaceQuads
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/client/renderer/block/model/IBakedModel;Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;Lnet/minecraft/util/EnumFacing;J)V]
	 * </p>
	 */
	public static McObfPair func_188644_a = McMappingDatabase.getSRG("SimpleBakedModel$Builder.func_188644_a");

	/**
	 * <p>
	 * Name: builderFaceQuads
	 * </p>
	 */
	public static McObfPair field_177654_b = McMappingDatabase.getSRG("field_177654_b");

	/**
	 * <p>
	 * Name: setTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;)Lnet/minecraft/client/renderer/block/model/SimpleBakedModel$Builder;]
	 * </p>
	 */
	public static McObfPair func_177646_a = McMappingDatabase.getSRG("SimpleBakedModel$Builder.func_177646_a");

	/**
	 * <p>
	 * Name: addFaceQuad
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;Lnet/minecraft/client/renderer/block/model/BakedQuad;)Lnet/minecraft/client/renderer/block/model/SimpleBakedModel$Builder;]
	 * </p>
	 */
	public static McObfPair func_177650_a = McMappingDatabase.getSRG("SimpleBakedModel$Builder.func_177650_a");

	/**
	 * <p>
	 * Name: builderTexture
	 * </p>
	 */
	public static McObfPair field_177652_d = McMappingDatabase.getSRG("field_177652_d");

	/**
	 * <p>
	 * Name: addGeneralQuad
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/BakedQuad;)Lnet/minecraft/client/renderer/block/model/SimpleBakedModel$Builder;]
	 * </p>
	 */
	public static McObfPair func_177648_a = McMappingDatabase.getSRG("SimpleBakedModel$Builder.func_177648_a");

	/**
	 * <p>
	 * Name: builderGui3d
	 * </p>
	 */
	public static McObfPair field_177653_e = McMappingDatabase.getSRG("field_177653_e");

	/**
	 * <p>
	 * Name: builderGeneralQuads
	 * </p>
	 */
	public static McObfPair field_177656_a = McMappingDatabase.getSRG("field_177656_a");

	/**
	 * <p>
	 * Name: makeBakedModel
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/IBakedModel;]
	 * </p>
	 */
	public static McObfPair func_177645_b = McMappingDatabase.getSRG("SimpleBakedModel$Builder.func_177645_b");

	/**
	 * <p>
	 * Name: builderItemOverrideList
	 * </p>
	 */
	public static McObfPair field_188646_c = McMappingDatabase.getSRG("field_188646_c");

	/**
	 * <p>
	 * Name: builderAmbientOcclusion
	 * </p>
	 */
	public static McObfPair field_177655_c = McMappingDatabase.getSRG("field_177655_c");

}

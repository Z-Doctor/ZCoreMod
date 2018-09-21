package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IBakedModel {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfy";
		else
			return "net/minecraft/client/renderer/block/model/IBakedModel";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfy";
		else
			return "IBakedModel";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcfy;";
		else
			return "Lnet/minecraft/client/renderer/block/model/IBakedModel;";
	}

	/**
	 * <p>
	 * Name: getItemCameraTransforms
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms;]
	 * </p>
	 */
	public static McObfPair func_177552_f = McMappingDatabase.getSRG("IBakedModel.func_177552_f");

	/**
	 * <p>
	 * Name: getOverrides
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/ItemOverrideList;]
	 * </p>
	 */
	public static McObfPair func_188617_f = McMappingDatabase.getSRG("IBakedModel.func_188617_f");

	/**
	 * <p>
	 * Name: isAmbientOcclusion
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177555_b = McMappingDatabase.getSRG("IBakedModel.func_177555_b");

	/**
	 * <p>
	 * Name: isBuiltInRenderer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188618_c = McMappingDatabase.getSRG("IBakedModel.func_188618_c");

	/**
	 * <p>
	 * Name: getQuads
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/EnumFacing;J)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_188616_a = McMappingDatabase.getSRG("IBakedModel.func_188616_a");

	/**
	 * <p>
	 * Name: isGui3d
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177556_c = McMappingDatabase.getSRG("IBakedModel.func_177556_c");

	/**
	 * <p>
	 * Name: getParticleTexture
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;]
	 * </p>
	 */
	public static McObfPair func_177554_e = McMappingDatabase.getSRG("IBakedModel.func_177554_e");

}

package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockModelShapes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvl";
		else
			return "net/minecraft/client/renderer/BlockModelShapes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvl";
		else
			return "BlockModelShapes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvl;";
		else
			return "Lnet/minecraft/client/renderer/BlockModelShapes;";
	}

	/**
	 * <p>
	 * Name: registerBuiltInBlocks
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_178123_a = McMappingDatabase.getSRG("BlockModelShapes.func_178123_a");

	/**
	 * <p>
	 * Name: getModelManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/ModelManager;]
	 * </p>
	 */
	public static McObfPair func_178126_b = McMappingDatabase.getSRG("BlockModelShapes.func_178126_b");

	/**
	 * <p>
	 * Name: blockStateMapper
	 * </p>
	 */
	public static McObfPair field_178127_b = McMappingDatabase.getSRG("field_178127_b");

	/**
	 * <p>
	 * Name: getBlockStateMapper
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/statemap/BlockStateMapper;]
	 * </p>
	 */
	public static McObfPair func_178120_a = McMappingDatabase.getSRG("BlockModelShapes.func_178120_a");

	/**
	 * <p>
	 * Name: getModelForState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/client/renderer/block/model/IBakedModel;]
	 * </p>
	 */
	public static McObfPair func_178125_b = McMappingDatabase.getSRG("BlockModelShapes.func_178125_b");

	/**
	 * <p>
	 * Name: registerAllBlocks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178119_d = McMappingDatabase.getSRG("BlockModelShapes.func_178119_d");

	/**
	 * <p>
	 * Name: modelManager
	 * </p>
	 */
	public static McObfPair field_178128_c = McMappingDatabase.getSRG("field_178128_c");

	/**
	 * <p>
	 * Name: getTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;]
	 * </p>
	 */
	public static McObfPair func_178122_a = McMappingDatabase.getSRG("BlockModelShapes.func_178122_a");

	/**
	 * <p>
	 * Name: reloadModels
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178124_c = McMappingDatabase.getSRG("BlockModelShapes.func_178124_c");

	/**
	 * <p>
	 * Name: bakedModelStore
	 * </p>
	 */
	public static McObfPair field_178129_a = McMappingDatabase.getSRG("field_178129_a");

	/**
	 * <p>
	 * Name: registerBlockWithStateMapper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;Lnet/minecraft/client/renderer/block/statemap/IStateMapper;)V]
	 * </p>
	 */
	public static McObfPair func_178121_a = McMappingDatabase.getSRG("BlockModelShapes.func_178121_a");

}

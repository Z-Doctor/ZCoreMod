package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockRendererDispatcher {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvm";
		else
			return "net/minecraft/client/renderer/BlockRendererDispatcher";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvm";
		else
			return "BlockRendererDispatcher";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvm;";
		else
			return "Lnet/minecraft/client/renderer/BlockRendererDispatcher;";
	}

	/**
	 * <p>
	 * Name: getBlockModelShapes
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/BlockModelShapes;]
	 * </p>
	 */
	public static McObfPair func_175023_a = McMappingDatabase.getSRG("BlockRendererDispatcher.func_175023_a");

	/**
	 * <p>
	 * Name: getBlockModelRenderer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/BlockModelRenderer;]
	 * </p>
	 */
	public static McObfPair func_175019_b = McMappingDatabase.getSRG("BlockRendererDispatcher.func_175019_b");

	/**
	 * <p>
	 * Name: chestRenderer
	 * </p>
	 */
	public static McObfPair field_175024_d = McMappingDatabase.getSRG("field_175024_d");

	/**
	 * <p>
	 * Name: blockModelRenderer
	 * </p>
	 */
	public static McObfPair field_175027_c = McMappingDatabase.getSRG("field_175027_c");

	/**
	 * <p>
	 * Name: blockModelShapes
	 * </p>
	 */
	public static McObfPair field_175028_a = McMappingDatabase.getSRG("field_175028_a");

	/**
	 * <p>
	 * Name: fluidRenderer
	 * </p>
	 */
	public static McObfPair field_175025_e = McMappingDatabase.getSRG("field_175025_e");

	/**
	 * <p>
	 * Name: onResourceManagerReload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110549_a = McMappingDatabase.getSRG("BlockRendererDispatcher.func_110549_a");

	/**
	 * <p>
	 * Name: renderBlockBrightness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;F)V]
	 * </p>
	 */
	public static McObfPair func_175016_a = McMappingDatabase.getSRG("BlockRendererDispatcher.func_175016_a");

	/**
	 * <p>
	 * Name: renderBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/client/renderer/BufferBuilder;)Z]
	 * </p>
	 */
	public static McObfPair func_175018_a = McMappingDatabase.getSRG("BlockRendererDispatcher.func_175018_a");

	/**
	 * <p>
	 * Name: getModelForState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/client/renderer/block/model/IBakedModel;]
	 * </p>
	 */
	public static McObfPair func_184389_a = McMappingDatabase.getSRG("BlockRendererDispatcher.func_184389_a");

	/**
	 * <p>
	 * Name: renderBlockDamage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;Lnet/minecraft/world/IBlockAccess;)V]
	 * </p>
	 */
	public static McObfPair func_175020_a = McMappingDatabase.getSRG("BlockRendererDispatcher.func_175020_a");

}

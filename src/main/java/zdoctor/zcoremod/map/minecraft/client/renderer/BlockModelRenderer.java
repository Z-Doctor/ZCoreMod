package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockModelRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvo";
		else
			return "net/minecraft/client/renderer/BlockModelRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvo";
		else
			return "BlockModelRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvo;";
		else
			return "Lnet/minecraft/client/renderer/BlockModelRenderer;";
	}

	/**
	 * <p>
	 * Name: renderModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/client/renderer/block/model/IBakedModel;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/client/renderer/BufferBuilder;ZJ)Z]
	 * </p>
	 */
	public static McObfPair func_187493_a = McMappingDatabase.getSRG("BlockModelRenderer.func_187493_a");

	/**
	 * <p>
	 * Name: renderModelBrightnessColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/client/renderer/block/model/IBakedModel;FFFF)V]
	 * </p>
	 */
	public static McObfPair func_187495_a = McMappingDatabase.getSRG("BlockModelRenderer.func_187495_a");

	/**
	 * <p>
	 * Name: renderModelSmooth
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/client/renderer/block/model/IBakedModel;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/client/renderer/BufferBuilder;ZJ)Z]
	 * </p>
	 */
	public static McObfPair func_187498_b = McMappingDatabase.getSRG("BlockModelRenderer.func_187498_b");

	/**
	 * <p>
	 * Name: fillQuadBounds
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;[ILnet/minecraft/util/EnumFacing;[FLjava/util/BitSet;)V]
	 * </p>
	 */
	public static McObfPair func_187494_a = McMappingDatabase.getSRG("BlockModelRenderer.func_187494_a");

	/**
	 * <p>
	 * Name: renderModelBrightnessColorQuads
	 * </p>
	 * <p>
	 * Desc: [(FFFFLjava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_178264_a = McMappingDatabase.getSRG("BlockModelRenderer.func_178264_a");

	/**
	 * <p>
	 * Name: renderModelBrightness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/IBakedModel;Lnet/minecraft/block/state/IBlockState;FZ)V]
	 * </p>
	 */
	public static McObfPair func_178266_a = McMappingDatabase.getSRG("BlockModelRenderer.func_178266_a");

	/**
	 * <p>
	 * Name: renderModelFlat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/client/renderer/block/model/IBakedModel;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/client/renderer/BufferBuilder;ZJ)Z]
	 * </p>
	 */
	public static McObfPair func_187497_c = McMappingDatabase.getSRG("BlockModelRenderer.func_187497_c");

	/**
	 * <p>
	 * Name: renderModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/client/renderer/block/model/IBakedModel;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/client/renderer/BufferBuilder;Z)Z]
	 * </p>
	 */
	public static McObfPair func_178267_a = McMappingDatabase.getSRG("BlockModelRenderer.func_178267_a");

	/**
	 * <p>
	 * Name: renderQuadsFlat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;IZLnet/minecraft/client/renderer/BufferBuilder;Ljava/util/List;Ljava/util/BitSet;)V]
	 * </p>
	 */
	public static McObfPair func_187496_a = McMappingDatabase.getSRG("BlockModelRenderer.func_187496_a");

	/**
	 * <p>
	 * Name: renderQuadsSmooth
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/client/renderer/BufferBuilder;Ljava/util/List;[FLjava/util/BitSet;Lnet/minecraft/client/renderer/BlockModelRenderer$AmbientOcclusionFace;)V]
	 * </p>
	 */
	public static McObfPair func_187492_a = McMappingDatabase.getSRG("BlockModelRenderer.func_187492_a");

	/**
	 * <p>
	 * Name: renderModelBrightnessColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/IBakedModel;FFFF)V]
	 * </p>
	 */
	public static McObfPair func_178262_a = McMappingDatabase.getSRG("BlockModelRenderer.func_178262_a");

	/**
	 * <p>
	 * Name: blockColors
	 * </p>
	 */
	public static McObfPair field_187499_a = McMappingDatabase.getSRG("field_187499_a");

}

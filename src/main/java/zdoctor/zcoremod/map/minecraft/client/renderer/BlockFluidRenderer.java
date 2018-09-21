package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockFluidRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvn";
		else
			return "net/minecraft/client/renderer/BlockFluidRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvn";
		else
			return "BlockFluidRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvn;";
		else
			return "Lnet/minecraft/client/renderer/BlockFluidRenderer;";
	}

	/**
	 * <p>
	 * Name: atlasSpritesWater
	 * </p>
	 */
	public static McObfPair field_178271_b = McMappingDatabase.getSRG("field_178271_b");

	/**
	 * <p>
	 * Name: atlasSpriteWaterOverlay
	 * </p>
	 */
	public static McObfPair field_187501_d = McMappingDatabase.getSRG("field_187501_d");

	/**
	 * <p>
	 * Name: atlasSpritesLava
	 * </p>
	 */
	public static McObfPair field_178272_a = McMappingDatabase.getSRG("field_178272_a");

	/**
	 * <p>
	 * Name: initAtlasSprites
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178268_a = McMappingDatabase.getSRG("BlockFluidRenderer.func_178268_a");

	/**
	 * <p>
	 * Name: blockColors
	 * </p>
	 */
	public static McObfPair field_187500_a = McMappingDatabase.getSRG("field_187500_a");

	/**
	 * <p>
	 * Name: renderFluid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/client/renderer/BufferBuilder;)Z]
	 * </p>
	 */
	public static McObfPair func_178270_a = McMappingDatabase.getSRG("BlockFluidRenderer.func_178270_a");

	/**
	 * <p>
	 * Name: getFluidHeight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/material/Material;)F]
	 * </p>
	 */
	public static McObfPair func_178269_a = McMappingDatabase.getSRG("BlockFluidRenderer.func_178269_a");

}

package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockBanner$BlockBannerHanging {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aoo$b";
		else
			return "net/minecraft/block/BlockBanner$BlockBannerHanging";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aoo$b";
		else
			return "BlockBanner$BlockBannerHanging";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laoo$b;";
		else
			return "Lnet/minecraft/block/BlockBanner$BlockBannerHanging;";
	}

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185499_a = McMappingDatabase.getSRG("BlockBanner$BlockBannerHanging.func_185499_a");

	/**
	 * <p>
	 * Name: SOUTH_AABB
	 * </p>
	 */
	public static McObfPair field_185552_e = McMappingDatabase.getSRG("field_185552_e");

	/**
	 * <p>
	 * Name: NORTH_AABB
	 * </p>
	 */
	public static McObfPair field_185551_d = McMappingDatabase.getSRG("field_185551_d");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185471_a = McMappingDatabase.getSRG("BlockBanner$BlockBannerHanging.func_185471_a");

	/**
	 * <p>
	 * Name: WEST_AABB
	 * </p>
	 */
	public static McObfPair field_185553_f = McMappingDatabase.getSRG("field_185553_f");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockBanner$BlockBannerHanging.func_180661_e");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockBanner$BlockBannerHanging.func_185496_a");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockBanner$BlockBannerHanging.func_176203_a");

	/**
	 * <p>
	 * Name: EAST_AABB
	 * </p>
	 */
	public static McObfPair field_185554_g = McMappingDatabase.getSRG("field_185554_g");

	/**
	 * <p>
	 * Name: neighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_189540_a = McMappingDatabase.getSRG("BlockBanner$BlockBannerHanging.func_189540_a");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockBanner$BlockBannerHanging.func_176201_c");

}

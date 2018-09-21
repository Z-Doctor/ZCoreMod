package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockFlower {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqr";
		else
			return "net/minecraft/block/BlockFlower";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqr";
		else
			return "BlockFlower";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laqr;";
		else
			return "Lnet/minecraft/block/BlockFlower;";
	}

	/**
	 * <p>
	 * Name: getBlockType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/BlockFlower$EnumFlowerColor;]
	 * </p>
	 */
	public static McObfPair func_176495_j = McMappingDatabase.getSRG("BlockFlower.func_176495_j");

	/**
	 * <p>
	 * Name: damageDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_180651_a = McMappingDatabase.getSRG("BlockFlower.func_180651_a");

	/**
	 * <p>
	 * Name: getSubBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_149666_a = McMappingDatabase.getSRG("BlockFlower.func_149666_a");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockFlower.func_176203_a");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockFlower.func_180661_e");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockFlower.func_176201_c");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_176496_a = McMappingDatabase.getSRG("field_176496_a");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockFlower.func_185496_a");

	/**
	 * <p>
	 * Name: getTypeProperty
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/properties/IProperty;]
	 * </p>
	 */
	public static McObfPair func_176494_l = McMappingDatabase.getSRG("BlockFlower.func_176494_l");

	/**
	 * <p>
	 * Name: getOffsetType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/Block$EnumOffsetType;]
	 * </p>
	 */
	public static McObfPair func_176218_Q = McMappingDatabase.getSRG("BlockFlower.func_176218_Q");

}

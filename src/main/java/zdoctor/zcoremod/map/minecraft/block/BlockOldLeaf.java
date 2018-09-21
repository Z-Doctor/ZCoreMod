package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockOldLeaf {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asn";
		else
			return "net/minecraft/block/BlockOldLeaf";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asn";
		else
			return "BlockOldLeaf";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lasn;";
		else
			return "Lnet/minecraft/block/BlockOldLeaf;";
	}

	/**
	 * <p>
	 * Name: VARIANT
	 * </p>
	 */
	public static McObfPair field_176239_P = McMappingDatabase.getSRG("field_176239_P");

	/**
	 * <p>
	 * Name: dropApple
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V]
	 * </p>
	 */
	public static McObfPair func_176234_a = McMappingDatabase.getSRG("BlockOldLeaf.func_176234_a");

	/**
	 * <p>
	 * Name: getSubBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_149666_a = McMappingDatabase.getSRG("BlockOldLeaf.func_149666_a");

	/**
	 * <p>
	 * Name: damageDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_180651_a = McMappingDatabase.getSRG("BlockOldLeaf.func_180651_a");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockOldLeaf.func_176201_c");

	/**
	 * <p>
	 * Name: getSilkTouchDrop
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_180643_i = McMappingDatabase.getSRG("BlockOldLeaf.func_180643_i");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockOldLeaf.func_176203_a");

	/**
	 * <p>
	 * Name: getWoodType
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockPlanks$EnumType;]
	 * </p>
	 */
	public static McObfPair func_176233_b = McMappingDatabase.getSRG("BlockOldLeaf.func_176233_b");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockOldLeaf.func_180661_e");

	/**
	 * <p>
	 * Name: harvestBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/tileentity/TileEntity;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_180657_a = McMappingDatabase.getSRG("BlockOldLeaf.func_180657_a");

	/**
	 * <p>
	 * Name: getSaplingDropChance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176232_d = McMappingDatabase.getSRG("BlockOldLeaf.func_176232_d");

}

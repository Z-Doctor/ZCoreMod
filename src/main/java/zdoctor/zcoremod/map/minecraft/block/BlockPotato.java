package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPotato {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ast";
		else
			return "net/minecraft/block/BlockPotato";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ast";
		else
			return "BlockPotato";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Last;";
		else
			return "Lnet/minecraft/block/BlockPotato;";
	}

	/**
	 * <p>
	 * Name: POTATO_AABB
	 * </p>
	 */
	public static McObfPair field_185534_a = McMappingDatabase.getSRG("field_185534_a");

	/**
	 * <p>
	 * Name: dropBlockAsItemWithChance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;FI)V]
	 * </p>
	 */
	public static McObfPair func_180653_a = McMappingDatabase.getSRG("BlockPotato.func_180653_a");

	/**
	 * <p>
	 * Name: getSeed
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_149866_i = McMappingDatabase.getSRG("BlockPotato.func_149866_i");

	/**
	 * <p>
	 * Name: getCrop
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_149865_P = McMappingDatabase.getSRG("BlockPotato.func_149865_P");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockPotato.func_185496_a");

}

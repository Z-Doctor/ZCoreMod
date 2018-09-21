package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockCarrot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "apg";
		else
			return "net/minecraft/block/BlockCarrot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "apg";
		else
			return "BlockCarrot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lapg;";
		else
			return "Lnet/minecraft/block/BlockCarrot;";
	}

	/**
	 * <p>
	 * Name: CARROT_AABB
	 * </p>
	 */
	public static McObfPair field_185533_a = McMappingDatabase.getSRG("field_185533_a");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockCarrot.func_185496_a");

	/**
	 * <p>
	 * Name: getSeed
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_149866_i = McMappingDatabase.getSRG("BlockCarrot.func_149866_i");

	/**
	 * <p>
	 * Name: getCrop
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_149865_P = McMappingDatabase.getSRG("BlockCarrot.func_149865_P");

}

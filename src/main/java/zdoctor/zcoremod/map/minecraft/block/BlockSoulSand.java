package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockSoulSand {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atx";
		else
			return "net/minecraft/block/BlockSoulSand";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atx";
		else
			return "BlockSoulSand";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Latx;";
		else
			return "Lnet/minecraft/block/BlockSoulSand;";
	}

	/**
	 * <p>
	 * Name: SOUL_SAND_AABB
	 * </p>
	 */
	public static McObfPair field_185703_a = McMappingDatabase.getSRG("field_185703_a");

	/**
	 * <p>
	 * Name: getCollisionBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_180646_a = McMappingDatabase.getSRG("BlockSoulSand.func_180646_a");

	/**
	 * <p>
	 * Name: onEntityCollidedWithBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_180634_a = McMappingDatabase.getSRG("BlockSoulSand.func_180634_a");

}

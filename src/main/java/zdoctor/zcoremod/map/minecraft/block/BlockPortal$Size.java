package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPortal$Size {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ass$a";
		else
			return "net/minecraft/block/BlockPortal$Size";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ass$a";
		else
			return "BlockPortal$Size";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lass$a;";
		else
			return "Lnet/minecraft/block/BlockPortal$Size;";
	}

	/**
	 * <p>
	 * Name: bottomLeft
	 * </p>
	 */
	public static McObfPair field_150861_f = McMappingDatabase.getSRG("field_150861_f");

	/**
	 * <p>
	 * Name: getDistanceUntilEdge
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_180120_a = McMappingDatabase.getSRG("BlockPortal$Size.func_180120_a");

	/**
	 * <p>
	 * Name: calculatePortalHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_150858_a = McMappingDatabase.getSRG("BlockPortal$Size.func_150858_a");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_150862_g = McMappingDatabase.getSRG("field_150862_g");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_150868_h = McMappingDatabase.getSRG("field_150868_h");

	/**
	 * <p>
	 * Name: portalBlockCount
	 * </p>
	 */
	public static McObfPair field_150864_e = McMappingDatabase.getSRG("field_150864_e");

	/**
	 * <p>
	 * Name: getWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_181101_b = McMappingDatabase.getSRG("BlockPortal$Size.func_181101_b");

	/**
	 * <p>
	 * Name: isValid
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150860_b = McMappingDatabase.getSRG("BlockPortal$Size.func_150860_b");

	/**
	 * <p>
	 * Name: axis
	 * </p>
	 */
	public static McObfPair field_150865_b = McMappingDatabase.getSRG("field_150865_b");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_150867_a = McMappingDatabase.getSRG("field_150867_a");

	/**
	 * <p>
	 * Name: placePortalBlocks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_150859_c = McMappingDatabase.getSRG("BlockPortal$Size.func_150859_c");

	/**
	 * <p>
	 * Name: isEmptyBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Z]
	 * </p>
	 */
	public static McObfPair func_150857_a = McMappingDatabase.getSRG("BlockPortal$Size.func_150857_a");

	/**
	 * <p>
	 * Name: rightDir
	 * </p>
	 */
	public static McObfPair field_150866_c = McMappingDatabase.getSRG("field_150866_c");

	/**
	 * <p>
	 * Name: leftDir
	 * </p>
	 */
	public static McObfPair field_150863_d = McMappingDatabase.getSRG("field_150863_d");

	/**
	 * <p>
	 * Name: getHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_181100_a = McMappingDatabase.getSRG("BlockPortal$Size.func_181100_a");

}

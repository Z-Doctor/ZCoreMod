package zdoctor.zcoremod.map.minecraft.block.state.pattern;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPattern {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awx";
		else
			return "net/minecraft/block/state/pattern/BlockPattern";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awx";
		else
			return "BlockPattern";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawx;";
		else
			return "Lnet/minecraft/block/state/pattern/BlockPattern;";
	}

	/**
	 * <p>
	 * Name: blockMatches
	 * </p>
	 */
	public static McObfPair field_177689_a = McMappingDatabase.getSRG("field_177689_a");

	/**
	 * <p>
	 * Name: translateOffset
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumFacing;III)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177683_a = McMappingDatabase.getSRG("BlockPattern.func_177683_a");

	/**
	 * <p>
	 * Name: fingerLength
	 * </p>
	 */
	public static McObfPair field_177687_b = McMappingDatabase.getSRG("field_177687_b");

	/**
	 * <p>
	 * Name: checkPatternAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumFacing;Lcom/google/common/cache/LoadingCache;)Lnet/minecraft/block/state/pattern/BlockPattern$PatternHelper;]
	 * </p>
	 */
	public static McObfPair func_177682_a = McMappingDatabase.getSRG("BlockPattern.func_177682_a");

	/**
	 * <p>
	 * Name: getThumbLength
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177685_b = McMappingDatabase.getSRG("BlockPattern.func_177685_b");

	/**
	 * <p>
	 * Name: getPalmLength
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177684_c = McMappingDatabase.getSRG("BlockPattern.func_177684_c");

	/**
	 * <p>
	 * Name: thumbLength
	 * </p>
	 */
	public static McObfPair field_177688_c = McMappingDatabase.getSRG("field_177688_c");

	/**
	 * <p>
	 * Name: getFingerLength
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_185922_a = McMappingDatabase.getSRG("BlockPattern.func_185922_a");

	/**
	 * <p>
	 * Name: palmLength
	 * </p>
	 */
	public static McObfPair field_177686_d = McMappingDatabase.getSRG("field_177686_d");

	/**
	 * <p>
	 * Name: match
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/pattern/BlockPattern$PatternHelper;]
	 * </p>
	 */
	public static McObfPair func_177681_a = McMappingDatabase.getSRG("BlockPattern.func_177681_a");

	/**
	 * <p>
	 * Name: createLoadingCache
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Z)Lcom/google/common/cache/LoadingCache;]
	 * </p>
	 */
	public static McObfPair func_181627_a = McMappingDatabase.getSRG("BlockPattern.func_181627_a");

}

package zdoctor.zcoremod.map.minecraft.block.state.pattern;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPattern$PatternHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awx$b";
		else
			return "net/minecraft/block/state/pattern/BlockPattern$PatternHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awx$b";
		else
			return "BlockPattern$PatternHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawx$b;";
		else
			return "Lnet/minecraft/block/state/pattern/BlockPattern$PatternHelper;";
	}

	/**
	 * <p>
	 * Name: up
	 * </p>
	 */
	public static McObfPair field_177673_c = McMappingDatabase.getSRG("field_177673_c");

	/**
	 * <p>
	 * Name: getForwards
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_177669_b = McMappingDatabase.getSRG("BlockPattern$PatternHelper.func_177669_b");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_181121_f = McMappingDatabase.getSRG("field_181121_f");

	/**
	 * <p>
	 * Name: getWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_181118_d = McMappingDatabase.getSRG("BlockPattern$PatternHelper.func_181118_d");

	/**
	 * <p>
	 * Name: translateOffset
	 * </p>
	 * <p>
	 * Desc: [(III)Lnet/minecraft/block/state/BlockWorldState;]
	 * </p>
	 */
	public static McObfPair func_177670_a = McMappingDatabase.getSRG("BlockPattern$PatternHelper.func_177670_a");

	/**
	 * <p>
	 * Name: lcache
	 * </p>
	 */
	public static McObfPair field_177671_d = McMappingDatabase.getSRG("field_177671_d");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_181120_e = McMappingDatabase.getSRG("field_181120_e");

	/**
	 * <p>
	 * Name: frontTopLeft
	 * </p>
	 */
	public static McObfPair field_177674_a = McMappingDatabase.getSRG("field_177674_a");

	/**
	 * <p>
	 * Name: getHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_181119_e = McMappingDatabase.getSRG("BlockPattern$PatternHelper.func_181119_e");

	/**
	 * <p>
	 * Name: depth
	 * </p>
	 */
	public static McObfPair field_181122_g = McMappingDatabase.getSRG("field_181122_g");

	/**
	 * <p>
	 * Name: forwards
	 * </p>
	 */
	public static McObfPair field_177672_b = McMappingDatabase.getSRG("field_177672_b");

	/**
	 * <p>
	 * Name: getUp
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_177668_c = McMappingDatabase.getSRG("BlockPattern$PatternHelper.func_177668_c");

	/**
	 * <p>
	 * Name: getFrontTopLeft
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_181117_a = McMappingDatabase.getSRG("BlockPattern$PatternHelper.func_181117_a");

}

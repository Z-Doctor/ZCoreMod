package zdoctor.zcoremod.map.minecraft.client.tutorial;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PunchTreeStep {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chy";
		else
			return "net/minecraft/client/tutorial/PunchTreeStep";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chy";
		else
			return "PunchTreeStep";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchy;";
		else
			return "Lnet/minecraft/client/tutorial/PunchTreeStep;";
	}

	/**
	 * <p>
	 * Name: onHitBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;F)V]
	 * </p>
	 */
	public static McObfPair func_193250_a = McMappingDatabase.getSRG("PunchTreeStep.func_193250_a");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193245_a = McMappingDatabase.getSRG("PunchTreeStep.func_193245_a");

	/**
	 * <p>
	 * Name: LOG_BLOCKS
	 * </p>
	 */
	public static McObfPair field_193274_a = McMappingDatabase.getSRG("field_193274_a");

	/**
	 * <p>
	 * Name: toast
	 * </p>
	 */
	public static McObfPair field_193278_e = McMappingDatabase.getSRG("field_193278_e");

	/**
	 * <p>
	 * Name: onStop
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193248_b = McMappingDatabase.getSRG("PunchTreeStep.func_193248_b");

	/**
	 * <p>
	 * Name: tutorial
	 * </p>
	 */
	public static McObfPair field_193277_d = McMappingDatabase.getSRG("field_193277_d");

	/**
	 * <p>
	 * Name: resetCount
	 * </p>
	 */
	public static McObfPair field_193280_g = McMappingDatabase.getSRG("field_193280_g");

	/**
	 * <p>
	 * Name: timeWaiting
	 * </p>
	 */
	public static McObfPair field_193279_f = McMappingDatabase.getSRG("field_193279_f");

	/**
	 * <p>
	 * Name: handleSetSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_193252_a = McMappingDatabase.getSRG("PunchTreeStep.func_193252_a");

	/**
	 * <p>
	 * Name: TITLE
	 * </p>
	 */
	public static McObfPair field_193275_b = McMappingDatabase.getSRG("field_193275_b");

	/**
	 * <p>
	 * Name: DESCRIPTION
	 * </p>
	 */
	public static McObfPair field_193276_c = McMappingDatabase.getSRG("field_193276_c");

}

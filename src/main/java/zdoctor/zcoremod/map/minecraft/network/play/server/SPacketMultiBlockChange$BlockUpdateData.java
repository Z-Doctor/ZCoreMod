package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketMultiBlockChange$BlockUpdateData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "io$a";
		else
			return "net/minecraft/network/play/server/SPacketMultiBlockChange$BlockUpdateData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "io$a";
		else
			return "SPacketMultiBlockChange$BlockUpdateData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lio$a;";
		else
			return "Lnet/minecraft/network/play/server/SPacketMultiBlockChange$BlockUpdateData;";
	}

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180088_c = McMappingDatabase.getSRG("SPacketMultiBlockChange$BlockUpdateData.func_180088_c");

	/**
	 * <p>
	 * Name: getOffset
	 * </p>
	 * <p>
	 * Desc: [()S]
	 * </p>
	 */
	public static McObfPair func_180089_b = McMappingDatabase.getSRG("SPacketMultiBlockChange$BlockUpdateData.func_180089_b");

	/**
	 * <p>
	 * Name: offset
	 * </p>
	 */
	public static McObfPair field_180091_b = McMappingDatabase.getSRG("field_180091_b");

	/**
	 * <p>
	 * Name: blockState
	 * </p>
	 */
	public static McObfPair field_180092_c = McMappingDatabase.getSRG("field_180092_c");

	/**
	 * <p>
	 * Name: getPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180090_a = McMappingDatabase.getSRG("SPacketMultiBlockChange$BlockUpdateData.func_180090_a");

}

package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockEventData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aml";
		else
			return "net/minecraft/block/BlockEventData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aml";
		else
			return "BlockEventData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laml;";
		else
			return "Lnet/minecraft/block/BlockEventData;";
	}

	/**
	 * <p>
	 * Name: eventParameter
	 * </p>
	 */
	public static McObfPair field_151343_f = McMappingDatabase.getSRG("field_151343_f");

	/**
	 * <p>
	 * Name: blockType
	 * </p>
	 */
	public static McObfPair field_151344_d = McMappingDatabase.getSRG("field_151344_d");

	/**
	 * <p>
	 * Name: getEventID
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_151339_d = McMappingDatabase.getSRG("BlockEventData.func_151339_d");

	/**
	 * <p>
	 * Name: position
	 * </p>
	 */
	public static McObfPair field_180329_a = McMappingDatabase.getSRG("field_180329_a");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180328_a = McMappingDatabase.getSRG("BlockEventData.func_180328_a");

	/**
	 * <p>
	 * Name: getEventParameter
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_151338_e = McMappingDatabase.getSRG("BlockEventData.func_151338_e");

	/**
	 * <p>
	 * Name: eventID
	 * </p>
	 */
	public static McObfPair field_151345_e = McMappingDatabase.getSRG("field_151345_e");

	/**
	 * <p>
	 * Name: getBlock
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_151337_f = McMappingDatabase.getSRG("BlockEventData.func_151337_f");

}

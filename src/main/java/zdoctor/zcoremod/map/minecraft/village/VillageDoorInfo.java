package zdoctor.zcoremod.map.minecraft.village;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class VillageDoorInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zn";
		else
			return "net/minecraft/village/VillageDoorInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zn";
		else
			return "VillageDoorInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lzn;";
		else
			return "Lnet/minecraft/village/VillageDoorInfo;";
	}

	/**
	 * <p>
	 * Name: insideBlock
	 * </p>
	 */
	public static McObfPair field_179857_b = McMappingDatabase.getSRG("field_179857_b");

	/**
	 * <p>
	 * Name: getInsideBlockPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_179856_e = McMappingDatabase.getSRG("VillageDoorInfo.func_179856_e");

	/**
	 * <p>
	 * Name: getDistanceSquared
	 * </p>
	 * <p>
	 * Desc: [(III)I]
	 * </p>
	 */
	public static McObfPair func_75474_b = McMappingDatabase.getSRG("VillageDoorInfo.func_75474_b");

	/**
	 * <p>
	 * Name: getFaceDirection
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_179854_a = McMappingDatabase.getSRG("VillageDoorInfo.func_179854_a");

	/**
	 * <p>
	 * Name: insideDirection
	 * </p>
	 */
	public static McObfPair field_179858_c = McMappingDatabase.getSRG("field_179858_c");

	/**
	 * <p>
	 * Name: getInsideOffsetX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179847_f = McMappingDatabase.getSRG("VillageDoorInfo.func_179847_f");

	/**
	 * <p>
	 * Name: getInsideOffsetZ
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179855_g = McMappingDatabase.getSRG("VillageDoorInfo.func_179855_g");

	/**
	 * <p>
	 * Name: getIsDetachedFromVillageFlag
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_179851_i = McMappingDatabase.getSRG("VillageDoorInfo.func_179851_i");

	/**
	 * <p>
	 * Name: resetDoorOpeningRestrictionCounter
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75466_d = McMappingDatabase.getSRG("VillageDoorInfo.func_75466_d");

	/**
	 * <p>
	 * Name: isInsideSide
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_179850_c = McMappingDatabase.getSRG("VillageDoorInfo.func_179850_c");

	/**
	 * <p>
	 * Name: incrementDoorOpeningRestrictionCounter
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75470_e = McMappingDatabase.getSRG("VillageDoorInfo.func_75470_e");

	/**
	 * <p>
	 * Name: getLastActivityTimestamp
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75473_b = McMappingDatabase.getSRG("VillageDoorInfo.func_75473_b");

	/**
	 * <p>
	 * Name: setLastActivityTimestamp
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179849_a = McMappingDatabase.getSRG("VillageDoorInfo.func_179849_a");

	/**
	 * <p>
	 * Name: getDoorBlockPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_179852_d = McMappingDatabase.getSRG("VillageDoorInfo.func_179852_d");

	/**
	 * <p>
	 * Name: getDistanceToInsideBlockSq
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_179846_b = McMappingDatabase.getSRG("VillageDoorInfo.func_179846_b");

	/**
	 * <p>
	 * Name: doorOpeningRestrictionCounter
	 * </p>
	 */
	public static McObfPair field_75482_h = McMappingDatabase.getSRG("field_75482_h");

	/**
	 * <p>
	 * Name: doorBlockPos
	 * </p>
	 */
	public static McObfPair field_179859_a = McMappingDatabase.getSRG("field_179859_a");

	/**
	 * <p>
	 * Name: lastActivityTimestamp
	 * </p>
	 */
	public static McObfPair field_75475_f = McMappingDatabase.getSRG("field_75475_f");

	/**
	 * <p>
	 * Name: getInsideDirection
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_188567_j = McMappingDatabase.getSRG("VillageDoorInfo.func_188567_j");

	/**
	 * <p>
	 * Name: getDistanceToDoorBlockSq
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_179848_a = McMappingDatabase.getSRG("VillageDoorInfo.func_179848_a");

	/**
	 * <p>
	 * Name: setIsDetachedFromVillageFlag
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_179853_a = McMappingDatabase.getSRG("VillageDoorInfo.func_179853_a");

	/**
	 * <p>
	 * Name: getDoorOpeningRestrictionCounter
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75468_f = McMappingDatabase.getSRG("VillageDoorInfo.func_75468_f");

	/**
	 * <p>
	 * Name: isDetachedFromVillageFlag
	 * </p>
	 */
	public static McObfPair field_75476_g = McMappingDatabase.getSRG("field_75476_g");

}

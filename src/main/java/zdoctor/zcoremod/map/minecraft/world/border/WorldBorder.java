package zdoctor.zcoremod.map.minecraft.world.border;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldBorder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axn";
		else
			return "net/minecraft/world/border/WorldBorder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axn";
		else
			return "WorldBorder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxn;";
		else
			return "Lnet/minecraft/world/border/WorldBorder;";
	}

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177722_l = McMappingDatabase.getSRG("WorldBorder.func_177722_l");

	/**
	 * <p>
	 * Name: addListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/IBorderListener;)V]
	 * </p>
	 */
	public static McObfPair func_177737_a = McMappingDatabase.getSRG("WorldBorder.func_177737_a");

	/**
	 * <p>
	 * Name: getDiameter
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_177741_h = McMappingDatabase.getSRG("WorldBorder.func_177741_h");

	/**
	 * <p>
	 * Name: getDamageAmount
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_177727_n = McMappingDatabase.getSRG("WorldBorder.func_177727_n");

	/**
	 * <p>
	 * Name: getDamageBuffer
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_177742_m = McMappingDatabase.getSRG("WorldBorder.func_177742_m");

	/**
	 * <p>
	 * Name: centerX
	 * </p>
	 */
	public static McObfPair field_177756_b = McMappingDatabase.getSRG("field_177756_b");

	/**
	 * <p>
	 * Name: minX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_177726_b = McMappingDatabase.getSRG("WorldBorder.func_177726_b");

	/**
	 * <p>
	 * Name: getWarningTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177740_p = McMappingDatabase.getSRG("WorldBorder.func_177740_p");

	/**
	 * <p>
	 * Name: setWarningDistance
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_177747_c = McMappingDatabase.getSRG("WorldBorder.func_177747_c");

	/**
	 * <p>
	 * Name: getTimeUntilTarget
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_177732_i = McMappingDatabase.getSRG("WorldBorder.func_177732_i");

	/**
	 * <p>
	 * Name: getClosestDistance
	 * </p>
	 * <p>
	 * Desc: [(DD)D]
	 * </p>
	 */
	public static McObfPair func_177729_b = McMappingDatabase.getSRG("WorldBorder.func_177729_b");

	/**
	 * <p>
	 * Name: getCenterX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_177731_f = McMappingDatabase.getSRG("WorldBorder.func_177731_f");

	/**
	 * <p>
	 * Name: maxX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_177728_d = McMappingDatabase.getSRG("WorldBorder.func_177728_d");

	/**
	 * <p>
	 * Name: getListeners
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_177735_k = McMappingDatabase.getSRG("WorldBorder.func_177735_k");

	/**
	 * <p>
	 * Name: startDiameter
	 * </p>
	 */
	public static McObfPair field_177754_d = McMappingDatabase.getSRG("field_177754_d");

	/**
	 * <p>
	 * Name: setWarningTime
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_177723_b = McMappingDatabase.getSRG("WorldBorder.func_177723_b");

	/**
	 * <p>
	 * Name: worldSize
	 * </p>
	 */
	public static McObfPair field_177762_h = McMappingDatabase.getSRG("field_177762_h");

	/**
	 * <p>
	 * Name: maxZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_177733_e = McMappingDatabase.getSRG("WorldBorder.func_177733_e");

	/**
	 * <p>
	 * Name: getCenterZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_177721_g = McMappingDatabase.getSRG("WorldBorder.func_177721_g");

	/**
	 * <p>
	 * Name: damageBuffer
	 * </p>
	 */
	public static McObfPair field_177760_j = McMappingDatabase.getSRG("field_177760_j");

	/**
	 * <p>
	 * Name: setDamageAmount
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_177744_c = McMappingDatabase.getSRG("WorldBorder.func_177744_c");

	/**
	 * <p>
	 * Name: contains
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/ChunkPos;)Z]
	 * </p>
	 */
	public static McObfPair func_177730_a = McMappingDatabase.getSRG("WorldBorder.func_177730_a");

	/**
	 * <p>
	 * Name: endDiameter
	 * </p>
	 */
	public static McObfPair field_177755_e = McMappingDatabase.getSRG("field_177755_e");

	/**
	 * <p>
	 * Name: damageAmount
	 * </p>
	 */
	public static McObfPair field_177763_i = McMappingDatabase.getSRG("field_177763_i");

	/**
	 * <p>
	 * Name: setSize
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_177725_a = McMappingDatabase.getSRG("WorldBorder.func_177725_a");

	/**
	 * <p>
	 * Name: setDamageBuffer
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_177724_b = McMappingDatabase.getSRG("WorldBorder.func_177724_b");

	/**
	 * <p>
	 * Name: contains
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;)Z]
	 * </p>
	 */
	public static McObfPair func_177743_a = McMappingDatabase.getSRG("WorldBorder.func_177743_a");

	/**
	 * <p>
	 * Name: setTransition
	 * </p>
	 * <p>
	 * Desc: [(DDJ)V]
	 * </p>
	 */
	public static McObfPair func_177738_a = McMappingDatabase.getSRG("WorldBorder.func_177738_a");

	/**
	 * <p>
	 * Name: setCenter
	 * </p>
	 * <p>
	 * Desc: [(DD)V]
	 * </p>
	 */
	public static McObfPair func_177739_c = McMappingDatabase.getSRG("WorldBorder.func_177739_c");

	/**
	 * <p>
	 * Name: contains
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_177746_a = McMappingDatabase.getSRG("WorldBorder.func_177746_a");

	/**
	 * <p>
	 * Name: getWarningDistance
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177748_q = McMappingDatabase.getSRG("WorldBorder.func_177748_q");

	/**
	 * <p>
	 * Name: getStatus
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/border/EnumBorderStatus;]
	 * </p>
	 */
	public static McObfPair func_177734_a = McMappingDatabase.getSRG("WorldBorder.func_177734_a");

	/**
	 * <p>
	 * Name: warningDistance
	 * </p>
	 */
	public static McObfPair field_177759_l = McMappingDatabase.getSRG("field_177759_l");

	/**
	 * <p>
	 * Name: minZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_177736_c = McMappingDatabase.getSRG("WorldBorder.func_177736_c");

	/**
	 * <p>
	 * Name: endTime
	 * </p>
	 */
	public static McObfPair field_177752_f = McMappingDatabase.getSRG("field_177752_f");

	/**
	 * <p>
	 * Name: getResizeSpeed
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_177749_o = McMappingDatabase.getSRG("WorldBorder.func_177749_o");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_177758_a = McMappingDatabase.getSRG("field_177758_a");

	/**
	 * <p>
	 * Name: getClosestDistance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)D]
	 * </p>
	 */
	public static McObfPair func_177745_a = McMappingDatabase.getSRG("WorldBorder.func_177745_a");

	/**
	 * <p>
	 * Name: startTime
	 * </p>
	 */
	public static McObfPair field_177753_g = McMappingDatabase.getSRG("field_177753_g");

	/**
	 * <p>
	 * Name: getTargetSize
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_177751_j = McMappingDatabase.getSRG("WorldBorder.func_177751_j");

	/**
	 * <p>
	 * Name: setTransition
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_177750_a = McMappingDatabase.getSRG("WorldBorder.func_177750_a");

	/**
	 * <p>
	 * Name: warningTime
	 * </p>
	 */
	public static McObfPair field_177761_k = McMappingDatabase.getSRG("field_177761_k");

	/**
	 * <p>
	 * Name: centerZ
	 * </p>
	 */
	public static McObfPair field_177757_c = McMappingDatabase.getSRG("field_177757_c");

}

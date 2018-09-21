package zdoctor.zcoremod.map.minecraft.server.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StatsComponent {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oe";
		else
			return "net/minecraft/server/gui/StatsComponent";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oe";
		else
			return "StatsComponent";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Loe;";
		else
			return "Lnet/minecraft/server/gui/StatsComponent;";
	}

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_120034_a = McMappingDatabase.getSRG("StatsComponent.func_120034_a");

	/**
	 * <p>
	 * Name: mean
	 * </p>
	 * <p>
	 * Desc: [([J)D]
	 * </p>
	 */
	public static McObfPair func_120035_a = McMappingDatabase.getSRG("StatsComponent.func_120035_a");

	/**
	 * <p>
	 * Name: msgs
	 * </p>
	 */
	public static McObfPair field_120036_d = McMappingDatabase.getSRG("field_120036_d");

	/**
	 * <p>
	 * Name: FORMATTER
	 * </p>
	 */
	public static McObfPair field_120040_a = McMappingDatabase.getSRG("field_120040_a");

	/**
	 * <p>
	 * Name: vp
	 * </p>
	 */
	public static McObfPair field_120039_c = McMappingDatabase.getSRG("field_120039_c");

	/**
	 * <p>
	 * Name: server
	 * </p>
	 */
	public static McObfPair field_120037_e = McMappingDatabase.getSRG("field_120037_e");

	/**
	 * <p>
	 * Name: values
	 * </p>
	 */
	public static McObfPair field_120038_b = McMappingDatabase.getSRG("field_120038_b");

}

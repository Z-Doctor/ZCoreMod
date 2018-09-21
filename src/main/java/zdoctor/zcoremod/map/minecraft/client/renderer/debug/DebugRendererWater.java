package zdoctor.zcoremod.map.minecraft.client.renderer.debug;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DebugRendererWater {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byl";
		else
			return "net/minecraft/client/renderer/debug/DebugRendererWater";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byl";
		else
			return "DebugRendererWater";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyl;";
		else
			return "Lnet/minecraft/client/renderer/debug/DebugRendererWater;";
	}

	/**
	 * <p>
	 * Name: yo
	 * </p>
	 */
	public static McObfPair field_190064_d = McMappingDatabase.getSRG("field_190064_d");

	/**
	 * <p>
	 * Name: zo
	 * </p>
	 */
	public static McObfPair field_190065_e = McMappingDatabase.getSRG("field_190065_e");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(FJ)V]
	 * </p>
	 */
	public static McObfPair func_190060_a = McMappingDatabase.getSRG("DebugRendererWater.func_190060_a");

	/**
	 * <p>
	 * Name: minecraft
	 * </p>
	 */
	public static McObfPair field_188288_a = McMappingDatabase.getSRG("field_188288_a");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_190062_b = McMappingDatabase.getSRG("field_190062_b");

	/**
	 * <p>
	 * Name: xo
	 * </p>
	 */
	public static McObfPair field_190063_c = McMappingDatabase.getSRG("field_190063_c");

}

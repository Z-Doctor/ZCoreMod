package zdoctor.zcoremod.map.minecraft.client.renderer.debug;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DebugRendererNeighborsUpdate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byi";
		else
			return "net/minecraft/client/renderer/debug/DebugRendererNeighborsUpdate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byi";
		else
			return "DebugRendererNeighborsUpdate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyi;";
		else
			return "Lnet/minecraft/client/renderer/debug/DebugRendererNeighborsUpdate;";
	}

	/**
	 * <p>
	 * Name: minecraft
	 * </p>
	 */
	public static McObfPair field_191554_a = McMappingDatabase.getSRG("field_191554_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(FJ)V]
	 * </p>
	 */
	public static McObfPair func_190060_a = McMappingDatabase.getSRG("DebugRendererNeighborsUpdate.func_190060_a");

	/**
	 * <p>
	 * Name: lastUpdate
	 * </p>
	 */
	public static McObfPair field_191555_b = McMappingDatabase.getSRG("field_191555_b");

	/**
	 * <p>
	 * Name: addUpdate
	 * </p>
	 * <p>
	 * Desc: [(JLnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_191553_a = McMappingDatabase.getSRG("DebugRendererNeighborsUpdate.func_191553_a");

}

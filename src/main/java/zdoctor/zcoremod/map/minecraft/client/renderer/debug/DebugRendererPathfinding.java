package zdoctor.zcoremod.map.minecraft.client.renderer.debug;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DebugRendererPathfinding {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byj";
		else
			return "net/minecraft/client/renderer/debug/DebugRendererPathfinding";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byj";
		else
			return "DebugRendererPathfinding";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyj;";
		else
			return "Lnet/minecraft/client/renderer/debug/DebugRendererPathfinding;";
	}

	/**
	 * <p>
	 * Name: zo
	 * </p>
	 */
	public static McObfPair field_190071_h = McMappingDatabase.getSRG("field_190071_h");

	/**
	 * <p>
	 * Name: pathMaxDistance
	 * </p>
	 */
	public static McObfPair field_188292_c = McMappingDatabase.getSRG("field_188292_c");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(FJ)V]
	 * </p>
	 */
	public static McObfPair func_190060_a = McMappingDatabase.getSRG("DebugRendererPathfinding.func_190060_a");

	/**
	 * <p>
	 * Name: yo
	 * </p>
	 */
	public static McObfPair field_190070_g = McMappingDatabase.getSRG("field_190070_g");

	/**
	 * <p>
	 * Name: addDistanceToPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/pathfinding/PathPoint;)F]
	 * </p>
	 */
	public static McObfPair func_190066_a = McMappingDatabase.getSRG("DebugRendererPathfinding.func_190066_a");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_190068_e = McMappingDatabase.getSRG("field_190068_e");

	/**
	 * <p>
	 * Name: pathMap
	 * </p>
	 */
	public static McObfPair field_188291_b = McMappingDatabase.getSRG("field_188291_b");

	/**
	 * <p>
	 * Name: xo
	 * </p>
	 */
	public static McObfPair field_190069_f = McMappingDatabase.getSRG("field_190069_f");

	/**
	 * <p>
	 * Name: minecraft
	 * </p>
	 */
	public static McObfPair field_188290_a = McMappingDatabase.getSRG("field_188290_a");

	/**
	 * <p>
	 * Name: renderPathLine
	 * </p>
	 * <p>
	 * Desc: [(FLnet/minecraft/pathfinding/Path;)V]
	 * </p>
	 */
	public static McObfPair func_190067_a = McMappingDatabase.getSRG("DebugRendererPathfinding.func_190067_a");

	/**
	 * <p>
	 * Name: addPath
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/pathfinding/Path;F)V]
	 * </p>
	 */
	public static McObfPair func_188289_a = McMappingDatabase.getSRG("DebugRendererPathfinding.func_188289_a");

	/**
	 * <p>
	 * Name: creationMap
	 * </p>
	 */
	public static McObfPair field_188293_d = McMappingDatabase.getSRG("field_188293_d");

}

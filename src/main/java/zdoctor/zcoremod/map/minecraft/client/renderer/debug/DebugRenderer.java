package zdoctor.zcoremod.map.minecraft.client.renderer.debug;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DebugRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byg";
		else
			return "net/minecraft/client/renderer/debug/DebugRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byg";
		else
			return "DebugRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyg;";
		else
			return "Lnet/minecraft/client/renderer/debug/DebugRenderer;";
	}

	/**
	 * <p>
	 * Name: heightMap
	 * </p>
	 */
	public static McObfPair field_190078_d = McMappingDatabase.getSRG("field_190078_d");

	/**
	 * <p>
	 * Name: pathfindingEnabled
	 * </p>
	 */
	public static McObfPair field_190080_f = McMappingDatabase.getSRG("field_190080_f");

	/**
	 * <p>
	 * Name: chunkBorderEnabled
	 * </p>
	 */
	public static McObfPair field_190079_e = McMappingDatabase.getSRG("field_190079_e");

	/**
	 * <p>
	 * Name: toggleChunkBorders
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190075_b = McMappingDatabase.getSRG("DebugRenderer.func_190075_b");

	/**
	 * <p>
	 * Name: waterEnabled
	 * </p>
	 */
	public static McObfPair field_190081_g = McMappingDatabase.getSRG("field_190081_g");

	/**
	 * <p>
	 * Name: renderDebugText
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;IIIFI)V]
	 * </p>
	 */
	public static McObfPair func_191556_a = McMappingDatabase.getSRG("DebugRenderer.func_191556_a");

	/**
	 * <p>
	 * Name: solidFace
	 * </p>
	 */
	public static McObfPair field_193852_g = McMappingDatabase.getSRG("field_193852_g");

	/**
	 * <p>
	 * Name: pathfinding
	 * </p>
	 */
	public static McObfPair field_188286_a = McMappingDatabase.getSRG("field_188286_a");

	/**
	 * <p>
	 * Name: water
	 * </p>
	 */
	public static McObfPair field_188287_b = McMappingDatabase.getSRG("field_188287_b");

	/**
	 * <p>
	 * Name: collisionBox
	 * </p>
	 */
	public static McObfPair field_191325_e = McMappingDatabase.getSRG("field_191325_e");

	/**
	 * <p>
	 * Name: neighborsUpdateEnabled
	 * </p>
	 */
	public static McObfPair field_191558_l = McMappingDatabase.getSRG("field_191558_l");

	/**
	 * <p>
	 * Name: neighborsUpdate
	 * </p>
	 */
	public static McObfPair field_191557_f = McMappingDatabase.getSRG("field_191557_f");

	/**
	 * <p>
	 * Name: heightMapEnabled
	 * </p>
	 */
	public static McObfPair field_190082_h = McMappingDatabase.getSRG("field_190082_h");

	/**
	 * <p>
	 * Name: renderDebugText
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;DDDFI)V]
	 * </p>
	 */
	public static McObfPair func_190076_a = McMappingDatabase.getSRG("DebugRenderer.func_190076_a");

	/**
	 * <p>
	 * Name: shouldRender
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190074_a = McMappingDatabase.getSRG("DebugRenderer.func_190074_a");

	/**
	 * <p>
	 * Name: solidFaceEnabled
	 * </p>
	 */
	public static McObfPair field_193853_n = McMappingDatabase.getSRG("field_193853_n");

	/**
	 * <p>
	 * Name: collisionBoxEnabled
	 * </p>
	 */
	public static McObfPair field_191326_j = McMappingDatabase.getSRG("field_191326_j");

	/**
	 * <p>
	 * Name: renderDebug
	 * </p>
	 * <p>
	 * Desc: [(FJ)V]
	 * </p>
	 */
	public static McObfPair func_190073_a = McMappingDatabase.getSRG("DebugRenderer.func_190073_a");

	/**
	 * <p>
	 * Name: chunkBorder
	 * </p>
	 */
	public static McObfPair field_190077_c = McMappingDatabase.getSRG("field_190077_c");

}

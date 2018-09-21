package zdoctor.zcoremod.map.minecraft.world.gen.layer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GenLayerBiomeEdge {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdj";
		else
			return "net/minecraft/world/gen/layer/GenLayerBiomeEdge";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdj";
		else
			return "GenLayerBiomeEdge";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbdj;";
		else
			return "Lnet/minecraft/world/gen/layer/GenLayerBiomeEdge;";
	}

	/**
	 * <p>
	 * Name: getInts
	 * </p>
	 * <p>
	 * Desc: [(IIII)[I]
	 * </p>
	 */
	public static McObfPair func_75904_a = McMappingDatabase.getSRG("GenLayerBiomeEdge.func_75904_a");

	/**
	 * <p>
	 * Name: canBiomesBeNeighbors
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_151634_b = McMappingDatabase.getSRG("GenLayerBiomeEdge.func_151634_b");

	/**
	 * <p>
	 * Name: replaceBiomeEdge
	 * </p>
	 * <p>
	 * Desc: [([I[IIIIIII)Z]
	 * </p>
	 */
	public static McObfPair func_151635_b = McMappingDatabase.getSRG("GenLayerBiomeEdge.func_151635_b");

	/**
	 * <p>
	 * Name: replaceBiomeEdgeIfNecessary
	 * </p>
	 * <p>
	 * Desc: [([I[IIIIIII)Z]
	 * </p>
	 */
	public static McObfPair func_151636_a = McMappingDatabase.getSRG("GenLayerBiomeEdge.func_151636_a");

}

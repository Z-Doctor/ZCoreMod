package zdoctor.zcoremod.map.minecraft.client.renderer.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class VisGraph {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxu";
		else
			return "net/minecraft/client/renderer/chunk/VisGraph";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxu";
		else
			return "VisGraph";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxu;";
		else
			return "Lnet/minecraft/client/renderer/chunk/VisGraph;";
	}

	/**
	 * <p>
	 * Name: computeVisibility
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/chunk/SetVisibility;]
	 * </p>
	 */
	public static McObfPair func_178607_a = McMappingDatabase.getSRG("VisGraph.func_178607_a");

	/**
	 * <p>
	 * Name: DZ
	 * </p>
	 */
	public static McObfPair field_178614_b = McMappingDatabase.getSRG("field_178614_b");

	/**
	 * <p>
	 * Name: INDEX_OF_EDGES
	 * </p>
	 */
	public static McObfPair field_178613_e = McMappingDatabase.getSRG("field_178613_e");

	/**
	 * <p>
	 * Name: DX
	 * </p>
	 */
	public static McObfPair field_178616_a = McMappingDatabase.getSRG("field_178616_a");

	/**
	 * <p>
	 * Name: addEdges
	 * </p>
	 * <p>
	 * Desc: [(ILjava/util/Set;)V]
	 * </p>
	 */
	public static McObfPair func_178610_a = McMappingDatabase.getSRG("VisGraph.func_178610_a");

	/**
	 * <p>
	 * Name: getVisibleFacings
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_178609_b = McMappingDatabase.getSRG("VisGraph.func_178609_b");

	/**
	 * <p>
	 * Name: setOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_178606_a = McMappingDatabase.getSRG("VisGraph.func_178606_a");

	/**
	 * <p>
	 * Name: empty
	 * </p>
	 */
	public static McObfPair field_178611_f = McMappingDatabase.getSRG("field_178611_f");

	/**
	 * <p>
	 * Name: getIndex
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_178608_c = McMappingDatabase.getSRG("VisGraph.func_178608_c");

	/**
	 * <p>
	 * Name: getNeighborIndexAtFace
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_178603_a = McMappingDatabase.getSRG("VisGraph.func_178603_a");

	/**
	 * <p>
	 * Name: DY
	 * </p>
	 */
	public static McObfPair field_178615_c = McMappingDatabase.getSRG("field_178615_c");

	/**
	 * <p>
	 * Name: bitSet
	 * </p>
	 */
	public static McObfPair field_178612_d = McMappingDatabase.getSRG("field_178612_d");

	/**
	 * <p>
	 * Name: getIndex
	 * </p>
	 * <p>
	 * Desc: [(III)I]
	 * </p>
	 */
	public static McObfPair func_178605_a = McMappingDatabase.getSRG("VisGraph.func_178605_a");

	/**
	 * <p>
	 * Name: floodFill
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_178604_a = McMappingDatabase.getSRG("VisGraph.func_178604_a");

}

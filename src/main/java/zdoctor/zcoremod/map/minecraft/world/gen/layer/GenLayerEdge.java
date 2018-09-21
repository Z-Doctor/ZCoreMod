package zdoctor.zcoremod.map.minecraft.world.gen.layer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GenLayerEdge {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdf";
		else
			return "net/minecraft/world/gen/layer/GenLayerEdge";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdf";
		else
			return "GenLayerEdge";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbdf;";
		else
			return "Lnet/minecraft/world/gen/layer/GenLayerEdge;";
	}

	/**
	 * <p>
	 * Name: getIntsSpecial
	 * </p>
	 * <p>
	 * Desc: [(IIII)[I]
	 * </p>
	 */
	public static McObfPair func_151625_e = McMappingDatabase.getSRG("GenLayerEdge.func_151625_e");

	/**
	 * <p>
	 * Name: getIntsHeatIce
	 * </p>
	 * <p>
	 * Desc: [(IIII)[I]
	 * </p>
	 */
	public static McObfPair func_151624_d = McMappingDatabase.getSRG("GenLayerEdge.func_151624_d");

	/**
	 * <p>
	 * Name: getInts
	 * </p>
	 * <p>
	 * Desc: [(IIII)[I]
	 * </p>
	 */
	public static McObfPair func_75904_a = McMappingDatabase.getSRG("GenLayerEdge.func_75904_a");

	/**
	 * <p>
	 * Name: getIntsCoolWarm
	 * </p>
	 * <p>
	 * Desc: [(IIII)[I]
	 * </p>
	 */
	public static McObfPair func_151626_c = McMappingDatabase.getSRG("GenLayerEdge.func_151626_c");

	/**
	 * <p>
	 * Name: mode
	 * </p>
	 */
	public static McObfPair field_151627_c = McMappingDatabase.getSRG("field_151627_c");

}

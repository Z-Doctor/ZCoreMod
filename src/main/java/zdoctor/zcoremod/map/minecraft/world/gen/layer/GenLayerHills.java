package zdoctor.zcoremod.map.minecraft.world.gen.layer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GenLayerHills {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bds";
		else
			return "net/minecraft/world/gen/layer/GenLayerHills";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bds";
		else
			return "GenLayerHills";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbds;";
		else
			return "Lnet/minecraft/world/gen/layer/GenLayerHills;";
	}

	/**
	 * <p>
	 * Name: riverLayer
	 * </p>
	 */
	public static McObfPair field_151628_d = McMappingDatabase.getSRG("field_151628_d");

	/**
	 * <p>
	 * Name: getInts
	 * </p>
	 * <p>
	 * Desc: [(IIII)[I]
	 * </p>
	 */
	public static McObfPair func_75904_a = McMappingDatabase.getSRG("GenLayerHills.func_75904_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151629_c = McMappingDatabase.getSRG("field_151629_c");

}

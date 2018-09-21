package zdoctor.zcoremod.map.minecraft.world.gen.layer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GenLayerFuzzyZoom {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdm";
		else
			return "net/minecraft/world/gen/layer/GenLayerFuzzyZoom";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdm";
		else
			return "GenLayerFuzzyZoom";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbdm;";
		else
			return "Lnet/minecraft/world/gen/layer/GenLayerFuzzyZoom;";
	}

	/**
	 * <p>
	 * Name: selectModeOrRandom
	 * </p>
	 * <p>
	 * Desc: [(IIII)I]
	 * </p>
	 */
	public static McObfPair func_151617_b = McMappingDatabase.getSRG("GenLayerFuzzyZoom.func_151617_b");

}

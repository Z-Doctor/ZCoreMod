package zdoctor.zcoremod.map.minecraft.world.gen.layer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GenLayerDeepOcean {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bde";
		else
			return "net/minecraft/world/gen/layer/GenLayerDeepOcean";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bde";
		else
			return "GenLayerDeepOcean";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbde;";
		else
			return "Lnet/minecraft/world/gen/layer/GenLayerDeepOcean;";
	}

	/**
	 * <p>
	 * Name: getInts
	 * </p>
	 * <p>
	 * Desc: [(IIII)[I]
	 * </p>
	 */
	public static McObfPair func_75904_a = McMappingDatabase.getSRG("GenLayerDeepOcean.func_75904_a");

}

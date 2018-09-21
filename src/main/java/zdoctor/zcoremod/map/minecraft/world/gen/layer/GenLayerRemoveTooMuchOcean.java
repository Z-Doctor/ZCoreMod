package zdoctor.zcoremod.map.minecraft.world.gen.layer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GenLayerRemoveTooMuchOcean {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdt";
		else
			return "net/minecraft/world/gen/layer/GenLayerRemoveTooMuchOcean";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdt";
		else
			return "GenLayerRemoveTooMuchOcean";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbdt;";
		else
			return "Lnet/minecraft/world/gen/layer/GenLayerRemoveTooMuchOcean;";
	}

	/**
	 * <p>
	 * Name: getInts
	 * </p>
	 * <p>
	 * Desc: [(IIII)[I]
	 * </p>
	 */
	public static McObfPair func_75904_a = McMappingDatabase.getSRG("GenLayerRemoveTooMuchOcean.func_75904_a");

}

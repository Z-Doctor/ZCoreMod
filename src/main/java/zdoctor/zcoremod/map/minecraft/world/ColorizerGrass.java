package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ColorizerGrass {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amt";
		else
			return "net/minecraft/world/ColorizerGrass";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amt";
		else
			return "ColorizerGrass";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamt;";
		else
			return "Lnet/minecraft/world/ColorizerGrass;";
	}

	/**
	 * <p>
	 * Name: grassBuffer
	 * </p>
	 */
	public static McObfPair field_77481_a = McMappingDatabase.getSRG("field_77481_a");

	/**
	 * <p>
	 * Name: getGrassColor
	 * </p>
	 * <p>
	 * Desc: [(DD)I]
	 * </p>
	 */
	public static McObfPair func_77480_a = McMappingDatabase.getSRG("ColorizerGrass.func_77480_a");

	/**
	 * <p>
	 * Name: setGrassBiomeColorizer
	 * </p>
	 * <p>
	 * Desc: [([I)V]
	 * </p>
	 */
	public static McObfPair func_77479_a = McMappingDatabase.getSRG("ColorizerGrass.func_77479_a");

}

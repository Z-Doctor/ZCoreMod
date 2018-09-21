package zdoctor.zcoremod.map.minecraft.world.gen.layer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GenLayerRiverMix {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdw";
		else
			return "net/minecraft/world/gen/layer/GenLayerRiverMix";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdw";
		else
			return "GenLayerRiverMix";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbdw;";
		else
			return "Lnet/minecraft/world/gen/layer/GenLayerRiverMix;";
	}

	/**
	 * <p>
	 * Name: initWorldGenSeed
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_75905_a = McMappingDatabase.getSRG("GenLayerRiverMix.func_75905_a");

	/**
	 * <p>
	 * Name: biomePatternGeneratorChain
	 * </p>
	 */
	public static McObfPair field_75910_b = McMappingDatabase.getSRG("field_75910_b");

	/**
	 * <p>
	 * Name: getInts
	 * </p>
	 * <p>
	 * Desc: [(IIII)[I]
	 * </p>
	 */
	public static McObfPair func_75904_a = McMappingDatabase.getSRG("GenLayerRiverMix.func_75904_a");

	/**
	 * <p>
	 * Name: riverPatternGeneratorChain
	 * </p>
	 */
	public static McObfPair field_75911_c = McMappingDatabase.getSRG("field_75911_c");

}

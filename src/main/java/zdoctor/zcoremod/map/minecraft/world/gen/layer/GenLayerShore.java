package zdoctor.zcoremod.map.minecraft.world.gen.layer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GenLayerShore {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdx";
		else
			return "net/minecraft/world/gen/layer/GenLayerShore";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdx";
		else
			return "GenLayerShore";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbdx;";
		else
			return "Lnet/minecraft/world/gen/layer/GenLayerShore;";
	}

	/**
	 * <p>
	 * Name: getInts
	 * </p>
	 * <p>
	 * Desc: [(IIII)[I]
	 * </p>
	 */
	public static McObfPair func_75904_a = McMappingDatabase.getSRG("GenLayerShore.func_75904_a");

	/**
	 * <p>
	 * Name: isJungleCompatible
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_151631_c = McMappingDatabase.getSRG("GenLayerShore.func_151631_c");

	/**
	 * <p>
	 * Name: isMesa
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_151633_d = McMappingDatabase.getSRG("GenLayerShore.func_151633_d");

	/**
	 * <p>
	 * Name: replaceIfNeighborOcean
	 * </p>
	 * <p>
	 * Desc: [([I[IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_151632_a = McMappingDatabase.getSRG("GenLayerShore.func_151632_a");

}

package zdoctor.zcoremod.map.minecraft.world.gen.layer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GenLayerZoom {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bed";
		else
			return "net/minecraft/world/gen/layer/GenLayerZoom";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bed";
		else
			return "GenLayerZoom";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbed;";
		else
			return "Lnet/minecraft/world/gen/layer/GenLayerZoom;";
	}

	/**
	 * <p>
	 * Name: getInts
	 * </p>
	 * <p>
	 * Desc: [(IIII)[I]
	 * </p>
	 */
	public static McObfPair func_75904_a = McMappingDatabase.getSRG("GenLayerZoom.func_75904_a");

	/**
	 * <p>
	 * Name: magnify
	 * </p>
	 * <p>
	 * Desc: [(JLnet/minecraft/world/gen/layer/GenLayer;I)Lnet/minecraft/world/gen/layer/GenLayer;]
	 * </p>
	 */
	public static McObfPair func_75915_a = McMappingDatabase.getSRG("GenLayerZoom.func_75915_a");

}

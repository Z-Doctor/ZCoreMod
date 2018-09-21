package zdoctor.zcoremod.map.minecraft.world.gen.layer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GenLayerAddIsland {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdg";
		else
			return "net/minecraft/world/gen/layer/GenLayerAddIsland";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdg";
		else
			return "GenLayerAddIsland";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbdg;";
		else
			return "Lnet/minecraft/world/gen/layer/GenLayerAddIsland;";
	}

	/**
	 * <p>
	 * Name: getInts
	 * </p>
	 * <p>
	 * Desc: [(IIII)[I]
	 * </p>
	 */
	public static McObfPair func_75904_a = McMappingDatabase.getSRG("GenLayerAddIsland.func_75904_a");

}

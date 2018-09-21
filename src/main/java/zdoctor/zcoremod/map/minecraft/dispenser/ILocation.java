package zdoctor.zcoremod.map.minecraft.dispenser;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ILocation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ff";
		else
			return "net/minecraft/dispenser/ILocation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ff";
		else
			return "ILocation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lff;";
		else
			return "Lnet/minecraft/dispenser/ILocation;";
	}

	/**
	 * <p>
	 * Name: getWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_82618_k = McMappingDatabase.getSRG("ILocation.func_82618_k");

}

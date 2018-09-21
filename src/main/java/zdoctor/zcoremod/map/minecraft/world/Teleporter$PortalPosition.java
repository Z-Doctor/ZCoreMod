package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Teleporter$PortalPosition {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anc$a";
		else
			return "net/minecraft/world/Teleporter$PortalPosition";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anc$a";
		else
			return "Teleporter$PortalPosition";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanc$a;";
		else
			return "Lnet/minecraft/world/Teleporter$PortalPosition;";
	}

	/**
	 * <p>
	 * Name: lastUpdateTime
	 * </p>
	 */
	public static McObfPair field_85087_d = McMappingDatabase.getSRG("field_85087_d");

}

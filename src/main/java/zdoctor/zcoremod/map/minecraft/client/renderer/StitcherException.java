package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StitcherException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdo";
		else
			return "net/minecraft/client/renderer/StitcherException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdo";
		else
			return "StitcherException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdo;";
		else
			return "Lnet/minecraft/client/renderer/StitcherException;";
	}

	/**
	 * <p>
	 * Name: holder
	 * </p>
	 */
	public static McObfPair field_98149_a = McMappingDatabase.getSRG("field_98149_a");

}

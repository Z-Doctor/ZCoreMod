package zdoctor.zcoremod.map.minecraft.server.dedicated;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PendingCommand {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nk";
		else
			return "net/minecraft/server/dedicated/PendingCommand";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nk";
		else
			return "PendingCommand";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnk;";
		else
			return "Lnet/minecraft/server/dedicated/PendingCommand;";
	}

	/**
	 * <p>
	 * Name: sender
	 * </p>
	 */
	public static McObfPair field_73701_b = McMappingDatabase.getSRG("field_73701_b");

	/**
	 * <p>
	 * Name: command
	 * </p>
	 */
	public static McObfPair field_73702_a = McMappingDatabase.getSRG("field_73702_a");

}

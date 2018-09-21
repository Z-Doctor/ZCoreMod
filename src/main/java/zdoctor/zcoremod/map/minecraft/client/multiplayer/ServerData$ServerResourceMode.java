package zdoctor.zcoremod.map.minecraft.client.multiplayer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerData$ServerResourceMode {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bse$a";
		else
			return "net/minecraft/client/multiplayer/ServerData$ServerResourceMode";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bse$a";
		else
			return "ServerData$ServerResourceMode";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbse$a;";
		else
			return "Lnet/minecraft/client/multiplayer/ServerData$ServerResourceMode;";
	}

	/**
	 * <p>
	 * Name: getMotd
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_152589_a = McMappingDatabase.getSRG("ServerData$ServerResourceMode.func_152589_a");

	/**
	 * <p>
	 * Name: motd
	 * </p>
	 */
	public static McObfPair field_152594_d = McMappingDatabase.getSRG("field_152594_d");

}

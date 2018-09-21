package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketTitle$Type {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kp$a";
		else
			return "net/minecraft/network/play/server/SPacketTitle$Type";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kp$a";
		else
			return "SPacketTitle$Type";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkp$a;";
		else
			return "Lnet/minecraft/network/play/server/SPacketTitle$Type;";
	}

	/**
	 * <p>
	 * Name: getNames
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_179971_a = McMappingDatabase.getSRG("SPacketTitle$Type.func_179971_a");

	/**
	 * <p>
	 * Name: byName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/network/play/server/SPacketTitle$Type;]
	 * </p>
	 */
	public static McObfPair func_179969_a = McMappingDatabase.getSRG("SPacketTitle$Type.func_179969_a");

}

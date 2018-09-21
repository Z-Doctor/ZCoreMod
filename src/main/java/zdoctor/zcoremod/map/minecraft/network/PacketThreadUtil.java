package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PacketThreadUtil {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hv";
		else
			return "net/minecraft/network/PacketThreadUtil";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hv";
		else
			return "PacketThreadUtil";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhv;";
		else
			return "Lnet/minecraft/network/PacketThreadUtil;";
	}

	/**
	 * <p>
	 * Name: checkThreadAndEnqueue
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/Packet;Lnet/minecraft/network/INetHandler;Lnet/minecraft/util/IThreadListener;)V]
	 * </p>
	 */
	public static McObfPair func_180031_a = McMappingDatabase.getSRG("PacketThreadUtil.func_180031_a");

}

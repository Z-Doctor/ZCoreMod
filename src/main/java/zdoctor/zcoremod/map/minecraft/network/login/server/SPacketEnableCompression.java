package zdoctor.zcoremod.map.minecraft.network.login.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketEnableCompression {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mj";
		else
			return "net/minecraft/network/login/server/SPacketEnableCompression";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mj";
		else
			return "SPacketEnableCompression";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lmj;";
		else
			return "Lnet/minecraft/network/login/server/SPacketEnableCompression;";
	}

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketEnableCompression.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketEnableCompression.func_148837_a");

	/**
	 * <p>
	 * Name: getCompressionThreshold
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179731_a = McMappingDatabase.getSRG("SPacketEnableCompression.func_179731_a");

	/**
	 * <p>
	 * Name: compressionThreshold
	 * </p>
	 */
	public static McObfPair field_179733_a = McMappingDatabase.getSRG("field_179733_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/login/INetHandlerLoginClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketEnableCompression.func_148833_a");

}

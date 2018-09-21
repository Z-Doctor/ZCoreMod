package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LegacyPingHandler {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ox";
		else
			return "net/minecraft/network/LegacyPingHandler";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ox";
		else
			return "LegacyPingHandler";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lox;";
		else
			return "Lnet/minecraft/network/LegacyPingHandler;";
	}

	/**
	 * <p>
	 * Name: writeAndFlush
	 * </p>
	 * <p>
	 * Desc: [(Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;)V]
	 * </p>
	 */
	public static McObfPair func_151256_a = McMappingDatabase.getSRG("LegacyPingHandler.func_151256_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151258_a = McMappingDatabase.getSRG("field_151258_a");

	/**
	 * <p>
	 * Name: networkSystem
	 * </p>
	 */
	public static McObfPair field_151257_b = McMappingDatabase.getSRG("field_151257_b");

	/**
	 * <p>
	 * Name: getStringBuffer
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lio/netty/buffer/ByteBuf;]
	 * </p>
	 */
	public static McObfPair func_151255_a = McMappingDatabase.getSRG("LegacyPingHandler.func_151255_a");

}

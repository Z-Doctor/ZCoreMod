package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NettyEncryptionTranslator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gr";
		else
			return "net/minecraft/network/NettyEncryptionTranslator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gr";
		else
			return "NettyEncryptionTranslator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgr;";
		else
			return "Lnet/minecraft/network/NettyEncryptionTranslator;";
	}

	/**
	 * <p>
	 * Name: cipher
	 * </p>
	 */
	public static McObfPair field_150507_a = McMappingDatabase.getSRG("field_150507_a");

	/**
	 * <p>
	 * Name: cipher
	 * </p>
	 * <p>
	 * Desc: [(Lio/netty/buffer/ByteBuf;Lio/netty/buffer/ByteBuf;)V]
	 * </p>
	 */
	public static McObfPair func_150504_a = McMappingDatabase.getSRG("NettyEncryptionTranslator.func_150504_a");

	/**
	 * <p>
	 * Name: inputBuffer
	 * </p>
	 */
	public static McObfPair field_150505_b = McMappingDatabase.getSRG("field_150505_b");

	/**
	 * <p>
	 * Name: decipher
	 * </p>
	 * <p>
	 * Desc: [(Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;]
	 * </p>
	 */
	public static McObfPair func_150503_a = McMappingDatabase.getSRG("NettyEncryptionTranslator.func_150503_a");

	/**
	 * <p>
	 * Name: bufToBytes
	 * </p>
	 * <p>
	 * Desc: [(Lio/netty/buffer/ByteBuf;)[B]
	 * </p>
	 */
	public static McObfPair func_150502_a = McMappingDatabase.getSRG("NettyEncryptionTranslator.func_150502_a");

	/**
	 * <p>
	 * Name: outputBuffer
	 * </p>
	 */
	public static McObfPair field_150506_c = McMappingDatabase.getSRG("field_150506_c");

}

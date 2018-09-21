package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketPlayerListHeaderFooter {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kr";
		else
			return "net/minecraft/network/play/server/SPacketPlayerListHeaderFooter";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kr";
		else
			return "SPacketPlayerListHeaderFooter";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkr;";
		else
			return "Lnet/minecraft/network/play/server/SPacketPlayerListHeaderFooter;";
	}

	/**
	 * <p>
	 * Name: footer
	 * </p>
	 */
	public static McObfPair field_179702_b = McMappingDatabase.getSRG("field_179702_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketPlayerListHeaderFooter.func_148833_a");

	/**
	 * <p>
	 * Name: header
	 * </p>
	 */
	public static McObfPair field_179703_a = McMappingDatabase.getSRG("field_179703_a");

	/**
	 * <p>
	 * Name: getFooter
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_179701_b = McMappingDatabase.getSRG("SPacketPlayerListHeaderFooter.func_179701_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketPlayerListHeaderFooter.func_148837_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketPlayerListHeaderFooter.func_148840_b");

	/**
	 * <p>
	 * Name: getHeader
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_179700_a = McMappingDatabase.getSRG("SPacketPlayerListHeaderFooter.func_179700_a");

}

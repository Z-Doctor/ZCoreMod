package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketTitle {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kp";
		else
			return "net/minecraft/network/play/server/SPacketTitle";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kp";
		else
			return "SPacketTitle";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkp;";
		else
			return "Lnet/minecraft/network/play/server/SPacketTitle;";
	}

	/**
	 * <p>
	 * Name: getFadeInTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179806_c = McMappingDatabase.getSRG("SPacketTitle.func_179806_c");

	/**
	 * <p>
	 * Name: getMessage
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_179805_b = McMappingDatabase.getSRG("SPacketTitle.func_179805_b");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_179812_a = McMappingDatabase.getSRG("field_179812_a");

	/**
	 * <p>
	 * Name: fadeOutTime
	 * </p>
	 */
	public static McObfPair field_179809_e = McMappingDatabase.getSRG("field_179809_e");

	/**
	 * <p>
	 * Name: displayTime
	 * </p>
	 */
	public static McObfPair field_179808_d = McMappingDatabase.getSRG("field_179808_d");

	/**
	 * <p>
	 * Name: fadeInTime
	 * </p>
	 */
	public static McObfPair field_179811_c = McMappingDatabase.getSRG("field_179811_c");

	/**
	 * <p>
	 * Name: getDisplayTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179804_d = McMappingDatabase.getSRG("SPacketTitle.func_179804_d");

	/**
	 * <p>
	 * Name: message
	 * </p>
	 */
	public static McObfPair field_179810_b = McMappingDatabase.getSRG("field_179810_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketTitle.func_148837_a");

	/**
	 * <p>
	 * Name: getFadeOutTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179803_e = McMappingDatabase.getSRG("SPacketTitle.func_179803_e");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketTitle.func_148833_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketTitle.func_148840_b");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketTitle$Type;]
	 * </p>
	 */
	public static McObfPair func_179807_a = McMappingDatabase.getSRG("SPacketTitle.func_179807_a");

}

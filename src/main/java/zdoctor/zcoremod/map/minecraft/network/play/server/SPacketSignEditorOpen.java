package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketSignEditorOpen {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jl";
		else
			return "net/minecraft/network/play/server/SPacketSignEditorOpen";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jl";
		else
			return "SPacketSignEditorOpen";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljl;";
		else
			return "Lnet/minecraft/network/play/server/SPacketSignEditorOpen;";
	}

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketSignEditorOpen.func_148837_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketSignEditorOpen.func_148840_b");

	/**
	 * <p>
	 * Name: getSignPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_179777_a = McMappingDatabase.getSRG("SPacketSignEditorOpen.func_179777_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketSignEditorOpen.func_148833_a");

	/**
	 * <p>
	 * Name: signPosition
	 * </p>
	 */
	public static McObfPair field_179778_a = McMappingDatabase.getSRG("field_179778_a");

}

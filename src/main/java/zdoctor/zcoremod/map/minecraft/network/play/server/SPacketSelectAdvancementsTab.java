package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketSelectAdvancementsTab {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jy";
		else
			return "net/minecraft/network/play/server/SPacketSelectAdvancementsTab";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jy";
		else
			return "SPacketSelectAdvancementsTab";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljy;";
		else
			return "Lnet/minecraft/network/play/server/SPacketSelectAdvancementsTab;";
	}

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketSelectAdvancementsTab.func_148837_a");

	/**
	 * <p>
	 * Name: getTab
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_194154_a = McMappingDatabase.getSRG("SPacketSelectAdvancementsTab.func_194154_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketSelectAdvancementsTab.func_148840_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketSelectAdvancementsTab.func_148833_a");

	/**
	 * <p>
	 * Name: tab
	 * </p>
	 */
	public static McObfPair field_194155_a = McMappingDatabase.getSRG("field_194155_a");

}

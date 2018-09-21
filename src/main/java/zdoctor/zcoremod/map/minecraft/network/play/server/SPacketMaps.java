package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketMaps {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ji";
		else
			return "net/minecraft/network/play/server/SPacketMaps";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ji";
		else
			return "SPacketMaps";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lji;";
		else
			return "Lnet/minecraft/network/play/server/SPacketMaps;";
	}

	/**
	 * <p>
	 * Name: minX
	 * </p>
	 */
	public static McObfPair field_179737_d = McMappingDatabase.getSRG("field_179737_d");

	/**
	 * <p>
	 * Name: trackingPosition
	 * </p>
	 */
	public static McObfPair field_186950_c = McMappingDatabase.getSRG("field_186950_c");

	/**
	 * <p>
	 * Name: mapId
	 * </p>
	 */
	public static McObfPair field_149191_a = McMappingDatabase.getSRG("field_149191_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketMaps.func_148840_b");

	/**
	 * <p>
	 * Name: minZ
	 * </p>
	 */
	public static McObfPair field_179738_e = McMappingDatabase.getSRG("field_179738_e");

	/**
	 * <p>
	 * Name: mapDataBytes
	 * </p>
	 */
	public static McObfPair field_179741_h = McMappingDatabase.getSRG("field_179741_h");

	/**
	 * <p>
	 * Name: getMapId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149188_c = McMappingDatabase.getSRG("SPacketMaps.func_149188_c");

	/**
	 * <p>
	 * Name: icons
	 * </p>
	 */
	public static McObfPair field_179740_c = McMappingDatabase.getSRG("field_179740_c");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketMaps.func_148837_a");

	/**
	 * <p>
	 * Name: columns
	 * </p>
	 */
	public static McObfPair field_179735_f = McMappingDatabase.getSRG("field_179735_f");

	/**
	 * <p>
	 * Name: setMapdataTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/MapData;)V]
	 * </p>
	 */
	public static McObfPair func_179734_a = McMappingDatabase.getSRG("SPacketMaps.func_179734_a");

	/**
	 * <p>
	 * Name: rows
	 * </p>
	 */
	public static McObfPair field_179736_g = McMappingDatabase.getSRG("field_179736_g");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketMaps.func_148833_a");

	/**
	 * <p>
	 * Name: mapScale
	 * </p>
	 */
	public static McObfPair field_179739_b = McMappingDatabase.getSRG("field_179739_b");

}

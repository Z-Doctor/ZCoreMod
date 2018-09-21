package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketChunkData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "je";
		else
			return "net/minecraft/network/play/server/SPacketChunkData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "je";
		else
			return "SPacketChunkData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lje;";
		else
			return "Lnet/minecraft/network/play/server/SPacketChunkData;";
	}

	/**
	 * <p>
	 * Name: getChunkZ
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149271_f = McMappingDatabase.getSRG("SPacketChunkData.func_149271_f");

	/**
	 * <p>
	 * Name: calculateChunkSize
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;ZI)I]
	 * </p>
	 */
	public static McObfPair func_189556_a = McMappingDatabase.getSRG("SPacketChunkData.func_189556_a");

	/**
	 * <p>
	 * Name: buffer
	 * </p>
	 */
	public static McObfPair field_186949_d = McMappingDatabase.getSRG("field_186949_d");

	/**
	 * <p>
	 * Name: getChunkX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149273_e = McMappingDatabase.getSRG("SPacketChunkData.func_149273_e");

	/**
	 * <p>
	 * Name: getExtractedSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149276_g = McMappingDatabase.getSRG("SPacketChunkData.func_149276_g");

	/**
	 * <p>
	 * Name: fullChunk
	 * </p>
	 */
	public static McObfPair field_149279_g = McMappingDatabase.getSRG("field_149279_g");

	/**
	 * <p>
	 * Name: getTileEntityTags
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_189554_f = McMappingDatabase.getSRG("SPacketChunkData.func_189554_f");

	/**
	 * <p>
	 * Name: extractChunkData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;Lnet/minecraft/world/chunk/Chunk;ZI)I]
	 * </p>
	 */
	public static McObfPair func_189555_a = McMappingDatabase.getSRG("SPacketChunkData.func_189555_a");

	/**
	 * <p>
	 * Name: getReadBuffer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_186946_a = McMappingDatabase.getSRG("SPacketChunkData.func_186946_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketChunkData.func_148840_b");

	/**
	 * <p>
	 * Name: isFullChunk
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149274_i = McMappingDatabase.getSRG("SPacketChunkData.func_149274_i");

	/**
	 * <p>
	 * Name: chunkZ
	 * </p>
	 */
	public static McObfPair field_149282_b = McMappingDatabase.getSRG("field_149282_b");

	/**
	 * <p>
	 * Name: chunkX
	 * </p>
	 */
	public static McObfPair field_149284_a = McMappingDatabase.getSRG("field_149284_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketChunkData.func_148833_a");

	/**
	 * <p>
	 * Name: availableSections
	 * </p>
	 */
	public static McObfPair field_186948_c = McMappingDatabase.getSRG("field_186948_c");

	/**
	 * <p>
	 * Name: getWriteBuffer
	 * </p>
	 * <p>
	 * Desc: [()Lio/netty/buffer/ByteBuf;]
	 * </p>
	 */
	public static McObfPair func_186945_f = McMappingDatabase.getSRG("SPacketChunkData.func_186945_f");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketChunkData.func_148837_a");

	/**
	 * <p>
	 * Name: tileEntityTags
	 * </p>
	 */
	public static McObfPair field_189557_e = McMappingDatabase.getSRG("field_189557_e");

}

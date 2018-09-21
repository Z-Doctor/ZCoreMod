package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketUpdateTileEntity {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ih";
		else
			return "net/minecraft/network/play/server/SPacketUpdateTileEntity";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ih";
		else
			return "SPacketUpdateTileEntity";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lih;";
		else
			return "Lnet/minecraft/network/play/server/SPacketUpdateTileEntity;";
	}

	/**
	 * <p>
	 * Name: getPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_179823_a = McMappingDatabase.getSRG("SPacketUpdateTileEntity.func_179823_a");

	/**
	 * <p>
	 * Name: tileEntityType
	 * </p>
	 */
	public static McObfPair field_148859_d = McMappingDatabase.getSRG("field_148859_d");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketUpdateTileEntity.func_148833_a");

	/**
	 * <p>
	 * Name: getNbtCompound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_148857_g = McMappingDatabase.getSRG("SPacketUpdateTileEntity.func_148857_g");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketUpdateTileEntity.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketUpdateTileEntity.func_148837_a");

	/**
	 * <p>
	 * Name: blockPos
	 * </p>
	 */
	public static McObfPair field_179824_a = McMappingDatabase.getSRG("field_179824_a");

	/**
	 * <p>
	 * Name: nbt
	 * </p>
	 */
	public static McObfPair field_148860_e = McMappingDatabase.getSRG("field_148860_e");

	/**
	 * <p>
	 * Name: getTileEntityType
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148853_f = McMappingDatabase.getSRG("SPacketUpdateTileEntity.func_148853_f");

}

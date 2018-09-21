package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketEntityEquipment {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kg";
		else
			return "net/minecraft/network/play/server/SPacketEntityEquipment";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kg";
		else
			return "SPacketEntityEquipment";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkg;";
		else
			return "Lnet/minecraft/network/play/server/SPacketEntityEquipment;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketEntityEquipment.func_148833_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketEntityEquipment.func_148837_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketEntityEquipment.func_148840_b");

	/**
	 * <p>
	 * Name: entityID
	 * </p>
	 */
	public static McObfPair field_149394_a = McMappingDatabase.getSRG("field_149394_a");

	/**
	 * <p>
	 * Name: getEntityID
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149389_d = McMappingDatabase.getSRG("SPacketEntityEquipment.func_149389_d");

	/**
	 * <p>
	 * Name: getItemStack
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_149390_c = McMappingDatabase.getSRG("SPacketEntityEquipment.func_149390_c");

	/**
	 * <p>
	 * Name: equipmentSlot
	 * </p>
	 */
	public static McObfPair field_149392_b = McMappingDatabase.getSRG("field_149392_b");

	/**
	 * <p>
	 * Name: getEquipmentSlot
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/inventory/EntityEquipmentSlot;]
	 * </p>
	 */
	public static McObfPair func_186969_c = McMappingDatabase.getSRG("SPacketEntityEquipment.func_186969_c");

	/**
	 * <p>
	 * Name: itemStack
	 * </p>
	 */
	public static McObfPair field_149393_c = McMappingDatabase.getSRG("field_149393_c");

}

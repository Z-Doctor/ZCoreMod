package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumConnectionState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gx";
		else
			return "net/minecraft/network/EnumConnectionState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gx";
		else
			return "EnumConnectionState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgx;";
		else
			return "Lnet/minecraft/network/EnumConnectionState;";
	}

	/**
	 * <p>
	 * Name: getById
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/network/EnumConnectionState;]
	 * </p>
	 */
	public static McObfPair func_150760_a = McMappingDatabase.getSRG("EnumConnectionState.func_150760_a");

	/**
	 * <p>
	 * Name: getFromPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/Packet;)Lnet/minecraft/network/EnumConnectionState;]
	 * </p>
	 */
	public static McObfPair func_150752_a = McMappingDatabase.getSRG("EnumConnectionState.func_150752_a");

	/**
	 * <p>
	 * Name: getPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/EnumPacketDirection;I)Lnet/minecraft/network/Packet;]
	 * </p>
	 */
	public static McObfPair func_179244_a = McMappingDatabase.getSRG("EnumConnectionState.func_179244_a");

	/**
	 * <p>
	 * Name: directionMaps
	 * </p>
	 */
	public static McObfPair field_179247_h = McMappingDatabase.getSRG("field_179247_h");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_150762_g = McMappingDatabase.getSRG("field_150762_g");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_150759_c = McMappingDatabase.getSRG("EnumConnectionState.func_150759_c");

	/**
	 * <p>
	 * Name: getPacketId
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/EnumPacketDirection;Lnet/minecraft/network/Packet;)Ljava/lang/Integer;]
	 * </p>
	 */
	public static McObfPair func_179246_a = McMappingDatabase.getSRG("EnumConnectionState.func_179246_a");

	/**
	 * <p>
	 * Name: registerPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/EnumPacketDirection;Ljava/lang/Class;)Lnet/minecraft/network/EnumConnectionState;]
	 * </p>
	 */
	public static McObfPair func_179245_a = McMappingDatabase.getSRG("EnumConnectionState.func_179245_a");

	/**
	 * <p>
	 * Name: STATES_BY_CLASS
	 * </p>
	 */
	public static McObfPair field_150761_f = McMappingDatabase.getSRG("field_150761_f");

	/**
	 * <p>
	 * Name: STATES_BY_ID
	 * </p>
	 */
	public static McObfPair field_150764_e = McMappingDatabase.getSRG("field_150764_e");

}

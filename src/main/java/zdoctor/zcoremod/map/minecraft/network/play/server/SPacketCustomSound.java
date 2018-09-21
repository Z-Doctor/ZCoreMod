package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketCustomSound {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ix";
		else
			return "net/minecraft/network/play/server/SPacketCustomSound";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ix";
		else
			return "SPacketCustomSound";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lix;";
		else
			return "Lnet/minecraft/network/play/server/SPacketCustomSound;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketCustomSound.func_148833_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketCustomSound.func_148837_a");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_186934_c = McMappingDatabase.getSRG("field_186934_c");

	/**
	 * <p>
	 * Name: getPitch
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_186928_g = McMappingDatabase.getSRG("SPacketCustomSound.func_186928_g");

	/**
	 * <p>
	 * Name: getVolume
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_186927_f = McMappingDatabase.getSRG("SPacketCustomSound.func_186927_f");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_186936_e = McMappingDatabase.getSRG("field_186936_e");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186925_e = McMappingDatabase.getSRG("SPacketCustomSound.func_186925_e");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186932_c = McMappingDatabase.getSRG("SPacketCustomSound.func_186932_c");

	/**
	 * <p>
	 * Name: getCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundCategory;]
	 * </p>
	 */
	public static McObfPair func_186929_b = McMappingDatabase.getSRG("SPacketCustomSound.func_186929_b");

	/**
	 * <p>
	 * Name: getSoundName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_186930_a = McMappingDatabase.getSRG("SPacketCustomSound.func_186930_a");

	/**
	 * <p>
	 * Name: pitch
	 * </p>
	 */
	public static McObfPair field_186938_g = McMappingDatabase.getSRG("field_186938_g");

	/**
	 * <p>
	 * Name: category
	 * </p>
	 */
	public static McObfPair field_186933_b = McMappingDatabase.getSRG("field_186933_b");

	/**
	 * <p>
	 * Name: volume
	 * </p>
	 */
	public static McObfPair field_186937_f = McMappingDatabase.getSRG("field_186937_f");

	/**
	 * <p>
	 * Name: soundName
	 * </p>
	 */
	public static McObfPair field_149219_a = McMappingDatabase.getSRG("field_149219_a");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_186935_d = McMappingDatabase.getSRG("field_186935_d");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186926_d = McMappingDatabase.getSRG("SPacketCustomSound.func_186926_d");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketCustomSound.func_148840_b");

}

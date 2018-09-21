package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketSoundEffect {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kq";
		else
			return "net/minecraft/network/play/server/SPacketSoundEffect";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kq";
		else
			return "SPacketSoundEffect";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkq;";
		else
			return "Lnet/minecraft/network/play/server/SPacketSoundEffect;";
	}

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketSoundEffect.func_148840_b");

	/**
	 * <p>
	 * Name: posX
	 * </p>
	 */
	public static McObfPair field_149217_b = McMappingDatabase.getSRG("field_149217_b");

	/**
	 * <p>
	 * Name: category
	 * </p>
	 */
	public static McObfPair field_186980_b = McMappingDatabase.getSRG("field_186980_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketSoundEffect.func_148833_a");

	/**
	 * <p>
	 * Name: getSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_186978_a = McMappingDatabase.getSRG("SPacketSoundEffect.func_186978_a");

	/**
	 * <p>
	 * Name: posY
	 * </p>
	 */
	public static McObfPair field_149218_c = McMappingDatabase.getSRG("field_149218_c");

	/**
	 * <p>
	 * Name: getPitch
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149209_h = McMappingDatabase.getSRG("SPacketSoundEffect.func_149209_h");

	/**
	 * <p>
	 * Name: soundVolume
	 * </p>
	 */
	public static McObfPair field_149216_e = McMappingDatabase.getSRG("field_149216_e");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_149207_d = McMappingDatabase.getSRG("SPacketSoundEffect.func_149207_d");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_149211_e = McMappingDatabase.getSRG("SPacketSoundEffect.func_149211_e");

	/**
	 * <p>
	 * Name: soundPitch
	 * </p>
	 */
	public static McObfPair field_149214_f = McMappingDatabase.getSRG("field_149214_f");

	/**
	 * <p>
	 * Name: posZ
	 * </p>
	 */
	public static McObfPair field_149215_d = McMappingDatabase.getSRG("field_149215_d");

	/**
	 * <p>
	 * Name: getVolume
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149208_g = McMappingDatabase.getSRG("SPacketSoundEffect.func_149208_g");

	/**
	 * <p>
	 * Name: sound
	 * </p>
	 */
	public static McObfPair field_186979_a = McMappingDatabase.getSRG("field_186979_a");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_149210_f = McMappingDatabase.getSRG("SPacketSoundEffect.func_149210_f");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketSoundEffect.func_148837_a");

	/**
	 * <p>
	 * Name: getCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundCategory;]
	 * </p>
	 */
	public static McObfPair func_186977_b = McMappingDatabase.getSRG("SPacketSoundEffect.func_186977_b");

}

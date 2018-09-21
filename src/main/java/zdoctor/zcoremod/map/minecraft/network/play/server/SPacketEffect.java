package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketEffect {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jf";
		else
			return "net/minecraft/network/play/server/SPacketEffect";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jf";
		else
			return "SPacketEffect";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljf;";
		else
			return "Lnet/minecraft/network/play/server/SPacketEffect;";
	}

	/**
	 * <p>
	 * Name: soundData
	 * </p>
	 */
	public static McObfPair field_149249_b = McMappingDatabase.getSRG("field_149249_b");

	/**
	 * <p>
	 * Name: getSoundPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_179746_d = McMappingDatabase.getSRG("SPacketEffect.func_179746_d");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketEffect.func_148837_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketEffect.func_148840_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketEffect.func_148833_a");

	/**
	 * <p>
	 * Name: soundPos
	 * </p>
	 */
	public static McObfPair field_179747_b = McMappingDatabase.getSRG("field_179747_b");

	/**
	 * <p>
	 * Name: soundType
	 * </p>
	 */
	public static McObfPair field_149251_a = McMappingDatabase.getSRG("field_149251_a");

	/**
	 * <p>
	 * Name: serverWide
	 * </p>
	 */
	public static McObfPair field_149246_f = McMappingDatabase.getSRG("field_149246_f");

	/**
	 * <p>
	 * Name: getSoundType
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149242_d = McMappingDatabase.getSRG("SPacketEffect.func_149242_d");

	/**
	 * <p>
	 * Name: isSoundServerwide
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149244_c = McMappingDatabase.getSRG("SPacketEffect.func_149244_c");

	/**
	 * <p>
	 * Name: getSoundData
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149241_e = McMappingDatabase.getSRG("SPacketEffect.func_149241_e");

}

package zdoctor.zcoremod.map.minecraft.network.login.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketEncryptionRequest {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mi";
		else
			return "net/minecraft/network/login/server/SPacketEncryptionRequest";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mi";
		else
			return "SPacketEncryptionRequest";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lmi;";
		else
			return "Lnet/minecraft/network/login/server/SPacketEncryptionRequest;";
	}

	/**
	 * <p>
	 * Name: getPublicKey
	 * </p>
	 * <p>
	 * Desc: [()Ljava/security/PublicKey;]
	 * </p>
	 */
	public static McObfPair func_149608_d = McMappingDatabase.getSRG("SPacketEncryptionRequest.func_149608_d");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketEncryptionRequest.func_148840_b");

	/**
	 * <p>
	 * Name: publicKey
	 * </p>
	 */
	public static McObfPair field_149610_b = McMappingDatabase.getSRG("field_149610_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/login/INetHandlerLoginClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketEncryptionRequest.func_148833_a");

	/**
	 * <p>
	 * Name: hashedServerId
	 * </p>
	 */
	public static McObfPair field_149612_a = McMappingDatabase.getSRG("field_149612_a");

	/**
	 * <p>
	 * Name: getServerId
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149609_c = McMappingDatabase.getSRG("SPacketEncryptionRequest.func_149609_c");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketEncryptionRequest.func_148837_a");

	/**
	 * <p>
	 * Name: getVerifyToken
	 * </p>
	 * <p>
	 * Desc: [()[B]
	 * </p>
	 */
	public static McObfPair func_149607_e = McMappingDatabase.getSRG("SPacketEncryptionRequest.func_149607_e");

	/**
	 * <p>
	 * Name: verifyToken
	 * </p>
	 */
	public static McObfPair field_149611_c = McMappingDatabase.getSRG("field_149611_c");

}

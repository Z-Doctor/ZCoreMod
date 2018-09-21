package zdoctor.zcoremod.map.minecraft.network.login.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketEncryptionResponse {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mn";
		else
			return "net/minecraft/network/login/client/CPacketEncryptionResponse";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mn";
		else
			return "CPacketEncryptionResponse";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lmn;";
		else
			return "Lnet/minecraft/network/login/client/CPacketEncryptionResponse;";
	}

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketEncryptionResponse.func_148840_b");

	/**
	 * <p>
	 * Name: verifyTokenEncrypted
	 * </p>
	 */
	public static McObfPair field_149301_b = McMappingDatabase.getSRG("field_149301_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketEncryptionResponse.func_148837_a");

	/**
	 * <p>
	 * Name: getVerifyToken
	 * </p>
	 * <p>
	 * Desc: [(Ljava/security/PrivateKey;)[B]
	 * </p>
	 */
	public static McObfPair func_149299_b = McMappingDatabase.getSRG("CPacketEncryptionResponse.func_149299_b");

	/**
	 * <p>
	 * Name: secretKeyEncrypted
	 * </p>
	 */
	public static McObfPair field_149302_a = McMappingDatabase.getSRG("field_149302_a");

	/**
	 * <p>
	 * Name: getSecretKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/security/PrivateKey;)Ljavax/crypto/SecretKey;]
	 * </p>
	 */
	public static McObfPair func_149300_a = McMappingDatabase.getSRG("CPacketEncryptionResponse.func_149300_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/login/INetHandlerLoginServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketEncryptionResponse.func_148833_a");

}

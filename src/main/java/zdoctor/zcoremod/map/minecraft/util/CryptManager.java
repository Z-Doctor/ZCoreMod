package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CryptManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ra";
		else
			return "net/minecraft/util/CryptManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ra";
		else
			return "CryptManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lra;";
		else
			return "Lnet/minecraft/util/CryptManager;";
	}

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_180198_a = McMappingDatabase.getSRG("field_180198_a");

	/**
	 * <p>
	 * Name: getServerIdHash
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/security/PublicKey;Ljavax/crypto/SecretKey;)[B]
	 * </p>
	 */
	public static McObfPair func_75895_a = McMappingDatabase.getSRG("CryptManager.func_75895_a");

	/**
	 * <p>
	 * Name: createNetCipherInstance
	 * </p>
	 * <p>
	 * Desc: [(ILjava/security/Key;)Ljavax/crypto/Cipher;]
	 * </p>
	 */
	public static McObfPair func_151229_a = McMappingDatabase.getSRG("CryptManager.func_151229_a");

	/**
	 * <p>
	 * Name: decryptData
	 * </p>
	 * <p>
	 * Desc: [(Ljava/security/Key;[B)[B]
	 * </p>
	 */
	public static McObfPair func_75889_b = McMappingDatabase.getSRG("CryptManager.func_75889_b");

	/**
	 * <p>
	 * Name: createTheCipherInstance
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;Ljava/security/Key;)Ljavax/crypto/Cipher;]
	 * </p>
	 */
	public static McObfPair func_75886_a = McMappingDatabase.getSRG("CryptManager.func_75886_a");

	/**
	 * <p>
	 * Name: cipherOperation
	 * </p>
	 * <p>
	 * Desc: [(ILjava/security/Key;[B)[B]
	 * </p>
	 */
	public static McObfPair func_75885_a = McMappingDatabase.getSRG("CryptManager.func_75885_a");

	/**
	 * <p>
	 * Name: decryptSharedKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/security/PrivateKey;[B)Ljavax/crypto/SecretKey;]
	 * </p>
	 */
	public static McObfPair func_75887_a = McMappingDatabase.getSRG("CryptManager.func_75887_a");

	/**
	 * <p>
	 * Name: createNewSharedKey
	 * </p>
	 * <p>
	 * Desc: [()Ljavax/crypto/SecretKey;]
	 * </p>
	 */
	public static McObfPair func_75890_a = McMappingDatabase.getSRG("CryptManager.func_75890_a");

	/**
	 * <p>
	 * Name: digestOperation
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;[[B)[B]
	 * </p>
	 */
	public static McObfPair func_75893_a = McMappingDatabase.getSRG("CryptManager.func_75893_a");

	/**
	 * <p>
	 * Name: decodePublicKey
	 * </p>
	 * <p>
	 * Desc: [([B)Ljava/security/PublicKey;]
	 * </p>
	 */
	public static McObfPair func_75896_a = McMappingDatabase.getSRG("CryptManager.func_75896_a");

	/**
	 * <p>
	 * Name: encryptData
	 * </p>
	 * <p>
	 * Desc: [(Ljava/security/Key;[B)[B]
	 * </p>
	 */
	public static McObfPair func_75894_a = McMappingDatabase.getSRG("CryptManager.func_75894_a");

	/**
	 * <p>
	 * Name: generateKeyPair
	 * </p>
	 * <p>
	 * Desc: [()Ljava/security/KeyPair;]
	 * </p>
	 */
	public static McObfPair func_75891_b = McMappingDatabase.getSRG("CryptManager.func_75891_b");

}

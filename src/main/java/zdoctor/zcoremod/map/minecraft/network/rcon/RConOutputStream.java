package zdoctor.zcoremod.map.minecraft.network.rcon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RConOutputStream {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pv";
		else
			return "net/minecraft/network/rcon/RConOutputStream";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pv";
		else
			return "RConOutputStream";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpv;";
		else
			return "Lnet/minecraft/network/rcon/RConOutputStream;";
	}

	/**
	 * <p>
	 * Name: writeString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_72671_a = McMappingDatabase.getSRG("RConOutputStream.func_72671_a");

	/**
	 * <p>
	 * Name: byteArrayOutput
	 * </p>
	 */
	public static McObfPair field_72674_a = McMappingDatabase.getSRG("field_72674_a");

	/**
	 * <p>
	 * Name: writeShort
	 * </p>
	 * <p>
	 * Desc: [(S)V]
	 * </p>
	 */
	public static McObfPair func_72668_a = McMappingDatabase.getSRG("RConOutputStream.func_72668_a");

	/**
	 * <p>
	 * Name: reset
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72669_b = McMappingDatabase.getSRG("RConOutputStream.func_72669_b");

	/**
	 * <p>
	 * Name: writeInt
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_72667_a = McMappingDatabase.getSRG("RConOutputStream.func_72667_a");

	/**
	 * <p>
	 * Name: writeByteArray
	 * </p>
	 * <p>
	 * Desc: [([B)V]
	 * </p>
	 */
	public static McObfPair func_72670_a = McMappingDatabase.getSRG("RConOutputStream.func_72670_a");

	/**
	 * <p>
	 * Name: toByteArray
	 * </p>
	 * <p>
	 * Desc: [()[B]
	 * </p>
	 */
	public static McObfPair func_72672_a = McMappingDatabase.getSRG("RConOutputStream.func_72672_a");

	/**
	 * <p>
	 * Name: output
	 * </p>
	 */
	public static McObfPair field_72673_b = McMappingDatabase.getSRG("field_72673_b");

}

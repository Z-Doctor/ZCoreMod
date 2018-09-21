package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketPlayerPosLook$EnumFlags {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jq$a";
		else
			return "net/minecraft/network/play/server/SPacketPlayerPosLook$EnumFlags";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jq$a";
		else
			return "SPacketPlayerPosLook$EnumFlags";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljq$a;";
		else
			return "Lnet/minecraft/network/play/server/SPacketPlayerPosLook$EnumFlags;";
	}

	/**
	 * <p>
	 * Name: bit
	 * </p>
	 */
	public static McObfPair field_187050_f = McMappingDatabase.getSRG("field_187050_f");

	/**
	 * <p>
	 * Name: getMask
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_187042_a = McMappingDatabase.getSRG("SPacketPlayerPosLook$EnumFlags.func_187042_a");

	/**
	 * <p>
	 * Name: isSet
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_187043_b = McMappingDatabase.getSRG("SPacketPlayerPosLook$EnumFlags.func_187043_b");

	/**
	 * <p>
	 * Name: unpack
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_187044_a = McMappingDatabase.getSRG("SPacketPlayerPosLook$EnumFlags.func_187044_a");

	/**
	 * <p>
	 * Name: pack
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Set;)I]
	 * </p>
	 */
	public static McObfPair func_187040_a = McMappingDatabase.getSRG("SPacketPlayerPosLook$EnumFlags.func_187040_a");

}

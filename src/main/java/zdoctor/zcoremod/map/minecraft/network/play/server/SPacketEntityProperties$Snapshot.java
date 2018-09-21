package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketEntityProperties$Snapshot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kv$a";
		else
			return "net/minecraft/network/play/server/SPacketEntityProperties$Snapshot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kv$a";
		else
			return "SPacketEntityProperties$Snapshot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkv$a;";
		else
			return "Lnet/minecraft/network/play/server/SPacketEntityProperties$Snapshot;";
	}

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_151412_b = McMappingDatabase.getSRG("field_151412_b");

	/**
	 * <p>
	 * Name: baseValue
	 * </p>
	 */
	public static McObfPair field_151413_c = McMappingDatabase.getSRG("field_151413_c");

	/**
	 * <p>
	 * Name: getModifiers
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_151408_c = McMappingDatabase.getSRG("SPacketEntityProperties$Snapshot.func_151408_c");

	/**
	 * <p>
	 * Name: modifiers
	 * </p>
	 */
	public static McObfPair field_151411_d = McMappingDatabase.getSRG("field_151411_d");

	/**
	 * <p>
	 * Name: getBaseValue
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_151410_b = McMappingDatabase.getSRG("SPacketEntityProperties$Snapshot.func_151410_b");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_151409_a = McMappingDatabase.getSRG("SPacketEntityProperties$Snapshot.func_151409_a");

}

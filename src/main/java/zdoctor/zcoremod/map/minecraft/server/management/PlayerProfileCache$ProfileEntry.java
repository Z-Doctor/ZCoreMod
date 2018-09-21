package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlayerProfileCache$ProfileEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ph$a";
		else
			return "net/minecraft/server/management/PlayerProfileCache$ProfileEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ph$a";
		else
			return "PlayerProfileCache$ProfileEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lph$a;";
		else
			return "Lnet/minecraft/server/management/PlayerProfileCache$ProfileEntry;";
	}

	/**
	 * <p>
	 * Name: getGameProfile
	 * </p>
	 * <p>
	 * Desc: [()Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_152668_a = McMappingDatabase.getSRG("PlayerProfileCache$ProfileEntry.func_152668_a");

	/**
	 * <p>
	 * Name: gameProfile
	 * </p>
	 */
	public static McObfPair field_152672_b = McMappingDatabase.getSRG("field_152672_b");

	/**
	 * <p>
	 * Name: expirationDate
	 * </p>
	 */
	public static McObfPair field_152673_c = McMappingDatabase.getSRG("field_152673_c");

	/**
	 * <p>
	 * Name: getExpirationDate
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Date;]
	 * </p>
	 */
	public static McObfPair func_152670_b = McMappingDatabase.getSRG("PlayerProfileCache$ProfileEntry.func_152670_b");

}

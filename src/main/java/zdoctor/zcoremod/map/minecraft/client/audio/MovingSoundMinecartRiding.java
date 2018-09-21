package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MovingSoundMinecartRiding {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgo";
		else
			return "net/minecraft/client/audio/MovingSoundMinecartRiding";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgo";
		else
			return "MovingSoundMinecartRiding";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgo;";
		else
			return "Lnet/minecraft/client/audio/MovingSoundMinecartRiding;";
	}

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("MovingSoundMinecartRiding.func_73660_a");

	/**
	 * <p>
	 * Name: minecart
	 * </p>
	 */
	public static McObfPair field_147671_l = McMappingDatabase.getSRG("field_147671_l");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_147672_k = McMappingDatabase.getSRG("field_147672_k");

}

package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MovingSoundMinecart {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgn";
		else
			return "net/minecraft/client/audio/MovingSoundMinecart";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgn";
		else
			return "MovingSoundMinecart";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgn;";
		else
			return "Lnet/minecraft/client/audio/MovingSoundMinecart;";
	}

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("MovingSoundMinecart.func_73660_a");

	/**
	 * <p>
	 * Name: distance
	 * </p>
	 */
	public static McObfPair field_147669_l = McMappingDatabase.getSRG("field_147669_l");

	/**
	 * <p>
	 * Name: minecart
	 * </p>
	 */
	public static McObfPair field_147670_k = McMappingDatabase.getSRG("field_147670_k");

}

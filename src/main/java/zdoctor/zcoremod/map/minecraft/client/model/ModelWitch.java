package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelWitch {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bri";
		else
			return "net/minecraft/client/model/ModelWitch";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bri";
		else
			return "ModelWitch";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbri;";
		else
			return "Lnet/minecraft/client/model/ModelWitch;";
	}

	/**
	 * <p>
	 * Name: mole
	 * </p>
	 */
	public static McObfPair field_82901_h = McMappingDatabase.getSRG("field_82901_h");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelWitch.func_78087_a");

	/**
	 * <p>
	 * Name: witchHat
	 * </p>
	 */
	public static McObfPair field_82902_i = McMappingDatabase.getSRG("field_82902_i");

	/**
	 * <p>
	 * Name: holdingItem
	 * </p>
	 */
	public static McObfPair field_82900_g = McMappingDatabase.getSRG("field_82900_g");

}

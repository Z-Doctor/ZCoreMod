package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelArmorStandArmor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpd";
		else
			return "net/minecraft/client/model/ModelArmorStandArmor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpd";
		else
			return "ModelArmorStandArmor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpd;";
		else
			return "Lnet/minecraft/client/model/ModelArmorStandArmor;";
	}

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelArmorStandArmor.func_78087_a");

}

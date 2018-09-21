package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelSquid {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brb";
		else
			return "net/minecraft/client/model/ModelSquid";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brb";
		else
			return "ModelSquid";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrb;";
		else
			return "Lnet/minecraft/client/model/ModelSquid;";
	}

	/**
	 * <p>
	 * Name: squidTentacles
	 * </p>
	 */
	public static McObfPair field_78201_b = McMappingDatabase.getSRG("field_78201_b");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelSquid.func_78088_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelSquid.func_78087_a");

	/**
	 * <p>
	 * Name: squidBody
	 * </p>
	 */
	public static McObfPair field_78202_a = McMappingDatabase.getSRG("field_78202_a");

}

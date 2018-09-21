package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelVillager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brg";
		else
			return "net/minecraft/client/model/ModelVillager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brg";
		else
			return "ModelVillager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrg;";
		else
			return "Lnet/minecraft/client/model/ModelVillager;";
	}

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelVillager.func_78087_a");

	/**
	 * <p>
	 * Name: rightVillagerLeg
	 * </p>
	 */
	public static McObfPair field_78187_d = McMappingDatabase.getSRG("field_78187_d");

	/**
	 * <p>
	 * Name: leftVillagerLeg
	 * </p>
	 */
	public static McObfPair field_78188_e = McMappingDatabase.getSRG("field_78188_e");

	/**
	 * <p>
	 * Name: villagerHead
	 * </p>
	 */
	public static McObfPair field_78191_a = McMappingDatabase.getSRG("field_78191_a");

	/**
	 * <p>
	 * Name: villagerNose
	 * </p>
	 */
	public static McObfPair field_82898_f = McMappingDatabase.getSRG("field_82898_f");

	/**
	 * <p>
	 * Name: villagerArms
	 * </p>
	 */
	public static McObfPair field_78190_c = McMappingDatabase.getSRG("field_78190_c");

	/**
	 * <p>
	 * Name: villagerBody
	 * </p>
	 */
	public static McObfPair field_78189_b = McMappingDatabase.getSRG("field_78189_b");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelVillager.func_78088_a");

}

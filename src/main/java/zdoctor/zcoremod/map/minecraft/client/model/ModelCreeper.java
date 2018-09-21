package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelCreeper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpo";
		else
			return "net/minecraft/client/model/ModelCreeper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpo";
		else
			return "ModelCreeper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpo;";
		else
			return "Lnet/minecraft/client/model/ModelCreeper;";
	}

	/**
	 * <p>
	 * Name: leg3
	 * </p>
	 */
	public static McObfPair field_78129_f = McMappingDatabase.getSRG("field_78129_f");

	/**
	 * <p>
	 * Name: leg2
	 * </p>
	 */
	public static McObfPair field_78132_e = McMappingDatabase.getSRG("field_78132_e");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelCreeper.func_78087_a");

	/**
	 * <p>
	 * Name: creeperArmor
	 * </p>
	 */
	public static McObfPair field_78133_b = McMappingDatabase.getSRG("field_78133_b");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelCreeper.func_78088_a");

	/**
	 * <p>
	 * Name: leg4
	 * </p>
	 */
	public static McObfPair field_78130_g = McMappingDatabase.getSRG("field_78130_g");

	/**
	 * <p>
	 * Name: head
	 * </p>
	 */
	public static McObfPair field_78135_a = McMappingDatabase.getSRG("field_78135_a");

	/**
	 * <p>
	 * Name: body
	 * </p>
	 */
	public static McObfPair field_78134_c = McMappingDatabase.getSRG("field_78134_c");

	/**
	 * <p>
	 * Name: leg1
	 * </p>
	 */
	public static McObfPair field_78131_d = McMappingDatabase.getSRG("field_78131_d");

}

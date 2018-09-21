package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelWolf {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brk";
		else
			return "net/minecraft/client/model/ModelWolf";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brk";
		else
			return "ModelWolf";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrk;";
		else
			return "Lnet/minecraft/client/model/ModelWolf;";
	}

	/**
	 * <p>
	 * Name: wolfMane
	 * </p>
	 */
	public static McObfPair field_78186_h = McMappingDatabase.getSRG("field_78186_h");

	/**
	 * <p>
	 * Name: wolfBody
	 * </p>
	 */
	public static McObfPair field_78183_b = McMappingDatabase.getSRG("field_78183_b");

	/**
	 * <p>
	 * Name: wolfHeadMain
	 * </p>
	 */
	public static McObfPair field_78185_a = McMappingDatabase.getSRG("field_78185_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelWolf.func_78087_a");

	/**
	 * <p>
	 * Name: wolfLeg3
	 * </p>
	 */
	public static McObfPair field_78182_e = McMappingDatabase.getSRG("field_78182_e");

	/**
	 * <p>
	 * Name: wolfTail
	 * </p>
	 */
	public static McObfPair field_78180_g = McMappingDatabase.getSRG("field_78180_g");

	/**
	 * <p>
	 * Name: wolfLeg4
	 * </p>
	 */
	public static McObfPair field_78179_f = McMappingDatabase.getSRG("field_78179_f");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelWolf.func_78088_a");

	/**
	 * <p>
	 * Name: setLivingAnimations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_78086_a = McMappingDatabase.getSRG("ModelWolf.func_78086_a");

	/**
	 * <p>
	 * Name: wolfLeg1
	 * </p>
	 */
	public static McObfPair field_78184_c = McMappingDatabase.getSRG("field_78184_c");

	/**
	 * <p>
	 * Name: wolfLeg2
	 * </p>
	 */
	public static McObfPair field_78181_d = McMappingDatabase.getSRG("field_78181_d");

}

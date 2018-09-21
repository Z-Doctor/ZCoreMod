package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelParrot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqh";
		else
			return "net/minecraft/client/model/ModelParrot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqh";
		else
			return "ModelParrot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqh;";
		else
			return "Lnet/minecraft/client/model/ModelParrot;";
	}

	/**
	 * <p>
	 * Name: head2
	 * </p>
	 */
	public static McObfPair field_192769_f = McMappingDatabase.getSRG("field_192769_f");

	/**
	 * <p>
	 * Name: beak1
	 * </p>
	 */
	public static McObfPair field_192770_g = McMappingDatabase.getSRG("field_192770_g");

	/**
	 * <p>
	 * Name: setLivingAnimations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_78086_a = McMappingDatabase.getSRG("ModelParrot.func_78086_a");

	/**
	 * <p>
	 * Name: head
	 * </p>
	 */
	public static McObfPair field_192768_e = McMappingDatabase.getSRG("field_192768_e");

	/**
	 * <p>
	 * Name: wingRight
	 * </p>
	 */
	public static McObfPair field_192767_d = McMappingDatabase.getSRG("field_192767_d");

	/**
	 * <p>
	 * Name: wingLeft
	 * </p>
	 */
	public static McObfPair field_192766_c = McMappingDatabase.getSRG("field_192766_c");

	/**
	 * <p>
	 * Name: legLeft
	 * </p>
	 */
	public static McObfPair field_192773_j = McMappingDatabase.getSRG("field_192773_j");

	/**
	 * <p>
	 * Name: tail
	 * </p>
	 */
	public static McObfPair field_192765_b = McMappingDatabase.getSRG("field_192765_b");

	/**
	 * <p>
	 * Name: legRight
	 * </p>
	 */
	public static McObfPair field_192774_k = McMappingDatabase.getSRG("field_192774_k");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelParrot.func_78088_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelParrot.func_78087_a");

	/**
	 * <p>
	 * Name: body
	 * </p>
	 */
	public static McObfPair field_192764_a = McMappingDatabase.getSRG("field_192764_a");

	/**
	 * <p>
	 * Name: state
	 * </p>
	 */
	public static McObfPair field_192775_l = McMappingDatabase.getSRG("field_192775_l");

	/**
	 * <p>
	 * Name: beak2
	 * </p>
	 */
	public static McObfPair field_192771_h = McMappingDatabase.getSRG("field_192771_h");

	/**
	 * <p>
	 * Name: feather
	 * </p>
	 */
	public static McObfPair field_192772_i = McMappingDatabase.getSRG("field_192772_i");

}

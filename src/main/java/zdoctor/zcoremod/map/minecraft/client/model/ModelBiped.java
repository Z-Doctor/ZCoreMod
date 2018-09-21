package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBiped {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpx";
		else
			return "net/minecraft/client/model/ModelBiped";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpx";
		else
			return "ModelBiped";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpx;";
		else
			return "Lnet/minecraft/client/model/ModelBiped;";
	}

	/**
	 * <p>
	 * Name: postRenderArm
	 * </p>
	 * <p>
	 * Desc: [(FLnet/minecraft/util/EnumHandSide;)V]
	 * </p>
	 */
	public static McObfPair func_187073_a = McMappingDatabase.getSRG("ModelBiped.func_187073_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelBiped.func_78087_a");

	/**
	 * <p>
	 * Name: rightArmPose
	 * </p>
	 */
	public static McObfPair field_187076_m = McMappingDatabase.getSRG("field_187076_m");

	/**
	 * <p>
	 * Name: bipedRightLeg
	 * </p>
	 */
	public static McObfPair field_178721_j = McMappingDatabase.getSRG("field_178721_j");

	/**
	 * <p>
	 * Name: setVisible
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_178719_a = McMappingDatabase.getSRG("ModelBiped.func_178719_a");

	/**
	 * <p>
	 * Name: getArmForSide
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumHandSide;)Lnet/minecraft/client/model/ModelRenderer;]
	 * </p>
	 */
	public static McObfPair func_187074_a = McMappingDatabase.getSRG("ModelBiped.func_187074_a");

	/**
	 * <p>
	 * Name: bipedBody
	 * </p>
	 */
	public static McObfPair field_78115_e = McMappingDatabase.getSRG("field_78115_e");

	/**
	 * <p>
	 * Name: bipedRightArm
	 * </p>
	 */
	public static McObfPair field_178723_h = McMappingDatabase.getSRG("field_178723_h");

	/**
	 * <p>
	 * Name: isSneak
	 * </p>
	 */
	public static McObfPair field_78117_n = McMappingDatabase.getSRG("field_78117_n");

	/**
	 * <p>
	 * Name: bipedHeadwear
	 * </p>
	 */
	public static McObfPair field_178720_f = McMappingDatabase.getSRG("field_178720_f");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelBiped.func_78088_a");

	/**
	 * <p>
	 * Name: getMainHand
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/EnumHandSide;]
	 * </p>
	 */
	public static McObfPair func_187072_a = McMappingDatabase.getSRG("ModelBiped.func_187072_a");

	/**
	 * <p>
	 * Name: bipedLeftLeg
	 * </p>
	 */
	public static McObfPair field_178722_k = McMappingDatabase.getSRG("field_178722_k");

	/**
	 * <p>
	 * Name: bipedHead
	 * </p>
	 */
	public static McObfPair field_78116_c = McMappingDatabase.getSRG("field_78116_c");

	/**
	 * <p>
	 * Name: setModelAttributes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/model/ModelBase;)V]
	 * </p>
	 */
	public static McObfPair func_178686_a = McMappingDatabase.getSRG("ModelBiped.func_178686_a");

	/**
	 * <p>
	 * Name: leftArmPose
	 * </p>
	 */
	public static McObfPair field_187075_l = McMappingDatabase.getSRG("field_187075_l");

	/**
	 * <p>
	 * Name: bipedLeftArm
	 * </p>
	 */
	public static McObfPair field_178724_i = McMappingDatabase.getSRG("field_178724_i");

}

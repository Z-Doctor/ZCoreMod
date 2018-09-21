package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelRabbit {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqn";
		else
			return "net/minecraft/client/model/ModelRabbit";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqn";
		else
			return "ModelRabbit";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqn;";
		else
			return "Lnet/minecraft/client/model/ModelRabbit;";
	}

	/**
	 * <p>
	 * Name: rabbitBody
	 * </p>
	 */
	public static McObfPair field_178695_e = McMappingDatabase.getSRG("field_178695_e");

	/**
	 * <p>
	 * Name: setLivingAnimations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_78086_a = McMappingDatabase.getSRG("ModelRabbit.func_78086_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelRabbit.func_78088_a");

	/**
	 * <p>
	 * Name: rabbitLeftEar
	 * </p>
	 */
	public static McObfPair field_178702_j = McMappingDatabase.getSRG("field_178702_j");

	/**
	 * <p>
	 * Name: rabbitRightEar
	 * </p>
	 */
	public static McObfPair field_178705_i = McMappingDatabase.getSRG("field_178705_i");

	/**
	 * <p>
	 * Name: rabbitLeftArm
	 * </p>
	 */
	public static McObfPair field_178692_f = McMappingDatabase.getSRG("field_178692_f");

	/**
	 * <p>
	 * Name: jumpRotation
	 * </p>
	 */
	public static McObfPair field_178701_m = McMappingDatabase.getSRG("field_178701_m");

	/**
	 * <p>
	 * Name: rabbitRightThigh
	 * </p>
	 */
	public static McObfPair field_178694_d = McMappingDatabase.getSRG("field_178694_d");

	/**
	 * <p>
	 * Name: rabbitRightFoot
	 * </p>
	 */
	public static McObfPair field_178696_b = McMappingDatabase.getSRG("field_178696_b");

	/**
	 * <p>
	 * Name: rabbitLeftThigh
	 * </p>
	 */
	public static McObfPair field_178697_c = McMappingDatabase.getSRG("field_178697_c");

	/**
	 * <p>
	 * Name: rabbitNose
	 * </p>
	 */
	public static McObfPair field_178700_l = McMappingDatabase.getSRG("field_178700_l");

	/**
	 * <p>
	 * Name: rabbitRightArm
	 * </p>
	 */
	public static McObfPair field_178693_g = McMappingDatabase.getSRG("field_178693_g");

	/**
	 * <p>
	 * Name: rabbitLeftFoot
	 * </p>
	 */
	public static McObfPair field_178698_a = McMappingDatabase.getSRG("field_178698_a");

	/**
	 * <p>
	 * Name: setRotationOffset
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/model/ModelRenderer;FFF)V]
	 * </p>
	 */
	public static McObfPair func_178691_a = McMappingDatabase.getSRG("ModelRabbit.func_178691_a");

	/**
	 * <p>
	 * Name: rabbitTail
	 * </p>
	 */
	public static McObfPair field_178703_k = McMappingDatabase.getSRG("field_178703_k");

	/**
	 * <p>
	 * Name: rabbitHead
	 * </p>
	 */
	public static McObfPair field_178704_h = McMappingDatabase.getSRG("field_178704_h");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelRabbit.func_78087_a");

}

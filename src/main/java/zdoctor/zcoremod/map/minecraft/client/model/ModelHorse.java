package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelHorse {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpv";
		else
			return "net/minecraft/client/model/ModelHorse";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpv";
		else
			return "ModelHorse";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpv;";
		else
			return "Lnet/minecraft/client/model/ModelHorse;";
	}

	/**
	 * <p>
	 * Name: horseLeftRein
	 * </p>
	 */
	public static McObfPair field_110702_R = McMappingDatabase.getSRG("field_110702_R");

	/**
	 * <p>
	 * Name: mane
	 * </p>
	 */
	public static McObfPair field_110714_j = McMappingDatabase.getSRG("field_110714_j");

	/**
	 * <p>
	 * Name: frontLeftShin
	 * </p>
	 */
	public static McObfPair field_110689_B = McMappingDatabase.getSRG("field_110689_B");

	/**
	 * <p>
	 * Name: muleRightChest
	 * </p>
	 */
	public static McObfPair field_110695_H = McMappingDatabase.getSRG("field_110695_H");

	/**
	 * <p>
	 * Name: frontRightLeg
	 * </p>
	 */
	public static McObfPair field_110684_D = McMappingDatabase.getSRG("field_110684_D");

	/**
	 * <p>
	 * Name: horseRightSaddleMetal
	 * </p>
	 */
	public static McObfPair field_110694_O = McMappingDatabase.getSRG("field_110694_O");

	/**
	 * <p>
	 * Name: frontRightHoof
	 * </p>
	 */
	public static McObfPair field_110686_F = McMappingDatabase.getSRG("field_110686_F");

	/**
	 * <p>
	 * Name: horseLeftSaddleMetal
	 * </p>
	 */
	public static McObfPair field_110692_M = McMappingDatabase.getSRG("field_110692_M");

	/**
	 * <p>
	 * Name: frontLeftLeg
	 * </p>
	 */
	public static McObfPair field_110688_A = McMappingDatabase.getSRG("field_110688_A");

	/**
	 * <p>
	 * Name: horseLeftFaceMetal
	 * </p>
	 */
	public static McObfPair field_110700_P = McMappingDatabase.getSRG("field_110700_P");

	/**
	 * <p>
	 * Name: horseSaddleFront
	 * </p>
	 */
	public static McObfPair field_110697_J = McMappingDatabase.getSRG("field_110697_J");

	/**
	 * <p>
	 * Name: horseRightRein
	 * </p>
	 */
	public static McObfPair field_110701_S = McMappingDatabase.getSRG("field_110701_S");

	/**
	 * <p>
	 * Name: head
	 * </p>
	 */
	public static McObfPair field_110709_a = McMappingDatabase.getSRG("field_110709_a");

	/**
	 * <p>
	 * Name: horseSaddleBack
	 * </p>
	 */
	public static McObfPair field_110698_K = McMappingDatabase.getSRG("field_110698_K");

	/**
	 * <p>
	 * Name: tailMiddle
	 * </p>
	 */
	public static McObfPair field_110713_m = McMappingDatabase.getSRG("field_110713_m");

	/**
	 * <p>
	 * Name: muleRightEar
	 * </p>
	 */
	public static McObfPair field_110704_g = McMappingDatabase.getSRG("field_110704_g");

	/**
	 * <p>
	 * Name: neck
	 * </p>
	 */
	public static McObfPair field_110716_h = McMappingDatabase.getSRG("field_110716_h");

	/**
	 * <p>
	 * Name: muleLeftEar
	 * </p>
	 */
	public static McObfPair field_110703_f = McMappingDatabase.getSRG("field_110703_f");

	/**
	 * <p>
	 * Name: horseLeftSaddleRope
	 * </p>
	 */
	public static McObfPair field_110691_L = McMappingDatabase.getSRG("field_110691_L");

	/**
	 * <p>
	 * Name: horseRightFaceMetal
	 * </p>
	 */
	public static McObfPair field_110699_Q = McMappingDatabase.getSRG("field_110699_Q");

	/**
	 * <p>
	 * Name: backLeftShin
	 * </p>
	 */
	public static McObfPair field_110719_v = McMappingDatabase.getSRG("field_110719_v");

	/**
	 * <p>
	 * Name: backRightHoof
	 * </p>
	 */
	public static McObfPair field_110720_z = McMappingDatabase.getSRG("field_110720_z");

	/**
	 * <p>
	 * Name: setLivingAnimations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_78086_a = McMappingDatabase.getSRG("ModelHorse.func_78086_a");

	/**
	 * <p>
	 * Name: backRightLeg
	 * </p>
	 */
	public static McObfPair field_110722_x = McMappingDatabase.getSRG("field_110722_x");

	/**
	 * <p>
	 * Name: backRightShin
	 * </p>
	 */
	public static McObfPair field_110721_y = McMappingDatabase.getSRG("field_110721_y");

	/**
	 * <p>
	 * Name: frontLeftHoof
	 * </p>
	 */
	public static McObfPair field_110690_C = McMappingDatabase.getSRG("field_110690_C");

	/**
	 * <p>
	 * Name: updateHorseRotation
	 * </p>
	 * <p>
	 * Desc: [(FFF)F]
	 * </p>
	 */
	public static McObfPair func_110683_a = McMappingDatabase.getSRG("ModelHorse.func_110683_a");

	/**
	 * <p>
	 * Name: muleLeftChest
	 * </p>
	 */
	public static McObfPair field_110687_G = McMappingDatabase.getSRG("field_110687_G");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelHorse.func_78088_a");

	/**
	 * <p>
	 * Name: horseLeftEar
	 * </p>
	 */
	public static McObfPair field_110705_d = McMappingDatabase.getSRG("field_110705_d");

	/**
	 * <p>
	 * Name: body
	 * </p>
	 */
	public static McObfPair field_110715_k = McMappingDatabase.getSRG("field_110715_k");

	/**
	 * <p>
	 * Name: horseRightEar
	 * </p>
	 */
	public static McObfPair field_110706_e = McMappingDatabase.getSRG("field_110706_e");

	/**
	 * <p>
	 * Name: frontRightShin
	 * </p>
	 */
	public static McObfPair field_110685_E = McMappingDatabase.getSRG("field_110685_E");

	/**
	 * <p>
	 * Name: horseFaceRopes
	 * </p>
	 */
	public static McObfPair field_110717_i = McMappingDatabase.getSRG("field_110717_i");

	/**
	 * <p>
	 * Name: tailTip
	 * </p>
	 */
	public static McObfPair field_110710_n = McMappingDatabase.getSRG("field_110710_n");

	/**
	 * <p>
	 * Name: backLeftLeg
	 * </p>
	 */
	public static McObfPair field_110711_o = McMappingDatabase.getSRG("field_110711_o");

	/**
	 * <p>
	 * Name: upperMouth
	 * </p>
	 */
	public static McObfPair field_178711_b = McMappingDatabase.getSRG("field_178711_b");

	/**
	 * <p>
	 * Name: lowerMouth
	 * </p>
	 */
	public static McObfPair field_178712_c = McMappingDatabase.getSRG("field_178712_c");

	/**
	 * <p>
	 * Name: backLeftHoof
	 * </p>
	 */
	public static McObfPair field_110718_w = McMappingDatabase.getSRG("field_110718_w");

	/**
	 * <p>
	 * Name: horseRightSaddleRope
	 * </p>
	 */
	public static McObfPair field_110693_N = McMappingDatabase.getSRG("field_110693_N");

	/**
	 * <p>
	 * Name: tailBase
	 * </p>
	 */
	public static McObfPair field_110712_l = McMappingDatabase.getSRG("field_110712_l");

	/**
	 * <p>
	 * Name: horseSaddleBottom
	 * </p>
	 */
	public static McObfPair field_110696_I = McMappingDatabase.getSRG("field_110696_I");

}

package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumFacing {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fa";
		else
			return "net/minecraft/util/EnumFacing";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fa";
		else
			return "EnumFacing";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfa;";
		else
			return "Lnet/minecraft/util/EnumFacing;";
	}

	/**
	 * <p>
	 * Name: random
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176741_a = McMappingDatabase.getSRG("EnumFacing.func_176741_a");

	/**
	 * <p>
	 * Name: fromAngle
	 * </p>
	 * <p>
	 * Desc: [(D)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176733_a = McMappingDatabase.getSRG("EnumFacing.func_176733_a");

	/**
	 * <p>
	 * Name: getFrontOffsetY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_96559_d = McMappingDatabase.getSRG("EnumFacing.func_96559_d");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("EnumFacing.func_176610_l");

	/**
	 * <p>
	 * Name: opposite
	 * </p>
	 */
	public static McObfPair field_176759_h = McMappingDatabase.getSRG("field_176759_h");

	/**
	 * <p>
	 * Name: NAME_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176761_p = McMappingDatabase.getSRG("field_176761_p");

	/**
	 * <p>
	 * Name: getName2
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176742_j = McMappingDatabase.getSRG("EnumFacing.func_176742_j");

	/**
	 * <p>
	 * Name: getAxis
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing$Axis;]
	 * </p>
	 */
	public static McObfPair func_176740_k = McMappingDatabase.getSRG("EnumFacing.func_176740_k");

	/**
	 * <p>
	 * Name: getFacingFromVector
	 * </p>
	 * <p>
	 * Desc: [(FFF)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176737_a = McMappingDatabase.getSRG("EnumFacing.func_176737_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176757_j = McMappingDatabase.getSRG("field_176757_j");

	/**
	 * <p>
	 * Name: getHorizontalIndex
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176736_b = McMappingDatabase.getSRG("EnumFacing.func_176736_b");

	/**
	 * <p>
	 * Name: rotateY
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176746_e = McMappingDatabase.getSRG("EnumFacing.func_176746_e");

	/**
	 * <p>
	 * Name: getFrontOffsetZ
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82599_e = McMappingDatabase.getSRG("EnumFacing.func_82599_e");

	/**
	 * <p>
	 * Name: axis
	 * </p>
	 */
	public static McObfPair field_176758_k = McMappingDatabase.getSRG("field_176758_k");

	/**
	 * <p>
	 * Name: getFacingFromAxis
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing$AxisDirection;Lnet/minecraft/util/EnumFacing$Axis;)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_181076_a = McMappingDatabase.getSRG("EnumFacing.func_181076_a");

	/**
	 * <p>
	 * Name: getHorizontalAngle
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_185119_l = McMappingDatabase.getSRG("EnumFacing.func_185119_l");

	/**
	 * <p>
	 * Name: horizontalIndex
	 * </p>
	 */
	public static McObfPair field_176760_i = McMappingDatabase.getSRG("field_176760_i");

	/**
	 * <p>
	 * Name: directionVec
	 * </p>
	 */
	public static McObfPair field_176756_m = McMappingDatabase.getSRG("field_176756_m");

	/**
	 * <p>
	 * Name: getFrontOffsetX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82601_c = McMappingDatabase.getSRG("EnumFacing.func_82601_c");

	/**
	 * <p>
	 * Name: rotateZ
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176738_p = McMappingDatabase.getSRG("EnumFacing.func_176738_p");

	/**
	 * <p>
	 * Name: getDirectionFromEntityLiving
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_190914_a = McMappingDatabase.getSRG("EnumFacing.func_190914_a");

	/**
	 * <p>
	 * Name: getHorizontal
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176731_b = McMappingDatabase.getSRG("EnumFacing.func_176731_b");

	/**
	 * <p>
	 * Name: getAxisDirection
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing$AxisDirection;]
	 * </p>
	 */
	public static McObfPair func_176743_c = McMappingDatabase.getSRG("EnumFacing.func_176743_c");

	/**
	 * <p>
	 * Name: getDirectionVec
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3i;]
	 * </p>
	 */
	public static McObfPair func_176730_m = McMappingDatabase.getSRG("EnumFacing.func_176730_m");

	/**
	 * <p>
	 * Name: HORIZONTALS
	 * </p>
	 */
	public static McObfPair field_176754_o = McMappingDatabase.getSRG("field_176754_o");

	/**
	 * <p>
	 * Name: VALUES
	 * </p>
	 */
	public static McObfPair field_82609_l = McMappingDatabase.getSRG("field_82609_l");

	/**
	 * <p>
	 * Name: getOpposite
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176734_d = McMappingDatabase.getSRG("EnumFacing.func_176734_d");

	/**
	 * <p>
	 * Name: rotateX
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176744_n = McMappingDatabase.getSRG("EnumFacing.func_176744_n");

	/**
	 * <p>
	 * Name: getFront
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_82600_a = McMappingDatabase.getSRG("EnumFacing.func_82600_a");

	/**
	 * <p>
	 * Name: rotateAround
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing$Axis;)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176732_a = McMappingDatabase.getSRG("EnumFacing.func_176732_a");

	/**
	 * <p>
	 * Name: index
	 * </p>
	 */
	public static McObfPair field_176748_g = McMappingDatabase.getSRG("field_176748_g");

	/**
	 * <p>
	 * Name: byName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176739_a = McMappingDatabase.getSRG("EnumFacing.func_176739_a");

	/**
	 * <p>
	 * Name: axisDirection
	 * </p>
	 */
	public static McObfPair field_176755_l = McMappingDatabase.getSRG("field_176755_l");

	/**
	 * <p>
	 * Name: rotateYCCW
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176735_f = McMappingDatabase.getSRG("EnumFacing.func_176735_f");

	/**
	 * <p>
	 * Name: getIndex
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176745_a = McMappingDatabase.getSRG("EnumFacing.func_176745_a");

}

package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumFacing$Axis {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fa$a";
		else
			return "net/minecraft/util/EnumFacing$Axis";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fa$a";
		else
			return "EnumFacing$Axis";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfa$a;";
		else
			return "Lnet/minecraft/util/EnumFacing$Axis;";
	}

	/**
	 * <p>
	 * Name: NAME_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176725_d = McMappingDatabase.getSRG("field_176725_d");

	/**
	 * <p>
	 * Name: getPlane
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing$Plane;]
	 * </p>
	 */
	public static McObfPair func_176716_d = McMappingDatabase.getSRG("EnumFacing$Axis.func_176716_d");

	/**
	 * <p>
	 * Name: byName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/EnumFacing$Axis;]
	 * </p>
	 */
	public static McObfPair func_176717_a = McMappingDatabase.getSRG("EnumFacing$Axis.func_176717_a");

	/**
	 * <p>
	 * Name: isHorizontal
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_176722_c = McMappingDatabase.getSRG("EnumFacing$Axis.func_176722_c");

	/**
	 * <p>
	 * Name: getName2
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176719_a = McMappingDatabase.getSRG("EnumFacing$Axis.func_176719_a");

	/**
	 * <p>
	 * Name: isVertical
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_176720_b = McMappingDatabase.getSRG("EnumFacing$Axis.func_176720_b");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("EnumFacing$Axis.func_176610_l");

	/**
	 * <p>
	 * Name: plane
	 * </p>
	 */
	public static McObfPair field_176723_f = McMappingDatabase.getSRG("field_176723_f");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176726_e = McMappingDatabase.getSRG("field_176726_e");

}

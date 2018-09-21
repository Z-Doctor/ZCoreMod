package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumFacing$AxisDirection {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fa$b";
		else
			return "net/minecraft/util/EnumFacing$AxisDirection";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fa$b";
		else
			return "EnumFacing$AxisDirection";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfa$b;";
		else
			return "Lnet/minecraft/util/EnumFacing$AxisDirection;";
	}

	/**
	 * <p>
	 * Name: offset
	 * </p>
	 */
	public static McObfPair field_179528_c = McMappingDatabase.getSRG("field_179528_c");

	/**
	 * <p>
	 * Name: getOffset
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179524_a = McMappingDatabase.getSRG("EnumFacing$AxisDirection.func_179524_a");

	/**
	 * <p>
	 * Name: description
	 * </p>
	 */
	public static McObfPair field_179525_d = McMappingDatabase.getSRG("field_179525_d");

}

package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumFacing$Plane {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fa$c";
		else
			return "net/minecraft/util/EnumFacing$Plane";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fa$c";
		else
			return "EnumFacing$Plane";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfa$c;";
		else
			return "Lnet/minecraft/util/EnumFacing$Plane;";
	}

	/**
	 * <p>
	 * Name: facings
	 * </p>
	 * <p>
	 * Desc: [()[Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_179516_a = McMappingDatabase.getSRG("EnumFacing$Plane.func_179516_a");

	/**
	 * <p>
	 * Name: random
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_179518_a = McMappingDatabase.getSRG("EnumFacing$Plane.func_179518_a");

}

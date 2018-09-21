package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumHandSide {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vo";
		else
			return "net/minecraft/util/EnumHandSide";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vo";
		else
			return "EnumHandSide";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvo;";
		else
			return "Lnet/minecraft/util/EnumHandSide;";
	}

	/**
	 * <p>
	 * Name: handName
	 * </p>
	 */
	public static McObfPair field_188471_c = McMappingDatabase.getSRG("field_188471_c");

	/**
	 * <p>
	 * Name: opposite
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumHandSide;]
	 * </p>
	 */
	public static McObfPair func_188468_a = McMappingDatabase.getSRG("EnumHandSide.func_188468_a");

}

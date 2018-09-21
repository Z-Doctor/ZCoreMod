package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumTypeAdapterFactory {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rj";
		else
			return "net/minecraft/util/EnumTypeAdapterFactory";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rj";
		else
			return "EnumTypeAdapterFactory";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrj;";
		else
			return "Lnet/minecraft/util/EnumTypeAdapterFactory;";
	}

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_151232_a = McMappingDatabase.getSRG("EnumTypeAdapterFactory.func_151232_a");

}

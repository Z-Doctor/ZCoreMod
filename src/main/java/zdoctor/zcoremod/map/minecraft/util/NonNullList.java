package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NonNullList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fi";
		else
			return "net/minecraft/util/NonNullList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fi";
		else
			return "NonNullList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfi;";
		else
			return "Lnet/minecraft/util/NonNullList;";
	}

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_191196_a = McMappingDatabase.getSRG("NonNullList.func_191196_a");

	/**
	 * <p>
	 * Name: delegate
	 * </p>
	 */
	public static McObfPair field_191198_a = McMappingDatabase.getSRG("field_191198_a");

	/**
	 * <p>
	 * Name: from
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;[Ljava/lang/Object;)Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_193580_a = McMappingDatabase.getSRG("NonNullList.func_193580_a");

	/**
	 * <p>
	 * Name: defaultElement
	 * </p>
	 */
	public static McObfPair field_191199_b = McMappingDatabase.getSRG("field_191199_b");

	/**
	 * <p>
	 * Name: withSize
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/Object;)Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_191197_a = McMappingDatabase.getSRG("NonNullList.func_191197_a");

}

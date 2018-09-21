package zdoctor.zcoremod.map.minecraft.entity.ai.attributes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IAttribute {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wc";
		else
			return "net/minecraft/entity/ai/attributes/IAttribute";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wc";
		else
			return "IAttribute";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwc;";
		else
			return "Lnet/minecraft/entity/ai/attributes/IAttribute;";
	}

	/**
	 * <p>
	 * Name: clampValue
	 * </p>
	 * <p>
	 * Desc: [(D)D]
	 * </p>
	 */
	public static McObfPair func_111109_a = McMappingDatabase.getSRG("IAttribute.func_111109_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_111108_a = McMappingDatabase.getSRG("IAttribute.func_111108_a");

	/**
	 * <p>
	 * Name: getShouldWatch
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_111111_c = McMappingDatabase.getSRG("IAttribute.func_111111_c");

	/**
	 * <p>
	 * Name: getParent
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/ai/attributes/IAttribute;]
	 * </p>
	 */
	public static McObfPair func_180372_d = McMappingDatabase.getSRG("IAttribute.func_180372_d");

	/**
	 * <p>
	 * Name: getDefaultValue
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_111110_b = McMappingDatabase.getSRG("IAttribute.func_111110_b");

}

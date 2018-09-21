package zdoctor.zcoremod.map.minecraft.entity.ai.attributes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RangedAttribute {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wj";
		else
			return "net/minecraft/entity/ai/attributes/RangedAttribute";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wj";
		else
			return "RangedAttribute";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwj;";
		else
			return "Lnet/minecraft/entity/ai/attributes/RangedAttribute;";
	}

	/**
	 * <p>
	 * Name: maximumValue
	 * </p>
	 */
	public static McObfPair field_111118_b = McMappingDatabase.getSRG("field_111118_b");

	/**
	 * <p>
	 * Name: getDescription
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_111116_f = McMappingDatabase.getSRG("RangedAttribute.func_111116_f");

	/**
	 * <p>
	 * Name: minimumValue
	 * </p>
	 */
	public static McObfPair field_111120_a = McMappingDatabase.getSRG("field_111120_a");

	/**
	 * <p>
	 * Name: description
	 * </p>
	 */
	public static McObfPair field_111119_c = McMappingDatabase.getSRG("field_111119_c");

	/**
	 * <p>
	 * Name: setDescription
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/entity/ai/attributes/RangedAttribute;]
	 * </p>
	 */
	public static McObfPair func_111117_a = McMappingDatabase.getSRG("RangedAttribute.func_111117_a");

	/**
	 * <p>
	 * Name: clampValue
	 * </p>
	 * <p>
	 * Desc: [(D)D]
	 * </p>
	 */
	public static McObfPair func_111109_a = McMappingDatabase.getSRG("RangedAttribute.func_111109_a");

}

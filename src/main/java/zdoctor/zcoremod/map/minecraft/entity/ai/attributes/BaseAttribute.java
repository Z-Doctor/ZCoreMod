package zdoctor.zcoremod.map.minecraft.entity.ai.attributes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BaseAttribute {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wf";
		else
			return "net/minecraft/entity/ai/attributes/BaseAttribute";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wf";
		else
			return "BaseAttribute";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwf;";
		else
			return "Lnet/minecraft/entity/ai/attributes/BaseAttribute;";
	}

	/**
	 * <p>
	 * Name: getShouldWatch
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_111111_c = McMappingDatabase.getSRG("BaseAttribute.func_111111_c");

	/**
	 * <p>
	 * Name: getParent
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/ai/attributes/IAttribute;]
	 * </p>
	 */
	public static McObfPair func_180372_d = McMappingDatabase.getSRG("BaseAttribute.func_180372_d");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_111108_a = McMappingDatabase.getSRG("BaseAttribute.func_111108_a");

	/**
	 * <p>
	 * Name: parent
	 * </p>
	 */
	public static McObfPair field_180373_a = McMappingDatabase.getSRG("field_180373_a");

	/**
	 * <p>
	 * Name: shouldWatch
	 * </p>
	 */
	public static McObfPair field_111114_c = McMappingDatabase.getSRG("field_111114_c");

	/**
	 * <p>
	 * Name: setShouldWatch
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/entity/ai/attributes/BaseAttribute;]
	 * </p>
	 */
	public static McObfPair func_111112_a = McMappingDatabase.getSRG("BaseAttribute.func_111112_a");

	/**
	 * <p>
	 * Name: defaultValue
	 * </p>
	 */
	public static McObfPair field_111113_b = McMappingDatabase.getSRG("field_111113_b");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_111115_a = McMappingDatabase.getSRG("field_111115_a");

	/**
	 * <p>
	 * Name: getDefaultValue
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_111110_b = McMappingDatabase.getSRG("BaseAttribute.func_111110_b");

}

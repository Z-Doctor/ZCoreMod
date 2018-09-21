package zdoctor.zcoremod.map.minecraft.block.properties;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IProperty {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axj";
		else
			return "net/minecraft/block/properties/IProperty";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axj";
		else
			return "IProperty";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxj;";
		else
			return "Lnet/minecraft/block/properties/IProperty;";
	}

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Comparable;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_177702_a = McMappingDatabase.getSRG("IProperty.func_177702_a");

	/**
	 * <p>
	 * Name: getValueClass
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Class;]
	 * </p>
	 */
	public static McObfPair func_177699_b = McMappingDatabase.getSRG("IProperty.func_177699_b");

	/**
	 * <p>
	 * Name: getAllowedValues
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_177700_c = McMappingDatabase.getSRG("IProperty.func_177700_c");

	/**
	 * <p>
	 * Name: parseValue
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lcom/google/common/base/Optional;]
	 * </p>
	 */
	public static McObfPair func_185929_b = McMappingDatabase.getSRG("IProperty.func_185929_b");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_177701_a = McMappingDatabase.getSRG("IProperty.func_177701_a");

}

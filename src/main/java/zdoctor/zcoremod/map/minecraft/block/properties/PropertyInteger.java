package zdoctor.zcoremod.map.minecraft.block.properties;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PropertyInteger {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axi";
		else
			return "net/minecraft/block/properties/PropertyInteger";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axi";
		else
			return "PropertyInteger";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxi;";
		else
			return "Lnet/minecraft/block/properties/PropertyInteger;";
	}

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Comparable;)Ljava/lang/String;, (Ljava/lang/Integer;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_177702_a = McMappingDatabase.getSRG("PropertyInteger.func_177702_a");

	/**
	 * <p>
	 * Name: allowedValues
	 * </p>
	 */
	public static McObfPair field_177720_a = McMappingDatabase.getSRG("field_177720_a");

	/**
	 * <p>
	 * Name: parseValue
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lcom/google/common/base/Optional;]
	 * </p>
	 */
	public static McObfPair func_185929_b = McMappingDatabase.getSRG("PropertyInteger.func_185929_b");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;II)Lnet/minecraft/block/properties/PropertyInteger;]
	 * </p>
	 */
	public static McObfPair func_177719_a = McMappingDatabase.getSRG("PropertyInteger.func_177719_a");

	/**
	 * <p>
	 * Name: getAllowedValues
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_177700_c = McMappingDatabase.getSRG("PropertyInteger.func_177700_c");

}

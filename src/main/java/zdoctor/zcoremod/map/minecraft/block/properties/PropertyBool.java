package zdoctor.zcoremod.map.minecraft.block.properties;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PropertyBool {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axf";
		else
			return "net/minecraft/block/properties/PropertyBool";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axf";
		else
			return "PropertyBool";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxf;";
		else
			return "Lnet/minecraft/block/properties/PropertyBool;";
	}

	/**
	 * <p>
	 * Name: parseValue
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lcom/google/common/base/Optional;]
	 * </p>
	 */
	public static McObfPair func_185929_b = McMappingDatabase.getSRG("PropertyBool.func_185929_b");

	/**
	 * <p>
	 * Name: allowedValues
	 * </p>
	 */
	public static McObfPair field_177717_a = McMappingDatabase.getSRG("field_177717_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Boolean;)Ljava/lang/String;, (Ljava/lang/Comparable;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_177702_a = McMappingDatabase.getSRG("PropertyBool.func_177702_a");

	/**
	 * <p>
	 * Name: getAllowedValues
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_177700_c = McMappingDatabase.getSRG("PropertyBool.func_177700_c");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/block/properties/PropertyBool;]
	 * </p>
	 */
	public static McObfPair func_177716_a = McMappingDatabase.getSRG("PropertyBool.func_177716_a");

}

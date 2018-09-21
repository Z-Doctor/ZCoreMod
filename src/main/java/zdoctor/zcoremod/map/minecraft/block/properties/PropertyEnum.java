package zdoctor.zcoremod.map.minecraft.block.properties;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PropertyEnum {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axh";
		else
			return "net/minecraft/block/properties/PropertyEnum";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axh";
		else
			return "PropertyEnum";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxh;";
		else
			return "Lnet/minecraft/block/properties/PropertyEnum;";
	}

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/Class;Ljava/util/Collection;)Lnet/minecraft/block/properties/PropertyEnum;]
	 * </p>
	 */
	public static McObfPair func_177707_a = McMappingDatabase.getSRG("PropertyEnum.func_177707_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Comparable;)Ljava/lang/String;, (Ljava/lang/Enum;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_177702_a = McMappingDatabase.getSRG("PropertyEnum.func_177702_a");

	/**
	 * <p>
	 * Name: allowedValues
	 * </p>
	 */
	public static McObfPair field_177711_a = McMappingDatabase.getSRG("field_177711_a");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/Class;Lcom/google/common/base/Predicate;)Lnet/minecraft/block/properties/PropertyEnum;]
	 * </p>
	 */
	public static McObfPair func_177708_a = McMappingDatabase.getSRG("PropertyEnum.func_177708_a");

	/**
	 * <p>
	 * Name: parseValue
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lcom/google/common/base/Optional;]
	 * </p>
	 */
	public static McObfPair func_185929_b = McMappingDatabase.getSRG("PropertyEnum.func_185929_b");

	/**
	 * <p>
	 * Name: nameToValue
	 * </p>
	 */
	public static McObfPair field_177710_b = McMappingDatabase.getSRG("field_177710_b");

	/**
	 * <p>
	 * Name: getAllowedValues
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_177700_c = McMappingDatabase.getSRG("PropertyEnum.func_177700_c");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/Class;)Lnet/minecraft/block/properties/PropertyEnum;]
	 * </p>
	 */
	public static McObfPair func_177709_a = McMappingDatabase.getSRG("PropertyEnum.func_177709_a");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Enum;)Lnet/minecraft/block/properties/PropertyEnum;]
	 * </p>
	 */
	public static McObfPair func_177706_a = McMappingDatabase.getSRG("PropertyEnum.func_177706_a");

}

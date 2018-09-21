package zdoctor.zcoremod.map.minecraft.block.properties;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PropertyDirection {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axg";
		else
			return "net/minecraft/block/properties/PropertyDirection";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axg";
		else
			return "PropertyDirection";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxg;";
		else
			return "Lnet/minecraft/block/properties/PropertyDirection;";
	}

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lcom/google/common/base/Predicate;)Lnet/minecraft/block/properties/PropertyDirection;]
	 * </p>
	 */
	public static McObfPair func_177712_a = McMappingDatabase.getSRG("PropertyDirection.func_177712_a");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/block/properties/PropertyDirection;]
	 * </p>
	 */
	public static McObfPair func_177714_a = McMappingDatabase.getSRG("PropertyDirection.func_177714_a");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/util/Collection;)Lnet/minecraft/block/properties/PropertyDirection;]
	 * </p>
	 */
	public static McObfPair func_177713_a = McMappingDatabase.getSRG("PropertyDirection.func_177713_a");

}

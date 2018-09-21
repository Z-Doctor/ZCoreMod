package zdoctor.zcoremod.map.minecraft.block.properties;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PropertyHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axe";
		else
			return "net/minecraft/block/properties/PropertyHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axe";
		else
			return "PropertyHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxe;";
		else
			return "Lnet/minecraft/block/properties/PropertyHelper;";
	}

	/**
	 * <p>
	 * Name: valueClass
	 * </p>
	 */
	public static McObfPair field_177704_a = McMappingDatabase.getSRG("field_177704_a");

	/**
	 * <p>
	 * Name: getValueClass
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Class;]
	 * </p>
	 */
	public static McObfPair func_177699_b = McMappingDatabase.getSRG("PropertyHelper.func_177699_b");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_177703_b = McMappingDatabase.getSRG("field_177703_b");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_177701_a = McMappingDatabase.getSRG("PropertyHelper.func_177701_a");

}

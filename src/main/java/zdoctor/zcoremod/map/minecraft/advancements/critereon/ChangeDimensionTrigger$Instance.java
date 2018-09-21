package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChangeDimensionTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "x$b";
		else
			return "net/minecraft/advancements/critereon/ChangeDimensionTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "x$b";
		else
			return "ChangeDimensionTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lx$b;";
		else
			return "Lnet/minecraft/advancements/critereon/ChangeDimensionTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: from
	 * </p>
	 */
	public static McObfPair field_193191_a = McMappingDatabase.getSRG("field_193191_a");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DimensionType;Lnet/minecraft/world/DimensionType;)Z]
	 * </p>
	 */
	public static McObfPair func_193190_a = McMappingDatabase.getSRG("ChangeDimensionTrigger$Instance.func_193190_a");

	/**
	 * <p>
	 * Name: to
	 * </p>
	 */
	public static McObfPair field_193192_b = McMappingDatabase.getSRG("field_193192_b");

}

package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ActionResult {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ue";
		else
			return "net/minecraft/util/ActionResult";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ue";
		else
			return "ActionResult";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lue;";
		else
			return "Lnet/minecraft/util/ActionResult;";
	}

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_188397_a = McMappingDatabase.getSRG("ActionResult.func_188397_a");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_188399_a = McMappingDatabase.getSRG("field_188399_a");

	/**
	 * <p>
	 * Name: result
	 * </p>
	 */
	public static McObfPair field_188400_b = McMappingDatabase.getSRG("field_188400_b");

	/**
	 * <p>
	 * Name: getResult
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_188398_b = McMappingDatabase.getSRG("ActionResult.func_188398_b");

}

package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FunctionObject$CacheableFunction {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bm$a";
		else
			return "net/minecraft/command/FunctionObject$CacheableFunction";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bm$a";
		else
			return "FunctionObject$CacheableFunction";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbm$a;";
		else
			return "Lnet/minecraft/command/FunctionObject$CacheableFunction;";
	}

	/**
	 * <p>
	 * Name: function
	 * </p>
	 */
	public static McObfPair field_193522_d = McMappingDatabase.getSRG("field_193522_d");

	/**
	 * <p>
	 * Name: get
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/FunctionManager;)Lnet/minecraft/command/FunctionObject;]
	 * </p>
	 */
	public static McObfPair func_193518_a = McMappingDatabase.getSRG("FunctionObject$CacheableFunction.func_193518_a");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_193520_b = McMappingDatabase.getSRG("field_193520_b");

	/**
	 * <p>
	 * Name: EMPTY
	 * </p>
	 */
	public static McObfPair field_193519_a = McMappingDatabase.getSRG("field_193519_a");

	/**
	 * <p>
	 * Name: isValid
	 * </p>
	 */
	public static McObfPair field_193521_c = McMappingDatabase.getSRG("field_193521_c");

}

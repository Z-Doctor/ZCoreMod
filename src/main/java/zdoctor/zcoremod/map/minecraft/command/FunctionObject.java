package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FunctionObject {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bm";
		else
			return "net/minecraft/command/FunctionObject";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bm";
		else
			return "FunctionObject";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbm;";
		else
			return "Lnet/minecraft/command/FunctionObject;";
	}

	/**
	 * <p>
	 * Name: getEntries
	 * </p>
	 * <p>
	 * Desc: [()[Lnet/minecraft/command/FunctionObject$Entry;]
	 * </p>
	 */
	public static McObfPair func_193528_a = McMappingDatabase.getSRG("FunctionObject.func_193528_a");

	/**
	 * <p>
	 * Name: entries
	 * </p>
	 */
	public static McObfPair field_193530_b = McMappingDatabase.getSRG("field_193530_b");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/FunctionManager;Ljava/util/List;)Lnet/minecraft/command/FunctionObject;]
	 * </p>
	 */
	public static McObfPair func_193527_a = McMappingDatabase.getSRG("FunctionObject.func_193527_a");

}

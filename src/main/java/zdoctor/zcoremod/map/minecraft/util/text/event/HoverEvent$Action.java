package zdoctor.zcoremod.map.minecraft.util.text.event;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class HoverEvent$Action {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hj$a";
		else
			return "net/minecraft/util/text/event/HoverEvent$Action";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hj$a";
		else
			return "HoverEvent$Action";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhj$a;";
		else
			return "Lnet/minecraft/util/text/event/HoverEvent$Action;";
	}

	/**
	 * <p>
	 * Name: allowedInChat
	 * </p>
	 */
	public static McObfPair field_150691_e = McMappingDatabase.getSRG("field_150691_e");

	/**
	 * <p>
	 * Name: canonicalName
	 * </p>
	 */
	public static McObfPair field_150688_f = McMappingDatabase.getSRG("field_150688_f");

	/**
	 * <p>
	 * Name: shouldAllowInChat
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150686_a = McMappingDatabase.getSRG("HoverEvent$Action.func_150686_a");

	/**
	 * <p>
	 * Name: getValueByCanonicalName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/text/event/HoverEvent$Action;]
	 * </p>
	 */
	public static McObfPair func_150684_a = McMappingDatabase.getSRG("HoverEvent$Action.func_150684_a");

	/**
	 * <p>
	 * Name: NAME_MAPPING
	 * </p>
	 */
	public static McObfPair field_150690_d = McMappingDatabase.getSRG("field_150690_d");

	/**
	 * <p>
	 * Name: getCanonicalName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150685_b = McMappingDatabase.getSRG("HoverEvent$Action.func_150685_b");

}

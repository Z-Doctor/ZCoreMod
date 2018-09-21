package zdoctor.zcoremod.map.minecraft.util.text.event;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ClickEvent$Action {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hg$a";
		else
			return "net/minecraft/util/text/event/ClickEvent$Action";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hg$a";
		else
			return "ClickEvent$Action";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhg$a;";
		else
			return "Lnet/minecraft/util/text/event/ClickEvent$Action;";
	}

	/**
	 * <p>
	 * Name: NAME_MAPPING
	 * </p>
	 */
	public static McObfPair field_150679_e = McMappingDatabase.getSRG("field_150679_e");

	/**
	 * <p>
	 * Name: allowedInChat
	 * </p>
	 */
	public static McObfPair field_150676_f = McMappingDatabase.getSRG("field_150676_f");

	/**
	 * <p>
	 * Name: canonicalName
	 * </p>
	 */
	public static McObfPair field_150677_g = McMappingDatabase.getSRG("field_150677_g");

	/**
	 * <p>
	 * Name: shouldAllowInChat
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150674_a = McMappingDatabase.getSRG("ClickEvent$Action.func_150674_a");

	/**
	 * <p>
	 * Name: getValueByCanonicalName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/text/event/ClickEvent$Action;]
	 * </p>
	 */
	public static McObfPair func_150672_a = McMappingDatabase.getSRG("ClickEvent$Action.func_150672_a");

	/**
	 * <p>
	 * Name: getCanonicalName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150673_b = McMappingDatabase.getSRG("ClickEvent$Action.func_150673_b");

}

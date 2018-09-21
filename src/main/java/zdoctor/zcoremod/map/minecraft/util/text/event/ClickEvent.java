package zdoctor.zcoremod.map.minecraft.util.text.event;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ClickEvent {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hg";
		else
			return "net/minecraft/util/text/event/ClickEvent";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hg";
		else
			return "ClickEvent";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhg;";
		else
			return "Lnet/minecraft/util/text/event/ClickEvent;";
	}

	/**
	 * <p>
	 * Name: value
	 * </p>
	 */
	public static McObfPair field_150670_b = McMappingDatabase.getSRG("field_150670_b");

	/**
	 * <p>
	 * Name: getValue
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150668_b = McMappingDatabase.getSRG("ClickEvent.func_150668_b");

	/**
	 * <p>
	 * Name: getAction
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/event/ClickEvent$Action;]
	 * </p>
	 */
	public static McObfPair func_150669_a = McMappingDatabase.getSRG("ClickEvent.func_150669_a");

	/**
	 * <p>
	 * Name: action
	 * </p>
	 */
	public static McObfPair field_150671_a = McMappingDatabase.getSRG("field_150671_a");

}

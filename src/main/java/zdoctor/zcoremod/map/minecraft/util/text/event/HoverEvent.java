package zdoctor.zcoremod.map.minecraft.util.text.event;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class HoverEvent {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hj";
		else
			return "net/minecraft/util/text/event/HoverEvent";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hj";
		else
			return "HoverEvent";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhj;";
		else
			return "Lnet/minecraft/util/text/event/HoverEvent;";
	}

	/**
	 * <p>
	 * Name: getValue
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_150702_b = McMappingDatabase.getSRG("HoverEvent.func_150702_b");

	/**
	 * <p>
	 * Name: getAction
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/event/HoverEvent$Action;]
	 * </p>
	 */
	public static McObfPair func_150701_a = McMappingDatabase.getSRG("HoverEvent.func_150701_a");

	/**
	 * <p>
	 * Name: value
	 * </p>
	 */
	public static McObfPair field_150703_b = McMappingDatabase.getSRG("field_150703_b");

	/**
	 * <p>
	 * Name: action
	 * </p>
	 */
	public static McObfPair field_150704_a = McMappingDatabase.getSRG("field_150704_a");

}

package zdoctor.zcoremod.map.minecraft.client.gui.chat;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class OverlayChatListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "biw";
		else
			return "net/minecraft/client/gui/chat/OverlayChatListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "biw";
		else
			return "OverlayChatListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbiw;";
		else
			return "Lnet/minecraft/client/gui/chat/OverlayChatListener;";
	}

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_192577_a = McMappingDatabase.getSRG("field_192577_a");

	/**
	 * <p>
	 * Name: say
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ChatType;Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_192576_a = McMappingDatabase.getSRG("OverlayChatListener.func_192576_a");

}

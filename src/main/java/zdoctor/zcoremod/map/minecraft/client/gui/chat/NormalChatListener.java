package zdoctor.zcoremod.map.minecraft.client.gui.chat;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NormalChatListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bix";
		else
			return "net/minecraft/client/gui/chat/NormalChatListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bix";
		else
			return "NormalChatListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbix;";
		else
			return "Lnet/minecraft/client/gui/chat/NormalChatListener;";
	}

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_192581_a = McMappingDatabase.getSRG("field_192581_a");

	/**
	 * <p>
	 * Name: say
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ChatType;Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_192576_a = McMappingDatabase.getSRG("NormalChatListener.func_192576_a");

}

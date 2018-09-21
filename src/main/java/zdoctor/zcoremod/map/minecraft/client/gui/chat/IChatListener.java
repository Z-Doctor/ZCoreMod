package zdoctor.zcoremod.map.minecraft.client.gui.chat;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IChatListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "biu";
		else
			return "net/minecraft/client/gui/chat/IChatListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "biu";
		else
			return "IChatListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbiu;";
		else
			return "Lnet/minecraft/client/gui/chat/IChatListener;";
	}

	/**
	 * <p>
	 * Name: say
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ChatType;Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_192576_a = McMappingDatabase.getSRG("IChatListener.func_192576_a");

}

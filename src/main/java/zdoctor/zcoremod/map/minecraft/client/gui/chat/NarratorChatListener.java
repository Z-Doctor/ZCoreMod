package zdoctor.zcoremod.map.minecraft.client.gui.chat;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NarratorChatListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "biv";
		else
			return "net/minecraft/client/gui/chat/NarratorChatListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "biv";
		else
			return "NarratorChatListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbiv;";
		else
			return "Lnet/minecraft/client/gui/chat/NarratorChatListener;";
	}

	/**
	 * <p>
	 * Name: announceMode
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_193641_a = McMappingDatabase.getSRG("NarratorChatListener.func_193641_a");

	/**
	 * <p>
	 * Name: INSTANCE
	 * </p>
	 */
	public static McObfPair field_193643_a = McMappingDatabase.getSRG("field_193643_a");

	/**
	 * <p>
	 * Name: isActive
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193640_a = McMappingDatabase.getSRG("NarratorChatListener.func_193640_a");

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193642_b = McMappingDatabase.getSRG("NarratorChatListener.func_193642_b");

	/**
	 * <p>
	 * Name: say
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ChatType;Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_192576_a = McMappingDatabase.getSRG("NarratorChatListener.func_192576_a");

	/**
	 * <p>
	 * Name: narrator
	 * </p>
	 */
	public static McObfPair field_192580_a = McMappingDatabase.getSRG("field_192580_a");

}

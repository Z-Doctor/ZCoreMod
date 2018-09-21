package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChatLine {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhx";
		else
			return "net/minecraft/client/gui/ChatLine";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhx";
		else
			return "ChatLine";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhx;";
		else
			return "Lnet/minecraft/client/gui/ChatLine;";
	}

	/**
	 * <p>
	 * Name: getChatComponent
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_151461_a = McMappingDatabase.getSRG("ChatLine.func_151461_a");

	/**
	 * <p>
	 * Name: getUpdatedCounter
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_74540_b = McMappingDatabase.getSRG("ChatLine.func_74540_b");

	/**
	 * <p>
	 * Name: chatLineID
	 * </p>
	 */
	public static McObfPair field_74542_c = McMappingDatabase.getSRG("field_74542_c");

	/**
	 * <p>
	 * Name: lineString
	 * </p>
	 */
	public static McObfPair field_74541_b = McMappingDatabase.getSRG("field_74541_b");

	/**
	 * <p>
	 * Name: updateCounterCreated
	 * </p>
	 */
	public static McObfPair field_74543_a = McMappingDatabase.getSRG("field_74543_a");

	/**
	 * <p>
	 * Name: getChatLineID
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_74539_c = McMappingDatabase.getSRG("ChatLine.func_74539_c");

}

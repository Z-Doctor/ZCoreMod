package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChatAllowedCharacters {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "g";
		else
			return "net/minecraft/util/ChatAllowedCharacters";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "g";
		else
			return "ChatAllowedCharacters";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lg;";
		else
			return "Lnet/minecraft/util/ChatAllowedCharacters;";
	}

	/**
	 * <p>
	 * Name: ILLEGAL_STRUCTURE_CHARACTERS
	 * </p>
	 */
	public static McObfPair field_189861_b = McMappingDatabase.getSRG("field_189861_b");

	/**
	 * <p>
	 * Name: filterAllowedCharacters
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71565_a = McMappingDatabase.getSRG("ChatAllowedCharacters.func_71565_a");

	/**
	 * <p>
	 * Name: ILLEGAL_FILE_CHARACTERS
	 * </p>
	 */
	public static McObfPair field_71567_b = McMappingDatabase.getSRG("field_71567_b");

	/**
	 * <p>
	 * Name: NETTY_LEAK_DETECTION
	 * </p>
	 */
	public static McObfPair field_184877_a = McMappingDatabase.getSRG("field_184877_a");

	/**
	 * <p>
	 * Name: isAllowedCharacter
	 * </p>
	 * <p>
	 * Desc: [(C)Z]
	 * </p>
	 */
	public static McObfPair func_71566_a = McMappingDatabase.getSRG("ChatAllowedCharacters.func_71566_a");

}

package zdoctor.zcoremod.map.minecraft.util.text;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextComponentTranslationFormatException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hq";
		else
			return "net/minecraft/util/text/TextComponentTranslationFormatException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hq";
		else
			return "TextComponentTranslationFormatException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhq;";
		else
			return "Lnet/minecraft/util/text/TextComponentTranslationFormatException;";
	}

}

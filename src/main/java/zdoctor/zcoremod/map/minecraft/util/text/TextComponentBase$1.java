package zdoctor.zcoremod.map.minecraft.util.text;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextComponentBase$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "he$1";
		else
			return "net/minecraft/util/text/TextComponentBase$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "he$1";
		else
			return "TextComponentBase$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhe$1;";
		else
			return "Lnet/minecraft/util/text/TextComponentBase$1;";
	}

}

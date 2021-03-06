package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SoundManager$2$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chm$2$1";
		else
			return "net/minecraft/client/audio/SoundManager$2$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chm$2$1";
		else
			return "SoundManager$2$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchm$2$1;";
		else
			return "Lnet/minecraft/client/audio/SoundManager$2$1;";
	}

}

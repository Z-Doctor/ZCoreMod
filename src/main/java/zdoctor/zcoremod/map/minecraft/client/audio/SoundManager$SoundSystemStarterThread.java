package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SoundManager$SoundSystemStarterThread {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chm$a";
		else
			return "net/minecraft/client/audio/SoundManager$SoundSystemStarterThread";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chm$a";
		else
			return "SoundManager$SoundSystemStarterThread";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchm$a;";
		else
			return "Lnet/minecraft/client/audio/SoundManager$SoundSystemStarterThread;";
	}

}

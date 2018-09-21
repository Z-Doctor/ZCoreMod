package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SoundHandler$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cho$2";
		else
			return "net/minecraft/client/audio/SoundHandler$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cho$2";
		else
			return "SoundHandler$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcho$2;";
		else
			return "Lnet/minecraft/client/audio/SoundHandler$2;";
	}

	/**
	 * <p>
	 * Name: getWeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148721_a = McMappingDatabase.getSRG("SoundHandler$2.func_148721_a");

	/**
	 * <p>
	 * Name: cloneEntry
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/audio/Sound;, ()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_148720_g = McMappingDatabase.getSRG("SoundHandler$2.func_148720_g");

}

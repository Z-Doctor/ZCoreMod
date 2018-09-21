package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Sound$Type {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgq$a";
		else
			return "net/minecraft/client/audio/Sound$Type";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgq$a";
		else
			return "Sound$Type";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgq$a;";
		else
			return "Lnet/minecraft/client/audio/Sound$Type;";
	}

	/**
	 * <p>
	 * Name: getByName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/audio/Sound$Type;]
	 * </p>
	 */
	public static McObfPair func_188704_a = McMappingDatabase.getSRG("Sound$Type.func_188704_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_188708_c = McMappingDatabase.getSRG("field_188708_c");

}

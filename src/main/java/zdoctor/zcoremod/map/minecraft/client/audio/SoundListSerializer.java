package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SoundListSerializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgs";
		else
			return "net/minecraft/client/audio/SoundListSerializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgs";
		else
			return "SoundListSerializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgs;";
		else
			return "Lnet/minecraft/client/audio/SoundListSerializer;";
	}

	/**
	 * <p>
	 * Name: deserializeSounds
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_188733_a = McMappingDatabase.getSRG("SoundListSerializer.func_188733_a");

	/**
	 * <p>
	 * Name: deserializeSound
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/client/audio/Sound;]
	 * </p>
	 */
	public static McObfPair func_188734_b = McMappingDatabase.getSRG("SoundListSerializer.func_188734_b");

	/**
	 * <p>
	 * Name: deserializeType
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lnet/minecraft/client/audio/Sound$Type;)Lnet/minecraft/client/audio/Sound$Type;]
	 * </p>
	 */
	public static McObfPair func_188732_a = McMappingDatabase.getSRG("SoundListSerializer.func_188732_a");

}

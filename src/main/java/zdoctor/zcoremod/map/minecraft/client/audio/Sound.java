package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Sound {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgq";
		else
			return "net/minecraft/client/audio/Sound";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgq";
		else
			return "Sound";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgq;";
		else
			return "Lnet/minecraft/client/audio/Sound;";
	}

	/**
	 * <p>
	 * Name: isStreaming
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188723_h = McMappingDatabase.getSRG("Sound.func_188723_h");

	/**
	 * <p>
	 * Name: getSoundLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_188719_a = McMappingDatabase.getSRG("Sound.func_188719_a");

	/**
	 * <p>
	 * Name: weight
	 * </p>
	 */
	public static McObfPair field_188729_d = McMappingDatabase.getSRG("field_188729_d");

	/**
	 * <p>
	 * Name: getVolume
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_188724_c = McMappingDatabase.getSRG("Sound.func_188724_c");

	/**
	 * <p>
	 * Name: cloneEntry
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/audio/Sound;, ()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_148720_g = McMappingDatabase.getSRG("Sound.func_148720_g");

	/**
	 * <p>
	 * Name: pitch
	 * </p>
	 */
	public static McObfPair field_188728_c = McMappingDatabase.getSRG("field_188728_c");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_188726_a = McMappingDatabase.getSRG("field_188726_a");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_188730_e = McMappingDatabase.getSRG("field_188730_e");

	/**
	 * <p>
	 * Name: volume
	 * </p>
	 */
	public static McObfPair field_188727_b = McMappingDatabase.getSRG("field_188727_b");

	/**
	 * <p>
	 * Name: getPitch
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_188725_d = McMappingDatabase.getSRG("Sound.func_188725_d");

	/**
	 * <p>
	 * Name: streaming
	 * </p>
	 */
	public static McObfPair field_188731_f = McMappingDatabase.getSRG("field_188731_f");

	/**
	 * <p>
	 * Name: getWeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148721_a = McMappingDatabase.getSRG("Sound.func_148721_a");

	/**
	 * <p>
	 * Name: getSoundAsOggLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_188721_b = McMappingDatabase.getSRG("Sound.func_188721_b");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/audio/Sound$Type;]
	 * </p>
	 */
	public static McObfPair func_188722_g = McMappingDatabase.getSRG("Sound.func_188722_g");

}

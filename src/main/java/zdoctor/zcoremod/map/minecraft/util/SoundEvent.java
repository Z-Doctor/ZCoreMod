package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SoundEvent {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qe";
		else
			return "net/minecraft/util/SoundEvent";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qe";
		else
			return "SoundEvent";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqe;";
		else
			return "Lnet/minecraft/util/SoundEvent;";
	}

	/**
	 * <p>
	 * Name: registerSounds
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187504_b = McMappingDatabase.getSRG("SoundEvent.func_187504_b");

	/**
	 * <p>
	 * Name: getSoundName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_187503_a = McMappingDatabase.getSRG("SoundEvent.func_187503_a");

	/**
	 * <p>
	 * Name: soundEventId
	 * </p>
	 */
	public static McObfPair field_187507_c = McMappingDatabase.getSRG("field_187507_c");

	/**
	 * <p>
	 * Name: soundName
	 * </p>
	 */
	public static McObfPair field_187506_b = McMappingDatabase.getSRG("field_187506_b");

	/**
	 * <p>
	 * Name: registerSound
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_187502_a = McMappingDatabase.getSRG("SoundEvent.func_187502_a");

	/**
	 * <p>
	 * Name: REGISTRY
	 * </p>
	 */
	public static McObfPair field_187505_a = McMappingDatabase.getSRG("field_187505_a");

}

package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SoundEventAccessor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chq";
		else
			return "net/minecraft/client/audio/SoundEventAccessor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chq";
		else
			return "SoundEventAccessor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchq;";
		else
			return "Lnet/minecraft/client/audio/SoundEventAccessor;";
	}

	/**
	 * <p>
	 * Name: getSubtitle
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_188712_c = McMappingDatabase.getSRG("SoundEventAccessor.func_188712_c");

	/**
	 * <p>
	 * Name: rnd
	 * </p>
	 */
	public static McObfPair field_148734_b = McMappingDatabase.getSRG("field_148734_b");

	/**
	 * <p>
	 * Name: accessorList
	 * </p>
	 */
	public static McObfPair field_188716_a = McMappingDatabase.getSRG("field_188716_a");

	/**
	 * <p>
	 * Name: subtitle
	 * </p>
	 */
	public static McObfPair field_188718_d = McMappingDatabase.getSRG("field_188718_d");

	/**
	 * <p>
	 * Name: getLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_188714_b = McMappingDatabase.getSRG("SoundEventAccessor.func_188714_b");

	/**
	 * <p>
	 * Name: addSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISoundEventAccessor;)V]
	 * </p>
	 */
	public static McObfPair func_188715_a = McMappingDatabase.getSRG("SoundEventAccessor.func_188715_a");

	/**
	 * <p>
	 * Name: getWeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148721_a = McMappingDatabase.getSRG("SoundEventAccessor.func_148721_a");

	/**
	 * <p>
	 * Name: location
	 * </p>
	 */
	public static McObfPair field_188717_c = McMappingDatabase.getSRG("field_188717_c");

	/**
	 * <p>
	 * Name: cloneEntry
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/audio/Sound;, ()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_148720_g = McMappingDatabase.getSRG("SoundEventAccessor.func_148720_g");

}

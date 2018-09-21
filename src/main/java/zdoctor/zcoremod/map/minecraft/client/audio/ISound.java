package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ISound {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgt";
		else
			return "net/minecraft/client/audio/ISound";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgt";
		else
			return "ISound";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgt;";
		else
			return "Lnet/minecraft/client/audio/ISound;";
	}

	/**
	 * <p>
	 * Name: getPitch
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_147655_f = McMappingDatabase.getSRG("ISound.func_147655_f");

	/**
	 * <p>
	 * Name: getYPosF
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_147654_h = McMappingDatabase.getSRG("ISound.func_147654_h");

	/**
	 * <p>
	 * Name: getSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/audio/Sound;]
	 * </p>
	 */
	public static McObfPair func_184364_b = McMappingDatabase.getSRG("ISound.func_184364_b");

	/**
	 * <p>
	 * Name: getZPosF
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_147651_i = McMappingDatabase.getSRG("ISound.func_147651_i");

	/**
	 * <p>
	 * Name: getAttenuationType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/audio/ISound$AttenuationType;]
	 * </p>
	 */
	public static McObfPair func_147656_j = McMappingDatabase.getSRG("ISound.func_147656_j");

	/**
	 * <p>
	 * Name: getXPosF
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_147649_g = McMappingDatabase.getSRG("ISound.func_147649_g");

	/**
	 * <p>
	 * Name: getCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundCategory;]
	 * </p>
	 */
	public static McObfPair func_184365_d = McMappingDatabase.getSRG("ISound.func_184365_d");

	/**
	 * <p>
	 * Name: getSoundLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_147650_b = McMappingDatabase.getSRG("ISound.func_147650_b");

	/**
	 * <p>
	 * Name: canRepeat
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_147657_c = McMappingDatabase.getSRG("ISound.func_147657_c");

	/**
	 * <p>
	 * Name: getRepeatDelay
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_147652_d = McMappingDatabase.getSRG("ISound.func_147652_d");

	/**
	 * <p>
	 * Name: createAccessor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/SoundHandler;)Lnet/minecraft/client/audio/SoundEventAccessor;]
	 * </p>
	 */
	public static McObfPair func_184366_a = McMappingDatabase.getSRG("ISound.func_184366_a");

	/**
	 * <p>
	 * Name: getVolume
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_147653_e = McMappingDatabase.getSRG("ISound.func_147653_e");

}

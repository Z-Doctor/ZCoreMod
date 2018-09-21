package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PositionedSound {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgj";
		else
			return "net/minecraft/client/audio/PositionedSound";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgj";
		else
			return "PositionedSound";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgj;";
		else
			return "Lnet/minecraft/client/audio/PositionedSound;";
	}

	/**
	 * <p>
	 * Name: getSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/audio/Sound;]
	 * </p>
	 */
	public static McObfPair func_184364_b = McMappingDatabase.getSRG("PositionedSound.func_184364_b");

	/**
	 * <p>
	 * Name: category
	 * </p>
	 */
	public static McObfPair field_184368_b = McMappingDatabase.getSRG("field_184368_b");

	/**
	 * <p>
	 * Name: getPitch
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_147655_f = McMappingDatabase.getSRG("PositionedSound.func_147655_f");

	/**
	 * <p>
	 * Name: getVolume
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_147653_e = McMappingDatabase.getSRG("PositionedSound.func_147653_e");

	/**
	 * <p>
	 * Name: getCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundCategory;]
	 * </p>
	 */
	public static McObfPair func_184365_d = McMappingDatabase.getSRG("PositionedSound.func_184365_d");

	/**
	 * <p>
	 * Name: yPosF
	 * </p>
	 */
	public static McObfPair field_147661_e = McMappingDatabase.getSRG("field_147661_e");

	/**
	 * <p>
	 * Name: getXPosF
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_147649_g = McMappingDatabase.getSRG("PositionedSound.func_147649_g");

	/**
	 * <p>
	 * Name: getZPosF
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_147651_i = McMappingDatabase.getSRG("PositionedSound.func_147651_i");

	/**
	 * <p>
	 * Name: xPosF
	 * </p>
	 */
	public static McObfPair field_147660_d = McMappingDatabase.getSRG("field_147660_d");

	/**
	 * <p>
	 * Name: getYPosF
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_147654_h = McMappingDatabase.getSRG("PositionedSound.func_147654_h");

	/**
	 * <p>
	 * Name: repeatDelay
	 * </p>
	 */
	public static McObfPair field_147665_h = McMappingDatabase.getSRG("field_147665_h");

	/**
	 * <p>
	 * Name: getAttenuationType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/audio/ISound$AttenuationType;]
	 * </p>
	 */
	public static McObfPair func_147656_j = McMappingDatabase.getSRG("PositionedSound.func_147656_j");

	/**
	 * <p>
	 * Name: positionedSoundLocation
	 * </p>
	 */
	public static McObfPair field_147664_a = McMappingDatabase.getSRG("field_147664_a");

	/**
	 * <p>
	 * Name: pitch
	 * </p>
	 */
	public static McObfPair field_147663_c = McMappingDatabase.getSRG("field_147663_c");

	/**
	 * <p>
	 * Name: sound
	 * </p>
	 */
	public static McObfPair field_184367_a = McMappingDatabase.getSRG("field_184367_a");

	/**
	 * <p>
	 * Name: repeat
	 * </p>
	 */
	public static McObfPair field_147659_g = McMappingDatabase.getSRG("field_147659_g");

	/**
	 * <p>
	 * Name: attenuationType
	 * </p>
	 */
	public static McObfPair field_147666_i = McMappingDatabase.getSRG("field_147666_i");

	/**
	 * <p>
	 * Name: zPosF
	 * </p>
	 */
	public static McObfPair field_147658_f = McMappingDatabase.getSRG("field_147658_f");

	/**
	 * <p>
	 * Name: getSoundLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_147650_b = McMappingDatabase.getSRG("PositionedSound.func_147650_b");

	/**
	 * <p>
	 * Name: createAccessor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/SoundHandler;)Lnet/minecraft/client/audio/SoundEventAccessor;]
	 * </p>
	 */
	public static McObfPair func_184366_a = McMappingDatabase.getSRG("PositionedSound.func_184366_a");

	/**
	 * <p>
	 * Name: volume
	 * </p>
	 */
	public static McObfPair field_147662_b = McMappingDatabase.getSRG("field_147662_b");

	/**
	 * <p>
	 * Name: canRepeat
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_147657_c = McMappingDatabase.getSRG("PositionedSound.func_147657_c");

	/**
	 * <p>
	 * Name: soundEvent
	 * </p>
	 */
	public static McObfPair field_184369_l = McMappingDatabase.getSRG("field_184369_l");

	/**
	 * <p>
	 * Name: getRepeatDelay
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_147652_d = McMappingDatabase.getSRG("PositionedSound.func_147652_d");

}

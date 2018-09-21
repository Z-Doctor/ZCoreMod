package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SoundManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chm";
		else
			return "net/minecraft/client/audio/SoundManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chm";
		else
			return "SoundManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchm;";
		else
			return "Lnet/minecraft/client/audio/SoundManager;";
	}

	/**
	 * <p>
	 * Name: options
	 * </p>
	 */
	public static McObfPair field_148619_d = McMappingDatabase.getSRG("field_148619_d");

	/**
	 * <p>
	 * Name: resumeAllSounds
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148604_f = McMappingDatabase.getSRG("SoundManager.func_148604_f");

	/**
	 * <p>
	 * Name: pausedChannels
	 * </p>
	 */
	public static McObfPair field_189000_p = McMappingDatabase.getSRG("field_189000_p");

	/**
	 * <p>
	 * Name: delayedSounds
	 * </p>
	 */
	public static McObfPair field_148626_m = McMappingDatabase.getSRG("field_148626_m");

	/**
	 * <p>
	 * Name: setVolume
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundCategory;F)V]
	 * </p>
	 */
	public static McObfPair func_188771_a = McMappingDatabase.getSRG("SoundManager.func_188771_a");

	/**
	 * <p>
	 * Name: playSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISound;)V]
	 * </p>
	 */
	public static McObfPair func_148611_c = McMappingDatabase.getSRG("SoundManager.func_148611_c");

	/**
	 * <p>
	 * Name: setListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;F)V]
	 * </p>
	 */
	public static McObfPair func_148615_a = McMappingDatabase.getSRG("SoundManager.func_148615_a");

	/**
	 * <p>
	 * Name: reloadSoundSystem
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148596_a = McMappingDatabase.getSRG("SoundManager.func_148596_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_148621_b = McMappingDatabase.getSRG("field_148621_b");

	/**
	 * <p>
	 * Name: getVolume
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundCategory;)F]
	 * </p>
	 */
	public static McObfPair func_188769_a = McMappingDatabase.getSRG("SoundManager.func_188769_a");

	/**
	 * <p>
	 * Name: getClampedPitch
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISound;)F]
	 * </p>
	 */
	public static McObfPair func_188772_d = McMappingDatabase.getSRG("SoundManager.func_188772_d");

	/**
	 * <p>
	 * Name: pauseAllSounds
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148610_e = McMappingDatabase.getSRG("SoundManager.func_148610_e");

	/**
	 * <p>
	 * Name: UNABLE_TO_PLAY
	 * </p>
	 */
	public static McObfPair field_188775_c = McMappingDatabase.getSRG("field_188775_c");

	/**
	 * <p>
	 * Name: unloadSoundSystem
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148613_b = McMappingDatabase.getSRG("SoundManager.func_148613_b");

	/**
	 * <p>
	 * Name: playTime
	 * </p>
	 */
	public static McObfPair field_148618_g = McMappingDatabase.getSRG("field_148618_g");

	/**
	 * <p>
	 * Name: updateAllSounds
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148605_d = McMappingDatabase.getSRG("SoundManager.func_148605_d");

	/**
	 * <p>
	 * Name: LOG_MARKER
	 * </p>
	 */
	public static McObfPair field_148623_a = McMappingDatabase.getSRG("field_148623_a");

	/**
	 * <p>
	 * Name: tickableSounds
	 * </p>
	 */
	public static McObfPair field_148625_l = McMappingDatabase.getSRG("field_148625_l");

	/**
	 * <p>
	 * Name: addListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISoundEventListener;)V]
	 * </p>
	 */
	public static McObfPair func_188774_a = McMappingDatabase.getSRG("SoundManager.func_188774_a");

	/**
	 * <p>
	 * Name: isSoundPlaying
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISound;)Z]
	 * </p>
	 */
	public static McObfPair func_148597_a = McMappingDatabase.getSRG("SoundManager.func_148597_a");

	/**
	 * <p>
	 * Name: playingSoundsStopTime
	 * </p>
	 */
	public static McObfPair field_148624_n = McMappingDatabase.getSRG("field_148624_n");

	/**
	 * <p>
	 * Name: categorySounds
	 * </p>
	 */
	public static McObfPair field_188776_k = McMappingDatabase.getSRG("field_188776_k");

	/**
	 * <p>
	 * Name: loadSoundSystem
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148608_i = McMappingDatabase.getSRG("SoundManager.func_148608_i");

	/**
	 * <p>
	 * Name: getClampedVolume
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISound;)F]
	 * </p>
	 */
	public static McObfPair func_188770_e = McMappingDatabase.getSRG("SoundManager.func_188770_e");

	/**
	 * <p>
	 * Name: sndHandler
	 * </p>
	 */
	public static McObfPair field_148622_c = McMappingDatabase.getSRG("field_148622_c");

	/**
	 * <p>
	 * Name: invPlayingSounds
	 * </p>
	 */
	public static McObfPair field_148630_i = McMappingDatabase.getSRG("field_148630_i");

	/**
	 * <p>
	 * Name: stop
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/util/SoundCategory;)V]
	 * </p>
	 */
	public static McObfPair func_189567_a = McMappingDatabase.getSRG("SoundManager.func_189567_a");

	/**
	 * <p>
	 * Name: removeListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISoundEventListener;)V]
	 * </p>
	 */
	public static McObfPair func_188773_b = McMappingDatabase.getSRG("SoundManager.func_188773_b");

	/**
	 * <p>
	 * Name: playDelayedSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISound;I)V]
	 * </p>
	 */
	public static McObfPair func_148599_a = McMappingDatabase.getSRG("SoundManager.func_148599_a");

	/**
	 * <p>
	 * Name: stopAllSounds
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148614_c = McMappingDatabase.getSRG("SoundManager.func_148614_c");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_188777_o = McMappingDatabase.getSRG("field_188777_o");

	/**
	 * <p>
	 * Name: getURLForSoundResource
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Ljava/net/URL;]
	 * </p>
	 */
	public static McObfPair func_148612_a = McMappingDatabase.getSRG("SoundManager.func_148612_a");

	/**
	 * <p>
	 * Name: loaded
	 * </p>
	 */
	public static McObfPair field_148617_f = McMappingDatabase.getSRG("field_148617_f");

	/**
	 * <p>
	 * Name: sndSystem
	 * </p>
	 */
	public static McObfPair field_148620_e = McMappingDatabase.getSRG("field_148620_e");

	/**
	 * <p>
	 * Name: playingSounds
	 * </p>
	 */
	public static McObfPair field_148629_h = McMappingDatabase.getSRG("field_148629_h");

	/**
	 * <p>
	 * Name: stopSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISound;)V]
	 * </p>
	 */
	public static McObfPair func_148602_b = McMappingDatabase.getSRG("SoundManager.func_148602_b");

}

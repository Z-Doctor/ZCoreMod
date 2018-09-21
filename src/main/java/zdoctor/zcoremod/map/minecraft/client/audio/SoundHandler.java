package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SoundHandler {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cho";
		else
			return "net/minecraft/client/audio/SoundHandler";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cho";
		else
			return "SoundHandler";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcho;";
		else
			return "Lnet/minecraft/client/audio/SoundHandler;";
	}

	/**
	 * <p>
	 * Name: playSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISound;)V]
	 * </p>
	 */
	public static McObfPair func_147682_a = McMappingDatabase.getSRG("SoundHandler.func_147682_a");

	/**
	 * <p>
	 * Name: validateSoundResource
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/Sound;Lnet/minecraft/util/ResourceLocation;)Z]
	 * </p>
	 */
	public static McObfPair func_184401_a = McMappingDatabase.getSRG("SoundHandler.func_184401_a");

	/**
	 * <p>
	 * Name: stopSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISound;)V]
	 * </p>
	 */
	public static McObfPair func_147683_b = McMappingDatabase.getSRG("SoundHandler.func_147683_b");

	/**
	 * <p>
	 * Name: setSoundLevel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundCategory;F)V]
	 * </p>
	 */
	public static McObfPair func_184399_a = McMappingDatabase.getSRG("SoundHandler.func_184399_a");

	/**
	 * <p>
	 * Name: stopSounds
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147690_c = McMappingDatabase.getSRG("SoundHandler.func_147690_c");

	/**
	 * <p>
	 * Name: isSoundPlaying
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISound;)Z]
	 * </p>
	 */
	public static McObfPair func_147692_c = McMappingDatabase.getSRG("SoundHandler.func_147692_c");

	/**
	 * <p>
	 * Name: addListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISoundEventListener;)V]
	 * </p>
	 */
	public static McObfPair func_184402_a = McMappingDatabase.getSRG("SoundHandler.func_184402_a");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("SoundHandler.func_73660_a");

	/**
	 * <p>
	 * Name: pauseSounds
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147689_b = McMappingDatabase.getSRG("SoundHandler.func_147689_b");

	/**
	 * <p>
	 * Name: getSoundMap
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/InputStream;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_175085_a = McMappingDatabase.getSRG("SoundHandler.func_175085_a");

	/**
	 * <p>
	 * Name: loadSoundResource
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;Lnet/minecraft/client/audio/SoundList;)V]
	 * </p>
	 */
	public static McObfPair func_147693_a = McMappingDatabase.getSRG("SoundHandler.func_147693_a");

	/**
	 * <p>
	 * Name: soundRegistry
	 * </p>
	 */
	public static McObfPair field_147697_e = McMappingDatabase.getSRG("field_147697_e");

	/**
	 * <p>
	 * Name: playDelayedSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISound;I)V]
	 * </p>
	 */
	public static McObfPair func_147681_a = McMappingDatabase.getSRG("SoundHandler.func_147681_a");

	/**
	 * <p>
	 * Name: GSON
	 * </p>
	 */
	public static McObfPair field_147699_c = McMappingDatabase.getSRG("field_147699_c");

	/**
	 * <p>
	 * Name: getAccessor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/audio/SoundEventAccessor;]
	 * </p>
	 */
	public static McObfPair func_184398_a = McMappingDatabase.getSRG("SoundHandler.func_184398_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147698_b = McMappingDatabase.getSRG("field_147698_b");

	/**
	 * <p>
	 * Name: onResourceManagerReload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110549_a = McMappingDatabase.getSRG("SoundHandler.func_110549_a");

	/**
	 * <p>
	 * Name: removeListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISoundEventListener;)V]
	 * </p>
	 */
	public static McObfPair func_184400_b = McMappingDatabase.getSRG("SoundHandler.func_184400_b");

	/**
	 * <p>
	 * Name: TYPE
	 * </p>
	 */
	public static McObfPair field_147696_d = McMappingDatabase.getSRG("field_147696_d");

	/**
	 * <p>
	 * Name: mcResourceManager
	 * </p>
	 */
	public static McObfPair field_147695_g = McMappingDatabase.getSRG("field_147695_g");

	/**
	 * <p>
	 * Name: unloadSounds
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147685_d = McMappingDatabase.getSRG("SoundHandler.func_147685_d");

	/**
	 * <p>
	 * Name: setListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;F)V]
	 * </p>
	 */
	public static McObfPair func_147691_a = McMappingDatabase.getSRG("SoundHandler.func_147691_a");

	/**
	 * <p>
	 * Name: MISSING_SOUND
	 * </p>
	 */
	public static McObfPair field_147700_a = McMappingDatabase.getSRG("field_147700_a");

	/**
	 * <p>
	 * Name: stop
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/util/SoundCategory;)V]
	 * </p>
	 */
	public static McObfPair func_189520_a = McMappingDatabase.getSRG("SoundHandler.func_189520_a");

	/**
	 * <p>
	 * Name: resumeSounds
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147687_e = McMappingDatabase.getSRG("SoundHandler.func_147687_e");

	/**
	 * <p>
	 * Name: sndManager
	 * </p>
	 */
	public static McObfPair field_147694_f = McMappingDatabase.getSRG("field_147694_f");

}

package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PositionedSoundRecord {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgp";
		else
			return "net/minecraft/client/audio/PositionedSoundRecord";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgp";
		else
			return "PositionedSoundRecord";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgp;";
		else
			return "Lnet/minecraft/client/audio/PositionedSoundRecord;";
	}

	/**
	 * <p>
	 * Name: getRecord
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundEvent;FF)Lnet/minecraft/client/audio/PositionedSoundRecord;]
	 * </p>
	 */
	public static McObfPair func_194007_a = McMappingDatabase.getSRG("PositionedSoundRecord.func_194007_a");

	/**
	 * <p>
	 * Name: getMusicRecord
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/client/audio/PositionedSoundRecord;]
	 * </p>
	 */
	public static McObfPair func_184370_a = McMappingDatabase.getSRG("PositionedSoundRecord.func_184370_a");

	/**
	 * <p>
	 * Name: getMasterRecord
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundEvent;F)Lnet/minecraft/client/audio/PositionedSoundRecord;]
	 * </p>
	 */
	public static McObfPair func_184371_a = McMappingDatabase.getSRG("PositionedSoundRecord.func_184371_a");

	/**
	 * <p>
	 * Name: getRecordSoundRecord
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundEvent;FFF)Lnet/minecraft/client/audio/PositionedSoundRecord;]
	 * </p>
	 */
	public static McObfPair func_184372_a = McMappingDatabase.getSRG("PositionedSoundRecord.func_184372_a");

}

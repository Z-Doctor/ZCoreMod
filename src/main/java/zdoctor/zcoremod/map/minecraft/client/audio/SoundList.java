package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SoundList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgr";
		else
			return "net/minecraft/client/audio/SoundList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgr";
		else
			return "SoundList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgr;";
		else
			return "Lnet/minecraft/client/audio/SoundList;";
	}

	/**
	 * <p>
	 * Name: replaceExisting
	 * </p>
	 */
	public static McObfPair field_148575_b = McMappingDatabase.getSRG("field_148575_b");

	/**
	 * <p>
	 * Name: getSubtitle
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_188701_c = McMappingDatabase.getSRG("SoundList.func_188701_c");

	/**
	 * <p>
	 * Name: sounds
	 * </p>
	 */
	public static McObfPair field_188702_a = McMappingDatabase.getSRG("field_188702_a");

	/**
	 * <p>
	 * Name: getSounds
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_188700_a = McMappingDatabase.getSRG("SoundList.func_188700_a");

	/**
	 * <p>
	 * Name: subtitle
	 * </p>
	 */
	public static McObfPair field_188703_c = McMappingDatabase.getSRG("field_188703_c");

	/**
	 * <p>
	 * Name: canReplaceExisting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148574_b = McMappingDatabase.getSRG("SoundList.func_148574_b");

}

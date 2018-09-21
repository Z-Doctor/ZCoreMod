package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SoundRegistry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chp";
		else
			return "net/minecraft/client/audio/SoundRegistry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chp";
		else
			return "SoundRegistry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchp;";
		else
			return "Lnet/minecraft/client/audio/SoundRegistry;";
	}

	/**
	 * <p>
	 * Name: clearMap
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148763_c = McMappingDatabase.getSRG("SoundRegistry.func_148763_c");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/SoundEventAccessor;)V]
	 * </p>
	 */
	public static McObfPair func_186803_a = McMappingDatabase.getSRG("SoundRegistry.func_186803_a");

	/**
	 * <p>
	 * Name: createUnderlyingMap
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_148740_a = McMappingDatabase.getSRG("SoundRegistry.func_148740_a");

	/**
	 * <p>
	 * Name: soundRegistry
	 * </p>
	 */
	public static McObfPair field_148764_a = McMappingDatabase.getSRG("field_148764_a");

}

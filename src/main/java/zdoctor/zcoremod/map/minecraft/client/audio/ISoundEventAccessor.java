package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ISoundEventAccessor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chr";
		else
			return "net/minecraft/client/audio/ISoundEventAccessor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chr";
		else
			return "ISoundEventAccessor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchr;";
		else
			return "Lnet/minecraft/client/audio/ISoundEventAccessor;";
	}

	/**
	 * <p>
	 * Name: getWeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148721_a = McMappingDatabase.getSRG("ISoundEventAccessor.func_148721_a");

	/**
	 * <p>
	 * Name: cloneEntry
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_148720_g = McMappingDatabase.getSRG("ISoundEventAccessor.func_148720_g");

}

package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SoundCategory {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qg";
		else
			return "net/minecraft/util/SoundCategory";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qg";
		else
			return "SoundCategory";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqg;";
		else
			return "Lnet/minecraft/util/SoundCategory;";
	}

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_187962_l = McMappingDatabase.getSRG("field_187962_l");

	/**
	 * <p>
	 * Name: SOUND_CATEGORIES
	 * </p>
	 */
	public static McObfPair field_187961_k = McMappingDatabase.getSRG("field_187961_k");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_187948_a = McMappingDatabase.getSRG("SoundCategory.func_187948_a");

	/**
	 * <p>
	 * Name: getSoundCategoryNames
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_187949_b = McMappingDatabase.getSRG("SoundCategory.func_187949_b");

	/**
	 * <p>
	 * Name: getByName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/SoundCategory;]
	 * </p>
	 */
	public static McObfPair func_187950_a = McMappingDatabase.getSRG("SoundCategory.func_187950_a");

}

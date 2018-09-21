package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BannerPattern {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avg";
		else
			return "net/minecraft/tileentity/BannerPattern";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avg";
		else
			return "BannerPattern";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavg;";
		else
			return "Lnet/minecraft/tileentity/BannerPattern;";
	}

	/**
	 * <p>
	 * Name: getFileName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_190997_a = McMappingDatabase.getSRG("BannerPattern.func_190997_a");

	/**
	 * <p>
	 * Name: hasPattern
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191000_d = McMappingDatabase.getSRG("BannerPattern.func_191000_d");

	/**
	 * <p>
	 * Name: getHashname
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_190993_b = McMappingDatabase.getSRG("BannerPattern.func_190993_b");

	/**
	 * <p>
	 * Name: getPatterns
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_190996_c = McMappingDatabase.getSRG("BannerPattern.func_190996_c");

	/**
	 * <p>
	 * Name: hasPatternItem
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190999_e = McMappingDatabase.getSRG("BannerPattern.func_190999_e");

	/**
	 * <p>
	 * Name: hashname
	 * </p>
	 */
	public static McObfPair field_191015_O = McMappingDatabase.getSRG("field_191015_O");

	/**
	 * <p>
	 * Name: fileName
	 * </p>
	 */
	public static McObfPair field_191014_N = McMappingDatabase.getSRG("field_191014_N");

	/**
	 * <p>
	 * Name: patterns
	 * </p>
	 */
	public static McObfPair field_191016_P = McMappingDatabase.getSRG("field_191016_P");

	/**
	 * <p>
	 * Name: byHash
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/tileentity/BannerPattern;]
	 * </p>
	 */
	public static McObfPair func_190994_a = McMappingDatabase.getSRG("BannerPattern.func_190994_a");

	/**
	 * <p>
	 * Name: getPatternItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190998_f = McMappingDatabase.getSRG("BannerPattern.func_190998_f");

	/**
	 * <p>
	 * Name: patternItem
	 * </p>
	 */
	public static McObfPair field_191017_Q = McMappingDatabase.getSRG("field_191017_Q");

}

package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aln";
		else
			return "net/minecraft/enchantment/EnchantmentData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aln";
		else
			return "EnchantmentData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laln;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentData;";
	}

	/**
	 * <p>
	 * Name: enchantment
	 * </p>
	 */
	public static McObfPair field_76302_b = McMappingDatabase.getSRG("field_76302_b");

	/**
	 * <p>
	 * Name: enchantmentLevel
	 * </p>
	 */
	public static McObfPair field_76303_c = McMappingDatabase.getSRG("field_76303_c");

}

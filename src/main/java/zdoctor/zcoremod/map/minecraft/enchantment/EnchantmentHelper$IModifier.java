package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentHelper$IModifier {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alm$c";
		else
			return "net/minecraft/enchantment/EnchantmentHelper$IModifier";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alm$c";
		else
			return "EnchantmentHelper$IModifier";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lalm$c;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentHelper$IModifier;";
	}

	/**
	 * <p>
	 * Name: calculateModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/Enchantment;I)V]
	 * </p>
	 */
	public static McObfPair func_77493_a = McMappingDatabase.getSRG("EnchantmentHelper$IModifier.func_77493_a");

}

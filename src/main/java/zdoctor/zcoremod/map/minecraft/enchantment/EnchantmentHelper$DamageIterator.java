package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentHelper$DamageIterator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alm$a";
		else
			return "net/minecraft/enchantment/EnchantmentHelper$DamageIterator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alm$a";
		else
			return "EnchantmentHelper$DamageIterator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lalm$a;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentHelper$DamageIterator;";
	}

	/**
	 * <p>
	 * Name: target
	 * </p>
	 */
	public static McObfPair field_151365_b = McMappingDatabase.getSRG("field_151365_b");

	/**
	 * <p>
	 * Name: user
	 * </p>
	 */
	public static McObfPair field_151366_a = McMappingDatabase.getSRG("field_151366_a");

	/**
	 * <p>
	 * Name: calculateModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/Enchantment;I)V]
	 * </p>
	 */
	public static McObfPair func_77493_a = McMappingDatabase.getSRG("EnchantmentHelper$DamageIterator.func_77493_a");

}

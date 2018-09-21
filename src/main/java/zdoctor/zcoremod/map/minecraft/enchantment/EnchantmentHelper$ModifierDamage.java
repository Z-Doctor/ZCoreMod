package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentHelper$ModifierDamage {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alm$e";
		else
			return "net/minecraft/enchantment/EnchantmentHelper$ModifierDamage";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alm$e";
		else
			return "EnchantmentHelper$ModifierDamage";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lalm$e;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentHelper$ModifierDamage;";
	}

	/**
	 * <p>
	 * Name: damageModifier
	 * </p>
	 */
	public static McObfPair field_77497_a = McMappingDatabase.getSRG("field_77497_a");

	/**
	 * <p>
	 * Name: calculateModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/Enchantment;I)V]
	 * </p>
	 */
	public static McObfPair func_77493_a = McMappingDatabase.getSRG("EnchantmentHelper$ModifierDamage.func_77493_a");

	/**
	 * <p>
	 * Name: source
	 * </p>
	 */
	public static McObfPair field_77496_b = McMappingDatabase.getSRG("field_77496_b");

}

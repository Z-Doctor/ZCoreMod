package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentHelper$HurtIterator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alm$b";
		else
			return "net/minecraft/enchantment/EnchantmentHelper$HurtIterator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alm$b";
		else
			return "EnchantmentHelper$HurtIterator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lalm$b;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentHelper$HurtIterator;";
	}

	/**
	 * <p>
	 * Name: user
	 * </p>
	 */
	public static McObfPair field_151364_a = McMappingDatabase.getSRG("field_151364_a");

	/**
	 * <p>
	 * Name: calculateModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/Enchantment;I)V]
	 * </p>
	 */
	public static McObfPair func_77493_a = McMappingDatabase.getSRG("EnchantmentHelper$HurtIterator.func_77493_a");

	/**
	 * <p>
	 * Name: attacker
	 * </p>
	 */
	public static McObfPair field_151363_b = McMappingDatabase.getSRG("field_151363_b");

}

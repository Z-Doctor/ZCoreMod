package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentHelper$ModifierLiving {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alm$d";
		else
			return "net/minecraft/enchantment/EnchantmentHelper$ModifierLiving";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alm$d";
		else
			return "EnchantmentHelper$ModifierLiving";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lalm$d;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentHelper$ModifierLiving;";
	}

	/**
	 * <p>
	 * Name: calculateModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/Enchantment;I)V]
	 * </p>
	 */
	public static McObfPair func_77493_a = McMappingDatabase.getSRG("EnchantmentHelper$ModifierLiving.func_77493_a");

	/**
	 * <p>
	 * Name: entityLiving
	 * </p>
	 */
	public static McObfPair field_77494_b = McMappingDatabase.getSRG("field_77494_b");

	/**
	 * <p>
	 * Name: livingModifier
	 * </p>
	 */
	public static McObfPair field_77495_a = McMappingDatabase.getSRG("field_77495_a");

}

package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumEnchantmentType$3 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "all$6";
		else
			return "net/minecraft/enchantment/EnumEnchantmentType$3";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "all$6";
		else
			return "EnumEnchantmentType$3";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lall$6;";
		else
			return "Lnet/minecraft/enchantment/EnumEnchantmentType$3;";
	}

	/**
	 * <p>
	 * Name: canEnchantItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Z]
	 * </p>
	 */
	public static McObfPair func_77557_a = McMappingDatabase.getSRG("EnumEnchantmentType$3.func_77557_a");

}

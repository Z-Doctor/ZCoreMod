package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumEnchantmentType$4 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "all$7";
		else
			return "net/minecraft/enchantment/EnumEnchantmentType$4";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "all$7";
		else
			return "EnumEnchantmentType$4";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lall$7;";
		else
			return "Lnet/minecraft/enchantment/EnumEnchantmentType$4;";
	}

	/**
	 * <p>
	 * Name: canEnchantItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Z]
	 * </p>
	 */
	public static McObfPair func_77557_a = McMappingDatabase.getSRG("EnumEnchantmentType$4.func_77557_a");

}

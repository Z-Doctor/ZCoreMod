package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentProtection$Type {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alw$a";
		else
			return "net/minecraft/enchantment/EnchantmentProtection$Type";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alw$a";
		else
			return "EnchantmentProtection$Type";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lalw$a;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentProtection$Type;";
	}

	/**
	 * <p>
	 * Name: getTypeName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_185314_a = McMappingDatabase.getSRG("EnchantmentProtection$Type.func_185314_a");

	/**
	 * <p>
	 * Name: levelCost
	 * </p>
	 */
	public static McObfPair field_185324_h = McMappingDatabase.getSRG("field_185324_h");

	/**
	 * <p>
	 * Name: getEnchantIncreasePerLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_185315_c = McMappingDatabase.getSRG("EnchantmentProtection$Type.func_185315_c");

	/**
	 * <p>
	 * Name: getMinimalEnchantability
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_185316_b = McMappingDatabase.getSRG("EnchantmentProtection$Type.func_185316_b");

	/**
	 * <p>
	 * Name: typeName
	 * </p>
	 */
	public static McObfPair field_185322_f = McMappingDatabase.getSRG("field_185322_f");

	/**
	 * <p>
	 * Name: levelCostSpan
	 * </p>
	 */
	public static McObfPair field_185325_i = McMappingDatabase.getSRG("field_185325_i");

	/**
	 * <p>
	 * Name: minEnchantability
	 * </p>
	 */
	public static McObfPair field_185323_g = McMappingDatabase.getSRG("field_185323_g");

}

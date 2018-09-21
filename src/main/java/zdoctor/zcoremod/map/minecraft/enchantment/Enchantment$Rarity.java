package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Enchantment$Rarity {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alk$a";
		else
			return "net/minecraft/enchantment/Enchantment$Rarity";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alk$a";
		else
			return "Enchantment$Rarity";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lalk$a;";
		else
			return "Lnet/minecraft/enchantment/Enchantment$Rarity;";
	}

	/**
	 * <p>
	 * Name: weight
	 * </p>
	 */
	public static McObfPair field_185275_e = McMappingDatabase.getSRG("field_185275_e");

	/**
	 * <p>
	 * Name: getWeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_185270_a = McMappingDatabase.getSRG("Enchantment$Rarity.func_185270_a");

}

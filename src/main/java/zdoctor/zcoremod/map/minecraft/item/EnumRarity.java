package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumRarity {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aje";
		else
			return "net/minecraft/item/EnumRarity";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aje";
		else
			return "EnumRarity";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laje;";
		else
			return "Lnet/minecraft/item/EnumRarity;";
	}

	/**
	 * <p>
	 * Name: rarityName
	 * </p>
	 */
	public static McObfPair field_77934_f = McMappingDatabase.getSRG("field_77934_f");

	/**
	 * <p>
	 * Name: rarityColor
	 * </p>
	 */
	public static McObfPair field_77937_e = McMappingDatabase.getSRG("field_77937_e");

}

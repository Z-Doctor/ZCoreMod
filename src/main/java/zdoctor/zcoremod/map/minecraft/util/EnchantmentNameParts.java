package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentNameParts {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bms";
		else
			return "net/minecraft/util/EnchantmentNameParts";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bms";
		else
			return "EnchantmentNameParts";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbms;";
		else
			return "Lnet/minecraft/util/EnchantmentNameParts;";
	}

	/**
	 * <p>
	 * Name: generateNewRandomName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/FontRenderer;I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148334_a = McMappingDatabase.getSRG("EnchantmentNameParts.func_148334_a");

	/**
	 * <p>
	 * Name: INSTANCE
	 * </p>
	 */
	public static McObfPair field_148338_a = McMappingDatabase.getSRG("field_148338_a");

	/**
	 * <p>
	 * Name: getInstance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnchantmentNameParts;]
	 * </p>
	 */
	public static McObfPair func_178176_a = McMappingDatabase.getSRG("EnchantmentNameParts.func_178176_a");

	/**
	 * <p>
	 * Name: rand
	 * </p>
	 */
	public static McObfPair field_148336_b = McMappingDatabase.getSRG("field_148336_b");

	/**
	 * <p>
	 * Name: reseedRandomGenerator
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_148335_a = McMappingDatabase.getSRG("EnchantmentNameParts.func_148335_a");

	/**
	 * <p>
	 * Name: namePartsArray
	 * </p>
	 */
	public static McObfPair field_148337_c = McMappingDatabase.getSRG("field_148337_c");

}

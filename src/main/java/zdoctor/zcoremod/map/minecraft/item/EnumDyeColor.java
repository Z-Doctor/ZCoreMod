package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumDyeColor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahs";
		else
			return "net/minecraft/item/EnumDyeColor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahs";
		else
			return "EnumDyeColor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lahs;";
		else
			return "Lnet/minecraft/item/EnumDyeColor;";
	}

	/**
	 * <p>
	 * Name: dyeDamage
	 * </p>
	 */
	public static McObfPair field_176787_t = McMappingDatabase.getSRG("field_176787_t");

	/**
	 * <p>
	 * Name: chatColor
	 * </p>
	 */
	public static McObfPair field_176793_x = McMappingDatabase.getSRG("field_176793_x");

	/**
	 * <p>
	 * Name: getDyeDamage
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176767_b = McMappingDatabase.getSRG("EnumDyeColor.func_176767_b");

	/**
	 * <p>
	 * Name: colorValue
	 * </p>
	 */
	public static McObfPair field_193351_w = McMappingDatabase.getSRG("field_193351_w");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("EnumDyeColor.func_176610_l");

	/**
	 * <p>
	 * Name: DYE_DMG_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176789_r = McMappingDatabase.getSRG("field_176789_r");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/EnumDyeColor;]
	 * </p>
	 */
	public static McObfPair func_176764_b = McMappingDatabase.getSRG("EnumDyeColor.func_176764_b");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176765_a = McMappingDatabase.getSRG("EnumDyeColor.func_176765_a");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_176785_v = McMappingDatabase.getSRG("field_176785_v");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176762_d = McMappingDatabase.getSRG("EnumDyeColor.func_176762_d");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_176788_s = McMappingDatabase.getSRG("field_176788_s");

	/**
	 * <p>
	 * Name: getColorValue
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_193350_e = McMappingDatabase.getSRG("EnumDyeColor.func_193350_e");

	/**
	 * <p>
	 * Name: getDyeColorName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_192396_c = McMappingDatabase.getSRG("EnumDyeColor.func_192396_c");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176786_u = McMappingDatabase.getSRG("field_176786_u");

	/**
	 * <p>
	 * Name: getColorComponentValues
	 * </p>
	 * <p>
	 * Desc: [()[F]
	 * </p>
	 */
	public static McObfPair func_193349_f = McMappingDatabase.getSRG("EnumDyeColor.func_193349_f");

	/**
	 * <p>
	 * Name: byDyeDamage
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/EnumDyeColor;]
	 * </p>
	 */
	public static McObfPair func_176766_a = McMappingDatabase.getSRG("EnumDyeColor.func_176766_a");

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176790_q = McMappingDatabase.getSRG("field_176790_q");

	/**
	 * <p>
	 * Name: colorComponentValues
	 * </p>
	 */
	public static McObfPair field_193352_x = McMappingDatabase.getSRG("field_193352_x");

}

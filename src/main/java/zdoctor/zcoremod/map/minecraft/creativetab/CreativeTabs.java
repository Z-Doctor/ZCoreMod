package zdoctor.zcoremod.map.minecraft.creativetab;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CreativeTabs {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahp";
		else
			return "net/minecraft/creativetab/CreativeTabs";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahp";
		else
			return "CreativeTabs";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lahp;";
		else
			return "Lnet/minecraft/creativetab/CreativeTabs;";
	}

	/**
	 * <p>
	 * Name: hasRelevantEnchantmentType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/EnumEnchantmentType;)Z]
	 * </p>
	 */
	public static McObfPair func_111226_a = McMappingDatabase.getSRG("CreativeTabs.func_111226_a");

	/**
	 * <p>
	 * Name: SEARCH
	 * </p>
	 */
	public static McObfPair field_78027_g = McMappingDatabase.getSRG("field_78027_g");

	/**
	 * <p>
	 * Name: isTabInFirstRow
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_78023_l = McMappingDatabase.getSRG("CreativeTabs.func_78023_l");

	/**
	 * <p>
	 * Name: isAlignedRight
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192394_m = McMappingDatabase.getSRG("CreativeTabs.func_192394_m");

	/**
	 * <p>
	 * Name: iconItemStack
	 * </p>
	 */
	public static McObfPair field_151245_t = McMappingDatabase.getSRG("field_151245_t");

	/**
	 * <p>
	 * Name: drawTitle
	 * </p>
	 */
	public static McObfPair field_78041_r = McMappingDatabase.getSRG("field_78041_r");

	/**
	 * <p>
	 * Name: setNoScrollbar
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/creativetab/CreativeTabs;]
	 * </p>
	 */
	public static McObfPair func_78022_j = McMappingDatabase.getSRG("CreativeTabs.func_78022_j");

	/**
	 * <p>
	 * Name: BUILDING_BLOCKS
	 * </p>
	 */
	public static McObfPair field_78030_b = McMappingDatabase.getSRG("field_78030_b");

	/**
	 * <p>
	 * Name: getTabIndex
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_78021_a = McMappingDatabase.getSRG("CreativeTabs.func_78021_a");

	/**
	 * <p>
	 * Name: REDSTONE
	 * </p>
	 */
	public static McObfPair field_78028_d = McMappingDatabase.getSRG("field_78028_d");

	/**
	 * <p>
	 * Name: shouldHidePlayerInventory
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_78017_i = McMappingDatabase.getSRG("CreativeTabs.func_78017_i");

	/**
	 * <p>
	 * Name: setBackgroundImageName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/creativetab/CreativeTabs;]
	 * </p>
	 */
	public static McObfPair func_78025_a = McMappingDatabase.getSRG("CreativeTabs.func_78025_a");

	/**
	 * <p>
	 * Name: drawInForegroundOfTab
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_78019_g = McMappingDatabase.getSRG("CreativeTabs.func_78019_g");

	/**
	 * <p>
	 * Name: COMBAT
	 * </p>
	 */
	public static McObfPair field_78037_j = McMappingDatabase.getSRG("field_78037_j");

	/**
	 * <p>
	 * Name: MISC
	 * </p>
	 */
	public static McObfPair field_78026_f = McMappingDatabase.getSRG("field_78026_f");

	/**
	 * <p>
	 * Name: setRelevantEnchantmentTypes
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/enchantment/EnumEnchantmentType;)Lnet/minecraft/creativetab/CreativeTabs;]
	 * </p>
	 */
	public static McObfPair func_111229_a = McMappingDatabase.getSRG("CreativeTabs.func_111229_a");

	/**
	 * <p>
	 * Name: tabIndex
	 * </p>
	 */
	public static McObfPair field_78033_n = McMappingDatabase.getSRG("field_78033_n");

	/**
	 * <p>
	 * Name: enchantmentTypes
	 * </p>
	 */
	public static McObfPair field_111230_s = McMappingDatabase.getSRG("field_111230_s");

	/**
	 * <p>
	 * Name: displayAllRelevantItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_78018_a = McMappingDatabase.getSRG("CreativeTabs.func_78018_a");

	/**
	 * <p>
	 * Name: getIconItemStack
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_151244_d = McMappingDatabase.getSRG("CreativeTabs.func_151244_d");

	/**
	 * <p>
	 * Name: TRANSPORTATION
	 * </p>
	 */
	public static McObfPair field_78029_e = McMappingDatabase.getSRG("field_78029_e");

	/**
	 * <p>
	 * Name: MATERIALS
	 * </p>
	 */
	public static McObfPair field_78035_l = McMappingDatabase.getSRG("field_78035_l");

	/**
	 * <p>
	 * Name: getTabIconItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_78016_d = McMappingDatabase.getSRG("CreativeTabs.func_78016_d");

	/**
	 * <p>
	 * Name: HOTBAR
	 * </p>
	 */
	public static McObfPair field_192395_m = McMappingDatabase.getSRG("field_192395_m");

	/**
	 * <p>
	 * Name: TOOLS
	 * </p>
	 */
	public static McObfPair field_78040_i = McMappingDatabase.getSRG("field_78040_i");

	/**
	 * <p>
	 * Name: getTabLabel
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_78013_b = McMappingDatabase.getSRG("CreativeTabs.func_78013_b");

	/**
	 * <p>
	 * Name: DECORATIONS
	 * </p>
	 */
	public static McObfPair field_78031_c = McMappingDatabase.getSRG("field_78031_c");

	/**
	 * <p>
	 * Name: FOOD
	 * </p>
	 */
	public static McObfPair field_78039_h = McMappingDatabase.getSRG("field_78039_h");

	/**
	 * <p>
	 * Name: getBackgroundImageName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_78015_f = McMappingDatabase.getSRG("CreativeTabs.func_78015_f");

	/**
	 * <p>
	 * Name: getTranslatedTabLabel
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_78024_c = McMappingDatabase.getSRG("CreativeTabs.func_78024_c");

	/**
	 * <p>
	 * Name: CREATIVE_TAB_ARRAY
	 * </p>
	 */
	public static McObfPair field_78032_a = McMappingDatabase.getSRG("field_78032_a");

	/**
	 * <p>
	 * Name: BREWING
	 * </p>
	 */
	public static McObfPair field_78038_k = McMappingDatabase.getSRG("field_78038_k");

	/**
	 * <p>
	 * Name: backgroundTexture
	 * </p>
	 */
	public static McObfPair field_78043_p = McMappingDatabase.getSRG("field_78043_p");

	/**
	 * <p>
	 * Name: INVENTORY
	 * </p>
	 */
	public static McObfPair field_78036_m = McMappingDatabase.getSRG("field_78036_m");

	/**
	 * <p>
	 * Name: tabLabel
	 * </p>
	 */
	public static McObfPair field_78034_o = McMappingDatabase.getSRG("field_78034_o");

	/**
	 * <p>
	 * Name: getRelevantEnchantmentTypes
	 * </p>
	 * <p>
	 * Desc: [()[Lnet/minecraft/enchantment/EnumEnchantmentType;]
	 * </p>
	 */
	public static McObfPair func_111225_m = McMappingDatabase.getSRG("CreativeTabs.func_111225_m");

	/**
	 * <p>
	 * Name: hasScrollbar
	 * </p>
	 */
	public static McObfPair field_78042_q = McMappingDatabase.getSRG("field_78042_q");

	/**
	 * <p>
	 * Name: setNoTitle
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/creativetab/CreativeTabs;]
	 * </p>
	 */
	public static McObfPair func_78014_h = McMappingDatabase.getSRG("CreativeTabs.func_78014_h");

	/**
	 * <p>
	 * Name: getTabColumn
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_78020_k = McMappingDatabase.getSRG("CreativeTabs.func_78020_k");

}

package zdoctor.zcoremod.map.minecraft.potion;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PotionHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akh";
		else
			return "net/minecraft/potion/PotionHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akh";
		else
			return "PotionHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lakh;";
		else
			return "Lnet/minecraft/potion/PotionHelper;";
	}

	/**
	 * <p>
	 * Name: POTION_TYPE_CONVERSIONS
	 * </p>
	 */
	public static McObfPair field_185213_a = McMappingDatabase.getSRG("field_185213_a");

	/**
	 * <p>
	 * Name: IS_POTION_ITEM
	 * </p>
	 */
	public static McObfPair field_185216_d = McMappingDatabase.getSRG("field_185216_d");

	/**
	 * <p>
	 * Name: isReagent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_185205_a = McMappingDatabase.getSRG("PotionHelper.func_185205_a");

	/**
	 * <p>
	 * Name: addContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemPotion;)V]
	 * </p>
	 */
	public static McObfPair func_193354_a = McMappingDatabase.getSRG("PotionHelper.func_193354_a");

	/**
	 * <p>
	 * Name: POTION_ITEMS
	 * </p>
	 */
	public static McObfPair field_185215_c = McMappingDatabase.getSRG("field_185215_c");

	/**
	 * <p>
	 * Name: hasTypeConversions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_185209_c = McMappingDatabase.getSRG("PotionHelper.func_185209_c");

	/**
	 * <p>
	 * Name: addMix
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionType;Lnet/minecraft/item/Item;Lnet/minecraft/potion/PotionType;)V]
	 * </p>
	 */
	public static McObfPair func_193357_a = McMappingDatabase.getSRG("PotionHelper.func_193357_a");

	/**
	 * <p>
	 * Name: hasItemConversions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_185206_b = McMappingDatabase.getSRG("PotionHelper.func_185206_b");

	/**
	 * <p>
	 * Name: addContainerRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemPotion;Lnet/minecraft/item/Item;Lnet/minecraft/item/ItemPotion;)V]
	 * </p>
	 */
	public static McObfPair func_193355_a = McMappingDatabase.getSRG("PotionHelper.func_193355_a");

	/**
	 * <p>
	 * Name: isItemConversionReagent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_185203_b = McMappingDatabase.getSRG("PotionHelper.func_185203_b");

	/**
	 * <p>
	 * Name: isTypeConversionReagent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_185211_c = McMappingDatabase.getSRG("PotionHelper.func_185211_c");

	/**
	 * <p>
	 * Name: POTION_ITEM_CONVERSIONS
	 * </p>
	 */
	public static McObfPair field_185214_b = McMappingDatabase.getSRG("field_185214_b");

	/**
	 * <p>
	 * Name: hasConversions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_185208_a = McMappingDatabase.getSRG("PotionHelper.func_185208_a");

	/**
	 * <p>
	 * Name: addMix
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionType;Lnet/minecraft/item/crafting/Ingredient;Lnet/minecraft/potion/PotionType;)V]
	 * </p>
	 */
	public static McObfPair func_193356_a = McMappingDatabase.getSRG("PotionHelper.func_193356_a");

	/**
	 * <p>
	 * Name: doReaction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_185212_d = McMappingDatabase.getSRG("PotionHelper.func_185212_d");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_185207_a = McMappingDatabase.getSRG("PotionHelper.func_185207_a");

}

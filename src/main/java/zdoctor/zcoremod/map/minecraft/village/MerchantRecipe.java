package zdoctor.zcoremod.map.minecraft.village;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MerchantRecipe {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amg";
		else
			return "net/minecraft/village/MerchantRecipe";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amg";
		else
			return "MerchantRecipe";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamg;";
		else
			return "Lnet/minecraft/village/MerchantRecipe;";
	}

	/**
	 * <p>
	 * Name: maxTradeUses
	 * </p>
	 */
	public static McObfPair field_82786_e = McMappingDatabase.getSRG("field_82786_e");

	/**
	 * <p>
	 * Name: incrementToolUses
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_77399_f = McMappingDatabase.getSRG("MerchantRecipe.func_77399_f");

	/**
	 * <p>
	 * Name: secondItemToBuy
	 * </p>
	 */
	public static McObfPair field_77401_b = McMappingDatabase.getSRG("field_77401_b");

	/**
	 * <p>
	 * Name: isRecipeDisabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82784_g = McMappingDatabase.getSRG("MerchantRecipe.func_82784_g");

	/**
	 * <p>
	 * Name: readFromTags
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_77390_a = McMappingDatabase.getSRG("MerchantRecipe.func_77390_a");

	/**
	 * <p>
	 * Name: itemToBuy
	 * </p>
	 */
	public static McObfPair field_77403_a = McMappingDatabase.getSRG("field_77403_a");

	/**
	 * <p>
	 * Name: getSecondItemToBuy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77396_b = McMappingDatabase.getSRG("MerchantRecipe.func_77396_b");

	/**
	 * <p>
	 * Name: writeToTags
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_77395_g = McMappingDatabase.getSRG("MerchantRecipe.func_77395_g");

	/**
	 * <p>
	 * Name: getToolUses
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_180321_e = McMappingDatabase.getSRG("MerchantRecipe.func_180321_e");

	/**
	 * <p>
	 * Name: rewardsExp
	 * </p>
	 */
	public static McObfPair field_180323_f = McMappingDatabase.getSRG("field_180323_f");

	/**
	 * <p>
	 * Name: getRewardsExp
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_180322_j = McMappingDatabase.getSRG("MerchantRecipe.func_180322_j");

	/**
	 * <p>
	 * Name: itemToSell
	 * </p>
	 */
	public static McObfPair field_77402_c = McMappingDatabase.getSRG("field_77402_c");

	/**
	 * <p>
	 * Name: toolUses
	 * </p>
	 */
	public static McObfPair field_77400_d = McMappingDatabase.getSRG("field_77400_d");

	/**
	 * <p>
	 * Name: getMaxTradeUses
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_180320_f = McMappingDatabase.getSRG("MerchantRecipe.func_180320_f");

	/**
	 * <p>
	 * Name: hasSecondItemToBuy
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77398_c = McMappingDatabase.getSRG("MerchantRecipe.func_77398_c");

	/**
	 * <p>
	 * Name: compensateToolUses
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_82785_h = McMappingDatabase.getSRG("MerchantRecipe.func_82785_h");

	/**
	 * <p>
	 * Name: increaseMaxTradeUses
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_82783_a = McMappingDatabase.getSRG("MerchantRecipe.func_82783_a");

	/**
	 * <p>
	 * Name: getItemToBuy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77394_a = McMappingDatabase.getSRG("MerchantRecipe.func_77394_a");

	/**
	 * <p>
	 * Name: getItemToSell
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77397_d = McMappingDatabase.getSRG("MerchantRecipe.func_77397_d");

}

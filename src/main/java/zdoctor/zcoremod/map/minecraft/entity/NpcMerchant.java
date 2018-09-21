package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NpcMerchant {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adw";
		else
			return "net/minecraft/entity/NpcMerchant";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adw";
		else
			return "NpcMerchant";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladw;";
		else
			return "Lnet/minecraft/entity/NpcMerchant;";
	}

	/**
	 * <p>
	 * Name: getCustomer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/player/EntityPlayer;]
	 * </p>
	 */
	public static McObfPair func_70931_l_ = McMappingDatabase.getSRG("NpcMerchant.func_70931_l_");

	/**
	 * <p>
	 * Name: recipeList
	 * </p>
	 */
	public static McObfPair field_70936_c = McMappingDatabase.getSRG("field_70936_c");

	/**
	 * <p>
	 * Name: getRecipes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/village/MerchantRecipeList;]
	 * </p>
	 */
	public static McObfPair func_70934_b = McMappingDatabase.getSRG("NpcMerchant.func_70934_b");

	/**
	 * <p>
	 * Name: merchantInventory
	 * </p>
	 */
	public static McObfPair field_70937_a = McMappingDatabase.getSRG("field_70937_a");

	/**
	 * <p>
	 * Name: useRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/village/MerchantRecipe;)V]
	 * </p>
	 */
	public static McObfPair func_70933_a = McMappingDatabase.getSRG("NpcMerchant.func_70933_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_175548_d = McMappingDatabase.getSRG("field_175548_d");

	/**
	 * <p>
	 * Name: setCustomer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_70932_a_ = McMappingDatabase.getSRG("NpcMerchant.func_70932_a_");

	/**
	 * <p>
	 * Name: customer
	 * </p>
	 */
	public static McObfPair field_70935_b = McMappingDatabase.getSRG("field_70935_b");

	/**
	 * <p>
	 * Name: getPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_190671_u_ = McMappingDatabase.getSRG("NpcMerchant.func_190671_u_");

	/**
	 * <p>
	 * Name: getWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_190670_t_ = McMappingDatabase.getSRG("NpcMerchant.func_190670_t_");

	/**
	 * <p>
	 * Name: verifySellingItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_110297_a_ = McMappingDatabase.getSRG("NpcMerchant.func_110297_a_");

	/**
	 * <p>
	 * Name: setRecipes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/village/MerchantRecipeList;)V]
	 * </p>
	 */
	public static McObfPair func_70930_a = McMappingDatabase.getSRG("NpcMerchant.func_70930_a");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("NpcMerchant.func_145748_c_");

}

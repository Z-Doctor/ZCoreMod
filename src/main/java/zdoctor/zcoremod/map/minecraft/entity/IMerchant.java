package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IMerchant {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amf";
		else
			return "net/minecraft/entity/IMerchant";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amf";
		else
			return "IMerchant";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamf;";
		else
			return "Lnet/minecraft/entity/IMerchant;";
	}

	/**
	 * <p>
	 * Name: getRecipes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/village/MerchantRecipeList;]
	 * </p>
	 */
	public static McObfPair func_70934_b = McMappingDatabase.getSRG("IMerchant.func_70934_b");

	/**
	 * <p>
	 * Name: getPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_190671_u_ = McMappingDatabase.getSRG("IMerchant.func_190671_u_");

	/**
	 * <p>
	 * Name: getCustomer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/player/EntityPlayer;]
	 * </p>
	 */
	public static McObfPair func_70931_l_ = McMappingDatabase.getSRG("IMerchant.func_70931_l_");

	/**
	 * <p>
	 * Name: setRecipes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/village/MerchantRecipeList;)V]
	 * </p>
	 */
	public static McObfPair func_70930_a = McMappingDatabase.getSRG("IMerchant.func_70930_a");

	/**
	 * <p>
	 * Name: verifySellingItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_110297_a_ = McMappingDatabase.getSRG("IMerchant.func_110297_a_");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("IMerchant.func_145748_c_");

	/**
	 * <p>
	 * Name: getWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_190670_t_ = McMappingDatabase.getSRG("IMerchant.func_190670_t_");

	/**
	 * <p>
	 * Name: useRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/village/MerchantRecipe;)V]
	 * </p>
	 */
	public static McObfPair func_70933_a = McMappingDatabase.getSRG("IMerchant.func_70933_a");

	/**
	 * <p>
	 * Name: setCustomer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_70932_a_ = McMappingDatabase.getSRG("IMerchant.func_70932_a_");

}

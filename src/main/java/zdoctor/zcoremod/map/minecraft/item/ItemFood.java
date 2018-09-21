package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemFood {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aij";
		else
			return "net/minecraft/item/ItemFood";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aij";
		else
			return "ItemFood";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laij;";
		else
			return "Lnet/minecraft/item/ItemFood;";
	}

	/**
	 * <p>
	 * Name: isWolfsFavoriteMeat
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77845_h = McMappingDatabase.getSRG("ItemFood.func_77845_h");

	/**
	 * <p>
	 * Name: saturationModifier
	 * </p>
	 */
	public static McObfPair field_77854_c = McMappingDatabase.getSRG("field_77854_c");

	/**
	 * <p>
	 * Name: isWolfsFavoriteMeat
	 * </p>
	 */
	public static McObfPair field_77856_bY = McMappingDatabase.getSRG("field_77856_bY");

	/**
	 * <p>
	 * Name: healAmount
	 * </p>
	 */
	public static McObfPair field_77853_b = McMappingDatabase.getSRG("field_77853_b");

	/**
	 * <p>
	 * Name: getItemUseAction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/EnumAction;]
	 * </p>
	 */
	public static McObfPair func_77661_b = McMappingDatabase.getSRG("ItemFood.func_77661_b");

	/**
	 * <p>
	 * Name: getSaturationModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)F]
	 * </p>
	 */
	public static McObfPair func_150906_h = McMappingDatabase.getSRG("ItemFood.func_150906_h");

	/**
	 * <p>
	 * Name: getHealAmount
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_150905_g = McMappingDatabase.getSRG("ItemFood.func_150905_g");

	/**
	 * <p>
	 * Name: potionId
	 * </p>
	 */
	public static McObfPair field_77851_ca = McMappingDatabase.getSRG("field_77851_ca");

	/**
	 * <p>
	 * Name: setAlwaysEdible
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemFood;]
	 * </p>
	 */
	public static McObfPair func_77848_i = McMappingDatabase.getSRG("ItemFood.func_77848_i");

	/**
	 * <p>
	 * Name: itemUseDuration
	 * </p>
	 */
	public static McObfPair field_77855_a = McMappingDatabase.getSRG("field_77855_a");

	/**
	 * <p>
	 * Name: getMaxItemUseDuration
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_77626_a = McMappingDatabase.getSRG("ItemFood.func_77626_a");

	/**
	 * <p>
	 * Name: setPotionEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;F)Lnet/minecraft/item/ItemFood;]
	 * </p>
	 */
	public static McObfPair func_185070_a = McMappingDatabase.getSRG("ItemFood.func_185070_a");

	/**
	 * <p>
	 * Name: onItemUseFinish
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77654_b = McMappingDatabase.getSRG("ItemFood.func_77654_b");

	/**
	 * <p>
	 * Name: potionEffectProbability
	 * </p>
	 */
	public static McObfPair field_77858_cd = McMappingDatabase.getSRG("field_77858_cd");

	/**
	 * <p>
	 * Name: alwaysEdible
	 * </p>
	 */
	public static McObfPair field_77852_bZ = McMappingDatabase.getSRG("field_77852_bZ");

	/**
	 * <p>
	 * Name: onItemRightClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;]
	 * </p>
	 */
	public static McObfPair func_77659_a = McMappingDatabase.getSRG("ItemFood.func_77659_a");

	/**
	 * <p>
	 * Name: onFoodEaten
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_77849_c = McMappingDatabase.getSRG("ItemFood.func_77849_c");

}

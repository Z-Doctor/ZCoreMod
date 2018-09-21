package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemBow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahg";
		else
			return "net/minecraft/item/ItemBow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahg";
		else
			return "ItemBow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lahg;";
		else
			return "Lnet/minecraft/item/ItemBow;";
	}

	/**
	 * <p>
	 * Name: getMaxItemUseDuration
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_77626_a = McMappingDatabase.getSRG("ItemBow.func_77626_a");

	/**
	 * <p>
	 * Name: getArrowVelocity
	 * </p>
	 * <p>
	 * Desc: [(I)F]
	 * </p>
	 */
	public static McObfPair func_185059_b = McMappingDatabase.getSRG("ItemBow.func_185059_b");

	/**
	 * <p>
	 * Name: getItemEnchantability
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77619_b = McMappingDatabase.getSRG("ItemBow.func_77619_b");

	/**
	 * <p>
	 * Name: onPlayerStoppedUsing
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;I)V]
	 * </p>
	 */
	public static McObfPair func_77615_a = McMappingDatabase.getSRG("ItemBow.func_77615_a");

	/**
	 * <p>
	 * Name: isArrow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_185058_h_ = McMappingDatabase.getSRG("ItemBow.func_185058_h_");

	/**
	 * <p>
	 * Name: getItemUseAction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/EnumAction;]
	 * </p>
	 */
	public static McObfPair func_77661_b = McMappingDatabase.getSRG("ItemBow.func_77661_b");

	/**
	 * <p>
	 * Name: onItemRightClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;]
	 * </p>
	 */
	public static McObfPair func_77659_a = McMappingDatabase.getSRG("ItemBow.func_77659_a");

	/**
	 * <p>
	 * Name: findAmmo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_185060_a = McMappingDatabase.getSRG("ItemBow.func_185060_a");

}

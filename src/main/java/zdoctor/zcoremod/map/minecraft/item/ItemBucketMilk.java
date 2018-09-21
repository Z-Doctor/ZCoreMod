package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemBucketMilk {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aix";
		else
			return "net/minecraft/item/ItemBucketMilk";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aix";
		else
			return "ItemBucketMilk";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laix;";
		else
			return "Lnet/minecraft/item/ItemBucketMilk;";
	}

	/**
	 * <p>
	 * Name: onItemRightClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;]
	 * </p>
	 */
	public static McObfPair func_77659_a = McMappingDatabase.getSRG("ItemBucketMilk.func_77659_a");

	/**
	 * <p>
	 * Name: getMaxItemUseDuration
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_77626_a = McMappingDatabase.getSRG("ItemBucketMilk.func_77626_a");

	/**
	 * <p>
	 * Name: getItemUseAction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/EnumAction;]
	 * </p>
	 */
	public static McObfPair func_77661_b = McMappingDatabase.getSRG("ItemBucketMilk.func_77661_b");

	/**
	 * <p>
	 * Name: onItemUseFinish
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77654_b = McMappingDatabase.getSRG("ItemBucketMilk.func_77654_b");

}

package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemExpBottle {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aic";
		else
			return "net/minecraft/item/ItemExpBottle";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aic";
		else
			return "ItemExpBottle";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laic;";
		else
			return "Lnet/minecraft/item/ItemExpBottle;";
	}

	/**
	 * <p>
	 * Name: onItemRightClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;]
	 * </p>
	 */
	public static McObfPair func_77659_a = McMappingDatabase.getSRG("ItemExpBottle.func_77659_a");

	/**
	 * <p>
	 * Name: hasEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_77636_d = McMappingDatabase.getSRG("ItemExpBottle.func_77636_d");

}

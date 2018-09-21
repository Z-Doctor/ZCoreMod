package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemSplashPotion {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajx";
		else
			return "net/minecraft/item/ItemSplashPotion";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajx";
		else
			return "ItemSplashPotion";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lajx;";
		else
			return "Lnet/minecraft/item/ItemSplashPotion;";
	}

	/**
	 * <p>
	 * Name: onItemRightClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;]
	 * </p>
	 */
	public static McObfPair func_77659_a = McMappingDatabase.getSRG("ItemSplashPotion.func_77659_a");

	/**
	 * <p>
	 * Name: getItemStackDisplayName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77653_i = McMappingDatabase.getSRG("ItemSplashPotion.func_77653_i");

}

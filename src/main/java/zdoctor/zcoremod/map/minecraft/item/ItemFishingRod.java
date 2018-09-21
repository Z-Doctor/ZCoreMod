package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemFishingRod {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aih";
		else
			return "net/minecraft/item/ItemFishingRod";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aih";
		else
			return "ItemFishingRod";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laih;";
		else
			return "Lnet/minecraft/item/ItemFishingRod;";
	}

	/**
	 * <p>
	 * Name: isFull3D
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77662_d = McMappingDatabase.getSRG("ItemFishingRod.func_77662_d");

	/**
	 * <p>
	 * Name: getItemEnchantability
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77619_b = McMappingDatabase.getSRG("ItemFishingRod.func_77619_b");

	/**
	 * <p>
	 * Name: shouldRotateAroundWhenRendering
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77629_n_ = McMappingDatabase.getSRG("ItemFishingRod.func_77629_n_");

	/**
	 * <p>
	 * Name: onItemRightClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;]
	 * </p>
	 */
	public static McObfPair func_77659_a = McMappingDatabase.getSRG("ItemFishingRod.func_77659_a");

}

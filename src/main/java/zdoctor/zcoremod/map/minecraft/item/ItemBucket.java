package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemBucket {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahi";
		else
			return "net/minecraft/item/ItemBucket";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahi";
		else
			return "ItemBucket";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lahi;";
		else
			return "Lnet/minecraft/item/ItemBucket;";
	}

	/**
	 * <p>
	 * Name: containedBlock
	 * </p>
	 */
	public static McObfPair field_77876_a = McMappingDatabase.getSRG("field_77876_a");

	/**
	 * <p>
	 * Name: onItemRightClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;]
	 * </p>
	 */
	public static McObfPair func_77659_a = McMappingDatabase.getSRG("ItemBucket.func_77659_a");

	/**
	 * <p>
	 * Name: fillBucket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/Item;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_150910_a = McMappingDatabase.getSRG("ItemBucket.func_150910_a");

	/**
	 * <p>
	 * Name: tryPlaceContainedLiquid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180616_a = McMappingDatabase.getSRG("ItemBucket.func_180616_a");

}

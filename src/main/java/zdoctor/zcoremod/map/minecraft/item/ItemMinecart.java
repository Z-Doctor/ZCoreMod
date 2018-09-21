package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemMinecart {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aiy";
		else
			return "net/minecraft/item/ItemMinecart";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aiy";
		else
			return "ItemMinecart";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laiy;";
		else
			return "Lnet/minecraft/item/ItemMinecart;";
	}

	/**
	 * <p>
	 * Name: minecartType
	 * </p>
	 */
	public static McObfPair field_77841_a = McMappingDatabase.getSRG("field_77841_a");

	/**
	 * <p>
	 * Name: onItemUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_180614_a = McMappingDatabase.getSRG("ItemMinecart.func_180614_a");

	/**
	 * <p>
	 * Name: MINECART_DISPENSER_BEHAVIOR
	 * </p>
	 */
	public static McObfPair field_96602_b = McMappingDatabase.getSRG("field_96602_b");

}

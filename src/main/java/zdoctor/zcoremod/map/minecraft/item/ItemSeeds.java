package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemSeeds {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajj";
		else
			return "net/minecraft/item/ItemSeeds";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajj";
		else
			return "ItemSeeds";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lajj;";
		else
			return "Lnet/minecraft/item/ItemSeeds;";
	}

	/**
	 * <p>
	 * Name: soilBlockID
	 * </p>
	 */
	public static McObfPair field_77838_b = McMappingDatabase.getSRG("field_77838_b");

	/**
	 * <p>
	 * Name: crops
	 * </p>
	 */
	public static McObfPair field_150925_a = McMappingDatabase.getSRG("field_150925_a");

	/**
	 * <p>
	 * Name: onItemUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_180614_a = McMappingDatabase.getSRG("ItemSeeds.func_180614_a");

}

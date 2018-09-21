package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemSeedFood {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aji";
		else
			return "net/minecraft/item/ItemSeedFood";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aji";
		else
			return "ItemSeedFood";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laji;";
		else
			return "Lnet/minecraft/item/ItemSeedFood;";
	}

	/**
	 * <p>
	 * Name: crops
	 * </p>
	 */
	public static McObfPair field_150908_b = McMappingDatabase.getSRG("field_150908_b");

	/**
	 * <p>
	 * Name: onItemUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_180614_a = McMappingDatabase.getSRG("ItemSeedFood.func_180614_a");

	/**
	 * <p>
	 * Name: soilId
	 * </p>
	 */
	public static McObfPair field_82809_c = McMappingDatabase.getSRG("field_82809_c");

}

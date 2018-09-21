package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityVillager$ItemAndEmeraldToItem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady$d";
		else
			return "net/minecraft/entity/passive/EntityVillager$ItemAndEmeraldToItem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady$d";
		else
			return "EntityVillager$ItemAndEmeraldToItem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lady$d;";
		else
			return "Lnet/minecraft/entity/passive/EntityVillager$ItemAndEmeraldToItem;";
	}

	/**
	 * <p>
	 * Name: buyingItemStack
	 * </p>
	 */
	public static McObfPair field_179411_a = McMappingDatabase.getSRG("field_179411_a");

	/**
	 * <p>
	 * Name: addMerchantRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/IMerchant;Lnet/minecraft/village/MerchantRecipeList;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_190888_a = McMappingDatabase.getSRG("EntityVillager$ItemAndEmeraldToItem.func_190888_a");

	/**
	 * <p>
	 * Name: sellingPriceInfo
	 * </p>
	 */
	public static McObfPair field_179408_d = McMappingDatabase.getSRG("field_179408_d");

	/**
	 * <p>
	 * Name: sellingItemstack
	 * </p>
	 */
	public static McObfPair field_179410_c = McMappingDatabase.getSRG("field_179410_c");

	/**
	 * <p>
	 * Name: buyingPriceInfo
	 * </p>
	 */
	public static McObfPair field_179409_b = McMappingDatabase.getSRG("field_179409_b");

}

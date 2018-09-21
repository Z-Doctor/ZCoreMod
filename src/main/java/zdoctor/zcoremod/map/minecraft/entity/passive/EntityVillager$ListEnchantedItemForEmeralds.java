package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityVillager$ListEnchantedItemForEmeralds {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady$c";
		else
			return "net/minecraft/entity/passive/EntityVillager$ListEnchantedItemForEmeralds";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady$c";
		else
			return "EntityVillager$ListEnchantedItemForEmeralds";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lady$c;";
		else
			return "Lnet/minecraft/entity/passive/EntityVillager$ListEnchantedItemForEmeralds;";
	}

	/**
	 * <p>
	 * Name: priceInfo
	 * </p>
	 */
	public static McObfPair field_179406_b = McMappingDatabase.getSRG("field_179406_b");

	/**
	 * <p>
	 * Name: addMerchantRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/IMerchant;Lnet/minecraft/village/MerchantRecipeList;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_190888_a = McMappingDatabase.getSRG("EntityVillager$ListEnchantedItemForEmeralds.func_190888_a");

	/**
	 * <p>
	 * Name: enchantedItemStack
	 * </p>
	 */
	public static McObfPair field_179407_a = McMappingDatabase.getSRG("field_179407_a");

}

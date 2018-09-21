package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityVillager$EmeraldForItems {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady$a";
		else
			return "net/minecraft/entity/passive/EntityVillager$EmeraldForItems";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady$a";
		else
			return "EntityVillager$EmeraldForItems";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lady$a;";
		else
			return "Lnet/minecraft/entity/passive/EntityVillager$EmeraldForItems;";
	}

	/**
	 * <p>
	 * Name: buyingItem
	 * </p>
	 */
	public static McObfPair field_179405_a = McMappingDatabase.getSRG("field_179405_a");

	/**
	 * <p>
	 * Name: price
	 * </p>
	 */
	public static McObfPair field_179404_b = McMappingDatabase.getSRG("field_179404_b");

	/**
	 * <p>
	 * Name: addMerchantRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/IMerchant;Lnet/minecraft/village/MerchantRecipeList;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_190888_a = McMappingDatabase.getSRG("EntityVillager$EmeraldForItems.func_190888_a");

}

package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityVillager$ListEnchantedBookForEmeralds {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady$b";
		else
			return "net/minecraft/entity/passive/EntityVillager$ListEnchantedBookForEmeralds";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady$b";
		else
			return "EntityVillager$ListEnchantedBookForEmeralds";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lady$b;";
		else
			return "Lnet/minecraft/entity/passive/EntityVillager$ListEnchantedBookForEmeralds;";
	}

	/**
	 * <p>
	 * Name: addMerchantRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/IMerchant;Lnet/minecraft/village/MerchantRecipeList;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_190888_a = McMappingDatabase.getSRG("EntityVillager$ListEnchantedBookForEmeralds.func_190888_a");

}

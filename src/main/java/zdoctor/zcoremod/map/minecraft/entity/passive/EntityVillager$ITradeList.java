package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityVillager$ITradeList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady$f";
		else
			return "net/minecraft/entity/passive/EntityVillager$ITradeList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady$f";
		else
			return "EntityVillager$ITradeList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lady$f;";
		else
			return "Lnet/minecraft/entity/passive/EntityVillager$ITradeList;";
	}

	/**
	 * <p>
	 * Name: addMerchantRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/IMerchant;Lnet/minecraft/village/MerchantRecipeList;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_190888_a = McMappingDatabase.getSRG("EntityVillager$ITradeList.func_190888_a");

}

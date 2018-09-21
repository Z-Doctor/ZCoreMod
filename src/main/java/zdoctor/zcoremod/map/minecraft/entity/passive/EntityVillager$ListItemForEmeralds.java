package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityVillager$ListItemForEmeralds {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady$e";
		else
			return "net/minecraft/entity/passive/EntityVillager$ListItemForEmeralds";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady$e";
		else
			return "EntityVillager$ListItemForEmeralds";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lady$e;";
		else
			return "Lnet/minecraft/entity/passive/EntityVillager$ListItemForEmeralds;";
	}

	/**
	 * <p>
	 * Name: itemToBuy
	 * </p>
	 */
	public static McObfPair field_179403_a = McMappingDatabase.getSRG("field_179403_a");

	/**
	 * <p>
	 * Name: priceInfo
	 * </p>
	 */
	public static McObfPair field_179402_b = McMappingDatabase.getSRG("field_179402_b");

	/**
	 * <p>
	 * Name: addMerchantRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/IMerchant;Lnet/minecraft/village/MerchantRecipeList;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_190888_a = McMappingDatabase.getSRG("EntityVillager$ListItemForEmeralds.func_190888_a");

}

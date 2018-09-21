package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityVillager$TreasureMapForEmeralds {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady$h";
		else
			return "net/minecraft/entity/passive/EntityVillager$TreasureMapForEmeralds";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady$h";
		else
			return "EntityVillager$TreasureMapForEmeralds";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lady$h;";
		else
			return "Lnet/minecraft/entity/passive/EntityVillager$TreasureMapForEmeralds;";
	}

	/**
	 * <p>
	 * Name: destination
	 * </p>
	 */
	public static McObfPair field_190890_b = McMappingDatabase.getSRG("field_190890_b");

	/**
	 * <p>
	 * Name: value
	 * </p>
	 */
	public static McObfPair field_190889_a = McMappingDatabase.getSRG("field_190889_a");

	/**
	 * <p>
	 * Name: destinationType
	 * </p>
	 */
	public static McObfPair field_190891_c = McMappingDatabase.getSRG("field_190891_c");

	/**
	 * <p>
	 * Name: addMerchantRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/IMerchant;Lnet/minecraft/village/MerchantRecipeList;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_190888_a = McMappingDatabase.getSRG("EntityVillager$TreasureMapForEmeralds.func_190888_a");

}

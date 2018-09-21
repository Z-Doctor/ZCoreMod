package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemPredicate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "an";
		else
			return "net/minecraft/advancements/critereon/ItemPredicate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "an";
		else
			return "ItemPredicate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lan;";
		else
			return "Lnet/minecraft/advancements/critereon/ItemPredicate;";
	}

	/**
	 * <p>
	 * Name: potion
	 * </p>
	 */
	public static McObfPair field_192500_f = McMappingDatabase.getSRG("field_192500_f");

	/**
	 * <p>
	 * Name: ANY
	 * </p>
	 */
	public static McObfPair field_192495_a = McMappingDatabase.getSRG("field_192495_a");

	/**
	 * <p>
	 * Name: count
	 * </p>
	 */
	public static McObfPair field_192498_d = McMappingDatabase.getSRG("field_192498_d");

	/**
	 * <p>
	 * Name: item
	 * </p>
	 */
	public static McObfPair field_192496_b = McMappingDatabase.getSRG("field_192496_b");

	/**
	 * <p>
	 * Name: durability
	 * </p>
	 */
	public static McObfPair field_193444_e = McMappingDatabase.getSRG("field_193444_e");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_192493_a = McMappingDatabase.getSRG("ItemPredicate.func_192493_a");

	/**
	 * <p>
	 * Name: enchantments
	 * </p>
	 */
	public static McObfPair field_192499_e = McMappingDatabase.getSRG("field_192499_e");

	/**
	 * <p>
	 * Name: nbt
	 * </p>
	 */
	public static McObfPair field_193445_h = McMappingDatabase.getSRG("field_193445_h");

	/**
	 * <p>
	 * Name: deserializeArray
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)[Lnet/minecraft/advancements/critereon/ItemPredicate;]
	 * </p>
	 */
	public static McObfPair func_192494_b = McMappingDatabase.getSRG("ItemPredicate.func_192494_b");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)Lnet/minecraft/advancements/critereon/ItemPredicate;]
	 * </p>
	 */
	public static McObfPair func_192492_a = McMappingDatabase.getSRG("ItemPredicate.func_192492_a");

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_192497_c = McMappingDatabase.getSRG("field_192497_c");

}

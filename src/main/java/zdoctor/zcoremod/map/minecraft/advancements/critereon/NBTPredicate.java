package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NBTPredicate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "au";
		else
			return "net/minecraft/advancements/critereon/NBTPredicate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "au";
		else
			return "NBTPredicate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lau;";
		else
			return "Lnet/minecraft/advancements/critereon/NBTPredicate;";
	}

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_193478_a = McMappingDatabase.getSRG("NBTPredicate.func_193478_a");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)Lnet/minecraft/advancements/critereon/NBTPredicate;]
	 * </p>
	 */
	public static McObfPair func_193476_a = McMappingDatabase.getSRG("NBTPredicate.func_193476_a");

	/**
	 * <p>
	 * Name: ANY
	 * </p>
	 */
	public static McObfPair field_193479_a = McMappingDatabase.getSRG("field_193479_a");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_193475_a = McMappingDatabase.getSRG("NBTPredicate.func_193475_a");

	/**
	 * <p>
	 * Name: tag
	 * </p>
	 */
	public static McObfPair field_193480_b = McMappingDatabase.getSRG("field_193480_b");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTBase;)Z]
	 * </p>
	 */
	public static McObfPair func_193477_a = McMappingDatabase.getSRG("NBTPredicate.func_193477_a");

}

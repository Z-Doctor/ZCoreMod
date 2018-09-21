package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantedItemTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "af$b";
		else
			return "net/minecraft/advancements/critereon/EnchantedItemTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "af$b";
		else
			return "EnchantedItemTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laf$b;";
		else
			return "Lnet/minecraft/advancements/critereon/EnchantedItemTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;I)Z]
	 * </p>
	 */
	public static McObfPair func_192257_a = McMappingDatabase.getSRG("EnchantedItemTrigger$Instance.func_192257_a");

	/**
	 * <p>
	 * Name: levels
	 * </p>
	 */
	public static McObfPair field_192259_b = McMappingDatabase.getSRG("field_192259_b");

	/**
	 * <p>
	 * Name: item
	 * </p>
	 */
	public static McObfPair field_192258_a = McMappingDatabase.getSRG("field_192258_a");

}

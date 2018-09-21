package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemDurabilityTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "am$b";
		else
			return "net/minecraft/advancements/critereon/ItemDurabilityTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "am$b";
		else
			return "ItemDurabilityTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lam$b;";
		else
			return "Lnet/minecraft/advancements/critereon/ItemDurabilityTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: item
	 * </p>
	 */
	public static McObfPair field_193198_a = McMappingDatabase.getSRG("field_193198_a");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;I)Z]
	 * </p>
	 */
	public static McObfPair func_193197_a = McMappingDatabase.getSRG("ItemDurabilityTrigger$Instance.func_193197_a");

	/**
	 * <p>
	 * Name: durability
	 * </p>
	 */
	public static McObfPair field_193199_b = McMappingDatabase.getSRG("field_193199_b");

	/**
	 * <p>
	 * Name: delta
	 * </p>
	 */
	public static McObfPair field_193200_c = McMappingDatabase.getSRG("field_193200_c");

}

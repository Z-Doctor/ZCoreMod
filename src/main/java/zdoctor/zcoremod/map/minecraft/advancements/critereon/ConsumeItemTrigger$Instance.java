package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ConsumeItemTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "z$b";
		else
			return "net/minecraft/advancements/critereon/ConsumeItemTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "z$b";
		else
			return "ConsumeItemTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lz$b;";
		else
			return "Lnet/minecraft/advancements/critereon/ConsumeItemTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: item
	 * </p>
	 */
	public static McObfPair field_193194_a = McMappingDatabase.getSRG("field_193194_a");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_193193_a = McMappingDatabase.getSRG("ConsumeItemTrigger$Instance.func_193193_a");

}

package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class UsedTotemTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "be$b";
		else
			return "net/minecraft/advancements/critereon/UsedTotemTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "be$b";
		else
			return "UsedTotemTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbe$b;";
		else
			return "Lnet/minecraft/advancements/critereon/UsedTotemTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_193218_a = McMappingDatabase.getSRG("UsedTotemTrigger$Instance.func_193218_a");

	/**
	 * <p>
	 * Name: item
	 * </p>
	 */
	public static McObfPair field_193219_a = McMappingDatabase.getSRG("field_193219_a");

}

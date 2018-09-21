package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemSimpleFoiled {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajq";
		else
			return "net/minecraft/item/ItemSimpleFoiled";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajq";
		else
			return "ItemSimpleFoiled";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lajq;";
		else
			return "Lnet/minecraft/item/ItemSimpleFoiled;";
	}

	/**
	 * <p>
	 * Name: hasEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_77636_d = McMappingDatabase.getSRG("ItemSimpleFoiled.func_77636_d");

}

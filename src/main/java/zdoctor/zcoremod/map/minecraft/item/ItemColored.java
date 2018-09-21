package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemColored {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajz";
		else
			return "net/minecraft/item/ItemColored";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajz";
		else
			return "ItemColored";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lajz;";
		else
			return "Lnet/minecraft/item/ItemColored;";
	}

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77647_b = McMappingDatabase.getSRG("ItemColored.func_77647_b");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77667_c = McMappingDatabase.getSRG("ItemColored.func_77667_c");

	/**
	 * <p>
	 * Name: subtypeNames
	 * </p>
	 */
	public static McObfPair field_150945_c = McMappingDatabase.getSRG("field_150945_c");

	/**
	 * <p>
	 * Name: setSubtypeNames
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;)Lnet/minecraft/item/ItemColored;]
	 * </p>
	 */
	public static McObfPair func_150943_a = McMappingDatabase.getSRG("ItemColored.func_150943_a");

}

package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemCloth {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahu";
		else
			return "net/minecraft/item/ItemCloth";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahu";
		else
			return "ItemCloth";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lahu;";
		else
			return "Lnet/minecraft/item/ItemCloth;";
	}

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77667_c = McMappingDatabase.getSRG("ItemCloth.func_77667_c");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77647_b = McMappingDatabase.getSRG("ItemCloth.func_77647_b");

}

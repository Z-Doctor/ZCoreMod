package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemLeaves {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aiu";
		else
			return "net/minecraft/item/ItemLeaves";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aiu";
		else
			return "ItemLeaves";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laiu;";
		else
			return "Lnet/minecraft/item/ItemLeaves;";
	}

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77667_c = McMappingDatabase.getSRG("ItemLeaves.func_77667_c");

	/**
	 * <p>
	 * Name: leaves
	 * </p>
	 */
	public static McObfPair field_150940_b = McMappingDatabase.getSRG("field_150940_b");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77647_b = McMappingDatabase.getSRG("ItemLeaves.func_77647_b");

}

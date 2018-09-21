package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemMultiTexture {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aiz";
		else
			return "net/minecraft/item/ItemMultiTexture";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aiz";
		else
			return "ItemMultiTexture";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laiz;";
		else
			return "Lnet/minecraft/item/ItemMultiTexture;";
	}

	/**
	 * <p>
	 * Name: unused
	 * </p>
	 */
	public static McObfPair field_179227_b = McMappingDatabase.getSRG("field_179227_b");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77647_b = McMappingDatabase.getSRG("ItemMultiTexture.func_77647_b");

	/**
	 * <p>
	 * Name: nameFunction
	 * </p>
	 */
	public static McObfPair field_179228_c = McMappingDatabase.getSRG("field_179228_c");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77667_c = McMappingDatabase.getSRG("ItemMultiTexture.func_77667_c");

}

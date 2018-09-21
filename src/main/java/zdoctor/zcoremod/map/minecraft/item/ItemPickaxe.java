package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemPickaxe {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajb";
		else
			return "net/minecraft/item/ItemPickaxe";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajb";
		else
			return "ItemPickaxe";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lajb;";
		else
			return "Lnet/minecraft/item/ItemPickaxe;";
	}

	/**
	 * <p>
	 * Name: canHarvestBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_150897_b = McMappingDatabase.getSRG("ItemPickaxe.func_150897_b");

	/**
	 * <p>
	 * Name: getDestroySpeed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/state/IBlockState;)F]
	 * </p>
	 */
	public static McObfPair func_150893_a = McMappingDatabase.getSRG("ItemPickaxe.func_150893_a");

	/**
	 * <p>
	 * Name: EFFECTIVE_ON
	 * </p>
	 */
	public static McObfPair field_150915_c = McMappingDatabase.getSRG("field_150915_c");

}

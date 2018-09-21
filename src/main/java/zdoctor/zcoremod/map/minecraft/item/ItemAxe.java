package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemAxe {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agy";
		else
			return "net/minecraft/item/ItemAxe";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agy";
		else
			return "ItemAxe";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagy;";
		else
			return "Lnet/minecraft/item/ItemAxe;";
	}

	/**
	 * <p>
	 * Name: EFFECTIVE_ON
	 * </p>
	 */
	public static McObfPair field_150917_c = McMappingDatabase.getSRG("field_150917_c");

	/**
	 * <p>
	 * Name: ATTACK_SPEEDS
	 * </p>
	 */
	public static McObfPair field_185067_n = McMappingDatabase.getSRG("field_185067_n");

	/**
	 * <p>
	 * Name: getDestroySpeed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/state/IBlockState;)F]
	 * </p>
	 */
	public static McObfPair func_150893_a = McMappingDatabase.getSRG("ItemAxe.func_150893_a");

	/**
	 * <p>
	 * Name: ATTACK_DAMAGES
	 * </p>
	 */
	public static McObfPair field_185066_m = McMappingDatabase.getSRG("field_185066_m");

}

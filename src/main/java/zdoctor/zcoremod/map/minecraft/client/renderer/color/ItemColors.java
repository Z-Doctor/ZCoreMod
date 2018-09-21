package zdoctor.zcoremod.map.minecraft.client.renderer.color;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemColors {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bin";
		else
			return "net/minecraft/client/renderer/color/ItemColors";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bin";
		else
			return "ItemColors";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbin;";
		else
			return "Lnet/minecraft/client/renderer/color/ItemColors;";
	}

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/color/BlockColors;)Lnet/minecraft/client/renderer/color/ItemColors;]
	 * </p>
	 */
	public static McObfPair func_186729_a = McMappingDatabase.getSRG("ItemColors.func_186729_a");

	/**
	 * <p>
	 * Name: registerItemColorHandler
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/color/IItemColor;[Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_186731_a = McMappingDatabase.getSRG("ItemColors.func_186731_a");

	/**
	 * <p>
	 * Name: mapItemColors
	 * </p>
	 */
	public static McObfPair field_186732_a = McMappingDatabase.getSRG("field_186732_a");

	/**
	 * <p>
	 * Name: colorMultiplier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;I)I]
	 * </p>
	 */
	public static McObfPair func_186728_a = McMappingDatabase.getSRG("ItemColors.func_186728_a");

	/**
	 * <p>
	 * Name: registerItemColorHandler
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/color/IItemColor;[Lnet/minecraft/item/Item;)V]
	 * </p>
	 */
	public static McObfPair func_186730_a = McMappingDatabase.getSRG("ItemColors.func_186730_a");

}

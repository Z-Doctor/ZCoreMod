package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemMinecart$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aiy$1";
		else
			return "net/minecraft/item/ItemMinecart$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aiy$1";
		else
			return "ItemMinecart$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laiy$1;";
		else
			return "Lnet/minecraft/item/ItemMinecart$1;";
	}

	/**
	 * <p>
	 * Name: playDispenseSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/dispenser/IBlockSource;)V]
	 * </p>
	 */
	public static McObfPair func_82485_a = McMappingDatabase.getSRG("ItemMinecart$1.func_82485_a");

	/**
	 * <p>
	 * Name: dispenseStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/dispenser/IBlockSource;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82487_b = McMappingDatabase.getSRG("ItemMinecart$1.func_82487_b");

	/**
	 * <p>
	 * Name: behaviourDefaultDispenseItem
	 * </p>
	 */
	public static McObfPair field_96465_b = McMappingDatabase.getSRG("field_96465_b");

}

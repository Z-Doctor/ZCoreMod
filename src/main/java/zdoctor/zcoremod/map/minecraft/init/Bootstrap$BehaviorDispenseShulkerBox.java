package zdoctor.zcoremod.map.minecraft.init;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Bootstrap$BehaviorDispenseShulkerBox {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ni$c";
		else
			return "net/minecraft/init/Bootstrap$BehaviorDispenseShulkerBox";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ni$c";
		else
			return "Bootstrap$BehaviorDispenseShulkerBox";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lni$c;";
		else
			return "Lnet/minecraft/init/Bootstrap$BehaviorDispenseShulkerBox;";
	}

	/**
	 * <p>
	 * Name: dispenseStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/dispenser/IBlockSource;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82487_b = McMappingDatabase.getSRG("Bootstrap$BehaviorDispenseShulkerBox.func_82487_b");

}

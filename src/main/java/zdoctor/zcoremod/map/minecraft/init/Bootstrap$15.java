package zdoctor.zcoremod.map.minecraft.init;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Bootstrap$15 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ni$7";
		else
			return "net/minecraft/init/Bootstrap$15";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ni$7";
		else
			return "Bootstrap$15";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lni$7;";
		else
			return "Lnet/minecraft/init/Bootstrap$15;";
	}

	/**
	 * <p>
	 * Name: dispenseStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/dispenser/IBlockSource;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82487_b = McMappingDatabase.getSRG("Bootstrap$15.func_82487_b");

}

package zdoctor.zcoremod.map.minecraft.init;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Bootstrap$BehaviorDispenseBoat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ni$a";
		else
			return "net/minecraft/init/Bootstrap$BehaviorDispenseBoat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ni$a";
		else
			return "Bootstrap$BehaviorDispenseBoat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lni$a;";
		else
			return "Lnet/minecraft/init/Bootstrap$BehaviorDispenseBoat;";
	}

	/**
	 * <p>
	 * Name: playDispenseSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/dispenser/IBlockSource;)V]
	 * </p>
	 */
	public static McObfPair func_82485_a = McMappingDatabase.getSRG("Bootstrap$BehaviorDispenseBoat.func_82485_a");

	/**
	 * <p>
	 * Name: boatType
	 * </p>
	 */
	public static McObfPair field_185027_c = McMappingDatabase.getSRG("field_185027_c");

	/**
	 * <p>
	 * Name: dispenseStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/dispenser/IBlockSource;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82487_b = McMappingDatabase.getSRG("Bootstrap$BehaviorDispenseBoat.func_82487_b");

	/**
	 * <p>
	 * Name: dispenseBehavior
	 * </p>
	 */
	public static McObfPair field_185026_b = McMappingDatabase.getSRG("field_185026_b");

}

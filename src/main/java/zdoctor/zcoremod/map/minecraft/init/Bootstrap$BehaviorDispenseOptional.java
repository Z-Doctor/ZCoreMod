package zdoctor.zcoremod.map.minecraft.init;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Bootstrap$BehaviorDispenseOptional {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ni$b";
		else
			return "net/minecraft/init/Bootstrap$BehaviorDispenseOptional";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ni$b";
		else
			return "Bootstrap$BehaviorDispenseOptional";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lni$b;";
		else
			return "Lnet/minecraft/init/Bootstrap$BehaviorDispenseOptional;";
	}

	/**
	 * <p>
	 * Name: successful
	 * </p>
	 */
	public static McObfPair field_190911_b = McMappingDatabase.getSRG("field_190911_b");

	/**
	 * <p>
	 * Name: playDispenseSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/dispenser/IBlockSource;)V]
	 * </p>
	 */
	public static McObfPair func_82485_a = McMappingDatabase.getSRG("Bootstrap$BehaviorDispenseOptional.func_82485_a");

}

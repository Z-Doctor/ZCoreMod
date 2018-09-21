package zdoctor.zcoremod.map.minecraft.dispenser;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IBehaviorDispenseItem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fb";
		else
			return "net/minecraft/dispenser/IBehaviorDispenseItem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fb";
		else
			return "IBehaviorDispenseItem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfb;";
		else
			return "Lnet/minecraft/dispenser/IBehaviorDispenseItem;";
	}

	/**
	 * <p>
	 * Name: DEFAULT_BEHAVIOR
	 * </p>
	 */
	public static McObfPair field_82483_a = McMappingDatabase.getSRG("field_82483_a");

	/**
	 * <p>
	 * Name: dispense
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/dispenser/IBlockSource;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82482_a = McMappingDatabase.getSRG("IBehaviorDispenseItem.func_82482_a");

}

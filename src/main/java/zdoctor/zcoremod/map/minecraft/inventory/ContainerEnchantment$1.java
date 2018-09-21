package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerEnchantment$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agb$1";
		else
			return "net/minecraft/inventory/ContainerEnchantment$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agb$1";
		else
			return "ContainerEnchantment$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagb$1;";
		else
			return "Lnet/minecraft/inventory/ContainerEnchantment$1;";
	}

	/**
	 * <p>
	 * Name: markDirty
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70296_d = McMappingDatabase.getSRG("ContainerEnchantment$1.func_70296_d");

	/**
	 * <p>
	 * Name: getInventoryStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70297_j_ = McMappingDatabase.getSRG("ContainerEnchantment$1.func_70297_j_");

}

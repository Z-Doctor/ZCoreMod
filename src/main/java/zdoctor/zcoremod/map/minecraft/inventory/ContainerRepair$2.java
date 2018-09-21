package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerRepair$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afs$2";
		else
			return "net/minecraft/inventory/ContainerRepair$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afs$2";
		else
			return "ContainerRepair$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafs$2;";
		else
			return "Lnet/minecraft/inventory/ContainerRepair$2;";
	}

	/**
	 * <p>
	 * Name: onTake
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190901_a = McMappingDatabase.getSRG("ContainerRepair$2.func_190901_a");

	/**
	 * <p>
	 * Name: canTakeStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_82869_a = McMappingDatabase.getSRG("ContainerRepair$2.func_82869_a");

	/**
	 * <p>
	 * Name: isItemValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75214_a = McMappingDatabase.getSRG("ContainerRepair$2.func_75214_a");

}

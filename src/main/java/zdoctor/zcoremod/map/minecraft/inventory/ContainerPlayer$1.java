package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerPlayer$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agi$1";
		else
			return "net/minecraft/inventory/ContainerPlayer$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agi$1";
		else
			return "ContainerPlayer$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagi$1;";
		else
			return "Lnet/minecraft/inventory/ContainerPlayer$1;";
	}

	/**
	 * <p>
	 * Name: canTakeStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_82869_a = McMappingDatabase.getSRG("ContainerPlayer$1.func_82869_a");

	/**
	 * <p>
	 * Name: getSlotStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75219_a = McMappingDatabase.getSRG("ContainerPlayer$1.func_75219_a");

	/**
	 * <p>
	 * Name: isItemValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75214_a = McMappingDatabase.getSRG("ContainerPlayer$1.func_75214_a");

	/**
	 * <p>
	 * Name: getSlotTexture
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_178171_c = McMappingDatabase.getSRG("ContainerPlayer$1.func_178171_c");

}

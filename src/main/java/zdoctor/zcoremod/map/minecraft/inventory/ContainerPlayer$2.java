package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerPlayer$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agi$2";
		else
			return "net/minecraft/inventory/ContainerPlayer$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agi$2";
		else
			return "ContainerPlayer$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagi$2;";
		else
			return "Lnet/minecraft/inventory/ContainerPlayer$2;";
	}

	/**
	 * <p>
	 * Name: getSlotTexture
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_178171_c = McMappingDatabase.getSRG("ContainerPlayer$2.func_178171_c");

}

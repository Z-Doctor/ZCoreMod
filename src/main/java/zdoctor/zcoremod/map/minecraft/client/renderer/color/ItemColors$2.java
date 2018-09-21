package zdoctor.zcoremod.map.minecraft.client.renderer.color;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemColors$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bin$2";
		else
			return "net/minecraft/client/renderer/color/ItemColors$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bin$2";
		else
			return "ItemColors$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbin$2;";
		else
			return "Lnet/minecraft/client/renderer/color/ItemColors$2;";
	}

	/**
	 * <p>
	 * Name: colorMultiplier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;I)I]
	 * </p>
	 */
	public static McObfPair func_186726_a = McMappingDatabase.getSRG("ItemColors$2.func_186726_a");

}

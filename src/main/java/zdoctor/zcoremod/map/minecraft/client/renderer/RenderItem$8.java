package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderItem$8 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzw$9";
		else
			return "net/minecraft/client/renderer/RenderItem$8";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzw$9";
		else
			return "RenderItem$8";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzw$9;";
		else
			return "Lnet/minecraft/client/renderer/RenderItem$8;";
	}

	/**
	 * <p>
	 * Name: getModelLocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/client/renderer/block/model/ModelResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_178113_a = McMappingDatabase.getSRG("RenderItem$8.func_178113_a");

}

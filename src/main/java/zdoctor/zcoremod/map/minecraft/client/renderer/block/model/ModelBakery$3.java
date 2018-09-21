package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBakery$3 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgb$3";
		else
			return "net/minecraft/client/renderer/block/model/ModelBakery$3";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgb$3";
		else
			return "ModelBakery$3";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgb$3;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ModelBakery$3;";
	}

	/**
	 * <p>
	 * Name: registerSprites
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/TextureMap;)V]
	 * </p>
	 */
	public static McObfPair func_177059_a = McMappingDatabase.getSRG("ModelBakery$3.func_177059_a");

}

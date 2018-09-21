package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemCameraTransforms$TransformType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwc$b";
		else
			return "net/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwc$b";
		else
			return "ItemCameraTransforms$TransformType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwc$b;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;";
	}

}

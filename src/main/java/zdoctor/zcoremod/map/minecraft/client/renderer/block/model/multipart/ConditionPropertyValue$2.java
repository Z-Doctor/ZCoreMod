package zdoctor.zcoremod.map.minecraft.client.renderer.block.model.multipart;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ConditionPropertyValue$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwh$2";
		else
			return "net/minecraft/client/renderer/block/model/multipart/ConditionPropertyValue$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwh$2";
		else
			return "ConditionPropertyValue$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwh$2;";
		else
			return "Lnet/minecraft/client/renderer/block/model/multipart/ConditionPropertyValue$2;";
	}

}

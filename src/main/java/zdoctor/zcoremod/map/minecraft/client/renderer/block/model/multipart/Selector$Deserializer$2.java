package zdoctor.zcoremod.map.minecraft.client.renderer.block.model.multipart;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Selector$Deserializer$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwk$a$2";
		else
			return "net/minecraft/client/renderer/block/model/multipart/Selector$Deserializer$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwk$a$2";
		else
			return "Selector$Deserializer$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwk$a$2;";
		else
			return "Lnet/minecraft/client/renderer/block/model/multipart/Selector$Deserializer$2;";
	}

}

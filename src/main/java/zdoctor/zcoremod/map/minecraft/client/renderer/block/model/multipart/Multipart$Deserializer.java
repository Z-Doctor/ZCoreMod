package zdoctor.zcoremod.map.minecraft.client.renderer.block.model.multipart;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Multipart$Deserializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwi$a";
		else
			return "net/minecraft/client/renderer/block/model/multipart/Multipart$Deserializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwi$a";
		else
			return "Multipart$Deserializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwi$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/multipart/Multipart$Deserializer;";
	}

	/**
	 * <p>
	 * Name: getSelectors
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonDeserializationContext;Lcom/google/gson/JsonArray;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_188133_a = McMappingDatabase.getSRG("Multipart$Deserializer.func_188133_a");

}

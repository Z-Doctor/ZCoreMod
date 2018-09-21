package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBlockDefinition$Deserializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvv$a";
		else
			return "net/minecraft/client/renderer/block/model/ModelBlockDefinition$Deserializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvv$a";
		else
			return "ModelBlockDefinition$Deserializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvv$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ModelBlockDefinition$Deserializer;";
	}

	/**
	 * <p>
	 * Name: parseMultipart
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonDeserializationContext;Lcom/google/gson/JsonObject;)Lnet/minecraft/client/renderer/block/model/multipart/Multipart;]
	 * </p>
	 */
	public static McObfPair func_187998_b = McMappingDatabase.getSRG("ModelBlockDefinition$Deserializer.func_187998_b");

	/**
	 * <p>
	 * Name: parseMapVariants
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonDeserializationContext;Lcom/google/gson/JsonObject;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_187999_a = McMappingDatabase.getSRG("ModelBlockDefinition$Deserializer.func_187999_a");

}

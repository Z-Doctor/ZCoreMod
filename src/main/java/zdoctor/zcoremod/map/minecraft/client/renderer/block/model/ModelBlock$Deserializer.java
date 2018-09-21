package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBlock$Deserializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvu$b";
		else
			return "net/minecraft/client/renderer/block/model/ModelBlock$Deserializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvu$b";
		else
			return "ModelBlock$Deserializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvu$b;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ModelBlock$Deserializer;";
	}

	/**
	 * <p>
	 * Name: getAmbientOcclusionEnabled
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Z]
	 * </p>
	 */
	public static McObfPair func_178328_a = McMappingDatabase.getSRG("ModelBlock$Deserializer.func_178328_a");

	/**
	 * <p>
	 * Name: getTextures
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_178329_b = McMappingDatabase.getSRG("ModelBlock$Deserializer.func_178329_b");

	/**
	 * <p>
	 * Name: getParent
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_178326_c = McMappingDatabase.getSRG("ModelBlock$Deserializer.func_178326_c");

	/**
	 * <p>
	 * Name: getItemOverrides
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonDeserializationContext;Lcom/google/gson/JsonObject;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_187964_a = McMappingDatabase.getSRG("ModelBlock$Deserializer.func_187964_a");

	/**
	 * <p>
	 * Name: getModelElements
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonDeserializationContext;Lcom/google/gson/JsonObject;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_178325_a = McMappingDatabase.getSRG("ModelBlock$Deserializer.func_178325_a");

}

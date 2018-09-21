package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemCameraTransforms$Deserializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwc$a";
		else
			return "net/minecraft/client/renderer/block/model/ItemCameraTransforms$Deserializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwc$a";
		else
			return "ItemCameraTransforms$Deserializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwc$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$Deserializer;";
	}

	/**
	 * <p>
	 * Name: getTransform
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonDeserializationContext;Lcom/google/gson/JsonObject;Ljava/lang/String;)Lnet/minecraft/client/renderer/block/model/ItemTransformVec3f;]
	 * </p>
	 */
	public static McObfPair func_181683_a = McMappingDatabase.getSRG("ItemCameraTransforms$Deserializer.func_181683_a");

}

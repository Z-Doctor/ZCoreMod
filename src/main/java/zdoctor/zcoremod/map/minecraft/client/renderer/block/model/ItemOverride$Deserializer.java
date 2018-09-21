package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemOverride$Deserializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvz$a";
		else
			return "net/minecraft/client/renderer/block/model/ItemOverride$Deserializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvz$a";
		else
			return "ItemOverride$Deserializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvz$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ItemOverride$Deserializer;";
	}

	/**
	 * <p>
	 * Name: makeMapResourceValues
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_188025_a = McMappingDatabase.getSRG("ItemOverride$Deserializer.func_188025_a");

}

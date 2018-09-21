package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPartFace$Deserializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvr$a";
		else
			return "net/minecraft/client/renderer/block/model/BlockPartFace$Deserializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvr$a";
		else
			return "BlockPartFace$Deserializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvr$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/BlockPartFace$Deserializer;";
	}

	/**
	 * <p>
	 * Name: parseCullFace
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_178339_c = McMappingDatabase.getSRG("BlockPartFace$Deserializer.func_178339_c");

	/**
	 * <p>
	 * Name: parseTintIndex
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)I]
	 * </p>
	 */
	public static McObfPair func_178337_a = McMappingDatabase.getSRG("BlockPartFace$Deserializer.func_178337_a");

	/**
	 * <p>
	 * Name: parseTexture
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_178340_b = McMappingDatabase.getSRG("BlockPartFace$Deserializer.func_178340_b");

}

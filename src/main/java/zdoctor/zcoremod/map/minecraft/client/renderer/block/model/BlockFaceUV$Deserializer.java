package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockFaceUV$Deserializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvt$a";
		else
			return "net/minecraft/client/renderer/block/model/BlockFaceUV$Deserializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvt$a";
		else
			return "BlockFaceUV$Deserializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvt$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/BlockFaceUV$Deserializer;";
	}

	/**
	 * <p>
	 * Name: parseUV
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)[F]
	 * </p>
	 */
	public static McObfPair func_178292_b = McMappingDatabase.getSRG("BlockFaceUV$Deserializer.func_178292_b");

	/**
	 * <p>
	 * Name: parseRotation
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)I]
	 * </p>
	 */
	public static McObfPair func_178291_a = McMappingDatabase.getSRG("BlockFaceUV$Deserializer.func_178291_a");

}

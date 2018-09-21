package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPart$Deserializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvq$a";
		else
			return "net/minecraft/client/renderer/block/model/BlockPart$Deserializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvq$a";
		else
			return "BlockPart$Deserializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvq$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/BlockPart$Deserializer;";
	}

	/**
	 * <p>
	 * Name: parsePositionFrom
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lorg/lwjgl/util/vector/Vector3f;]
	 * </p>
	 */
	public static McObfPair func_178249_e = McMappingDatabase.getSRG("BlockPart$Deserializer.func_178249_e");

	/**
	 * <p>
	 * Name: parsePositionTo
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lorg/lwjgl/util/vector/Vector3f;]
	 * </p>
	 */
	public static McObfPair func_178247_d = McMappingDatabase.getSRG("BlockPart$Deserializer.func_178247_d");

	/**
	 * <p>
	 * Name: parseFaces
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonDeserializationContext;Lcom/google/gson/JsonObject;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_178253_b = McMappingDatabase.getSRG("BlockPart$Deserializer.func_178253_b");

	/**
	 * <p>
	 * Name: parseRotation
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/client/renderer/block/model/BlockPartRotation;]
	 * </p>
	 */
	public static McObfPair func_178256_a = McMappingDatabase.getSRG("BlockPart$Deserializer.func_178256_a");

	/**
	 * <p>
	 * Name: parseAxis
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/util/EnumFacing$Axis;]
	 * </p>
	 */
	public static McObfPair func_178252_c = McMappingDatabase.getSRG("BlockPart$Deserializer.func_178252_c");

	/**
	 * <p>
	 * Name: parseFacesCheck
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonDeserializationContext;Lcom/google/gson/JsonObject;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_178250_a = McMappingDatabase.getSRG("BlockPart$Deserializer.func_178250_a");

	/**
	 * <p>
	 * Name: parseEnumFacing
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_178248_a = McMappingDatabase.getSRG("BlockPart$Deserializer.func_178248_a");

	/**
	 * <p>
	 * Name: parseAngle
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)F]
	 * </p>
	 */
	public static McObfPair func_178255_b = McMappingDatabase.getSRG("BlockPart$Deserializer.func_178255_b");

	/**
	 * <p>
	 * Name: parsePosition
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;)Lorg/lwjgl/util/vector/Vector3f;]
	 * </p>
	 */
	public static McObfPair func_178251_a = McMappingDatabase.getSRG("BlockPart$Deserializer.func_178251_a");

}

package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemTransformVec3f$Deserializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwb$a";
		else
			return "net/minecraft/client/renderer/block/model/ItemTransformVec3f$Deserializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwb$a";
		else
			return "ItemTransformVec3f$Deserializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwb$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ItemTransformVec3f$Deserializer;";
	}

	/**
	 * <p>
	 * Name: parseVector3f
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;Lorg/lwjgl/util/vector/Vector3f;)Lorg/lwjgl/util/vector/Vector3f;]
	 * </p>
	 */
	public static McObfPair func_178358_a = McMappingDatabase.getSRG("ItemTransformVec3f$Deserializer.func_178358_a");

	/**
	 * <p>
	 * Name: TRANSLATION_DEFAULT
	 * </p>
	 */
	public static McObfPair field_178360_b = McMappingDatabase.getSRG("field_178360_b");

	/**
	 * <p>
	 * Name: ROTATION_DEFAULT
	 * </p>
	 */
	public static McObfPair field_178362_a = McMappingDatabase.getSRG("field_178362_a");

	/**
	 * <p>
	 * Name: SCALE_DEFAULT
	 * </p>
	 */
	public static McObfPair field_178361_c = McMappingDatabase.getSRG("field_178361_c");

}

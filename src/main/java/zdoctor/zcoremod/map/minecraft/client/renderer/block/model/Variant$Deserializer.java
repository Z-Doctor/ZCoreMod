package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Variant$Deserializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwe$a";
		else
			return "net/minecraft/client/renderer/block/model/Variant$Deserializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwe$a";
		else
			return "Variant$Deserializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwe$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/Variant$Deserializer;";
	}

	/**
	 * <p>
	 * Name: parseModelRotation
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/client/renderer/block/model/ModelRotation;]
	 * </p>
	 */
	public static McObfPair func_188042_a = McMappingDatabase.getSRG("Variant$Deserializer.func_188042_a");

	/**
	 * <p>
	 * Name: parseWeight
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)I]
	 * </p>
	 */
	public static McObfPair func_188045_c = McMappingDatabase.getSRG("Variant$Deserializer.func_188045_c");

	/**
	 * <p>
	 * Name: getStringModel
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_188043_b = McMappingDatabase.getSRG("Variant$Deserializer.func_188043_b");

	/**
	 * <p>
	 * Name: getResourceLocationBlock
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_188041_a = McMappingDatabase.getSRG("Variant$Deserializer.func_188041_a");

	/**
	 * <p>
	 * Name: parseUvLock
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Z]
	 * </p>
	 */
	public static McObfPair func_188044_d = McMappingDatabase.getSRG("Variant$Deserializer.func_188044_d");

}

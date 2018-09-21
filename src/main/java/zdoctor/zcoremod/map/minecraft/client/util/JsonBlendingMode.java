package zdoctor.zcoremod.map.minecraft.client.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class JsonBlendingMode {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccv";
		else
			return "net/minecraft/client/util/JsonBlendingMode";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccv";
		else
			return "JsonBlendingMode";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lccv;";
		else
			return "Lnet/minecraft/client/util/JsonBlendingMode;";
	}

	/**
	 * <p>
	 * Name: separateBlend
	 * </p>
	 */
	public static McObfPair field_148113_g = McMappingDatabase.getSRG("field_148113_g");

	/**
	 * <p>
	 * Name: stringToBlendFunction
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_148108_a = McMappingDatabase.getSRG("JsonBlendingMode.func_148108_a");

	/**
	 * <p>
	 * Name: apply
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148109_a = McMappingDatabase.getSRG("JsonBlendingMode.func_148109_a");

	/**
	 * <p>
	 * Name: opaque
	 * </p>
	 */
	public static McObfPair field_148119_h = McMappingDatabase.getSRG("field_148119_h");

	/**
	 * <p>
	 * Name: parseBlendNode
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/client/util/JsonBlendingMode;]
	 * </p>
	 */
	public static McObfPair func_148110_a = McMappingDatabase.getSRG("JsonBlendingMode.func_148110_a");

	/**
	 * <p>
	 * Name: lastApplied
	 * </p>
	 */
	public static McObfPair field_148118_a = McMappingDatabase.getSRG("field_148118_a");

	/**
	 * <p>
	 * Name: destColorFactor
	 * </p>
	 */
	public static McObfPair field_148114_d = McMappingDatabase.getSRG("field_148114_d");

	/**
	 * <p>
	 * Name: destAlphaFactor
	 * </p>
	 */
	public static McObfPair field_148115_e = McMappingDatabase.getSRG("field_148115_e");

	/**
	 * <p>
	 * Name: srcColorFactor
	 * </p>
	 */
	public static McObfPair field_148116_b = McMappingDatabase.getSRG("field_148116_b");

	/**
	 * <p>
	 * Name: isOpaque
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148111_b = McMappingDatabase.getSRG("JsonBlendingMode.func_148111_b");

	/**
	 * <p>
	 * Name: stringToBlendFactor
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_148107_b = McMappingDatabase.getSRG("JsonBlendingMode.func_148107_b");

	/**
	 * <p>
	 * Name: srcAlphaFactor
	 * </p>
	 */
	public static McObfPair field_148117_c = McMappingDatabase.getSRG("field_148117_c");

	/**
	 * <p>
	 * Name: blendFunction
	 * </p>
	 */
	public static McObfPair field_148112_f = McMappingDatabase.getSRG("field_148112_f");

}

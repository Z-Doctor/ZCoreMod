package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class JsonUtils {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rc";
		else
			return "net/minecraft/util/JsonUtils";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rc";
		else
			return "JsonUtils";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrc;";
		else
			return "Lnet/minecraft/util/JsonUtils;";
	}

	/**
	 * <p>
	 * Name: isString
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)Z]
	 * </p>
	 */
	public static McObfPair func_151211_a = McMappingDatabase.getSRG("JsonUtils.func_151211_a");

	/**
	 * <p>
	 * Name: getFloat
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;F)F]
	 * </p>
	 */
	public static McObfPair func_151221_a = McMappingDatabase.getSRG("JsonUtils.func_151221_a");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_188180_i = McMappingDatabase.getSRG("JsonUtils.func_188180_i");

	/**
	 * <p>
	 * Name: isBoolean
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_180199_c = McMappingDatabase.getSRG("JsonUtils.func_180199_c");

	/**
	 * <p>
	 * Name: getString
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_151206_a = McMappingDatabase.getSRG("JsonUtils.func_151206_a");

	/**
	 * <p>
	 * Name: fromJson
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/Gson;Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_193839_a = McMappingDatabase.getSRG("JsonUtils.func_193839_a");

	/**
	 * <p>
	 * Name: getFloat
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;)F]
	 * </p>
	 */
	public static McObfPair func_151217_k = McMappingDatabase.getSRG("JsonUtils.func_151217_k");

	/**
	 * <p>
	 * Name: getInt
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_151215_f = McMappingDatabase.getSRG("JsonUtils.func_151215_f");

	/**
	 * <p>
	 * Name: getJsonObject
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonObject;]
	 * </p>
	 */
	public static McObfPair func_151210_l = McMappingDatabase.getSRG("JsonUtils.func_151210_l");

	/**
	 * <p>
	 * Name: getJsonArray
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonArray;]
	 * </p>
	 */
	public static McObfPair func_151207_m = McMappingDatabase.getSRG("JsonUtils.func_151207_m");

	/**
	 * <p>
	 * Name: getString
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_151219_a = McMappingDatabase.getSRG("JsonUtils.func_151219_a");

	/**
	 * <p>
	 * Name: isString
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_151205_a = McMappingDatabase.getSRG("JsonUtils.func_151205_a");

	/**
	 * <p>
	 * Name: gsonDeserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/Gson;Ljava/io/Reader;Ljava/lang/Class;Z)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_188173_a = McMappingDatabase.getSRG("JsonUtils.func_188173_a");

	/**
	 * <p>
	 * Name: gsonDeserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/Gson;Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_193840_a = McMappingDatabase.getSRG("JsonUtils.func_193840_a");

	/**
	 * <p>
	 * Name: gsonDeserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/Gson;Ljava/lang/String;Ljava/lang/Class;Z)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_188176_a = McMappingDatabase.getSRG("JsonUtils.func_188176_a");

	/**
	 * <p>
	 * Name: gsonDeserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/Gson;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_188178_a = McMappingDatabase.getSRG("JsonUtils.func_188178_a");

	/**
	 * <p>
	 * Name: getInt
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;I)I]
	 * </p>
	 */
	public static McObfPair func_151208_a = McMappingDatabase.getSRG("JsonUtils.func_151208_a");

	/**
	 * <p>
	 * Name: getJsonObject
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonObject;]
	 * </p>
	 */
	public static McObfPair func_151218_a = McMappingDatabase.getSRG("JsonUtils.func_151218_a");

	/**
	 * <p>
	 * Name: fromJson
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/Gson;Ljava/io/Reader;Ljava/lang/reflect/Type;Z)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_193838_a = McMappingDatabase.getSRG("JsonUtils.func_193838_a");

	/**
	 * <p>
	 * Name: getString
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_151200_h = McMappingDatabase.getSRG("JsonUtils.func_151200_h");

	/**
	 * <p>
	 * Name: getJsonArray
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;)Lcom/google/gson/JsonArray;]
	 * </p>
	 */
	public static McObfPair func_151214_t = McMappingDatabase.getSRG("JsonUtils.func_151214_t");

	/**
	 * <p>
	 * Name: getBoolean
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_151216_b = McMappingDatabase.getSRG("JsonUtils.func_151216_b");

	/**
	 * <p>
	 * Name: fromJson
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/Gson;Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_193841_a = McMappingDatabase.getSRG("JsonUtils.func_193841_a");

	/**
	 * <p>
	 * Name: toString
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_151222_d = McMappingDatabase.getSRG("JsonUtils.func_151222_d");

	/**
	 * <p>
	 * Name: isJsonPrimitive
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_151201_f = McMappingDatabase.getSRG("JsonUtils.func_151201_f");

	/**
	 * <p>
	 * Name: getJsonArray
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;Lcom/google/gson/JsonArray;)Lcom/google/gson/JsonArray;]
	 * </p>
	 */
	public static McObfPair func_151213_a = McMappingDatabase.getSRG("JsonUtils.func_151213_a");

	/**
	 * <p>
	 * Name: getBoolean
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;Z)Z]
	 * </p>
	 */
	public static McObfPair func_151209_a = McMappingDatabase.getSRG("JsonUtils.func_151209_a");

	/**
	 * <p>
	 * Name: deserializeClass
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;Lcom/google/gson/JsonDeserializationContext;Ljava/lang/Class;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_188174_a = McMappingDatabase.getSRG("JsonUtils.func_188174_a");

	/**
	 * <p>
	 * Name: fromJson
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/Gson;Ljava/lang/String;Ljava/lang/reflect/Type;Z)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_193837_a = McMappingDatabase.getSRG("JsonUtils.func_193837_a");

	/**
	 * <p>
	 * Name: deserializeClass
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;Ljava/lang/String;Lcom/google/gson/JsonDeserializationContext;Ljava/lang/Class;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_188179_a = McMappingDatabase.getSRG("JsonUtils.func_188179_a");

	/**
	 * <p>
	 * Name: getJsonObject
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;)Lcom/google/gson/JsonObject;]
	 * </p>
	 */
	public static McObfPair func_152754_s = McMappingDatabase.getSRG("JsonUtils.func_152754_s");

	/**
	 * <p>
	 * Name: getFloat
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;Ljava/lang/String;)F]
	 * </p>
	 */
	public static McObfPair func_151220_d = McMappingDatabase.getSRG("JsonUtils.func_151220_d");

	/**
	 * <p>
	 * Name: deserializeClass
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/lang/Object;Lcom/google/gson/JsonDeserializationContext;Ljava/lang/Class;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_188177_a = McMappingDatabase.getSRG("JsonUtils.func_188177_a");

	/**
	 * <p>
	 * Name: getBoolean
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_151212_i = McMappingDatabase.getSRG("JsonUtils.func_151212_i");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;Ljava/lang/String;)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_188172_b = McMappingDatabase.getSRG("JsonUtils.func_188172_b");

	/**
	 * <p>
	 * Name: isJsonArray
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_151202_d = McMappingDatabase.getSRG("JsonUtils.func_151202_d");

	/**
	 * <p>
	 * Name: getInt
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_151203_m = McMappingDatabase.getSRG("JsonUtils.func_151203_m");

	/**
	 * <p>
	 * Name: isNumber
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)Z]
	 * </p>
	 */
	public static McObfPair func_188175_b = McMappingDatabase.getSRG("JsonUtils.func_188175_b");

	/**
	 * <p>
	 * Name: hasField
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_151204_g = McMappingDatabase.getSRG("JsonUtils.func_151204_g");

}

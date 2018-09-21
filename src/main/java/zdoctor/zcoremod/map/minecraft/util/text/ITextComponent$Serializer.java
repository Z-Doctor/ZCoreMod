package zdoctor.zcoremod.map.minecraft.util.text;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ITextComponent$Serializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hh$a";
		else
			return "net/minecraft/util/text/ITextComponent$Serializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hh$a";
		else
			return "ITextComponent$Serializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhh$a;";
		else
			return "Lnet/minecraft/util/text/ITextComponent$Serializer;";
	}

	/**
	 * <p>
	 * Name: fromJsonLenient
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_186877_b = McMappingDatabase.getSRG("ITextComponent$Serializer.func_186877_b");

	/**
	 * <p>
	 * Name: serializeChatStyle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/Style;Lcom/google/gson/JsonObject;Lcom/google/gson/JsonSerializationContext;)V]
	 * </p>
	 */
	public static McObfPair func_150695_a = McMappingDatabase.getSRG("ITextComponent$Serializer.func_150695_a");

	/**
	 * <p>
	 * Name: GSON
	 * </p>
	 */
	public static McObfPair field_150700_a = McMappingDatabase.getSRG("field_150700_a");

	/**
	 * <p>
	 * Name: componentToJson
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150696_a = McMappingDatabase.getSRG("ITextComponent$Serializer.func_150696_a");

	/**
	 * <p>
	 * Name: jsonToComponent
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_150699_a = McMappingDatabase.getSRG("ITextComponent$Serializer.func_150699_a");

}

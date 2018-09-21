package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IJsonSerializable {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qr";
		else
			return "net/minecraft/util/IJsonSerializable";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qr";
		else
			return "IJsonSerializable";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqr;";
		else
			return "Lnet/minecraft/util/IJsonSerializable;";
	}

	/**
	 * <p>
	 * Name: fromJson
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)V]
	 * </p>
	 */
	public static McObfPair func_152753_a = McMappingDatabase.getSRG("IJsonSerializable.func_152753_a");

	/**
	 * <p>
	 * Name: getSerializableElement
	 * </p>
	 * <p>
	 * Desc: [()Lcom/google/gson/JsonElement;]
	 * </p>
	 */
	public static McObfPair func_151003_a = McMappingDatabase.getSRG("IJsonSerializable.func_151003_a");

}

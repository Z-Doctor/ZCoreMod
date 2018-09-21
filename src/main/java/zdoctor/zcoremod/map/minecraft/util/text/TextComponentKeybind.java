package zdoctor.zcoremod.map.minecraft.util.text;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextComponentKeybind {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hk";
		else
			return "net/minecraft/util/text/TextComponentKeybind";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hk";
		else
			return "TextComponentKeybind";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhk;";
		else
			return "Lnet/minecraft/util/text/TextComponentKeybind;";
	}

	/**
	 * <p>
	 * Name: displaySupplier
	 * </p>
	 */
	public static McObfPair field_193639_d = McMappingDatabase.getSRG("field_193639_d");

	/**
	 * <p>
	 * Name: keybind
	 * </p>
	 */
	public static McObfPair field_193638_c = McMappingDatabase.getSRG("field_193638_c");

	/**
	 * <p>
	 * Name: createCopy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;, ()Lnet/minecraft/util/text/TextComponentKeybind;]
	 * </p>
	 */
	public static McObfPair func_150259_f = McMappingDatabase.getSRG("TextComponentKeybind.func_150259_f");

	/**
	 * <p>
	 * Name: getUnformattedComponentText
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150261_e = McMappingDatabase.getSRG("TextComponentKeybind.func_150261_e");

	/**
	 * <p>
	 * Name: displaySupplierFunction
	 * </p>
	 */
	public static McObfPair field_193637_b = McMappingDatabase.getSRG("field_193637_b");

	/**
	 * <p>
	 * Name: getKeybind
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_193633_h = McMappingDatabase.getSRG("TextComponentKeybind.func_193633_h");

}

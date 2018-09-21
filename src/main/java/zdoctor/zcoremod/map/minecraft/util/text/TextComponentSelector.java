package zdoctor.zcoremod.map.minecraft.util.text;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextComponentSelector {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hm";
		else
			return "net/minecraft/util/text/TextComponentSelector";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hm";
		else
			return "TextComponentSelector";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhm;";
		else
			return "Lnet/minecraft/util/text/TextComponentSelector;";
	}

	/**
	 * <p>
	 * Name: getUnformattedComponentText
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150261_e = McMappingDatabase.getSRG("TextComponentSelector.func_150261_e");

	/**
	 * <p>
	 * Name: getSelector
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_179992_g = McMappingDatabase.getSRG("TextComponentSelector.func_179992_g");

	/**
	 * <p>
	 * Name: createCopy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;, ()Lnet/minecraft/util/text/TextComponentSelector;]
	 * </p>
	 */
	public static McObfPair func_150259_f = McMappingDatabase.getSRG("TextComponentSelector.func_150259_f");

	/**
	 * <p>
	 * Name: selector
	 * </p>
	 */
	public static McObfPair field_179993_b = McMappingDatabase.getSRG("field_179993_b");

}

package zdoctor.zcoremod.map.minecraft.util.text;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextComponentString {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ho";
		else
			return "net/minecraft/util/text/TextComponentString";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ho";
		else
			return "TextComponentString";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lho;";
		else
			return "Lnet/minecraft/util/text/TextComponentString;";
	}

	/**
	 * <p>
	 * Name: text
	 * </p>
	 */
	public static McObfPair field_150267_b = McMappingDatabase.getSRG("field_150267_b");

	/**
	 * <p>
	 * Name: createCopy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;, ()Lnet/minecraft/util/text/TextComponentString;]
	 * </p>
	 */
	public static McObfPair func_150259_f = McMappingDatabase.getSRG("TextComponentString.func_150259_f");

	/**
	 * <p>
	 * Name: getUnformattedComponentText
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150261_e = McMappingDatabase.getSRG("TextComponentString.func_150261_e");

	/**
	 * <p>
	 * Name: getText
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150265_g = McMappingDatabase.getSRG("TextComponentString.func_150265_g");

}

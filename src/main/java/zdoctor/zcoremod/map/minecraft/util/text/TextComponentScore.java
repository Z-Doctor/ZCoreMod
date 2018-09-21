package zdoctor.zcoremod.map.minecraft.util.text;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextComponentScore {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hl";
		else
			return "net/minecraft/util/text/TextComponentScore";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hl";
		else
			return "TextComponentScore";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhl;";
		else
			return "Lnet/minecraft/util/text/TextComponentScore;";
	}

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_179999_b = McMappingDatabase.getSRG("field_179999_b");

	/**
	 * <p>
	 * Name: value
	 * </p>
	 */
	public static McObfPair field_179998_d = McMappingDatabase.getSRG("field_179998_d");

	/**
	 * <p>
	 * Name: objective
	 * </p>
	 */
	public static McObfPair field_180000_c = McMappingDatabase.getSRG("field_180000_c");

	/**
	 * <p>
	 * Name: getUnformattedComponentText
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150261_e = McMappingDatabase.getSRG("TextComponentScore.func_150261_e");

	/**
	 * <p>
	 * Name: getObjective
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_179994_h = McMappingDatabase.getSRG("TextComponentScore.func_179994_h");

	/**
	 * <p>
	 * Name: setValue
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_179997_b = McMappingDatabase.getSRG("TextComponentScore.func_179997_b");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_179995_g = McMappingDatabase.getSRG("TextComponentScore.func_179995_g");

	/**
	 * <p>
	 * Name: resolve
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;)V]
	 * </p>
	 */
	public static McObfPair func_186876_a = McMappingDatabase.getSRG("TextComponentScore.func_186876_a");

	/**
	 * <p>
	 * Name: createCopy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;, ()Lnet/minecraft/util/text/TextComponentScore;]
	 * </p>
	 */
	public static McObfPair func_150259_f = McMappingDatabase.getSRG("TextComponentScore.func_150259_f");

}

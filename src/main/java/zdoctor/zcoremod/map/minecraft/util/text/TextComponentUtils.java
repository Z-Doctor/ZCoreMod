package zdoctor.zcoremod.map.minecraft.util.text;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextComponentUtils {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hi";
		else
			return "net/minecraft/util/text/TextComponentUtils";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hi";
		else
			return "TextComponentUtils";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhi;";
		else
			return "Lnet/minecraft/util/text/TextComponentUtils;";
	}

	/**
	 * <p>
	 * Name: processComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/util/text/ITextComponent;Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_179985_a = McMappingDatabase.getSRG("TextComponentUtils.func_179985_a");

}

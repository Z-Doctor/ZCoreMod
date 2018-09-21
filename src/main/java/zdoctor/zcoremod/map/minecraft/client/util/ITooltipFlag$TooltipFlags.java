package zdoctor.zcoremod.map.minecraft.client.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ITooltipFlag$TooltipFlags {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akb$a";
		else
			return "net/minecraft/client/util/ITooltipFlag$TooltipFlags";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akb$a";
		else
			return "ITooltipFlag$TooltipFlags";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lakb$a;";
		else
			return "Lnet/minecraft/client/util/ITooltipFlag$TooltipFlags;";
	}

	/**
	 * <p>
	 * Name: isAdvanced
	 * </p>
	 */
	public static McObfPair field_194131_c = McMappingDatabase.getSRG("field_194131_c");

	/**
	 * <p>
	 * Name: isAdvanced
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_194127_a = McMappingDatabase.getSRG("ITooltipFlag$TooltipFlags.func_194127_a");

}

package zdoctor.zcoremod.map.minecraft.client.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ITooltipFlag {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akb";
		else
			return "net/minecraft/client/util/ITooltipFlag";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akb";
		else
			return "ITooltipFlag";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lakb;";
		else
			return "Lnet/minecraft/client/util/ITooltipFlag;";
	}

	/**
	 * <p>
	 * Name: isAdvanced
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_194127_a = McMappingDatabase.getSRG("ITooltipFlag.func_194127_a");

}

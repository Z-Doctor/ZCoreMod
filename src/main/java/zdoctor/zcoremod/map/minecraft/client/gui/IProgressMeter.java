package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IProgressMeter {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blv";
		else
			return "net/minecraft/client/gui/IProgressMeter";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blv";
		else
			return "IProgressMeter";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblv;";
		else
			return "Lnet/minecraft/client/gui/IProgressMeter;";
	}

	/**
	 * <p>
	 * Name: LOADING_STRINGS
	 * </p>
	 */
	public static McObfPair field_146510_b_ = McMappingDatabase.getSRG("field_146510_b_");

	/**
	 * <p>
	 * Name: onStatsUpdated
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193026_g = McMappingDatabase.getSRG("IProgressMeter.func_193026_g");

}

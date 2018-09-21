package zdoctor.zcoremod.map.minecraft.client.tutorial;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CompletedTutorialStep {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cht";
		else
			return "net/minecraft/client/tutorial/CompletedTutorialStep";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cht";
		else
			return "CompletedTutorialStep";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcht;";
		else
			return "Lnet/minecraft/client/tutorial/CompletedTutorialStep;";
	}

	/**
	 * <p>
	 * Name: tutorial
	 * </p>
	 */
	public static McObfPair field_193253_a = McMappingDatabase.getSRG("field_193253_a");

}

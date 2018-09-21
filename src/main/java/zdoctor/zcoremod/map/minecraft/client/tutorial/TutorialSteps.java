package zdoctor.zcoremod.map.minecraft.client.tutorial;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TutorialSteps {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cib";
		else
			return "net/minecraft/client/tutorial/TutorialSteps";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cib";
		else
			return "TutorialSteps";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcib;";
		else
			return "Lnet/minecraft/client/tutorial/TutorialSteps;";
	}

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_193316_g = McMappingDatabase.getSRG("field_193316_g");

	/**
	 * <p>
	 * Name: tutorial
	 * </p>
	 */
	public static McObfPair field_193317_h = McMappingDatabase.getSRG("field_193317_h");

	/**
	 * <p>
	 * Name: getTutorial
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/tutorial/TutorialSteps;]
	 * </p>
	 */
	public static McObfPair func_193307_a = McMappingDatabase.getSRG("TutorialSteps.func_193307_a");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/tutorial/Tutorial;)Lnet/minecraft/client/tutorial/ITutorialStep;]
	 * </p>
	 */
	public static McObfPair func_193309_a = McMappingDatabase.getSRG("TutorialSteps.func_193309_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_193308_a = McMappingDatabase.getSRG("TutorialSteps.func_193308_a");

}

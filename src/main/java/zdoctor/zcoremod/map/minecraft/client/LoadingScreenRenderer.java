package zdoctor.zcoremod.map.minecraft.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LoadingScreenRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bie";
		else
			return "net/minecraft/client/LoadingScreenRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bie";
		else
			return "LoadingScreenRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbie;";
		else
			return "Lnet/minecraft/client/LoadingScreenRenderer;";
	}

	/**
	 * <p>
	 * Name: setDoneWorking
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146586_a = McMappingDatabase.getSRG("LoadingScreenRenderer.func_146586_a");

	/**
	 * <p>
	 * Name: displaySavingString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_73720_a = McMappingDatabase.getSRG("LoadingScreenRenderer.func_73720_a");

	/**
	 * <p>
	 * Name: scaledResolution
	 * </p>
	 */
	public static McObfPair field_146587_f = McMappingDatabase.getSRG("field_146587_f");

	/**
	 * <p>
	 * Name: displayString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_73722_d = McMappingDatabase.getSRG("LoadingScreenRenderer.func_73722_d");

	/**
	 * <p>
	 * Name: resetProgressAndMessage
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_73721_b = McMappingDatabase.getSRG("LoadingScreenRenderer.func_73721_b");

	/**
	 * <p>
	 * Name: setLoadingProgress
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_73718_a = McMappingDatabase.getSRG("LoadingScreenRenderer.func_73718_a");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_73725_b = McMappingDatabase.getSRG("field_73725_b");

	/**
	 * <p>
	 * Name: systemTime
	 * </p>
	 */
	public static McObfPair field_73723_d = McMappingDatabase.getSRG("field_73723_d");

	/**
	 * <p>
	 * Name: framebuffer
	 * </p>
	 */
	public static McObfPair field_146588_g = McMappingDatabase.getSRG("field_146588_g");

	/**
	 * <p>
	 * Name: message
	 * </p>
	 */
	public static McObfPair field_73727_a = McMappingDatabase.getSRG("field_73727_a");

	/**
	 * <p>
	 * Name: loadingSuccess
	 * </p>
	 */
	public static McObfPair field_73724_e = McMappingDatabase.getSRG("field_73724_e");

	/**
	 * <p>
	 * Name: displayLoadingString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_73719_c = McMappingDatabase.getSRG("LoadingScreenRenderer.func_73719_c");

	/**
	 * <p>
	 * Name: currentlyDisplayedText
	 * </p>
	 */
	public static McObfPair field_73726_c = McMappingDatabase.getSRG("field_73726_c");

}

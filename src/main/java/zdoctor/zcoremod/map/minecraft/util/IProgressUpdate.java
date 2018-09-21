package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IProgressUpdate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rm";
		else
			return "net/minecraft/util/IProgressUpdate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rm";
		else
			return "IProgressUpdate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrm;";
		else
			return "Lnet/minecraft/util/IProgressUpdate;";
	}

	/**
	 * <p>
	 * Name: resetProgressAndMessage
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_73721_b = McMappingDatabase.getSRG("IProgressUpdate.func_73721_b");

	/**
	 * <p>
	 * Name: setLoadingProgress
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_73718_a = McMappingDatabase.getSRG("IProgressUpdate.func_73718_a");

	/**
	 * <p>
	 * Name: displaySavingString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_73720_a = McMappingDatabase.getSRG("IProgressUpdate.func_73720_a");

	/**
	 * <p>
	 * Name: displayLoadingString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_73719_c = McMappingDatabase.getSRG("IProgressUpdate.func_73719_c");

	/**
	 * <p>
	 * Name: setDoneWorking
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146586_a = McMappingDatabase.getSRG("IProgressUpdate.func_146586_a");

}

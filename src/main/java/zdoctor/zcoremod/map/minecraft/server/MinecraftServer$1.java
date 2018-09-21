package zdoctor.zcoremod.map.minecraft.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MinecraftServer$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "net/minecraft/server/MinecraftServer$1";
		else
			return "net/minecraft/server/MinecraftServer$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "MinecraftServer$1";
		else
			return "MinecraftServer$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnet/minecraft/server/MinecraftServer$1;";
		else
			return "Lnet/minecraft/server/MinecraftServer$1;";
	}

	/**
	 * <p>
	 * Name: resetProgressAndMessage
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_73721_b = McMappingDatabase.getSRG("MinecraftServer$1.func_73721_b");

	/**
	 * <p>
	 * Name: displayLoadingString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_73719_c = McMappingDatabase.getSRG("MinecraftServer$1.func_73719_c");

	/**
	 * <p>
	 * Name: setDoneWorking
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146586_a = McMappingDatabase.getSRG("MinecraftServer$1.func_146586_a");

	/**
	 * <p>
	 * Name: setLoadingProgress
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_73718_a = McMappingDatabase.getSRG("MinecraftServer$1.func_73718_a");

	/**
	 * <p>
	 * Name: startTime
	 * </p>
	 */
	public static McObfPair field_96245_b = McMappingDatabase.getSRG("field_96245_b");

	/**
	 * <p>
	 * Name: displaySavingString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_73720_a = McMappingDatabase.getSRG("MinecraftServer$1.func_73720_a");

}

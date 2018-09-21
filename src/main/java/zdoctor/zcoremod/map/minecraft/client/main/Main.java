package zdoctor.zcoremod.map.minecraft.client.main;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Main {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "net/minecraft/client/main/Main";
		else
			return "net/minecraft/client/main/Main";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Main";
		else
			return "Main";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnet/minecraft/client/main/Main;";
		else
			return "Lnet/minecraft/client/main/Main;";
	}

	/**
	 * <p>
	 * Name: isNullOrEmpty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_110121_a = McMappingDatabase.getSRG("Main.func_110121_a");

}

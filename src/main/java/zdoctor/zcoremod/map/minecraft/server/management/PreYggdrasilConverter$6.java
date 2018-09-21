package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PreYggdrasilConverter$6 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pk$6";
		else
			return "net/minecraft/server/management/PreYggdrasilConverter$6";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pk$6";
		else
			return "PreYggdrasilConverter$6";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpk$6;";
		else
			return "Lnet/minecraft/server/management/PreYggdrasilConverter$6;";
	}

	/**
	 * <p>
	 * Name: getFileNameForProfile
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_152744_a = McMappingDatabase.getSRG("PreYggdrasilConverter$6.func_152744_a");

	/**
	 * <p>
	 * Name: renamePlayerFile
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_152743_a = McMappingDatabase.getSRG("PreYggdrasilConverter$6.func_152743_a");

}

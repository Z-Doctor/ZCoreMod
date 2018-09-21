package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IResourceManagerReloadListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceq";
		else
			return "net/minecraft/client/resources/IResourceManagerReloadListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceq";
		else
			return "IResourceManagerReloadListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lceq;";
		else
			return "Lnet/minecraft/client/resources/IResourceManagerReloadListener;";
	}

	/**
	 * <p>
	 * Name: onResourceManagerReload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110549_a = McMappingDatabase.getSRG("IResourceManagerReloadListener.func_110549_a");

}

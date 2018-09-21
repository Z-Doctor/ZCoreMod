package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GrassColorReloadListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cem";
		else
			return "net/minecraft/client/resources/GrassColorReloadListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cem";
		else
			return "GrassColorReloadListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcem;";
		else
			return "Lnet/minecraft/client/resources/GrassColorReloadListener;";
	}

	/**
	 * <p>
	 * Name: LOC_GRASS_PNG
	 * </p>
	 */
	public static McObfPair field_130078_a = McMappingDatabase.getSRG("field_130078_a");

	/**
	 * <p>
	 * Name: onResourceManagerReload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110549_a = McMappingDatabase.getSRG("GrassColorReloadListener.func_110549_a");

}

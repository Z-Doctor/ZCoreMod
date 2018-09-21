package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FoliageColorReloadListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cel";
		else
			return "net/minecraft/client/resources/FoliageColorReloadListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cel";
		else
			return "FoliageColorReloadListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcel;";
		else
			return "Lnet/minecraft/client/resources/FoliageColorReloadListener;";
	}

	/**
	 * <p>
	 * Name: LOC_FOLIAGE_PNG
	 * </p>
	 */
	public static McObfPair field_130079_a = McMappingDatabase.getSRG("field_130079_a");

	/**
	 * <p>
	 * Name: onResourceManagerReload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110549_a = McMappingDatabase.getSRG("FoliageColorReloadListener.func_110549_a");

}

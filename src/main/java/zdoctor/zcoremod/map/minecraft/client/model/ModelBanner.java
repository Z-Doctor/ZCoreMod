package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBanner {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpf";
		else
			return "net/minecraft/client/model/ModelBanner";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpf";
		else
			return "ModelBanner";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpf;";
		else
			return "Lnet/minecraft/client/model/ModelBanner;";
	}

	/**
	 * <p>
	 * Name: bannerTop
	 * </p>
	 */
	public static McObfPair field_178689_c = McMappingDatabase.getSRG("field_178689_c");

	/**
	 * <p>
	 * Name: renderBanner
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178687_a = McMappingDatabase.getSRG("ModelBanner.func_178687_a");

	/**
	 * <p>
	 * Name: bannerStand
	 * </p>
	 */
	public static McObfPair field_178688_b = McMappingDatabase.getSRG("field_178688_b");

	/**
	 * <p>
	 * Name: bannerSlate
	 * </p>
	 */
	public static McObfPair field_178690_a = McMappingDatabase.getSRG("field_178690_a");

}

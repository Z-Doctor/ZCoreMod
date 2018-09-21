package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerEntityOnShoulder$DataHolder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cca$a";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerEntityOnShoulder$DataHolder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cca$a";
		else
			return "LayerEntityOnShoulder$DataHolder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcca$a;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerEntityOnShoulder$DataHolder;";
	}

	/**
	 * <p>
	 * Name: clazz
	 * </p>
	 */
	public static McObfPair field_192886_e = McMappingDatabase.getSRG("field_192886_e");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_192882_a = McMappingDatabase.getSRG("field_192882_a");

	/**
	 * <p>
	 * Name: model
	 * </p>
	 */
	public static McObfPair field_192884_c = McMappingDatabase.getSRG("field_192884_c");

	/**
	 * <p>
	 * Name: textureLocation
	 * </p>
	 */
	public static McObfPair field_192885_d = McMappingDatabase.getSRG("field_192885_d");

	/**
	 * <p>
	 * Name: renderer
	 * </p>
	 */
	public static McObfPair field_192883_b = McMappingDatabase.getSRG("field_192883_b");

}

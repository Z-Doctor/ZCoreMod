package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemTransformVec3f {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwb";
		else
			return "net/minecraft/client/renderer/block/model/ItemTransformVec3f";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwb";
		else
			return "ItemTransformVec3f";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwb;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ItemTransformVec3f;";
	}

	/**
	 * <p>
	 * Name: translation
	 * </p>
	 */
	public static McObfPair field_178365_c = McMappingDatabase.getSRG("field_178365_c");

	/**
	 * <p>
	 * Name: rotation
	 * </p>
	 */
	public static McObfPair field_178364_b = McMappingDatabase.getSRG("field_178364_b");

	/**
	 * <p>
	 * Name: DEFAULT
	 * </p>
	 */
	public static McObfPair field_178366_a = McMappingDatabase.getSRG("field_178366_a");

	/**
	 * <p>
	 * Name: scale
	 * </p>
	 */
	public static McObfPair field_178363_d = McMappingDatabase.getSRG("field_178363_d");

}

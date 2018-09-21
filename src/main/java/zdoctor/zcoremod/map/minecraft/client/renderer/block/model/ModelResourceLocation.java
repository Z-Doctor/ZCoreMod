package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelResourceLocation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgd";
		else
			return "net/minecraft/client/renderer/block/model/ModelResourceLocation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgd";
		else
			return "ModelResourceLocation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgd;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ModelResourceLocation;";
	}

	/**
	 * <p>
	 * Name: parsePathString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_177517_b = McMappingDatabase.getSRG("ModelResourceLocation.func_177517_b");

	/**
	 * <p>
	 * Name: getVariant
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_177518_c = McMappingDatabase.getSRG("ModelResourceLocation.func_177518_c");

	/**
	 * <p>
	 * Name: variant
	 * </p>
	 */
	public static McObfPair field_177519_c = McMappingDatabase.getSRG("field_177519_c");

}

package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockModelRenderer$Orientation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvo$d";
		else
			return "net/minecraft/client/renderer/BlockModelRenderer$Orientation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvo$d";
		else
			return "BlockModelRenderer$Orientation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvo$d;";
		else
			return "Lnet/minecraft/client/renderer/BlockModelRenderer$Orientation;";
	}

	/**
	 * <p>
	 * Name: shape
	 * </p>
	 */
	public static McObfPair field_178229_m = McMappingDatabase.getSRG("field_178229_m");

}

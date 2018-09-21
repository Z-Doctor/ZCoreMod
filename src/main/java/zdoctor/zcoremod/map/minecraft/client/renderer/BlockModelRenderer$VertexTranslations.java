package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockModelRenderer$VertexTranslations {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvo$c";
		else
			return "net/minecraft/client/renderer/BlockModelRenderer$VertexTranslations";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvo$c";
		else
			return "BlockModelRenderer$VertexTranslations";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvo$c;";
		else
			return "Lnet/minecraft/client/renderer/BlockModelRenderer$VertexTranslations;";
	}

	/**
	 * <p>
	 * Name: VALUES
	 * </p>
	 */
	public static McObfPair field_178199_k = McMappingDatabase.getSRG("field_178199_k");

	/**
	 * <p>
	 * Name: getVertexTranslations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/client/renderer/BlockModelRenderer$VertexTranslations;]
	 * </p>
	 */
	public static McObfPair func_178184_a = McMappingDatabase.getSRG("BlockModelRenderer$VertexTranslations.func_178184_a");

	/**
	 * <p>
	 * Name: vert1
	 * </p>
	 */
	public static McObfPair field_178200_h = McMappingDatabase.getSRG("field_178200_h");

	/**
	 * <p>
	 * Name: vert2
	 * </p>
	 */
	public static McObfPair field_178201_i = McMappingDatabase.getSRG("field_178201_i");

	/**
	 * <p>
	 * Name: vert0
	 * </p>
	 */
	public static McObfPair field_178191_g = McMappingDatabase.getSRG("field_178191_g");

	/**
	 * <p>
	 * Name: vert3
	 * </p>
	 */
	public static McObfPair field_178198_j = McMappingDatabase.getSRG("field_178198_j");

}

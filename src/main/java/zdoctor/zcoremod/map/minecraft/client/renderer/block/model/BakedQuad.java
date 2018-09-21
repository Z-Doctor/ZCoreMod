package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BakedQuad {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvp";
		else
			return "net/minecraft/client/renderer/block/model/BakedQuad";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvp";
		else
			return "BakedQuad";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvp;";
		else
			return "Lnet/minecraft/client/renderer/block/model/BakedQuad;";
	}

	/**
	 * <p>
	 * Name: hasTintIndex
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178212_b = McMappingDatabase.getSRG("BakedQuad.func_178212_b");

	/**
	 * <p>
	 * Name: getTintIndex
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178211_c = McMappingDatabase.getSRG("BakedQuad.func_178211_c");

	/**
	 * <p>
	 * Name: vertexData
	 * </p>
	 */
	public static McObfPair field_178215_a = McMappingDatabase.getSRG("field_178215_a");

	/**
	 * <p>
	 * Name: sprite
	 * </p>
	 */
	public static McObfPair field_187509_d = McMappingDatabase.getSRG("field_187509_d");

	/**
	 * <p>
	 * Name: getSprite
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;]
	 * </p>
	 */
	public static McObfPair func_187508_a = McMappingDatabase.getSRG("BakedQuad.func_187508_a");

	/**
	 * <p>
	 * Name: tintIndex
	 * </p>
	 */
	public static McObfPair field_178213_b = McMappingDatabase.getSRG("field_178213_b");

	/**
	 * <p>
	 * Name: getVertexData
	 * </p>
	 * <p>
	 * Desc: [()[I]
	 * </p>
	 */
	public static McObfPair func_178209_a = McMappingDatabase.getSRG("BakedQuad.func_178209_a");

	/**
	 * <p>
	 * Name: face
	 * </p>
	 */
	public static McObfPair field_178214_c = McMappingDatabase.getSRG("field_178214_c");

	/**
	 * <p>
	 * Name: getFace
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_178210_d = McMappingDatabase.getSRG("BakedQuad.func_178210_d");

}

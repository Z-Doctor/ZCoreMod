package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TexturedQuad {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bql";
		else
			return "net/minecraft/client/model/TexturedQuad";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bql";
		else
			return "TexturedQuad";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbql;";
		else
			return "Lnet/minecraft/client/model/TexturedQuad;";
	}

	/**
	 * <p>
	 * Name: draw
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;F)V]
	 * </p>
	 */
	public static McObfPair func_178765_a = McMappingDatabase.getSRG("TexturedQuad.func_178765_a");

	/**
	 * <p>
	 * Name: invertNormal
	 * </p>
	 */
	public static McObfPair field_78238_c = McMappingDatabase.getSRG("field_78238_c");

	/**
	 * <p>
	 * Name: vertexPositions
	 * </p>
	 */
	public static McObfPair field_78239_a = McMappingDatabase.getSRG("field_78239_a");

	/**
	 * <p>
	 * Name: flipFace
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78235_a = McMappingDatabase.getSRG("TexturedQuad.func_78235_a");

	/**
	 * <p>
	 * Name: nVertices
	 * </p>
	 */
	public static McObfPair field_78237_b = McMappingDatabase.getSRG("field_78237_b");

}

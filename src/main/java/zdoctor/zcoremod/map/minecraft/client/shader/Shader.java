package zdoctor.zcoremod.map.minecraft.client.shader;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Shader {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccz";
		else
			return "net/minecraft/client/shader/Shader";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccz";
		else
			return "Shader";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lccz;";
		else
			return "Lnet/minecraft/client/shader/Shader;";
	}

	/**
	 * <p>
	 * Name: deleteShader
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148044_b = McMappingDatabase.getSRG("Shader.func_148044_b");

	/**
	 * <p>
	 * Name: projectionMatrix
	 * </p>
	 */
	public static McObfPair field_148053_h = McMappingDatabase.getSRG("field_148053_h");

	/**
	 * <p>
	 * Name: listAuxFramebuffers
	 * </p>
	 */
	public static McObfPair field_148048_d = McMappingDatabase.getSRG("field_148048_d");

	/**
	 * <p>
	 * Name: manager
	 * </p>
	 */
	public static McObfPair field_148051_c = McMappingDatabase.getSRG("field_148051_c");

	/**
	 * <p>
	 * Name: framebufferIn
	 * </p>
	 */
	public static McObfPair field_148052_a = McMappingDatabase.getSRG("field_148052_a");

	/**
	 * <p>
	 * Name: addAuxFramebuffer
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/Object;II)V]
	 * </p>
	 */
	public static McObfPair func_148041_a = McMappingDatabase.getSRG("Shader.func_148041_a");

	/**
	 * <p>
	 * Name: preRender
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148040_d = McMappingDatabase.getSRG("Shader.func_148040_d");

	/**
	 * <p>
	 * Name: framebufferOut
	 * </p>
	 */
	public static McObfPair field_148050_b = McMappingDatabase.getSRG("field_148050_b");

	/**
	 * <p>
	 * Name: setProjectionMatrix
	 * </p>
	 * <p>
	 * Desc: [(Lorg/lwjgl/util/vector/Matrix4f;)V]
	 * </p>
	 */
	public static McObfPair func_148045_a = McMappingDatabase.getSRG("Shader.func_148045_a");

	/**
	 * <p>
	 * Name: listAuxWidths
	 * </p>
	 */
	public static McObfPair field_148046_f = McMappingDatabase.getSRG("field_148046_f");

	/**
	 * <p>
	 * Name: getShaderManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/shader/ShaderManager;]
	 * </p>
	 */
	public static McObfPair func_148043_c = McMappingDatabase.getSRG("Shader.func_148043_c");

	/**
	 * <p>
	 * Name: listAuxNames
	 * </p>
	 */
	public static McObfPair field_148049_e = McMappingDatabase.getSRG("field_148049_e");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_148042_a = McMappingDatabase.getSRG("Shader.func_148042_a");

	/**
	 * <p>
	 * Name: listAuxHeights
	 * </p>
	 */
	public static McObfPair field_148047_g = McMappingDatabase.getSRG("field_148047_g");

}

package zdoctor.zcoremod.map.minecraft.client.shader;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ShaderUniform {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdc";
		else
			return "net/minecraft/client/shader/ShaderUniform";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdc";
		else
			return "ShaderUniform";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdc;";
		else
			return "Lnet/minecraft/client/shader/ShaderUniform;";
	}

	/**
	 * <p>
	 * Name: uniformLocation
	 * </p>
	 */
	public static McObfPair field_148102_b = McMappingDatabase.getSRG("field_148102_b");

	/**
	 * <p>
	 * Name: uploadFloatMatrix
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148082_k = McMappingDatabase.getSRG("ShaderUniform.func_148082_k");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_148087_a = McMappingDatabase.getSRG("ShaderUniform.func_148087_a");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_148090_a = McMappingDatabase.getSRG("ShaderUniform.func_148090_a");

	/**
	 * <p>
	 * Name: shaderManager
	 * </p>
	 */
	public static McObfPair field_148106_i = McMappingDatabase.getSRG("field_148106_i");

	/**
	 * <p>
	 * Name: markDirty
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148096_h = McMappingDatabase.getSRG("ShaderUniform.func_148096_h");

	/**
	 * <p>
	 * Name: shaderName
	 * </p>
	 */
	public static McObfPair field_148099_g = McMappingDatabase.getSRG("field_148099_g");

	/**
	 * <p>
	 * Name: getShaderName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148086_a = McMappingDatabase.getSRG("ShaderUniform.func_148086_a");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_148083_a = McMappingDatabase.getSRG("ShaderUniform.func_148083_a");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [([F)V]
	 * </p>
	 */
	public static McObfPair func_148097_a = McMappingDatabase.getSRG("ShaderUniform.func_148097_a");

	/**
	 * <p>
	 * Name: uniformIntBuffer
	 * </p>
	 */
	public static McObfPair field_148101_e = McMappingDatabase.getSRG("field_148101_e");

	/**
	 * <p>
	 * Name: uniformCount
	 * </p>
	 */
	public static McObfPair field_148103_c = McMappingDatabase.getSRG("field_148103_c");

	/**
	 * <p>
	 * Name: uploadFloat
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148089_j = McMappingDatabase.getSRG("ShaderUniform.func_148089_j");

	/**
	 * <p>
	 * Name: setSafe
	 * </p>
	 * <p>
	 * Desc: [(FFFF)V]
	 * </p>
	 */
	public static McObfPair func_148092_b = McMappingDatabase.getSRG("ShaderUniform.func_148092_b");

	/**
	 * <p>
	 * Name: dirty
	 * </p>
	 */
	public static McObfPair field_148105_h = McMappingDatabase.getSRG("field_148105_h");

	/**
	 * <p>
	 * Name: uniformFloatBuffer
	 * </p>
	 */
	public static McObfPair field_148098_f = McMappingDatabase.getSRG("field_148098_f");

	/**
	 * <p>
	 * Name: uniformType
	 * </p>
	 */
	public static McObfPair field_148100_d = McMappingDatabase.getSRG("field_148100_d");

	/**
	 * <p>
	 * Name: parseType
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_148085_a = McMappingDatabase.getSRG("ShaderUniform.func_148085_a");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(Lorg/lwjgl/util/vector/Matrix4f;)V]
	 * </p>
	 */
	public static McObfPair func_148088_a = McMappingDatabase.getSRG("ShaderUniform.func_148088_a");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_148095_a = McMappingDatabase.getSRG("ShaderUniform.func_148095_a");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFFFFFFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_148094_a = McMappingDatabase.getSRG("ShaderUniform.func_148094_a");

	/**
	 * <p>
	 * Name: setUniformLocation
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_148084_b = McMappingDatabase.getSRG("ShaderUniform.func_148084_b");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(FFFF)V]
	 * </p>
	 */
	public static McObfPair func_148081_a = McMappingDatabase.getSRG("ShaderUniform.func_148081_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_148104_a = McMappingDatabase.getSRG("field_148104_a");

	/**
	 * <p>
	 * Name: upload
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148093_b = McMappingDatabase.getSRG("ShaderUniform.func_148093_b");

	/**
	 * <p>
	 * Name: uploadInt
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148091_i = McMappingDatabase.getSRG("ShaderUniform.func_148091_i");

}

package zdoctor.zcoremod.map.minecraft.client.shader;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ShaderManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccx";
		else
			return "net/minecraft/client/shader/ShaderManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccx";
		else
			return "ShaderManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lccx;";
		else
			return "Lnet/minecraft/client/shader/ShaderManager;";
	}

	/**
	 * <p>
	 * Name: addSamplerTexture
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_147992_a = McMappingDatabase.getSRG("ShaderManager.func_147992_a");

	/**
	 * <p>
	 * Name: DEFAULT_SHADER_UNIFORM
	 * </p>
	 */
	public static McObfPair field_148001_b = McMappingDatabase.getSRG("field_148001_b");

	/**
	 * <p>
	 * Name: shaderUniformLocations
	 * </p>
	 */
	public static McObfPair field_148008_j = McMappingDatabase.getSRG("field_148008_j");

	/**
	 * <p>
	 * Name: getProgram
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_147986_h = McMappingDatabase.getSRG("ShaderManager.func_147986_h");

	/**
	 * <p>
	 * Name: setupUniforms
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147990_i = McMappingDatabase.getSRG("ShaderManager.func_147990_i");

	/**
	 * <p>
	 * Name: deleteShader
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147988_a = McMappingDatabase.getSRG("ShaderManager.func_147988_a");

	/**
	 * <p>
	 * Name: attributes
	 * </p>
	 */
	public static McObfPair field_148014_r = McMappingDatabase.getSRG("field_148014_r");

	/**
	 * <p>
	 * Name: currentProgram
	 * </p>
	 */
	public static McObfPair field_147999_d = McMappingDatabase.getSRG("field_147999_d");

	/**
	 * <p>
	 * Name: markDirty
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147985_d = McMappingDatabase.getSRG("ShaderManager.func_147985_d");

	/**
	 * <p>
	 * Name: getShaderUniform
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/shader/ShaderUniform;]
	 * </p>
	 */
	public static McObfPair func_147991_a = McMappingDatabase.getSRG("ShaderManager.func_147991_a");

	/**
	 * <p>
	 * Name: parseSampler
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)V]
	 * </p>
	 */
	public static McObfPair func_147996_a = McMappingDatabase.getSRG("ShaderManager.func_147996_a");

	/**
	 * <p>
	 * Name: fragmentShaderLoader
	 * </p>
	 */
	public static McObfPair field_148012_t = McMappingDatabase.getSRG("field_148012_t");

	/**
	 * <p>
	 * Name: staticShaderManager
	 * </p>
	 */
	public static McObfPair field_148002_c = McMappingDatabase.getSRG("field_148002_c");

	/**
	 * <p>
	 * Name: getVertexShaderLoader
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/shader/ShaderLoader;]
	 * </p>
	 */
	public static McObfPair func_147989_e = McMappingDatabase.getSRG("ShaderManager.func_147989_e");

	/**
	 * <p>
	 * Name: attribLocations
	 * </p>
	 */
	public static McObfPair field_148015_q = McMappingDatabase.getSRG("field_148015_q");

	/**
	 * <p>
	 * Name: shaderUniforms
	 * </p>
	 */
	public static McObfPair field_148011_i = McMappingDatabase.getSRG("field_148011_i");

	/**
	 * <p>
	 * Name: program
	 * </p>
	 */
	public static McObfPair field_148006_l = McMappingDatabase.getSRG("field_148006_l");

	/**
	 * <p>
	 * Name: vertexShaderLoader
	 * </p>
	 */
	public static McObfPair field_148013_s = McMappingDatabase.getSRG("field_148013_s");

	/**
	 * <p>
	 * Name: isDirty
	 * </p>
	 */
	public static McObfPair field_148005_o = McMappingDatabase.getSRG("field_148005_o");

	/**
	 * <p>
	 * Name: shaderSamplers
	 * </p>
	 */
	public static McObfPair field_147997_f = McMappingDatabase.getSRG("field_147997_f");

	/**
	 * <p>
	 * Name: parseUniform
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)V]
	 * </p>
	 */
	public static McObfPair func_147987_b = McMappingDatabase.getSRG("ShaderManager.func_147987_b");

	/**
	 * <p>
	 * Name: programFilename
	 * </p>
	 */
	public static McObfPair field_148007_m = McMappingDatabase.getSRG("field_148007_m");

	/**
	 * <p>
	 * Name: samplerNames
	 * </p>
	 */
	public static McObfPair field_147998_g = McMappingDatabase.getSRG("field_147998_g");

	/**
	 * <p>
	 * Name: lastCull
	 * </p>
	 */
	public static McObfPair field_148000_e = McMappingDatabase.getSRG("field_148000_e");

	/**
	 * <p>
	 * Name: mappedShaderUniforms
	 * </p>
	 */
	public static McObfPair field_148009_k = McMappingDatabase.getSRG("field_148009_k");

	/**
	 * <p>
	 * Name: shaderSamplerLocations
	 * </p>
	 */
	public static McObfPair field_148010_h = McMappingDatabase.getSRG("field_148010_h");

	/**
	 * <p>
	 * Name: blendingMode
	 * </p>
	 */
	public static McObfPair field_148016_p = McMappingDatabase.getSRG("field_148016_p");

	/**
	 * <p>
	 * Name: endShader
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147993_b = McMappingDatabase.getSRG("ShaderManager.func_147993_b");

	/**
	 * <p>
	 * Name: useShader
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147995_c = McMappingDatabase.getSRG("ShaderManager.func_147995_c");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_148003_a = McMappingDatabase.getSRG("field_148003_a");

	/**
	 * <p>
	 * Name: useFaceCulling
	 * </p>
	 */
	public static McObfPair field_148004_n = McMappingDatabase.getSRG("field_148004_n");

	/**
	 * <p>
	 * Name: getShaderUniformOrDefault
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/shader/ShaderUniform;]
	 * </p>
	 */
	public static McObfPair func_147984_b = McMappingDatabase.getSRG("ShaderManager.func_147984_b");

	/**
	 * <p>
	 * Name: getFragmentShaderLoader
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/shader/ShaderLoader;]
	 * </p>
	 */
	public static McObfPair func_147994_f = McMappingDatabase.getSRG("ShaderManager.func_147994_f");

}

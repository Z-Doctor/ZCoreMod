package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class OpenGlHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cii";
		else
			return "net/minecraft/client/renderer/OpenGlHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cii";
		else
			return "OpenGlHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcii;";
		else
			return "Lnet/minecraft/client/renderer/OpenGlHelper;";
	}

	/**
	 * <p>
	 * Name: framebufferType
	 * </p>
	 */
	public static McObfPair field_153212_w = McMappingDatabase.getSRG("field_153212_w");

	/**
	 * <p>
	 * Name: GL_OPERAND2_ALPHA
	 * </p>
	 */
	public static McObfPair field_176087_K = McMappingDatabase.getSRG("field_176087_K");

	/**
	 * <p>
	 * Name: framebufferSupported
	 * </p>
	 */
	public static McObfPair field_148823_f = McMappingDatabase.getSRG("field_148823_f");

	/**
	 * <p>
	 * Name: GL_SOURCE2_RGB
	 * </p>
	 */
	public static McObfPair field_176080_A = McMappingDatabase.getSRG("field_176080_A");

	/**
	 * <p>
	 * Name: areShadersSupported
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_153193_b = McMappingDatabase.getSRG("OpenGlHelper.func_153193_b");

	/**
	 * <p>
	 * Name: glFramebufferRenderbuffer
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_153190_b = McMappingDatabase.getSRG("OpenGlHelper.func_153190_b");

	/**
	 * <p>
	 * Name: glBindFramebuffer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_153171_g = McMappingDatabase.getSRG("OpenGlHelper.func_153171_g");

	/**
	 * <p>
	 * Name: GL_PREVIOUS
	 * </p>
	 */
	public static McObfPair field_176091_w = McMappingDatabase.getSRG("field_176091_w");

	/**
	 * <p>
	 * Name: arbMultitexture
	 * </p>
	 */
	public static McObfPair field_153215_z = McMappingDatabase.getSRG("field_153215_z");

	/**
	 * <p>
	 * Name: glAttachShader
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_153178_b = McMappingDatabase.getSRG("OpenGlHelper.func_153178_b");

	/**
	 * <p>
	 * Name: glDeleteBuffers
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_176074_g = McMappingDatabase.getSRG("OpenGlHelper.func_176074_g");

	/**
	 * <p>
	 * Name: arbTextureEnvCombine
	 * </p>
	 */
	public static McObfPair field_176088_V = McMappingDatabase.getSRG("field_176088_V");

	/**
	 * <p>
	 * Name: GL_COMBINE_ALPHA
	 * </p>
	 */
	public static McObfPair field_176077_E = McMappingDatabase.getSRG("field_176077_E");

	/**
	 * <p>
	 * Name: cpu
	 * </p>
	 */
	public static McObfPair field_183030_aa = McMappingDatabase.getSRG("field_183030_aa");

	/**
	 * <p>
	 * Name: GL_CONSTANT
	 * </p>
	 */
	public static McObfPair field_176092_v = McMappingDatabase.getSRG("field_176092_v");

	/**
	 * <p>
	 * Name: GL_TEXTURE2
	 * </p>
	 */
	public static McObfPair field_176096_r = McMappingDatabase.getSRG("field_176096_r");

	/**
	 * <p>
	 * Name: glUniform1i
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_153163_f = McMappingDatabase.getSRG("OpenGlHelper.func_153163_f");

	/**
	 * <p>
	 * Name: glGenBuffers
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176073_e = McMappingDatabase.getSRG("OpenGlHelper.func_176073_e");

	/**
	 * <p>
	 * Name: glUniformMatrix3
	 * </p>
	 * <p>
	 * Desc: [(IZLjava/nio/FloatBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_153189_b = McMappingDatabase.getSRG("OpenGlHelper.func_153189_b");

	/**
	 * <p>
	 * Name: useVbo
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_176075_f = McMappingDatabase.getSRG("OpenGlHelper.func_176075_f");

	/**
	 * <p>
	 * Name: GL_SOURCE2_ALPHA
	 * </p>
	 */
	public static McObfPair field_176084_H = McMappingDatabase.getSRG("field_176084_H");

	/**
	 * <p>
	 * Name: openGL21
	 * </p>
	 */
	public static McObfPair field_148827_a = McMappingDatabase.getSRG("field_148827_a");

	/**
	 * <p>
	 * Name: setActiveTexture
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_77473_a = McMappingDatabase.getSRG("OpenGlHelper.func_77473_a");

	/**
	 * <p>
	 * Name: glUniform1
	 * </p>
	 * <p>
	 * Desc: [(ILjava/nio/IntBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_153181_a = McMappingDatabase.getSRG("OpenGlHelper.func_153181_a");

	/**
	 * <p>
	 * Name: arbVbo
	 * </p>
	 */
	public static McObfPair field_176090_Y = McMappingDatabase.getSRG("field_176090_Y");

	/**
	 * <p>
	 * Name: defaultTexUnit
	 * </p>
	 */
	public static McObfPair field_77478_a = McMappingDatabase.getSRG("field_77478_a");

	/**
	 * <p>
	 * Name: initializeTextures
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_77474_a = McMappingDatabase.getSRG("OpenGlHelper.func_77474_a");

	/**
	 * <p>
	 * Name: renderDirections
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_188785_m = McMappingDatabase.getSRG("OpenGlHelper.func_188785_m");

	/**
	 * <p>
	 * Name: glShaderSource
	 * </p>
	 * <p>
	 * Desc: [(ILjava/nio/ByteBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_153169_a = McMappingDatabase.getSRG("OpenGlHelper.func_153169_a");

	/**
	 * <p>
	 * Name: glUniformMatrix2
	 * </p>
	 * <p>
	 * Desc: [(IZLjava/nio/FloatBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_153173_a = McMappingDatabase.getSRG("OpenGlHelper.func_153173_a");

	/**
	 * <p>
	 * Name: glGetProgrami
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_153175_a = McMappingDatabase.getSRG("OpenGlHelper.func_153175_a");

	/**
	 * <p>
	 * Name: glUniform2
	 * </p>
	 * <p>
	 * Desc: [(ILjava/nio/IntBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_153182_b = McMappingDatabase.getSRG("OpenGlHelper.func_153182_b");

	/**
	 * <p>
	 * Name: openFile
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;)V]
	 * </p>
	 */
	public static McObfPair func_188786_a = McMappingDatabase.getSRG("OpenGlHelper.func_188786_a");

	/**
	 * <p>
	 * Name: GL_FB_INCOMPLETE_READ_BUFFER
	 * </p>
	 */
	public static McObfPair field_153206_m = McMappingDatabase.getSRG("field_153206_m");

	/**
	 * <p>
	 * Name: nvidia
	 * </p>
	 */
	public static McObfPair field_153197_d = McMappingDatabase.getSRG("field_153197_d");

	/**
	 * <p>
	 * Name: GL_SOURCE1_RGB
	 * </p>
	 */
	public static McObfPair field_176097_z = McMappingDatabase.getSRG("field_176097_z");

	/**
	 * <p>
	 * Name: GL_SOURCE0_RGB
	 * </p>
	 */
	public static McObfPair field_176098_y = McMappingDatabase.getSRG("field_176098_y");

	/**
	 * <p>
	 * Name: GL_FB_INCOMPLETE_DRAW_BUFFER
	 * </p>
	 */
	public static McObfPair field_153205_l = McMappingDatabase.getSRG("field_153205_l");

	/**
	 * <p>
	 * Name: GL_FB_INCOMPLETE_ATTACHMENT
	 * </p>
	 */
	public static McObfPair field_153203_j = McMappingDatabase.getSRG("field_153203_j");

	/**
	 * <p>
	 * Name: GL_RENDERBUFFER
	 * </p>
	 */
	public static McObfPair field_153199_f = McMappingDatabase.getSRG("field_153199_f");

	/**
	 * <p>
	 * Name: GL_STATIC_DRAW
	 * </p>
	 */
	public static McObfPair field_148826_e = McMappingDatabase.getSRG("field_148826_e");

	/**
	 * <p>
	 * Name: glCheckFramebufferStatus
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_153167_i = McMappingDatabase.getSRG("OpenGlHelper.func_153167_i");

	/**
	 * <p>
	 * Name: logText
	 * </p>
	 */
	public static McObfPair field_153196_B = McMappingDatabase.getSRG("field_153196_B");

	/**
	 * <p>
	 * Name: glGetProgramInfoLog
	 * </p>
	 * <p>
	 * Desc: [(II)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_153166_e = McMappingDatabase.getSRG("OpenGlHelper.func_153166_e");

	/**
	 * <p>
	 * Name: glCreateProgram
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_153183_d = McMappingDatabase.getSRG("OpenGlHelper.func_153183_d");

	/**
	 * <p>
	 * Name: glUniform2
	 * </p>
	 * <p>
	 * Desc: [(ILjava/nio/FloatBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_153177_b = McMappingDatabase.getSRG("OpenGlHelper.func_153177_b");

	/**
	 * <p>
	 * Name: glUniform3
	 * </p>
	 * <p>
	 * Desc: [(ILjava/nio/FloatBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_153191_c = McMappingDatabase.getSRG("OpenGlHelper.func_153191_c");

	/**
	 * <p>
	 * Name: GL_VERTEX_SHADER
	 * </p>
	 */
	public static McObfPair field_153209_q = McMappingDatabase.getSRG("field_153209_q");

	/**
	 * <p>
	 * Name: glRenderbufferStorage
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_153186_a = McMappingDatabase.getSRG("OpenGlHelper.func_153186_a");

	/**
	 * <p>
	 * Name: glFramebufferTexture2D
	 * </p>
	 * <p>
	 * Desc: [(IIIII)V]
	 * </p>
	 */
	public static McObfPair func_153188_a = McMappingDatabase.getSRG("OpenGlHelper.func_153188_a");

	/**
	 * <p>
	 * Name: vboSupportedAti
	 * </p>
	 */
	public static McObfPair field_181062_Q = McMappingDatabase.getSRG("field_181062_Q");

	/**
	 * <p>
	 * Name: GL_SOURCE0_ALPHA
	 * </p>
	 */
	public static McObfPair field_176078_F = McMappingDatabase.getSRG("field_176078_F");

	/**
	 * <p>
	 * Name: GL_INTERPOLATE
	 * </p>
	 */
	public static McObfPair field_176094_t = McMappingDatabase.getSRG("field_176094_t");

	/**
	 * <p>
	 * Name: glCompileShader
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_153170_c = McMappingDatabase.getSRG("OpenGlHelper.func_153170_c");

	/**
	 * <p>
	 * Name: glUseProgram
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_153161_d = McMappingDatabase.getSRG("OpenGlHelper.func_153161_d");

	/**
	 * <p>
	 * Name: glGetShaderi
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_153157_c = McMappingDatabase.getSRG("OpenGlHelper.func_153157_c");

	/**
	 * <p>
	 * Name: GL_COMBINE
	 * </p>
	 */
	public static McObfPair field_176095_s = McMappingDatabase.getSRG("field_176095_s");

	/**
	 * <p>
	 * Name: glUniform3
	 * </p>
	 * <p>
	 * Desc: [(ILjava/nio/IntBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_153192_c = McMappingDatabase.getSRG("OpenGlHelper.func_153192_c");

	/**
	 * <p>
	 * Name: glUniform1
	 * </p>
	 * <p>
	 * Desc: [(ILjava/nio/FloatBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_153168_a = McMappingDatabase.getSRG("OpenGlHelper.func_153168_a");

	/**
	 * <p>
	 * Name: glGenFramebuffers
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_153165_e = McMappingDatabase.getSRG("OpenGlHelper.func_153165_e");

	/**
	 * <p>
	 * Name: GL_FRAMEBUFFER
	 * </p>
	 */
	public static McObfPair field_153198_e = McMappingDatabase.getSRG("field_153198_e");

	/**
	 * <p>
	 * Name: GL_FRAGMENT_SHADER
	 * </p>
	 */
	public static McObfPair field_153210_r = McMappingDatabase.getSRG("field_153210_r");

	/**
	 * <p>
	 * Name: GL_OPERAND0_RGB
	 * </p>
	 */
	public static McObfPair field_176081_B = McMappingDatabase.getSRG("field_176081_B");

	/**
	 * <p>
	 * Name: glDeleteRenderbuffers
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_153184_g = McMappingDatabase.getSRG("OpenGlHelper.func_153184_g");

	/**
	 * <p>
	 * Name: GL_ARRAY_BUFFER
	 * </p>
	 */
	public static McObfPair field_176089_P = McMappingDatabase.getSRG("field_176089_P");

	/**
	 * <p>
	 * Name: lightmapTexUnit
	 * </p>
	 */
	public static McObfPair field_77476_b = McMappingDatabase.getSRG("field_77476_b");

	/**
	 * <p>
	 * Name: GL_COMBINE_RGB
	 * </p>
	 */
	public static McObfPair field_176099_x = McMappingDatabase.getSRG("field_176099_x");

	/**
	 * <p>
	 * Name: glDeleteProgram
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_153187_e = McMappingDatabase.getSRG("OpenGlHelper.func_153187_e");

	/**
	 * <p>
	 * Name: GL_DEPTH_ATTACHMENT
	 * </p>
	 */
	public static McObfPair field_153201_h = McMappingDatabase.getSRG("field_153201_h");

	/**
	 * <p>
	 * Name: extBlendFuncSeparate
	 * </p>
	 */
	public static McObfPair field_153211_u = McMappingDatabase.getSRG("field_153211_u");

	/**
	 * <p>
	 * Name: glBlendFunc
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_148821_a = McMappingDatabase.getSRG("OpenGlHelper.func_148821_a");

	/**
	 * <p>
	 * Name: GL_COMPILE_STATUS
	 * </p>
	 */
	public static McObfPair field_153208_p = McMappingDatabase.getSRG("field_153208_p");

	/**
	 * <p>
	 * Name: GL_OPERAND0_ALPHA
	 * </p>
	 */
	public static McObfPair field_176085_I = McMappingDatabase.getSRG("field_176085_I");

	/**
	 * <p>
	 * Name: glGetShaderInfoLog
	 * </p>
	 * <p>
	 * Desc: [(II)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_153158_d = McMappingDatabase.getSRG("OpenGlHelper.func_153158_d");

	/**
	 * <p>
	 * Name: glUniformMatrix4
	 * </p>
	 * <p>
	 * Desc: [(IZLjava/nio/FloatBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_153160_c = McMappingDatabase.getSRG("OpenGlHelper.func_153160_c");

	/**
	 * <p>
	 * Name: setClientActiveTexture
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_77472_b = McMappingDatabase.getSRG("OpenGlHelper.func_77472_b");

	/**
	 * <p>
	 * Name: getCpu
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_183029_j = McMappingDatabase.getSRG("OpenGlHelper.func_183029_j");

	/**
	 * <p>
	 * Name: glGetUniformLocation
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/CharSequence;)I]
	 * </p>
	 */
	public static McObfPair func_153194_a = McMappingDatabase.getSRG("OpenGlHelper.func_153194_a");

	/**
	 * <p>
	 * Name: glUniform4
	 * </p>
	 * <p>
	 * Desc: [(ILjava/nio/FloatBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_153159_d = McMappingDatabase.getSRG("OpenGlHelper.func_153159_d");

	/**
	 * <p>
	 * Name: glBindRenderbuffer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_153176_h = McMappingDatabase.getSRG("OpenGlHelper.func_153176_h");

	/**
	 * <p>
	 * Name: GL_COLOR_ATTACHMENT0
	 * </p>
	 */
	public static McObfPair field_153200_g = McMappingDatabase.getSRG("field_153200_g");

	/**
	 * <p>
	 * Name: GL_OPERAND1_ALPHA
	 * </p>
	 */
	public static McObfPair field_176086_J = McMappingDatabase.getSRG("field_176086_J");

	/**
	 * <p>
	 * Name: GL_PRIMARY_COLOR
	 * </p>
	 */
	public static McObfPair field_176093_u = McMappingDatabase.getSRG("field_176093_u");

	/**
	 * <p>
	 * Name: GL_SOURCE1_ALPHA
	 * </p>
	 */
	public static McObfPair field_176079_G = McMappingDatabase.getSRG("field_176079_G");

	/**
	 * <p>
	 * Name: GL_OPERAND1_RGB
	 * </p>
	 */
	public static McObfPair field_176082_C = McMappingDatabase.getSRG("field_176082_C");

	/**
	 * <p>
	 * Name: glLinkProgram
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_153179_f = McMappingDatabase.getSRG("OpenGlHelper.func_153179_f");

	/**
	 * <p>
	 * Name: glCreateShader
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_153195_b = McMappingDatabase.getSRG("OpenGlHelper.func_153195_b");

	/**
	 * <p>
	 * Name: GL_LINK_STATUS
	 * </p>
	 */
	public static McObfPair field_153207_o = McMappingDatabase.getSRG("field_153207_o");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_188787_T = McMappingDatabase.getSRG("field_188787_T");

	/**
	 * <p>
	 * Name: openGL14
	 * </p>
	 */
	public static McObfPair field_148828_i = McMappingDatabase.getSRG("field_148828_i");

	/**
	 * <p>
	 * Name: glDeleteFramebuffers
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_153174_h = McMappingDatabase.getSRG("OpenGlHelper.func_153174_h");

	/**
	 * <p>
	 * Name: ati
	 * </p>
	 */
	public static McObfPair field_181063_b = McMappingDatabase.getSRG("field_181063_b");

	/**
	 * <p>
	 * Name: glUniform4
	 * </p>
	 * <p>
	 * Desc: [(ILjava/nio/IntBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_153162_d = McMappingDatabase.getSRG("OpenGlHelper.func_153162_d");

	/**
	 * <p>
	 * Name: GL_FB_INCOMPLETE_MISS_ATTACH
	 * </p>
	 */
	public static McObfPair field_153204_k = McMappingDatabase.getSRG("field_153204_k");

	/**
	 * <p>
	 * Name: glDeleteShader
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_153180_a = McMappingDatabase.getSRG("OpenGlHelper.func_153180_a");

	/**
	 * <p>
	 * Name: vboSupported
	 * </p>
	 */
	public static McObfPair field_176083_O = McMappingDatabase.getSRG("field_176083_O");

	/**
	 * <p>
	 * Name: arbShaders
	 * </p>
	 */
	public static McObfPair field_153214_y = McMappingDatabase.getSRG("field_153214_y");

	/**
	 * <p>
	 * Name: glGenRenderbuffers
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_153185_f = McMappingDatabase.getSRG("OpenGlHelper.func_153185_f");

	/**
	 * <p>
	 * Name: GL_FRAMEBUFFER_COMPLETE
	 * </p>
	 */
	public static McObfPair field_153202_i = McMappingDatabase.getSRG("field_153202_i");

	/**
	 * <p>
	 * Name: shadersAvailable
	 * </p>
	 */
	public static McObfPair field_153213_x = McMappingDatabase.getSRG("field_153213_x");

	/**
	 * <p>
	 * Name: GL_OPERAND2_RGB
	 * </p>
	 */
	public static McObfPair field_176076_D = McMappingDatabase.getSRG("field_176076_D");

	/**
	 * <p>
	 * Name: glGetAttribLocation
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/CharSequence;)I]
	 * </p>
	 */
	public static McObfPair func_153164_b = McMappingDatabase.getSRG("OpenGlHelper.func_153164_b");

	/**
	 * <p>
	 * Name: isFramebufferEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148822_b = McMappingDatabase.getSRG("OpenGlHelper.func_148822_b");

	/**
	 * <p>
	 * Name: glBindBuffer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_176072_g = McMappingDatabase.getSRG("OpenGlHelper.func_176072_g");

	/**
	 * <p>
	 * Name: getLogText
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_153172_c = McMappingDatabase.getSRG("OpenGlHelper.func_153172_c");

	/**
	 * <p>
	 * Name: shadersSupported
	 * </p>
	 */
	public static McObfPair field_148824_g = McMappingDatabase.getSRG("field_148824_g");

	/**
	 * <p>
	 * Name: setLightmapTextureCoords
	 * </p>
	 * <p>
	 * Desc: [(IFF)V]
	 * </p>
	 */
	public static McObfPair func_77475_a = McMappingDatabase.getSRG("OpenGlHelper.func_77475_a");

	/**
	 * <p>
	 * Name: glBufferData
	 * </p>
	 * <p>
	 * Desc: [(ILjava/nio/ByteBuffer;I)V]
	 * </p>
	 */
	public static McObfPair func_176071_a = McMappingDatabase.getSRG("OpenGlHelper.func_176071_a");

}

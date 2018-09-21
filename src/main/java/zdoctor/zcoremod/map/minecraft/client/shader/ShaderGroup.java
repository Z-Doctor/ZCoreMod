package zdoctor.zcoremod.map.minecraft.client.shader;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ShaderGroup {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccy";
		else
			return "net/minecraft/client/shader/ShaderGroup";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccy";
		else
			return "ShaderGroup";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lccy;";
		else
			return "Lnet/minecraft/client/shader/ShaderGroup;";
	}

	/**
	 * <p>
	 * Name: shaderGroupName
	 * </p>
	 */
	public static McObfPair field_148034_c = McMappingDatabase.getSRG("field_148034_c");

	/**
	 * <p>
	 * Name: initTarget
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)V]
	 * </p>
	 */
	public static McObfPair func_148027_a = McMappingDatabase.getSRG("ShaderGroup.func_148027_a");

	/**
	 * <p>
	 * Name: mapFramebuffers
	 * </p>
	 */
	public static McObfPair field_148032_e = McMappingDatabase.getSRG("field_148032_e");

	/**
	 * <p>
	 * Name: parsePass
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/TextureManager;Lcom/google/gson/JsonElement;)V]
	 * </p>
	 */
	public static McObfPair func_152764_a = McMappingDatabase.getSRG("ShaderGroup.func_152764_a");

	/**
	 * <p>
	 * Name: getShaderGroupName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148022_b = McMappingDatabase.getSRG("ShaderGroup.func_148022_b");

	/**
	 * <p>
	 * Name: getFramebuffer
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/shader/Framebuffer;]
	 * </p>
	 */
	public static McObfPair func_148017_a = McMappingDatabase.getSRG("ShaderGroup.func_148017_a");

	/**
	 * <p>
	 * Name: listFramebuffers
	 * </p>
	 */
	public static McObfPair field_148029_f = McMappingDatabase.getSRG("field_148029_f");

	/**
	 * <p>
	 * Name: mainFramebuffer
	 * </p>
	 */
	public static McObfPair field_148035_a = McMappingDatabase.getSRG("field_148035_a");

	/**
	 * <p>
	 * Name: lastStamp
	 * </p>
	 */
	public static McObfPair field_148037_k = McMappingDatabase.getSRG("field_148037_k");

	/**
	 * <p>
	 * Name: createBindFramebuffers
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_148026_a = McMappingDatabase.getSRG("ShaderGroup.func_148026_a");

	/**
	 * <p>
	 * Name: deleteShaderGroup
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148021_a = McMappingDatabase.getSRG("ShaderGroup.func_148021_a");

	/**
	 * <p>
	 * Name: addShader
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/client/shader/Framebuffer;Lnet/minecraft/client/shader/Framebuffer;)Lnet/minecraft/client/shader/Shader;]
	 * </p>
	 */
	public static McObfPair func_148023_a = McMappingDatabase.getSRG("ShaderGroup.func_148023_a");

	/**
	 * <p>
	 * Name: initUniform
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)V]
	 * </p>
	 */
	public static McObfPair func_148028_c = McMappingDatabase.getSRG("ShaderGroup.func_148028_c");

	/**
	 * <p>
	 * Name: resourceManager
	 * </p>
	 */
	public static McObfPair field_148033_b = McMappingDatabase.getSRG("field_148033_b");

	/**
	 * <p>
	 * Name: listShaders
	 * </p>
	 */
	public static McObfPair field_148031_d = McMappingDatabase.getSRG("field_148031_d");

	/**
	 * <p>
	 * Name: getFramebufferRaw
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/shader/Framebuffer;]
	 * </p>
	 */
	public static McObfPair func_177066_a = McMappingDatabase.getSRG("ShaderGroup.func_177066_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_148018_a = McMappingDatabase.getSRG("ShaderGroup.func_148018_a");

	/**
	 * <p>
	 * Name: mainFramebufferHeight
	 * </p>
	 */
	public static McObfPair field_148039_i = McMappingDatabase.getSRG("field_148039_i");

	/**
	 * <p>
	 * Name: mainFramebufferWidth
	 * </p>
	 */
	public static McObfPair field_148038_h = McMappingDatabase.getSRG("field_148038_h");

	/**
	 * <p>
	 * Name: time
	 * </p>
	 */
	public static McObfPair field_148036_j = McMappingDatabase.getSRG("field_148036_j");

	/**
	 * <p>
	 * Name: parseGroup
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/TextureManager;Lnet/minecraft/util/ResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_152765_a = McMappingDatabase.getSRG("ShaderGroup.func_152765_a");

	/**
	 * <p>
	 * Name: projectionMatrix
	 * </p>
	 */
	public static McObfPair field_148030_g = McMappingDatabase.getSRG("field_148030_g");

	/**
	 * <p>
	 * Name: addFramebuffer
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;II)V]
	 * </p>
	 */
	public static McObfPair func_148020_a = McMappingDatabase.getSRG("ShaderGroup.func_148020_a");

	/**
	 * <p>
	 * Name: resetProjectionMatrix
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148024_c = McMappingDatabase.getSRG("ShaderGroup.func_148024_c");

}

package zdoctor.zcoremod.map.minecraft.client.shader;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ShaderLoader {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cda";
		else
			return "net/minecraft/client/shader/ShaderLoader";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cda";
		else
			return "ShaderLoader";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcda;";
		else
			return "Lnet/minecraft/client/shader/ShaderLoader;";
	}

	/**
	 * <p>
	 * Name: deleteShader
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/shader/ShaderManager;)V]
	 * </p>
	 */
	public static McObfPair func_148054_b = McMappingDatabase.getSRG("ShaderLoader.func_148054_b");

	/**
	 * <p>
	 * Name: shader
	 * </p>
	 */
	public static McObfPair field_148060_c = McMappingDatabase.getSRG("field_148060_c");

	/**
	 * <p>
	 * Name: attachShader
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/shader/ShaderManager;)V]
	 * </p>
	 */
	public static McObfPair func_148056_a = McMappingDatabase.getSRG("ShaderLoader.func_148056_a");

	/**
	 * <p>
	 * Name: loadShader
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;Lnet/minecraft/client/shader/ShaderLoader$ShaderType;Ljava/lang/String;)Lnet/minecraft/client/shader/ShaderLoader;]
	 * </p>
	 */
	public static McObfPair func_148057_a = McMappingDatabase.getSRG("ShaderLoader.func_148057_a");

	/**
	 * <p>
	 * Name: getShaderFilename
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148055_a = McMappingDatabase.getSRG("ShaderLoader.func_148055_a");

	/**
	 * <p>
	 * Name: shaderAttachCount
	 * </p>
	 */
	public static McObfPair field_148058_d = McMappingDatabase.getSRG("field_148058_d");

	/**
	 * <p>
	 * Name: shaderFilename
	 * </p>
	 */
	public static McObfPair field_148059_b = McMappingDatabase.getSRG("field_148059_b");

	/**
	 * <p>
	 * Name: shaderType
	 * </p>
	 */
	public static McObfPair field_148061_a = McMappingDatabase.getSRG("field_148061_a");

}

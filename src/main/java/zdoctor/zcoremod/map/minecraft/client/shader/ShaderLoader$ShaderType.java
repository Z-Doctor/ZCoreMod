package zdoctor.zcoremod.map.minecraft.client.shader;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ShaderLoader$ShaderType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cda$a";
		else
			return "net/minecraft/client/shader/ShaderLoader$ShaderType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cda$a";
		else
			return "ShaderLoader$ShaderType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcda$a;";
		else
			return "Lnet/minecraft/client/shader/ShaderLoader$ShaderType;";
	}

	/**
	 * <p>
	 * Name: shaderName
	 * </p>
	 */
	public static McObfPair field_148072_c = McMappingDatabase.getSRG("field_148072_c");

	/**
	 * <p>
	 * Name: getShaderMode
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148065_c = McMappingDatabase.getSRG("ShaderLoader$ShaderType.func_148065_c");

	/**
	 * <p>
	 * Name: getShaderExtension
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148063_b = McMappingDatabase.getSRG("ShaderLoader$ShaderType.func_148063_b");

	/**
	 * <p>
	 * Name: getShaderName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148062_a = McMappingDatabase.getSRG("ShaderLoader$ShaderType.func_148062_a");

	/**
	 * <p>
	 * Name: loadedShaders
	 * </p>
	 */
	public static McObfPair field_148067_f = McMappingDatabase.getSRG("field_148067_f");

	/**
	 * <p>
	 * Name: shaderExtension
	 * </p>
	 */
	public static McObfPair field_148069_d = McMappingDatabase.getSRG("field_148069_d");

	/**
	 * <p>
	 * Name: shaderMode
	 * </p>
	 */
	public static McObfPair field_148070_e = McMappingDatabase.getSRG("field_148070_e");

	/**
	 * <p>
	 * Name: getLoadedShaders
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_148064_d = McMappingDatabase.getSRG("ShaderLoader$ShaderType.func_148064_d");

}

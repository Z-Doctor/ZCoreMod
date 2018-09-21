package zdoctor.zcoremod.map.minecraft.client.shader;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ShaderLinkHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdb";
		else
			return "net/minecraft/client/shader/ShaderLinkHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdb";
		else
			return "ShaderLinkHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdb;";
		else
			return "Lnet/minecraft/client/shader/ShaderLinkHelper;";
	}

	/**
	 * <p>
	 * Name: deleteShader
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/shader/ShaderManager;)V]
	 * </p>
	 */
	public static McObfPair func_148077_a = McMappingDatabase.getSRG("ShaderLinkHelper.func_148077_a");

	/**
	 * <p>
	 * Name: setNewStaticShaderLinkHelper
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148076_a = McMappingDatabase.getSRG("ShaderLinkHelper.func_148076_a");

	/**
	 * <p>
	 * Name: getStaticShaderLinkHelper
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/shader/ShaderLinkHelper;]
	 * </p>
	 */
	public static McObfPair func_148074_b = McMappingDatabase.getSRG("ShaderLinkHelper.func_148074_b");

	/**
	 * <p>
	 * Name: createProgram
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148078_c = McMappingDatabase.getSRG("ShaderLinkHelper.func_148078_c");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_148080_a = McMappingDatabase.getSRG("field_148080_a");

	/**
	 * <p>
	 * Name: staticShaderLinkHelper
	 * </p>
	 */
	public static McObfPair field_148079_b = McMappingDatabase.getSRG("field_148079_b");

	/**
	 * <p>
	 * Name: linkProgram
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/shader/ShaderManager;)V]
	 * </p>
	 */
	public static McObfPair func_148075_b = McMappingDatabase.getSRG("ShaderLinkHelper.func_148075_b");

}

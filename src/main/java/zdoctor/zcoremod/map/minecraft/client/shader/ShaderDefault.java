package zdoctor.zcoremod.map.minecraft.client.shader;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ShaderDefault {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccw";
		else
			return "net/minecraft/client/shader/ShaderDefault";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccw";
		else
			return "ShaderDefault";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lccw;";
		else
			return "Lnet/minecraft/client/shader/ShaderDefault;";
	}

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [([F)V]
	 * </p>
	 */
	public static McObfPair func_148097_a = McMappingDatabase.getSRG("ShaderDefault.func_148097_a");

	/**
	 * <p>
	 * Name: setSafe
	 * </p>
	 * <p>
	 * Desc: [(FFFF)V]
	 * </p>
	 */
	public static McObfPair func_148092_b = McMappingDatabase.getSRG("ShaderDefault.func_148092_b");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_148090_a = McMappingDatabase.getSRG("ShaderDefault.func_148090_a");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_148095_a = McMappingDatabase.getSRG("ShaderDefault.func_148095_a");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(Lorg/lwjgl/util/vector/Matrix4f;)V]
	 * </p>
	 */
	public static McObfPair func_148088_a = McMappingDatabase.getSRG("ShaderDefault.func_148088_a");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_148083_a = McMappingDatabase.getSRG("ShaderDefault.func_148083_a");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(FFFF)V]
	 * </p>
	 */
	public static McObfPair func_148081_a = McMappingDatabase.getSRG("ShaderDefault.func_148081_a");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_148087_a = McMappingDatabase.getSRG("ShaderDefault.func_148087_a");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFFFFFFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_148094_a = McMappingDatabase.getSRG("ShaderDefault.func_148094_a");

}

package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GLAllocation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bia";
		else
			return "net/minecraft/client/renderer/GLAllocation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bia";
		else
			return "GLAllocation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbia;";
		else
			return "Lnet/minecraft/client/renderer/GLAllocation;";
	}

	/**
	 * <p>
	 * Name: generateDisplayLists
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_74526_a = McMappingDatabase.getSRG("GLAllocation.func_74526_a");

	/**
	 * <p>
	 * Name: createDirectIntBuffer
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/nio/IntBuffer;]
	 * </p>
	 */
	public static McObfPair func_74527_f = McMappingDatabase.getSRG("GLAllocation.func_74527_f");

	/**
	 * <p>
	 * Name: deleteDisplayLists
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_178874_a = McMappingDatabase.getSRG("GLAllocation.func_178874_a");

	/**
	 * <p>
	 * Name: deleteDisplayLists
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_74523_b = McMappingDatabase.getSRG("GLAllocation.func_74523_b");

	/**
	 * <p>
	 * Name: createDirectByteBuffer
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/nio/ByteBuffer;]
	 * </p>
	 */
	public static McObfPair func_74524_c = McMappingDatabase.getSRG("GLAllocation.func_74524_c");

	/**
	 * <p>
	 * Name: createDirectFloatBuffer
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/nio/FloatBuffer;]
	 * </p>
	 */
	public static McObfPair func_74529_h = McMappingDatabase.getSRG("GLAllocation.func_74529_h");

}

package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BufferBuilder$State {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buk$a";
		else
			return "net/minecraft/client/renderer/BufferBuilder$State";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buk$a";
		else
			return "BufferBuilder$State";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbuk$a;";
		else
			return "Lnet/minecraft/client/renderer/BufferBuilder$State;";
	}

	/**
	 * <p>
	 * Name: stateRawBuffer
	 * </p>
	 */
	public static McObfPair field_179019_b = McMappingDatabase.getSRG("field_179019_b");

	/**
	 * <p>
	 * Name: getRawBuffer
	 * </p>
	 * <p>
	 * Desc: [()[I]
	 * </p>
	 */
	public static McObfPair func_179013_a = McMappingDatabase.getSRG("BufferBuilder$State.func_179013_a");

	/**
	 * <p>
	 * Name: stateVertexFormat
	 * </p>
	 */
	public static McObfPair field_179018_e = McMappingDatabase.getSRG("field_179018_e");

	/**
	 * <p>
	 * Name: getVertexCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179014_c = McMappingDatabase.getSRG("BufferBuilder$State.func_179014_c");

	/**
	 * <p>
	 * Name: getVertexFormat
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/vertex/VertexFormat;]
	 * </p>
	 */
	public static McObfPair func_179016_d = McMappingDatabase.getSRG("BufferBuilder$State.func_179016_d");

}

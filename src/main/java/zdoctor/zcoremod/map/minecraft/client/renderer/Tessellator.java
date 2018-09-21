package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Tessellator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bve";
		else
			return "net/minecraft/client/renderer/Tessellator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bve";
		else
			return "Tessellator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbve;";
		else
			return "Lnet/minecraft/client/renderer/Tessellator;";
	}

	/**
	 * <p>
	 * Name: getBuffer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/BufferBuilder;]
	 * </p>
	 */
	public static McObfPair func_178180_c = McMappingDatabase.getSRG("Tessellator.func_178180_c");

	/**
	 * <p>
	 * Name: draw
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78381_a = McMappingDatabase.getSRG("Tessellator.func_78381_a");

	/**
	 * <p>
	 * Name: vboUploader
	 * </p>
	 */
	public static McObfPair field_178182_b = McMappingDatabase.getSRG("field_178182_b");

	/**
	 * <p>
	 * Name: INSTANCE
	 * </p>
	 */
	public static McObfPair field_78398_a = McMappingDatabase.getSRG("field_78398_a");

	/**
	 * <p>
	 * Name: buffer
	 * </p>
	 */
	public static McObfPair field_178183_a = McMappingDatabase.getSRG("field_178183_a");

	/**
	 * <p>
	 * Name: getInstance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/Tessellator;]
	 * </p>
	 */
	public static McObfPair func_178181_a = McMappingDatabase.getSRG("Tessellator.func_178181_a");

}

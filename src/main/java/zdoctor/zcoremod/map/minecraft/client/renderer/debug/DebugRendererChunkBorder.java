package zdoctor.zcoremod.map.minecraft.client.renderer.debug;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DebugRendererChunkBorder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bye";
		else
			return "net/minecraft/client/renderer/debug/DebugRendererChunkBorder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bye";
		else
			return "DebugRendererChunkBorder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbye;";
		else
			return "Lnet/minecraft/client/renderer/debug/DebugRendererChunkBorder;";
	}

	/**
	 * <p>
	 * Name: minecraft
	 * </p>
	 */
	public static McObfPair field_190072_a = McMappingDatabase.getSRG("field_190072_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(FJ)V]
	 * </p>
	 */
	public static McObfPair func_190060_a = McMappingDatabase.getSRG("DebugRendererChunkBorder.func_190060_a");

}

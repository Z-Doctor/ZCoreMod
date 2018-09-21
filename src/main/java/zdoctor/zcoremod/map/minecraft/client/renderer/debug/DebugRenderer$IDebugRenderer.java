package zdoctor.zcoremod.map.minecraft.client.renderer.debug;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DebugRenderer$IDebugRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byg$a";
		else
			return "net/minecraft/client/renderer/debug/DebugRenderer$IDebugRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byg$a";
		else
			return "DebugRenderer$IDebugRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyg$a;";
		else
			return "Lnet/minecraft/client/renderer/debug/DebugRenderer$IDebugRenderer;";
	}

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(FJ)V]
	 * </p>
	 */
	public static McObfPair func_190060_a = McMappingDatabase.getSRG("DebugRenderer$IDebugRenderer.func_190060_a");

}

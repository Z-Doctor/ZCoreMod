package zdoctor.zcoremod.map.minecraft.client.renderer.debug;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DebugRendererHeightMap {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byh";
		else
			return "net/minecraft/client/renderer/debug/DebugRendererHeightMap";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byh";
		else
			return "DebugRendererHeightMap";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyh;";
		else
			return "Lnet/minecraft/client/renderer/debug/DebugRendererHeightMap;";
	}

	/**
	 * <p>
	 * Name: minecraft
	 * </p>
	 */
	public static McObfPair field_190061_a = McMappingDatabase.getSRG("field_190061_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(FJ)V]
	 * </p>
	 */
	public static McObfPair func_190060_a = McMappingDatabase.getSRG("DebugRendererHeightMap.func_190060_a");

}

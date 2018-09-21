package zdoctor.zcoremod.map.minecraft.client.renderer.debug;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DebugRendererSolidFace {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byk";
		else
			return "net/minecraft/client/renderer/debug/DebugRendererSolidFace";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byk";
		else
			return "DebugRendererSolidFace";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyk;";
		else
			return "Lnet/minecraft/client/renderer/debug/DebugRendererSolidFace;";
	}

	/**
	 * <p>
	 * Name: minecraft
	 * </p>
	 */
	public static McObfPair field_193851_a = McMappingDatabase.getSRG("field_193851_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(FJ)V]
	 * </p>
	 */
	public static McObfPair func_190060_a = McMappingDatabase.getSRG("DebugRendererSolidFace.func_190060_a");

}

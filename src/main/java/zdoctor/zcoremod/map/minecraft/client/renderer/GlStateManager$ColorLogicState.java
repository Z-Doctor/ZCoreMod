package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$ColorLogicState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$f";
		else
			return "net/minecraft/client/renderer/GlStateManager$ColorLogicState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$f";
		else
			return "GlStateManager$ColorLogicState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$f;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$ColorLogicState;";
	}

	/**
	 * <p>
	 * Name: colorLogicOp
	 * </p>
	 */
	public static McObfPair field_179197_a = McMappingDatabase.getSRG("field_179197_a");

	/**
	 * <p>
	 * Name: opcode
	 * </p>
	 */
	public static McObfPair field_179196_b = McMappingDatabase.getSRG("field_179196_b");

}

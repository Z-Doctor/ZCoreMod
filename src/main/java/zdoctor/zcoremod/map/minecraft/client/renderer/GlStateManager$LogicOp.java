package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$LogicOp {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$o";
		else
			return "net/minecraft/client/renderer/GlStateManager$LogicOp";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$o";
		else
			return "GlStateManager$LogicOp";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$o;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$LogicOp;";
	}

	/**
	 * <p>
	 * Name: opcode
	 * </p>
	 */
	public static McObfPair field_187370_q = McMappingDatabase.getSRG("field_187370_q");

}

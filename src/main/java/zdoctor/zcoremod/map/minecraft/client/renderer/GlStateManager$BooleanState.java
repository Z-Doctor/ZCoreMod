package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$BooleanState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$c";
		else
			return "net/minecraft/client/renderer/GlStateManager$BooleanState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$c";
		else
			return "GlStateManager$BooleanState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$c;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$BooleanState;";
	}

	/**
	 * <p>
	 * Name: setState
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_179199_a = McMappingDatabase.getSRG("GlStateManager$BooleanState.func_179199_a");

	/**
	 * <p>
	 * Name: capability
	 * </p>
	 */
	public static McObfPair field_179202_a = McMappingDatabase.getSRG("field_179202_a");

	/**
	 * <p>
	 * Name: setEnabled
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179200_b = McMappingDatabase.getSRG("GlStateManager$BooleanState.func_179200_b");

	/**
	 * <p>
	 * Name: currentState
	 * </p>
	 */
	public static McObfPair field_179201_b = McMappingDatabase.getSRG("field_179201_b");

	/**
	 * <p>
	 * Name: setDisabled
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179198_a = McMappingDatabase.getSRG("GlStateManager$BooleanState.func_179198_a");

}

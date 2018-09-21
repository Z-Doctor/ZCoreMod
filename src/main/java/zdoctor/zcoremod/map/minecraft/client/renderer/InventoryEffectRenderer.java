package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class InventoryEffectRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmr";
		else
			return "net/minecraft/client/renderer/InventoryEffectRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmr";
		else
			return "InventoryEffectRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmr;";
		else
			return "Lnet/minecraft/client/renderer/InventoryEffectRenderer;";
	}

	/**
	 * <p>
	 * Name: updateActivePotionEffects
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175378_g = McMappingDatabase.getSRG("InventoryEffectRenderer.func_175378_g");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("InventoryEffectRenderer.func_73866_w_");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("InventoryEffectRenderer.func_73863_a");

	/**
	 * <p>
	 * Name: hasActivePotionEffects
	 * </p>
	 */
	public static McObfPair field_147045_u = McMappingDatabase.getSRG("field_147045_u");

	/**
	 * <p>
	 * Name: drawActivePotionEffects
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147044_g = McMappingDatabase.getSRG("InventoryEffectRenderer.func_147044_g");

}

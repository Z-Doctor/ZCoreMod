package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerVillagerArmor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccm";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerVillagerArmor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccm";
		else
			return "LayerVillagerArmor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lccm;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerVillagerArmor;";
	}

	/**
	 * <p>
	 * Name: initArmor
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177177_a = McMappingDatabase.getSRG("LayerVillagerArmor.func_177177_a");

}

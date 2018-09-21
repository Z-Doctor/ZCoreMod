package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerBipedArmor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccb";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerBipedArmor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ccb";
		else
			return "LayerBipedArmor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lccb;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerBipedArmor;";
	}

	/**
	 * <p>
	 * Name: setModelSlotVisible
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/model/ModelBiped;Lnet/minecraft/inventory/EntityEquipmentSlot;)V, (Lnet/minecraft/client/model/ModelBase;Lnet/minecraft/inventory/EntityEquipmentSlot;)V]
	 * </p>
	 */
	public static McObfPair func_188359_a = McMappingDatabase.getSRG("LayerBipedArmor.func_188359_a");

	/**
	 * <p>
	 * Name: initArmor
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177177_a = McMappingDatabase.getSRG("LayerBipedArmor.func_177177_a");

	/**
	 * <p>
	 * Name: setModelVisible
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/model/ModelBiped;)V]
	 * </p>
	 */
	public static McObfPair func_177194_a = McMappingDatabase.getSRG("LayerBipedArmor.func_177194_a");

}

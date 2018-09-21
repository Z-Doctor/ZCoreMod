package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class InventoryChangeTrigger$Listeners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "al$a";
		else
			return "net/minecraft/advancements/critereon/InventoryChangeTrigger$Listeners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "al$a";
		else
			return "InventoryChangeTrigger$Listeners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lal$a;";
		else
			return "Lnet/minecraft/advancements/critereon/InventoryChangeTrigger$Listeners;";
	}

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_192486_a = McMappingDatabase.getSRG("InventoryChangeTrigger$Listeners.func_192486_a");

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192487_b = McMappingDatabase.getSRG("InventoryChangeTrigger$Listeners.func_192487_b");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_192491_b = McMappingDatabase.getSRG("field_192491_b");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192489_a = McMappingDatabase.getSRG("InventoryChangeTrigger$Listeners.func_192489_a");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192488_a = McMappingDatabase.getSRG("InventoryChangeTrigger$Listeners.func_192488_a");

	/**
	 * <p>
	 * Name: playerAdvancements
	 * </p>
	 */
	public static McObfPair field_192490_a = McMappingDatabase.getSRG("field_192490_a");

}

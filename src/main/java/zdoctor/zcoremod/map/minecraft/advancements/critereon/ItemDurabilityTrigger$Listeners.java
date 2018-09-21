package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemDurabilityTrigger$Listeners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "am$a";
		else
			return "net/minecraft/advancements/critereon/ItemDurabilityTrigger$Listeners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "am$a";
		else
			return "ItemDurabilityTrigger$Listeners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lam$a;";
		else
			return "Lnet/minecraft/advancements/critereon/ItemDurabilityTrigger$Listeners;";
	}

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_193438_b = McMappingDatabase.getSRG("ItemDurabilityTrigger$Listeners.func_193438_b");

	/**
	 * <p>
	 * Name: playerAdvancements
	 * </p>
	 */
	public static McObfPair field_193442_a = McMappingDatabase.getSRG("field_193442_a");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_193443_b = McMappingDatabase.getSRG("field_193443_b");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;I)V]
	 * </p>
	 */
	public static McObfPair func_193441_a = McMappingDatabase.getSRG("ItemDurabilityTrigger$Listeners.func_193441_a");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193439_a = McMappingDatabase.getSRG("ItemDurabilityTrigger$Listeners.func_193439_a");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_193440_a = McMappingDatabase.getSRG("ItemDurabilityTrigger$Listeners.func_193440_a");

}

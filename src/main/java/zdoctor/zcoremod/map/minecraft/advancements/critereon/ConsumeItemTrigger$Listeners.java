package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ConsumeItemTrigger$Listeners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "z$a";
		else
			return "net/minecraft/advancements/critereon/ConsumeItemTrigger$Listeners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "z$a";
		else
			return "ConsumeItemTrigger$Listeners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lz$a;";
		else
			return "Lnet/minecraft/advancements/critereon/ConsumeItemTrigger$Listeners;";
	}

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_193239_a = McMappingDatabase.getSRG("ConsumeItemTrigger$Listeners.func_193239_a");

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_193237_b = McMappingDatabase.getSRG("ConsumeItemTrigger$Listeners.func_193237_b");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_193242_b = McMappingDatabase.getSRG("field_193242_b");

	/**
	 * <p>
	 * Name: playerAdvancements
	 * </p>
	 */
	public static McObfPair field_193241_a = McMappingDatabase.getSRG("field_193241_a");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193238_a = McMappingDatabase.getSRG("ConsumeItemTrigger$Listeners.func_193238_a");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_193240_a = McMappingDatabase.getSRG("ConsumeItemTrigger$Listeners.func_193240_a");

}

package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class VillagerTradeTrigger$Listeners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bc$a";
		else
			return "net/minecraft/advancements/critereon/VillagerTradeTrigger$Listeners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bc$a";
		else
			return "VillagerTradeTrigger$Listeners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbc$a;";
		else
			return "Lnet/minecraft/advancements/critereon/VillagerTradeTrigger$Listeners;";
	}

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192538_b = McMappingDatabase.getSRG("VillagerTradeTrigger$Listeners.func_192538_b");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/passive/EntityVillager;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_192537_a = McMappingDatabase.getSRG("VillagerTradeTrigger$Listeners.func_192537_a");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192540_a = McMappingDatabase.getSRG("VillagerTradeTrigger$Listeners.func_192540_a");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_192542_b = McMappingDatabase.getSRG("field_192542_b");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192539_a = McMappingDatabase.getSRG("VillagerTradeTrigger$Listeners.func_192539_a");

	/**
	 * <p>
	 * Name: playerAdvancements
	 * </p>
	 */
	public static McObfPair field_192541_a = McMappingDatabase.getSRG("field_192541_a");

}

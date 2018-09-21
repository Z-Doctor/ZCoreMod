package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BrewedPotionTrigger$Listeners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "w$a";
		else
			return "net/minecraft/advancements/critereon/BrewedPotionTrigger$Listeners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "w$a";
		else
			return "BrewedPotionTrigger$Listeners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lw$a;";
		else
			return "Lnet/minecraft/advancements/critereon/BrewedPotionTrigger$Listeners;";
	}

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192347_a = McMappingDatabase.getSRG("BrewedPotionTrigger$Listeners.func_192347_a");

	/**
	 * <p>
	 * Name: playerAdvancements
	 * </p>
	 */
	public static McObfPair field_192350_a = McMappingDatabase.getSRG("field_192350_a");

	/**
	 * <p>
	 * Name: removeListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192346_b = McMappingDatabase.getSRG("BrewedPotionTrigger$Listeners.func_192346_b");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionType;)V]
	 * </p>
	 */
	public static McObfPair func_192348_a = McMappingDatabase.getSRG("BrewedPotionTrigger$Listeners.func_192348_a");

	/**
	 * <p>
	 * Name: addListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192349_a = McMappingDatabase.getSRG("BrewedPotionTrigger$Listeners.func_192349_a");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_192351_b = McMappingDatabase.getSRG("field_192351_b");

}

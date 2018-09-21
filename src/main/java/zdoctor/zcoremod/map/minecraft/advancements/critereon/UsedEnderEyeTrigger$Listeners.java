package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class UsedEnderEyeTrigger$Listeners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bd$a";
		else
			return "net/minecraft/advancements/critereon/UsedEnderEyeTrigger$Listeners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bd$a";
		else
			return "UsedEnderEyeTrigger$Listeners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbd$a;";
		else
			return "Lnet/minecraft/advancements/critereon/UsedEnderEyeTrigger$Listeners;";
	}

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_192543_a = McMappingDatabase.getSRG("UsedEnderEyeTrigger$Listeners.func_192543_a");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_192548_b = McMappingDatabase.getSRG("field_192548_b");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192545_a = McMappingDatabase.getSRG("UsedEnderEyeTrigger$Listeners.func_192545_a");

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192544_b = McMappingDatabase.getSRG("UsedEnderEyeTrigger$Listeners.func_192544_b");

	/**
	 * <p>
	 * Name: playerAdvancements
	 * </p>
	 */
	public static McObfPair field_192547_a = McMappingDatabase.getSRG("field_192547_a");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192546_a = McMappingDatabase.getSRG("UsedEnderEyeTrigger$Listeners.func_192546_a");

}

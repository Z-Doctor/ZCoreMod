package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PositionTrigger$Listeners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ar$a";
		else
			return "net/minecraft/advancements/critereon/PositionTrigger$Listeners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ar$a";
		else
			return "PositionTrigger$Listeners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lar$a;";
		else
			return "Lnet/minecraft/advancements/critereon/PositionTrigger$Listeners;";
	}

	/**
	 * <p>
	 * Name: playerAdvancements
	 * </p>
	 */
	public static McObfPair field_192511_a = McMappingDatabase.getSRG("field_192511_a");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldServer;DDD)V]
	 * </p>
	 */
	public static McObfPair func_193462_a = McMappingDatabase.getSRG("PositionTrigger$Listeners.func_193462_a");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192510_a = McMappingDatabase.getSRG("PositionTrigger$Listeners.func_192510_a");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_192512_b = McMappingDatabase.getSRG("field_192512_b");

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192507_b = McMappingDatabase.getSRG("PositionTrigger$Listeners.func_192507_b");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192508_a = McMappingDatabase.getSRG("PositionTrigger$Listeners.func_192508_a");

}

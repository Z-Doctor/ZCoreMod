package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlayerHurtEntityTrigger$Listeners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ax$a";
		else
			return "net/minecraft/advancements/critereon/PlayerHurtEntityTrigger$Listeners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ax$a";
		else
			return "PlayerHurtEntityTrigger$Listeners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lax$a;";
		else
			return "Lnet/minecraft/advancements/critereon/PlayerHurtEntityTrigger$Listeners;";
	}

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192519_b = McMappingDatabase.getSRG("PlayerHurtEntityTrigger$Listeners.func_192519_b");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192522_a = McMappingDatabase.getSRG("PlayerHurtEntityTrigger$Listeners.func_192522_a");

	/**
	 * <p>
	 * Name: playerAdvancements
	 * </p>
	 */
	public static McObfPair field_192523_a = McMappingDatabase.getSRG("field_192523_a");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/DamageSource;FFZ)V]
	 * </p>
	 */
	public static McObfPair func_192521_a = McMappingDatabase.getSRG("PlayerHurtEntityTrigger$Listeners.func_192521_a");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_192524_b = McMappingDatabase.getSRG("field_192524_b");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192520_a = McMappingDatabase.getSRG("PlayerHurtEntityTrigger$Listeners.func_192520_a");

}

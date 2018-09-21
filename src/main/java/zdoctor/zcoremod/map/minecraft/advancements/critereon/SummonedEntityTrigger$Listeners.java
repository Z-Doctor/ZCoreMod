package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SummonedEntityTrigger$Listeners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "az$a";
		else
			return "net/minecraft/advancements/critereon/SummonedEntityTrigger$Listeners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "az$a";
		else
			return "SummonedEntityTrigger$Listeners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laz$a;";
		else
			return "Lnet/minecraft/advancements/critereon/SummonedEntityTrigger$Listeners;";
	}

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192534_a = McMappingDatabase.getSRG("SummonedEntityTrigger$Listeners.func_192534_a");

	/**
	 * <p>
	 * Name: playerAdvancements
	 * </p>
	 */
	public static McObfPair field_192535_a = McMappingDatabase.getSRG("field_192535_a");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_192536_b = McMappingDatabase.getSRG("field_192536_b");

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192531_b = McMappingDatabase.getSRG("SummonedEntityTrigger$Listeners.func_192531_b");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192532_a = McMappingDatabase.getSRG("SummonedEntityTrigger$Listeners.func_192532_a");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_192533_a = McMappingDatabase.getSRG("SummonedEntityTrigger$Listeners.func_192533_a");

}

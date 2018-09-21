package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityHurtPlayerTrigger$Listeners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ai$a";
		else
			return "net/minecraft/advancements/critereon/EntityHurtPlayerTrigger$Listeners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ai$a";
		else
			return "EntityHurtPlayerTrigger$Listeners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lai$a;";
		else
			return "Lnet/minecraft/advancements/critereon/EntityHurtPlayerTrigger$Listeners;";
	}

	/**
	 * <p>
	 * Name: playerAdvancements
	 * </p>
	 */
	public static McObfPair field_192479_a = McMappingDatabase.getSRG("field_192479_a");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_192480_b = McMappingDatabase.getSRG("field_192480_b");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192476_a = McMappingDatabase.getSRG("EntityHurtPlayerTrigger$Listeners.func_192476_a");

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192475_b = McMappingDatabase.getSRG("EntityHurtPlayerTrigger$Listeners.func_192475_b");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192477_a = McMappingDatabase.getSRG("EntityHurtPlayerTrigger$Listeners.func_192477_a");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/util/DamageSource;FFZ)V]
	 * </p>
	 */
	public static McObfPair func_192478_a = McMappingDatabase.getSRG("EntityHurtPlayerTrigger$Listeners.func_192478_a");

}

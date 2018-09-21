package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CuredZombieVillagerTrigger$Listeners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aa$a";
		else
			return "net/minecraft/advancements/critereon/CuredZombieVillagerTrigger$Listeners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aa$a";
		else
			return "CuredZombieVillagerTrigger$Listeners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laa$a;";
		else
			return "Lnet/minecraft/advancements/critereon/CuredZombieVillagerTrigger$Listeners;";
	}

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192360_a = McMappingDatabase.getSRG("CuredZombieVillagerTrigger$Listeners.func_192360_a");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_192363_b = McMappingDatabase.getSRG("field_192363_b");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/monster/EntityZombie;Lnet/minecraft/entity/passive/EntityVillager;)V]
	 * </p>
	 */
	public static McObfPair func_192361_a = McMappingDatabase.getSRG("CuredZombieVillagerTrigger$Listeners.func_192361_a");

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192358_b = McMappingDatabase.getSRG("CuredZombieVillagerTrigger$Listeners.func_192358_b");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192359_a = McMappingDatabase.getSRG("CuredZombieVillagerTrigger$Listeners.func_192359_a");

	/**
	 * <p>
	 * Name: playerAdvancements
	 * </p>
	 */
	public static McObfPair field_192362_a = McMappingDatabase.getSRG("field_192362_a");

}

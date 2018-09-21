package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CuredZombieVillagerTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aa$b";
		else
			return "net/minecraft/advancements/critereon/CuredZombieVillagerTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aa$b";
		else
			return "CuredZombieVillagerTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laa$b;";
		else
			return "Lnet/minecraft/advancements/critereon/CuredZombieVillagerTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: villager
	 * </p>
	 */
	public static McObfPair field_192256_b = McMappingDatabase.getSRG("field_192256_b");

	/**
	 * <p>
	 * Name: zombie
	 * </p>
	 */
	public static McObfPair field_192255_a = McMappingDatabase.getSRG("field_192255_a");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/monster/EntityZombie;Lnet/minecraft/entity/passive/EntityVillager;)Z]
	 * </p>
	 */
	public static McObfPair func_192254_a = McMappingDatabase.getSRG("CuredZombieVillagerTrigger$Instance.func_192254_a");

}

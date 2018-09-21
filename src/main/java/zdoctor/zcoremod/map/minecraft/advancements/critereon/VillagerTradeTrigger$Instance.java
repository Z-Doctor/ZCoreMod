package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class VillagerTradeTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bc$b";
		else
			return "net/minecraft/advancements/critereon/VillagerTradeTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bc$b";
		else
			return "VillagerTradeTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbc$b;";
		else
			return "Lnet/minecraft/advancements/critereon/VillagerTradeTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: villager
	 * </p>
	 */
	public static McObfPair field_192286_a = McMappingDatabase.getSRG("field_192286_a");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/passive/EntityVillager;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_192285_a = McMappingDatabase.getSRG("VillagerTradeTrigger$Instance.func_192285_a");

	/**
	 * <p>
	 * Name: item
	 * </p>
	 */
	public static McObfPair field_192287_b = McMappingDatabase.getSRG("field_192287_b");

}

package zdoctor.zcoremod.map.minecraft.world.storage.loot.functions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SetCount {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgd";
		else
			return "net/minecraft/world/storage/loot/functions/SetCount";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgd";
		else
			return "SetCount";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgd;";
		else
			return "Lnet/minecraft/world/storage/loot/functions/SetCount;";
	}

	/**
	 * <p>
	 * Name: countRange
	 * </p>
	 */
	public static McObfPair field_186568_a = McMappingDatabase.getSRG("field_186568_a");

	/**
	 * <p>
	 * Name: apply
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_186553_a = McMappingDatabase.getSRG("SetCount.func_186553_a");

}

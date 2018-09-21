package zdoctor.zcoremod.map.minecraft.world.storage.loot.functions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SetDamage {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bge";
		else
			return "net/minecraft/world/storage/loot/functions/SetDamage";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bge";
		else
			return "SetDamage";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbge;";
		else
			return "Lnet/minecraft/world/storage/loot/functions/SetDamage;";
	}

	/**
	 * <p>
	 * Name: apply
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_186553_a = McMappingDatabase.getSRG("SetDamage.func_186553_a");

	/**
	 * <p>
	 * Name: damageRange
	 * </p>
	 */
	public static McObfPair field_186566_b = McMappingDatabase.getSRG("field_186566_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_186565_a = McMappingDatabase.getSRG("field_186565_a");

}

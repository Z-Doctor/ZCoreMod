package zdoctor.zcoremod.map.minecraft.world.storage.loot.functions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SetAttributes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgc";
		else
			return "net/minecraft/world/storage/loot/functions/SetAttributes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgc";
		else
			return "SetAttributes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgc;";
		else
			return "Lnet/minecraft/world/storage/loot/functions/SetAttributes;";
	}

	/**
	 * <p>
	 * Name: apply
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_186553_a = McMappingDatabase.getSRG("SetAttributes.func_186553_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_186560_a = McMappingDatabase.getSRG("field_186560_a");

	/**
	 * <p>
	 * Name: modifiers
	 * </p>
	 */
	public static McObfPair field_186561_b = McMappingDatabase.getSRG("field_186561_b");

}

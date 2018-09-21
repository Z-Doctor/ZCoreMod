package zdoctor.zcoremod.map.minecraft.world.storage.loot.functions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootFunctionManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bga";
		else
			return "net/minecraft/world/storage/loot/functions/LootFunctionManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bga";
		else
			return "LootFunctionManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbga;";
		else
			return "Lnet/minecraft/world/storage/loot/functions/LootFunctionManager;";
	}

	/**
	 * <p>
	 * Name: getSerializerFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/loot/functions/LootFunction;)Lnet/minecraft/world/storage/loot/functions/LootFunction$Serializer;]
	 * </p>
	 */
	public static McObfPair func_186581_a = McMappingDatabase.getSRG("LootFunctionManager.func_186581_a");

	/**
	 * <p>
	 * Name: getSerializerForName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/world/storage/loot/functions/LootFunction$Serializer;]
	 * </p>
	 */
	public static McObfPair func_186583_a = McMappingDatabase.getSRG("LootFunctionManager.func_186583_a");

	/**
	 * <p>
	 * Name: CLASS_TO_SERIALIZER_MAP
	 * </p>
	 */
	public static McObfPair field_186585_b = McMappingDatabase.getSRG("field_186585_b");

	/**
	 * <p>
	 * Name: registerFunction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/loot/functions/LootFunction$Serializer;)V]
	 * </p>
	 */
	public static McObfPair func_186582_a = McMappingDatabase.getSRG("LootFunctionManager.func_186582_a");

	/**
	 * <p>
	 * Name: NAME_TO_SERIALIZER_MAP
	 * </p>
	 */
	public static McObfPair field_186584_a = McMappingDatabase.getSRG("field_186584_a");

}

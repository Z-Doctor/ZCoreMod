package zdoctor.zcoremod.map.minecraft.world.storage.loot.conditions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootConditionManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgm";
		else
			return "net/minecraft/world/storage/loot/conditions/LootConditionManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgm";
		else
			return "LootConditionManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgm;";
		else
			return "Lnet/minecraft/world/storage/loot/conditions/LootConditionManager;";
	}

	/**
	 * <p>
	 * Name: getSerializerFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/loot/conditions/LootCondition;)Lnet/minecraft/world/storage/loot/conditions/LootCondition$Serializer;]
	 * </p>
	 */
	public static McObfPair func_186640_a = McMappingDatabase.getSRG("LootConditionManager.func_186640_a");

	/**
	 * <p>
	 * Name: getSerializerForName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/world/storage/loot/conditions/LootCondition$Serializer;]
	 * </p>
	 */
	public static McObfPair func_186641_a = McMappingDatabase.getSRG("LootConditionManager.func_186641_a");

	/**
	 * <p>
	 * Name: NAME_TO_SERIALIZER_MAP
	 * </p>
	 */
	public static McObfPair field_186642_a = McMappingDatabase.getSRG("field_186642_a");

	/**
	 * <p>
	 * Name: testAllConditions
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/world/storage/loot/conditions/LootCondition;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Z]
	 * </p>
	 */
	public static McObfPair func_186638_a = McMappingDatabase.getSRG("LootConditionManager.func_186638_a");

	/**
	 * <p>
	 * Name: CLASS_TO_SERIALIZER_MAP
	 * </p>
	 */
	public static McObfPair field_186643_b = McMappingDatabase.getSRG("field_186643_b");

	/**
	 * <p>
	 * Name: registerCondition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/loot/conditions/LootCondition$Serializer;)V]
	 * </p>
	 */
	public static McObfPair func_186639_a = McMappingDatabase.getSRG("LootConditionManager.func_186639_a");

}

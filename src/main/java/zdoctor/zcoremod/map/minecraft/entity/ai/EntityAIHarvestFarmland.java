package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIHarvestFarmland {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xg";
		else
			return "net/minecraft/entity/ai/EntityAIHarvestFarmland";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xg";
		else
			return "EntityAIHarvestFarmland";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxg;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIHarvestFarmland;";
	}

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIHarvestFarmland.func_75253_b");

	/**
	 * <p>
	 * Name: wantsToReapStuff
	 * </p>
	 */
	public static McObfPair field_179503_e = McMappingDatabase.getSRG("field_179503_e");

	/**
	 * <p>
	 * Name: villager
	 * </p>
	 */
	public static McObfPair field_179504_c = McMappingDatabase.getSRG("field_179504_c");

	/**
	 * <p>
	 * Name: shouldMoveTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_179488_a = McMappingDatabase.getSRG("EntityAIHarvestFarmland.func_179488_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIHarvestFarmland.func_75250_a");

	/**
	 * <p>
	 * Name: currentTask
	 * </p>
	 */
	public static McObfPair field_179501_f = McMappingDatabase.getSRG("field_179501_f");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIHarvestFarmland.func_75246_d");

	/**
	 * <p>
	 * Name: hasFarmItem
	 * </p>
	 */
	public static McObfPair field_179502_d = McMappingDatabase.getSRG("field_179502_d");

}

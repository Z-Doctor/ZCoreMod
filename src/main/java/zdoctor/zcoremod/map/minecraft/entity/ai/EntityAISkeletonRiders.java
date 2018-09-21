package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAISkeletonRiders {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aav";
		else
			return "net/minecraft/entity/ai/EntityAISkeletonRiders";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aav";
		else
			return "EntityAISkeletonRiders";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laav;";
		else
			return "Lnet/minecraft/entity/ai/EntityAISkeletonRiders;";
	}

	/**
	 * <p>
	 * Name: createSkeleton
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/passive/AbstractHorse;)Lnet/minecraft/entity/monster/EntitySkeleton;]
	 * </p>
	 */
	public static McObfPair func_188514_a = McMappingDatabase.getSRG("EntityAISkeletonRiders.func_188514_a");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAISkeletonRiders.func_75246_d");

	/**
	 * <p>
	 * Name: horse
	 * </p>
	 */
	public static McObfPair field_188516_a = McMappingDatabase.getSRG("field_188516_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAISkeletonRiders.func_75250_a");

	/**
	 * <p>
	 * Name: createHorse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;)Lnet/minecraft/entity/passive/AbstractHorse;]
	 * </p>
	 */
	public static McObfPair func_188515_a = McMappingDatabase.getSRG("EntityAISkeletonRiders.func_188515_a");

}

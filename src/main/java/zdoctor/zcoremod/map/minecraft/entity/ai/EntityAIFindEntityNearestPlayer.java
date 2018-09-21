package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIFindEntityNearestPlayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yv";
		else
			return "net/minecraft/entity/ai/EntityAIFindEntityNearestPlayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yv";
		else
			return "EntityAIFindEntityNearestPlayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyv;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIFindEntityNearestPlayer;";
	}

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_179436_a = McMappingDatabase.getSRG("field_179436_a");

	/**
	 * <p>
	 * Name: maxTargetRange
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_179431_f = McMappingDatabase.getSRG("EntityAIFindEntityNearestPlayer.func_179431_f");

	/**
	 * <p>
	 * Name: predicate
	 * </p>
	 */
	public static McObfPair field_179435_c = McMappingDatabase.getSRG("field_179435_c");

	/**
	 * <p>
	 * Name: sorter
	 * </p>
	 */
	public static McObfPair field_179432_d = McMappingDatabase.getSRG("field_179432_d");

	/**
	 * <p>
	 * Name: entityLiving
	 * </p>
	 */
	public static McObfPair field_179434_b = McMappingDatabase.getSRG("field_179434_b");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIFindEntityNearestPlayer.func_75251_c");

	/**
	 * <p>
	 * Name: entityTarget
	 * </p>
	 */
	public static McObfPair field_179433_e = McMappingDatabase.getSRG("field_179433_e");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIFindEntityNearestPlayer.func_75249_e");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIFindEntityNearestPlayer.func_75250_a");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIFindEntityNearestPlayer.func_75253_b");

}

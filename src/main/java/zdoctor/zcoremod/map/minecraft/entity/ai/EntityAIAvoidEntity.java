package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIAvoidEntity {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ws";
		else
			return "net/minecraft/entity/ai/EntityAIAvoidEntity";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ws";
		else
			return "EntityAIAvoidEntity";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lws;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIAvoidEntity;";
	}

	/**
	 * <p>
	 * Name: navigation
	 * </p>
	 */
	public static McObfPair field_75375_g = McMappingDatabase.getSRG("field_75375_g");

	/**
	 * <p>
	 * Name: nearSpeed
	 * </p>
	 */
	public static McObfPair field_75379_c = McMappingDatabase.getSRG("field_75379_c");

	/**
	 * <p>
	 * Name: path
	 * </p>
	 */
	public static McObfPair field_75374_f = McMappingDatabase.getSRG("field_75374_f");

	/**
	 * <p>
	 * Name: classToAvoid
	 * </p>
	 */
	public static McObfPair field_181064_i = McMappingDatabase.getSRG("field_181064_i");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIAvoidEntity.func_75253_b");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIAvoidEntity.func_75246_d");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_75380_a = McMappingDatabase.getSRG("field_75380_a");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIAvoidEntity.func_75251_c");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIAvoidEntity.func_75250_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIAvoidEntity.func_75249_e");

	/**
	 * <p>
	 * Name: farSpeed
	 * </p>
	 */
	public static McObfPair field_75378_b = McMappingDatabase.getSRG("field_75378_b");

	/**
	 * <p>
	 * Name: avoidDistance
	 * </p>
	 */
	public static McObfPair field_179508_f = McMappingDatabase.getSRG("field_179508_f");

	/**
	 * <p>
	 * Name: avoidTargetSelector
	 * </p>
	 */
	public static McObfPair field_179510_i = McMappingDatabase.getSRG("field_179510_i");

	/**
	 * <p>
	 * Name: closestLivingEntity
	 * </p>
	 */
	public static McObfPair field_75376_d = McMappingDatabase.getSRG("field_75376_d");

	/**
	 * <p>
	 * Name: canBeSeenSelector
	 * </p>
	 */
	public static McObfPair field_179509_a = McMappingDatabase.getSRG("field_179509_a");

}

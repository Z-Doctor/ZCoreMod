package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIMoveTowardsTarget {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xt";
		else
			return "net/minecraft/entity/ai/EntityAIMoveTowardsTarget";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xt";
		else
			return "EntityAIMoveTowardsTarget";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxt;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIMoveTowardsTarget;";
	}

	/**
	 * <p>
	 * Name: targetEntity
	 * </p>
	 */
	public static McObfPair field_75429_b = McMappingDatabase.getSRG("field_75429_b");

	/**
	 * <p>
	 * Name: creature
	 * </p>
	 */
	public static McObfPair field_75431_a = McMappingDatabase.getSRG("field_75431_a");

	/**
	 * <p>
	 * Name: movePosZ
	 * </p>
	 */
	public static McObfPair field_75428_e = McMappingDatabase.getSRG("field_75428_e");

	/**
	 * <p>
	 * Name: speed
	 * </p>
	 */
	public static McObfPair field_75425_f = McMappingDatabase.getSRG("field_75425_f");

	/**
	 * <p>
	 * Name: movePosY
	 * </p>
	 */
	public static McObfPair field_75427_d = McMappingDatabase.getSRG("field_75427_d");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIMoveTowardsTarget.func_75249_e");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIMoveTowardsTarget.func_75251_c");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIMoveTowardsTarget.func_75250_a");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIMoveTowardsTarget.func_75253_b");

	/**
	 * <p>
	 * Name: maxTargetDistance
	 * </p>
	 */
	public static McObfPair field_75426_g = McMappingDatabase.getSRG("field_75426_g");

	/**
	 * <p>
	 * Name: movePosX
	 * </p>
	 */
	public static McObfPair field_75430_c = McMappingDatabase.getSRG("field_75430_c");

}

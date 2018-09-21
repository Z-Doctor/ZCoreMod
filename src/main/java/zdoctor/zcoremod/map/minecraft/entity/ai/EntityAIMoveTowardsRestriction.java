package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIMoveTowardsRestriction {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xs";
		else
			return "net/minecraft/entity/ai/EntityAIMoveTowardsRestriction";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xs";
		else
			return "EntityAIMoveTowardsRestriction";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxs;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIMoveTowardsRestriction;";
	}

	/**
	 * <p>
	 * Name: movePosX
	 * </p>
	 */
	public static McObfPair field_75434_b = McMappingDatabase.getSRG("field_75434_b");

	/**
	 * <p>
	 * Name: movePosY
	 * </p>
	 */
	public static McObfPair field_75435_c = McMappingDatabase.getSRG("field_75435_c");

	/**
	 * <p>
	 * Name: movementSpeed
	 * </p>
	 */
	public static McObfPair field_75433_e = McMappingDatabase.getSRG("field_75433_e");

	/**
	 * <p>
	 * Name: movePosZ
	 * </p>
	 */
	public static McObfPair field_75432_d = McMappingDatabase.getSRG("field_75432_d");

	/**
	 * <p>
	 * Name: creature
	 * </p>
	 */
	public static McObfPair field_75436_a = McMappingDatabase.getSRG("field_75436_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIMoveTowardsRestriction.func_75249_e");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIMoveTowardsRestriction.func_75253_b");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIMoveTowardsRestriction.func_75250_a");

}

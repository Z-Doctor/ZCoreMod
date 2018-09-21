package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIOwnerHurtTarget {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yz";
		else
			return "net/minecraft/entity/ai/EntityAIOwnerHurtTarget";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yz";
		else
			return "EntityAIOwnerHurtTarget";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyz;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIOwnerHurtTarget;";
	}

	/**
	 * <p>
	 * Name: timestamp
	 * </p>
	 */
	public static McObfPair field_142050_e = McMappingDatabase.getSRG("field_142050_e");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIOwnerHurtTarget.func_75250_a");

	/**
	 * <p>
	 * Name: attacker
	 * </p>
	 */
	public static McObfPair field_75313_b = McMappingDatabase.getSRG("field_75313_b");

	/**
	 * <p>
	 * Name: tameable
	 * </p>
	 */
	public static McObfPair field_75314_a = McMappingDatabase.getSRG("field_75314_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIOwnerHurtTarget.func_75249_e");

}

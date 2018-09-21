package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIOwnerHurtByTarget {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yy";
		else
			return "net/minecraft/entity/ai/EntityAIOwnerHurtByTarget";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yy";
		else
			return "EntityAIOwnerHurtByTarget";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyy;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIOwnerHurtByTarget;";
	}

	/**
	 * <p>
	 * Name: attacker
	 * </p>
	 */
	public static McObfPair field_75315_b = McMappingDatabase.getSRG("field_75315_b");

	/**
	 * <p>
	 * Name: tameable
	 * </p>
	 */
	public static McObfPair field_75316_a = McMappingDatabase.getSRG("field_75316_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIOwnerHurtByTarget.func_75250_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIOwnerHurtByTarget.func_75249_e");

	/**
	 * <p>
	 * Name: timestamp
	 * </p>
	 */
	public static McObfPair field_142051_e = McMappingDatabase.getSRG("field_142051_e");

}

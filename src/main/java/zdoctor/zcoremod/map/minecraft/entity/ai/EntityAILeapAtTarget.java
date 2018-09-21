package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAILeapAtTarget {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xj";
		else
			return "net/minecraft/entity/ai/EntityAILeapAtTarget";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xj";
		else
			return "EntityAILeapAtTarget";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxj;";
		else
			return "Lnet/minecraft/entity/ai/EntityAILeapAtTarget;";
	}

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAILeapAtTarget.func_75249_e");

	/**
	 * <p>
	 * Name: leapTarget
	 * </p>
	 */
	public static McObfPair field_75326_b = McMappingDatabase.getSRG("field_75326_b");

	/**
	 * <p>
	 * Name: leaper
	 * </p>
	 */
	public static McObfPair field_75328_a = McMappingDatabase.getSRG("field_75328_a");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAILeapAtTarget.func_75253_b");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAILeapAtTarget.func_75250_a");

	/**
	 * <p>
	 * Name: leapMotionY
	 * </p>
	 */
	public static McObfPair field_75327_c = McMappingDatabase.getSRG("field_75327_c");

}

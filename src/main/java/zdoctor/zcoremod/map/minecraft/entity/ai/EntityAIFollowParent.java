package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIFollowParent {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xd";
		else
			return "net/minecraft/entity/ai/EntityAIFollowParent";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xd";
		else
			return "EntityAIFollowParent";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxd;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIFollowParent;";
	}

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIFollowParent.func_75251_c");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIFollowParent.func_75246_d");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIFollowParent.func_75253_b");

	/**
	 * <p>
	 * Name: delayCounter
	 * </p>
	 */
	public static McObfPair field_75345_d = McMappingDatabase.getSRG("field_75345_d");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIFollowParent.func_75250_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIFollowParent.func_75249_e");

	/**
	 * <p>
	 * Name: parentAnimal
	 * </p>
	 */
	public static McObfPair field_75346_b = McMappingDatabase.getSRG("field_75346_b");

	/**
	 * <p>
	 * Name: moveSpeed
	 * </p>
	 */
	public static McObfPair field_75347_c = McMappingDatabase.getSRG("field_75347_c");

	/**
	 * <p>
	 * Name: childAnimal
	 * </p>
	 */
	public static McObfPair field_75348_a = McMappingDatabase.getSRG("field_75348_a");

}

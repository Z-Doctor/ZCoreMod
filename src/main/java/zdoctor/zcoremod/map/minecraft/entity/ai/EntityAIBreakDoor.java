package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIBreakDoor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wu";
		else
			return "net/minecraft/entity/ai/EntityAIBreakDoor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wu";
		else
			return "EntityAIBreakDoor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwu;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIBreakDoor;";
	}

	/**
	 * <p>
	 * Name: breakingTime
	 * </p>
	 */
	public static McObfPair field_75359_i = McMappingDatabase.getSRG("field_75359_i");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIBreakDoor.func_75251_c");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIBreakDoor.func_75246_d");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIBreakDoor.func_75253_b");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIBreakDoor.func_75249_e");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIBreakDoor.func_75250_a");

	/**
	 * <p>
	 * Name: previousBreakProgress
	 * </p>
	 */
	public static McObfPair field_75358_j = McMappingDatabase.getSRG("field_75358_j");

}

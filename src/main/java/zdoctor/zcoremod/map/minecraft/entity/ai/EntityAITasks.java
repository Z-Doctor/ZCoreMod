package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAITasks {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xf";
		else
			return "net/minecraft/entity/ai/EntityAITasks";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xf";
		else
			return "EntityAITasks";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxf;";
		else
			return "Lnet/minecraft/entity/ai/EntityAITasks;";
	}

	/**
	 * <p>
	 * Name: disableControlFlag
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_188526_c = McMappingDatabase.getSRG("EntityAITasks.func_188526_c");

	/**
	 * <p>
	 * Name: canContinue
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/EntityAITasks$EntityAITaskEntry;)Z]
	 * </p>
	 */
	public static McObfPair func_75773_a = McMappingDatabase.getSRG("EntityAITasks.func_75773_a");

	/**
	 * <p>
	 * Name: tickCount
	 * </p>
	 */
	public static McObfPair field_75778_d = McMappingDatabase.getSRG("field_75778_d");

	/**
	 * <p>
	 * Name: setControlFlag
	 * </p>
	 * <p>
	 * Desc: [(IZ)V]
	 * </p>
	 */
	public static McObfPair func_188527_a = McMappingDatabase.getSRG("EntityAITasks.func_188527_a");

	/**
	 * <p>
	 * Name: onUpdateTasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75774_a = McMappingDatabase.getSRG("EntityAITasks.func_75774_a");

	/**
	 * <p>
	 * Name: isControlFlagDisabled
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_188528_b = McMappingDatabase.getSRG("EntityAITasks.func_188528_b");

	/**
	 * <p>
	 * Name: executingTaskEntries
	 * </p>
	 */
	public static McObfPair field_75780_b = McMappingDatabase.getSRG("field_75780_b");

	/**
	 * <p>
	 * Name: addTask
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/entity/ai/EntityAIBase;)V]
	 * </p>
	 */
	public static McObfPair func_75776_a = McMappingDatabase.getSRG("EntityAITasks.func_75776_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151506_a = McMappingDatabase.getSRG("field_151506_a");

	/**
	 * <p>
	 * Name: tickRate
	 * </p>
	 */
	public static McObfPair field_75779_e = McMappingDatabase.getSRG("field_75779_e");

	/**
	 * <p>
	 * Name: areTasksCompatible
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/EntityAITasks$EntityAITaskEntry;Lnet/minecraft/entity/ai/EntityAITasks$EntityAITaskEntry;)Z]
	 * </p>
	 */
	public static McObfPair func_75777_a = McMappingDatabase.getSRG("EntityAITasks.func_75777_a");

	/**
	 * <p>
	 * Name: profiler
	 * </p>
	 */
	public static McObfPair field_75781_c = McMappingDatabase.getSRG("field_75781_c");

	/**
	 * <p>
	 * Name: disabledControlFlags
	 * </p>
	 */
	public static McObfPair field_188529_g = McMappingDatabase.getSRG("field_188529_g");

	/**
	 * <p>
	 * Name: removeTask
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/EntityAIBase;)V]
	 * </p>
	 */
	public static McObfPair func_85156_a = McMappingDatabase.getSRG("EntityAITasks.func_85156_a");

	/**
	 * <p>
	 * Name: enableControlFlag
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_188525_d = McMappingDatabase.getSRG("EntityAITasks.func_188525_d");

	/**
	 * <p>
	 * Name: canUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/EntityAITasks$EntityAITaskEntry;)Z]
	 * </p>
	 */
	public static McObfPair func_75775_b = McMappingDatabase.getSRG("EntityAITasks.func_75775_b");

	/**
	 * <p>
	 * Name: taskEntries
	 * </p>
	 */
	public static McObfPair field_75782_a = McMappingDatabase.getSRG("field_75782_a");

}

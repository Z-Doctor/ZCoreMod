package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIOcelotAttack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xu";
		else
			return "net/minecraft/entity/ai/EntityAIOcelotAttack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xu";
		else
			return "EntityAIOcelotAttack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxu;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIOcelotAttack;";
	}

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_75411_a = McMappingDatabase.getSRG("field_75411_a");

	/**
	 * <p>
	 * Name: attackCountdown
	 * </p>
	 */
	public static McObfPair field_75408_d = McMappingDatabase.getSRG("field_75408_d");

	/**
	 * <p>
	 * Name: target
	 * </p>
	 */
	public static McObfPair field_75410_c = McMappingDatabase.getSRG("field_75410_c");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIOcelotAttack.func_75251_c");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIOcelotAttack.func_75253_b");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_75409_b = McMappingDatabase.getSRG("field_75409_b");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIOcelotAttack.func_75250_a");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIOcelotAttack.func_75246_d");

}

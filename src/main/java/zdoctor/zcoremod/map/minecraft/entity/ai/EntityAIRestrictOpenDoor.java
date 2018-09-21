package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIRestrictOpenDoor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yf";
		else
			return "net/minecraft/entity/ai/EntityAIRestrictOpenDoor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yf";
		else
			return "EntityAIRestrictOpenDoor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyf;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIRestrictOpenDoor;";
	}

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIRestrictOpenDoor.func_75253_b");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_75275_a = McMappingDatabase.getSRG("field_75275_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIRestrictOpenDoor.func_75250_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIRestrictOpenDoor.func_75249_e");

	/**
	 * <p>
	 * Name: frontDoor
	 * </p>
	 */
	public static McObfPair field_75274_b = McMappingDatabase.getSRG("field_75274_b");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIRestrictOpenDoor.func_75251_c");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIRestrictOpenDoor.func_75246_d");

}

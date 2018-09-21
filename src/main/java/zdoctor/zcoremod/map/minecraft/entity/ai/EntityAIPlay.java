package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIPlay {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xz";
		else
			return "net/minecraft/entity/ai/EntityAIPlay";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xz";
		else
			return "EntityAIPlay";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxz;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIPlay;";
	}

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIPlay.func_75251_c");

	/**
	 * <p>
	 * Name: targetVillager
	 * </p>
	 */
	public static McObfPair field_75260_b = McMappingDatabase.getSRG("field_75260_b");

	/**
	 * <p>
	 * Name: speed
	 * </p>
	 */
	public static McObfPair field_75261_c = McMappingDatabase.getSRG("field_75261_c");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIPlay.func_75249_e");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIPlay.func_75250_a");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIPlay.func_75253_b");

	/**
	 * <p>
	 * Name: villager
	 * </p>
	 */
	public static McObfPair field_75262_a = McMappingDatabase.getSRG("field_75262_a");

	/**
	 * <p>
	 * Name: playTime
	 * </p>
	 */
	public static McObfPair field_75259_d = McMappingDatabase.getSRG("field_75259_d");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIPlay.func_75246_d");

}

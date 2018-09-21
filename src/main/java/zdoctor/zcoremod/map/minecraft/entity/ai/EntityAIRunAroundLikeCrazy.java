package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIRunAroundLikeCrazy {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yh";
		else
			return "net/minecraft/entity/ai/EntityAIRunAroundLikeCrazy";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yh";
		else
			return "EntityAIRunAroundLikeCrazy";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyh;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIRunAroundLikeCrazy;";
	}

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIRunAroundLikeCrazy.func_75246_d");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIRunAroundLikeCrazy.func_75250_a");

	/**
	 * <p>
	 * Name: targetY
	 * </p>
	 */
	public static McObfPair field_111176_d = McMappingDatabase.getSRG("field_111176_d");

	/**
	 * <p>
	 * Name: speed
	 * </p>
	 */
	public static McObfPair field_111178_b = McMappingDatabase.getSRG("field_111178_b");

	/**
	 * <p>
	 * Name: horseHost
	 * </p>
	 */
	public static McObfPair field_111180_a = McMappingDatabase.getSRG("field_111180_a");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIRunAroundLikeCrazy.func_75253_b");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIRunAroundLikeCrazy.func_75249_e");

	/**
	 * <p>
	 * Name: targetX
	 * </p>
	 */
	public static McObfPair field_111179_c = McMappingDatabase.getSRG("field_111179_c");

	/**
	 * <p>
	 * Name: targetZ
	 * </p>
	 */
	public static McObfPair field_111177_e = McMappingDatabase.getSRG("field_111177_e");

}

package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAILlamaFollowCaravan {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xk";
		else
			return "net/minecraft/entity/ai/EntityAILlamaFollowCaravan";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xk";
		else
			return "EntityAILlamaFollowCaravan";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxk;";
		else
			return "Lnet/minecraft/entity/ai/EntityAILlamaFollowCaravan;";
	}

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAILlamaFollowCaravan.func_75250_a");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAILlamaFollowCaravan.func_75251_c");

	/**
	 * <p>
	 * Name: llama
	 * </p>
	 */
	public static McObfPair field_190859_a = McMappingDatabase.getSRG("field_190859_a");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAILlamaFollowCaravan.func_75253_b");

	/**
	 * <p>
	 * Name: distCheckCounter
	 * </p>
	 */
	public static McObfPair field_190861_c = McMappingDatabase.getSRG("field_190861_c");

	/**
	 * <p>
	 * Name: firstIsLeashed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityLlama;I)Z]
	 * </p>
	 */
	public static McObfPair func_190858_a = McMappingDatabase.getSRG("EntityAILlamaFollowCaravan.func_190858_a");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAILlamaFollowCaravan.func_75246_d");

	/**
	 * <p>
	 * Name: speedModifier
	 * </p>
	 */
	public static McObfPair field_190860_b = McMappingDatabase.getSRG("field_190860_b");

}

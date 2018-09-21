package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIFollowGolem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yk";
		else
			return "net/minecraft/entity/ai/EntityAIFollowGolem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yk";
		else
			return "EntityAIFollowGolem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyk;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIFollowGolem;";
	}

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIFollowGolem.func_75251_c");

	/**
	 * <p>
	 * Name: tookGolemRose
	 * </p>
	 */
	public static McObfPair field_75291_d = McMappingDatabase.getSRG("field_75291_d");

	/**
	 * <p>
	 * Name: villager
	 * </p>
	 */
	public static McObfPair field_75294_a = McMappingDatabase.getSRG("field_75294_a");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIFollowGolem.func_75246_d");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIFollowGolem.func_75250_a");

	/**
	 * <p>
	 * Name: takeGolemRoseTick
	 * </p>
	 */
	public static McObfPair field_75293_c = McMappingDatabase.getSRG("field_75293_c");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIFollowGolem.func_75253_b");

	/**
	 * <p>
	 * Name: ironGolem
	 * </p>
	 */
	public static McObfPair field_75292_b = McMappingDatabase.getSRG("field_75292_b");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIFollowGolem.func_75249_e");

}

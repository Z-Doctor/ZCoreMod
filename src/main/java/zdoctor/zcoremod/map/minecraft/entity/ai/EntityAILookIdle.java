package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAILookIdle {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yb";
		else
			return "net/minecraft/entity/ai/EntityAILookIdle";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yb";
		else
			return "EntityAILookIdle";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyb;";
		else
			return "Lnet/minecraft/entity/ai/EntityAILookIdle;";
	}

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAILookIdle.func_75249_e");

	/**
	 * <p>
	 * Name: lookX
	 * </p>
	 */
	public static McObfPair field_75256_b = McMappingDatabase.getSRG("field_75256_b");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAILookIdle.func_75253_b");

	/**
	 * <p>
	 * Name: idleEntity
	 * </p>
	 */
	public static McObfPair field_75258_a = McMappingDatabase.getSRG("field_75258_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAILookIdle.func_75250_a");

	/**
	 * <p>
	 * Name: lookZ
	 * </p>
	 */
	public static McObfPair field_75257_c = McMappingDatabase.getSRG("field_75257_c");

	/**
	 * <p>
	 * Name: idleTime
	 * </p>
	 */
	public static McObfPair field_75255_d = McMappingDatabase.getSRG("field_75255_d");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAILookIdle.func_75246_d");

}

package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIWander {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yc";
		else
			return "net/minecraft/entity/ai/EntityAIWander";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yc";
		else
			return "EntityAIWander";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyc;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIWander;";
	}

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_190864_f = McMappingDatabase.getSRG("EntityAIWander.func_190864_f");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_75455_b = McMappingDatabase.getSRG("field_75455_b");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIWander.func_75250_a");

	/**
	 * <p>
	 * Name: executionChance
	 * </p>
	 */
	public static McObfPair field_179481_f = McMappingDatabase.getSRG("field_179481_f");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_75456_c = McMappingDatabase.getSRG("field_75456_c");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIWander.func_75249_e");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIWander.func_75253_b");

	/**
	 * <p>
	 * Name: makeUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179480_f = McMappingDatabase.getSRG("EntityAIWander.func_179480_f");

	/**
	 * <p>
	 * Name: setExecutionChance
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179479_b = McMappingDatabase.getSRG("EntityAIWander.func_179479_b");

	/**
	 * <p>
	 * Name: speed
	 * </p>
	 */
	public static McObfPair field_75454_e = McMappingDatabase.getSRG("field_75454_e");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_75453_d = McMappingDatabase.getSRG("field_75453_d");

	/**
	 * <p>
	 * Name: mustUpdate
	 * </p>
	 */
	public static McObfPair field_179482_g = McMappingDatabase.getSRG("field_179482_g");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_75457_a = McMappingDatabase.getSRG("field_75457_a");

}

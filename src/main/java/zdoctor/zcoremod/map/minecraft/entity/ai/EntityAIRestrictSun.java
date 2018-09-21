package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIRestrictSun {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yg";
		else
			return "net/minecraft/entity/ai/EntityAIRestrictSun";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yg";
		else
			return "EntityAIRestrictSun";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyg;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIRestrictSun;";
	}

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_75273_a = McMappingDatabase.getSRG("field_75273_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIRestrictSun.func_75250_a");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIRestrictSun.func_75251_c");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIRestrictSun.func_75249_e");

}

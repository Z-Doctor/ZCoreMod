package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAITargetNonTamed {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yx";
		else
			return "net/minecraft/entity/ai/EntityAITargetNonTamed";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yx";
		else
			return "EntityAITargetNonTamed";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyx;";
		else
			return "Lnet/minecraft/entity/ai/EntityAITargetNonTamed;";
	}

	/**
	 * <p>
	 * Name: tameable
	 * </p>
	 */
	public static McObfPair field_75310_g = McMappingDatabase.getSRG("field_75310_g");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAITargetNonTamed.func_75250_a");

}

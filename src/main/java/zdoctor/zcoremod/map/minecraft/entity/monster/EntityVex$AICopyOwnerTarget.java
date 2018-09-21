package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityVex$AICopyOwnerTarget {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adp$b";
		else
			return "net/minecraft/entity/monster/EntityVex$AICopyOwnerTarget";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adp$b";
		else
			return "EntityVex$AICopyOwnerTarget";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladp$b;";
		else
			return "Lnet/minecraft/entity/monster/EntityVex$AICopyOwnerTarget;";
	}

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityVex$AICopyOwnerTarget.func_75250_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityVex$AICopyOwnerTarget.func_75249_e");

}

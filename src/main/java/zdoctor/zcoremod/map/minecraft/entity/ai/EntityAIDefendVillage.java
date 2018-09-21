package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIDefendVillage {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ys";
		else
			return "net/minecraft/entity/ai/EntityAIDefendVillage";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ys";
		else
			return "EntityAIDefendVillage";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lys;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIDefendVillage;";
	}

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIDefendVillage.func_75249_e");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIDefendVillage.func_75250_a");

	/**
	 * <p>
	 * Name: villageAgressorTarget
	 * </p>
	 */
	public static McObfPair field_75304_b = McMappingDatabase.getSRG("field_75304_b");

	/**
	 * <p>
	 * Name: irongolem
	 * </p>
	 */
	public static McObfPair field_75305_a = McMappingDatabase.getSRG("field_75305_a");

}

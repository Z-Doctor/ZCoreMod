package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIVillagerMate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xn";
		else
			return "net/minecraft/entity/ai/EntityAIVillagerMate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xn";
		else
			return "EntityAIVillagerMate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxn;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIVillagerMate;";
	}

	/**
	 * <p>
	 * Name: matingTimeout
	 * </p>
	 */
	public static McObfPair field_75449_e = McMappingDatabase.getSRG("field_75449_e");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIVillagerMate.func_75251_c");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIVillagerMate.func_75246_d");

	/**
	 * <p>
	 * Name: village
	 * </p>
	 */
	public static McObfPair field_75452_a = McMappingDatabase.getSRG("field_75452_a");

	/**
	 * <p>
	 * Name: giveBirth
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75447_i = McMappingDatabase.getSRG("EntityAIVillagerMate.func_75447_i");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIVillagerMate.func_75249_e");

	/**
	 * <p>
	 * Name: mate
	 * </p>
	 */
	public static McObfPair field_75451_c = McMappingDatabase.getSRG("field_75451_c");

	/**
	 * <p>
	 * Name: villager
	 * </p>
	 */
	public static McObfPair field_75450_b = McMappingDatabase.getSRG("field_75450_b");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIVillagerMate.func_75253_b");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_75448_d = McMappingDatabase.getSRG("field_75448_d");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIVillagerMate.func_75250_a");

	/**
	 * <p>
	 * Name: checkSufficientDoorsPresentForNewVillager
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75446_f = McMappingDatabase.getSRG("EntityAIVillagerMate.func_75446_f");

}

package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAILookAtVillager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xw";
		else
			return "net/minecraft/entity/ai/EntityAILookAtVillager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xw";
		else
			return "EntityAILookAtVillager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxw;";
		else
			return "Lnet/minecraft/entity/ai/EntityAILookAtVillager;";
	}

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAILookAtVillager.func_75253_b");

	/**
	 * <p>
	 * Name: lookTime
	 * </p>
	 */
	public static McObfPair field_75396_c = McMappingDatabase.getSRG("field_75396_c");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAILookAtVillager.func_75246_d");

	/**
	 * <p>
	 * Name: villager
	 * </p>
	 */
	public static McObfPair field_75395_b = McMappingDatabase.getSRG("field_75395_b");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAILookAtVillager.func_75250_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAILookAtVillager.func_75249_e");

	/**
	 * <p>
	 * Name: ironGolem
	 * </p>
	 */
	public static McObfPair field_75397_a = McMappingDatabase.getSRG("field_75397_a");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAILookAtVillager.func_75251_c");

}

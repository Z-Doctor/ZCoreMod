package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIMate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wv";
		else
			return "net/minecraft/entity/ai/EntityAIMate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wv";
		else
			return "EntityAIMate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwv;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIMate;";
	}

	/**
	 * <p>
	 * Name: getNearbyMate
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/passive/EntityAnimal;]
	 * </p>
	 */
	public static McObfPair func_75389_f = McMappingDatabase.getSRG("EntityAIMate.func_75389_f");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIMate.func_75253_b");

	/**
	 * <p>
	 * Name: mateClass
	 * </p>
	 */
	public static McObfPair field_190857_e = McMappingDatabase.getSRG("field_190857_e");

	/**
	 * <p>
	 * Name: spawnBaby
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75388_i = McMappingDatabase.getSRG("EntityAIMate.func_75388_i");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIMate.func_75246_d");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_75394_a = McMappingDatabase.getSRG("field_75394_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIMate.func_75250_a");

	/**
	 * <p>
	 * Name: targetMate
	 * </p>
	 */
	public static McObfPair field_75391_e = McMappingDatabase.getSRG("field_75391_e");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIMate.func_75251_c");

	/**
	 * <p>
	 * Name: animal
	 * </p>
	 */
	public static McObfPair field_75390_d = McMappingDatabase.getSRG("field_75390_d");

	/**
	 * <p>
	 * Name: moveSpeed
	 * </p>
	 */
	public static McObfPair field_75393_c = McMappingDatabase.getSRG("field_75393_c");

	/**
	 * <p>
	 * Name: spawnBabyDelay
	 * </p>
	 */
	public static McObfPair field_75392_b = McMappingDatabase.getSRG("field_75392_b");

}

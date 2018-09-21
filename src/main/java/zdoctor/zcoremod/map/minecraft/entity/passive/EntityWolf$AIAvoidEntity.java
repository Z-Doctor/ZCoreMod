package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityWolf$AIAvoidEntity {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aam$a";
		else
			return "net/minecraft/entity/passive/EntityWolf$AIAvoidEntity";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aam$a";
		else
			return "EntityWolf$AIAvoidEntity";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laam$a;";
		else
			return "Lnet/minecraft/entity/passive/EntityWolf$AIAvoidEntity;";
	}

	/**
	 * <p>
	 * Name: wolf
	 * </p>
	 */
	public static McObfPair field_190856_d = McMappingDatabase.getSRG("field_190856_d");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityWolf$AIAvoidEntity.func_75246_d");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityWolf$AIAvoidEntity.func_75250_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityWolf$AIAvoidEntity.func_75249_e");

	/**
	 * <p>
	 * Name: avoidLlama
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityLlama;)Z]
	 * </p>
	 */
	public static McObfPair func_190854_a = McMappingDatabase.getSRG("EntityWolf$AIAvoidEntity.func_190854_a");

}

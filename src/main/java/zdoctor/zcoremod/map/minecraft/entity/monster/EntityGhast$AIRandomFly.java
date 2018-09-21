package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityGhast$AIRandomFly {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acy$d";
		else
			return "net/minecraft/entity/monster/EntityGhast$AIRandomFly";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acy$d";
		else
			return "EntityGhast$AIRandomFly";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacy$d;";
		else
			return "Lnet/minecraft/entity/monster/EntityGhast$AIRandomFly;";
	}

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityGhast$AIRandomFly.func_75250_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityGhast$AIRandomFly.func_75249_e");

	/**
	 * <p>
	 * Name: parentEntity
	 * </p>
	 */
	public static McObfPair field_179454_a = McMappingDatabase.getSRG("field_179454_a");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityGhast$AIRandomFly.func_75253_b");

}

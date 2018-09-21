package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIOcelotSit {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xv";
		else
			return "net/minecraft/entity/ai/EntityAIOcelotSit";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xv";
		else
			return "EntityAIOcelotSit";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxv;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIOcelotSit;";
	}

	/**
	 * <p>
	 * Name: ocelot
	 * </p>
	 */
	public static McObfPair field_151493_a = McMappingDatabase.getSRG("field_151493_a");

	/**
	 * <p>
	 * Name: shouldMoveTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_179488_a = McMappingDatabase.getSRG("EntityAIOcelotSit.func_179488_a");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIOcelotSit.func_75251_c");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIOcelotSit.func_75246_d");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIOcelotSit.func_75250_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIOcelotSit.func_75249_e");

}

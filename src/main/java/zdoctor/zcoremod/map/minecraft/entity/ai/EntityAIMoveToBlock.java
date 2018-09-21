package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIMoveToBlock {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xr";
		else
			return "net/minecraft/entity/ai/EntityAIMoveToBlock";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xr";
		else
			return "EntityAIMoveToBlock";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxr;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIMoveToBlock;";
	}

	/**
	 * <p>
	 * Name: searchForDestination
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_179489_g = McMappingDatabase.getSRG("EntityAIMoveToBlock.func_179489_g");

	/**
	 * <p>
	 * Name: searchLength
	 * </p>
	 */
	public static McObfPair field_179497_h = McMappingDatabase.getSRG("field_179497_h");

	/**
	 * <p>
	 * Name: runDelay
	 * </p>
	 */
	public static McObfPair field_179496_a = McMappingDatabase.getSRG("field_179496_a");

	/**
	 * <p>
	 * Name: maxStayTicks
	 * </p>
	 */
	public static McObfPair field_179490_f = McMappingDatabase.getSRG("field_179490_f");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIMoveToBlock.func_75246_d");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIMoveToBlock.func_75249_e");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIMoveToBlock.func_75250_a");

	/**
	 * <p>
	 * Name: destinationBlock
	 * </p>
	 */
	public static McObfPair field_179494_b = McMappingDatabase.getSRG("field_179494_b");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIMoveToBlock.func_75253_b");

	/**
	 * <p>
	 * Name: timeoutCounter
	 * </p>
	 */
	public static McObfPair field_179493_e = McMappingDatabase.getSRG("field_179493_e");

	/**
	 * <p>
	 * Name: movementSpeed
	 * </p>
	 */
	public static McObfPair field_179492_d = McMappingDatabase.getSRG("field_179492_d");

	/**
	 * <p>
	 * Name: creature
	 * </p>
	 */
	public static McObfPair field_179495_c = McMappingDatabase.getSRG("field_179495_c");

	/**
	 * <p>
	 * Name: isAboveDestination
	 * </p>
	 */
	public static McObfPair field_179491_g = McMappingDatabase.getSRG("field_179491_g");

	/**
	 * <p>
	 * Name: getIsAboveDestination
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_179487_f = McMappingDatabase.getSRG("EntityAIMoveToBlock.func_179487_f");

	/**
	 * <p>
	 * Name: shouldMoveTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_179488_a = McMappingDatabase.getSRG("EntityAIMoveToBlock.func_179488_a");

}

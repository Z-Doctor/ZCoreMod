package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIDoorInteract {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ww";
		else
			return "net/minecraft/entity/ai/EntityAIDoorInteract";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ww";
		else
			return "EntityAIDoorInteract";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lww;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIDoorInteract;";
	}

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_75356_a = McMappingDatabase.getSRG("field_75356_a");

	/**
	 * <p>
	 * Name: entityPositionZ
	 * </p>
	 */
	public static McObfPair field_75357_h = McMappingDatabase.getSRG("field_75357_h");

	/**
	 * <p>
	 * Name: hasStoppedDoorInteraction
	 * </p>
	 */
	public static McObfPair field_75350_f = McMappingDatabase.getSRG("field_75350_f");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIDoorInteract.func_75249_e");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIDoorInteract.func_75250_a");

	/**
	 * <p>
	 * Name: doorPosition
	 * </p>
	 */
	public static McObfPair field_179507_b = McMappingDatabase.getSRG("field_179507_b");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIDoorInteract.func_75246_d");

	/**
	 * <p>
	 * Name: doorBlock
	 * </p>
	 */
	public static McObfPair field_151504_e = McMappingDatabase.getSRG("field_151504_e");

	/**
	 * <p>
	 * Name: entityPositionX
	 * </p>
	 */
	public static McObfPair field_75351_g = McMappingDatabase.getSRG("field_75351_g");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIDoorInteract.func_75253_b");

	/**
	 * <p>
	 * Name: getBlockDoor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockDoor;]
	 * </p>
	 */
	public static McObfPair func_179506_a = McMappingDatabase.getSRG("EntityAIDoorInteract.func_179506_a");

}

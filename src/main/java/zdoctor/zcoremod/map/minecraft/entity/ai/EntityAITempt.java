package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAITempt {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yl";
		else
			return "net/minecraft/entity/ai/EntityAITempt";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yl";
		else
			return "EntityAITempt";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyl;";
		else
			return "Lnet/minecraft/entity/ai/EntityAITempt;";
	}

	/**
	 * <p>
	 * Name: temptingPlayer
	 * </p>
	 */
	public static McObfPair field_75289_h = McMappingDatabase.getSRG("field_75289_h");

	/**
	 * <p>
	 * Name: delayTemptCounter
	 * </p>
	 */
	public static McObfPair field_75290_i = McMappingDatabase.getSRG("field_75290_i");

	/**
	 * <p>
	 * Name: pitch
	 * </p>
	 */
	public static McObfPair field_75278_f = McMappingDatabase.getSRG("field_75278_f");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAITempt.func_75250_a");

	/**
	 * <p>
	 * Name: temptedEntity
	 * </p>
	 */
	public static McObfPair field_75284_a = McMappingDatabase.getSRG("field_75284_a");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAITempt.func_75251_c");

	/**
	 * <p>
	 * Name: scaredByPlayerMovement
	 * </p>
	 */
	public static McObfPair field_75285_l = McMappingDatabase.getSRG("field_75285_l");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAITempt.func_75253_b");

	/**
	 * <p>
	 * Name: isRunning
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75277_f = McMappingDatabase.getSRG("EntityAITempt.func_75277_f");

	/**
	 * <p>
	 * Name: targetZ
	 * </p>
	 */
	public static McObfPair field_75281_e = McMappingDatabase.getSRG("field_75281_e");

	/**
	 * <p>
	 * Name: targetX
	 * </p>
	 */
	public static McObfPair field_75283_c = McMappingDatabase.getSRG("field_75283_c");

	/**
	 * <p>
	 * Name: targetY
	 * </p>
	 */
	public static McObfPair field_75280_d = McMappingDatabase.getSRG("field_75280_d");

	/**
	 * <p>
	 * Name: temptItem
	 * </p>
	 */
	public static McObfPair field_151484_k = McMappingDatabase.getSRG("field_151484_k");

	/**
	 * <p>
	 * Name: speed
	 * </p>
	 */
	public static McObfPair field_75282_b = McMappingDatabase.getSRG("field_75282_b");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAITempt.func_75249_e");

	/**
	 * <p>
	 * Name: yaw
	 * </p>
	 */
	public static McObfPair field_75279_g = McMappingDatabase.getSRG("field_75279_g");

	/**
	 * <p>
	 * Name: isTempting
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_188508_a = McMappingDatabase.getSRG("EntityAITempt.func_188508_a");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAITempt.func_75246_d");

	/**
	 * <p>
	 * Name: isRunning
	 * </p>
	 */
	public static McObfPair field_75287_j = McMappingDatabase.getSRG("field_75287_j");

}

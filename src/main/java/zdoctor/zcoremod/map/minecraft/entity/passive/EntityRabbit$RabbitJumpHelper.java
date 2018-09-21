package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityRabbit$RabbitJumpHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaf$d";
		else
			return "net/minecraft/entity/passive/EntityRabbit$RabbitJumpHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaf$d";
		else
			return "EntityRabbit$RabbitJumpHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laaf$d;";
		else
			return "Lnet/minecraft/entity/passive/EntityRabbit$RabbitJumpHelper;";
	}

	/**
	 * <p>
	 * Name: getIsJumping
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_180067_c = McMappingDatabase.getSRG("EntityRabbit$RabbitJumpHelper.func_180067_c");

	/**
	 * <p>
	 * Name: setCanJump
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_180066_a = McMappingDatabase.getSRG("EntityRabbit$RabbitJumpHelper.func_180066_a");

	/**
	 * <p>
	 * Name: canJump
	 * </p>
	 */
	public static McObfPair field_180068_d = McMappingDatabase.getSRG("field_180068_d");

	/**
	 * <p>
	 * Name: canJump
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_180065_d = McMappingDatabase.getSRG("EntityRabbit$RabbitJumpHelper.func_180065_d");

	/**
	 * <p>
	 * Name: rabbit
	 * </p>
	 */
	public static McObfPair field_180070_c = McMappingDatabase.getSRG("field_180070_c");

	/**
	 * <p>
	 * Name: doJump
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75661_b = McMappingDatabase.getSRG("EntityRabbit$RabbitJumpHelper.func_75661_b");

}

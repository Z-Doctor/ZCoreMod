package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityRabbit$RabbitMoveHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaf$e";
		else
			return "net/minecraft/entity/passive/EntityRabbit$RabbitMoveHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaf$e";
		else
			return "EntityRabbit$RabbitMoveHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laaf$e;";
		else
			return "Lnet/minecraft/entity/passive/EntityRabbit$RabbitMoveHelper;";
	}

	/**
	 * <p>
	 * Name: setMoveTo
	 * </p>
	 * <p>
	 * Desc: [(DDDD)V]
	 * </p>
	 */
	public static McObfPair func_75642_a = McMappingDatabase.getSRG("EntityRabbit$RabbitMoveHelper.func_75642_a");

	/**
	 * <p>
	 * Name: onUpdateMoveHelper
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75641_c = McMappingDatabase.getSRG("EntityRabbit$RabbitMoveHelper.func_75641_c");

	/**
	 * <p>
	 * Name: nextJumpSpeed
	 * </p>
	 */
	public static McObfPair field_188492_j = McMappingDatabase.getSRG("field_188492_j");

	/**
	 * <p>
	 * Name: rabbit
	 * </p>
	 */
	public static McObfPair field_179929_g = McMappingDatabase.getSRG("field_179929_g");

}

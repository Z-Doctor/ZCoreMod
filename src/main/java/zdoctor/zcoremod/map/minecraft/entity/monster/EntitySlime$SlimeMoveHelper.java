package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySlime$SlimeMoveHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adl$d";
		else
			return "net/minecraft/entity/monster/EntitySlime$SlimeMoveHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adl$d";
		else
			return "EntitySlime$SlimeMoveHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladl$d;";
		else
			return "Lnet/minecraft/entity/monster/EntitySlime$SlimeMoveHelper;";
	}

	/**
	 * <p>
	 * Name: setDirection
	 * </p>
	 * <p>
	 * Desc: [(FZ)V]
	 * </p>
	 */
	public static McObfPair func_179920_a = McMappingDatabase.getSRG("EntitySlime$SlimeMoveHelper.func_179920_a");

	/**
	 * <p>
	 * Name: setSpeed
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_179921_a = McMappingDatabase.getSRG("EntitySlime$SlimeMoveHelper.func_179921_a");

	/**
	 * <p>
	 * Name: jumpDelay
	 * </p>
	 */
	public static McObfPair field_179924_h = McMappingDatabase.getSRG("field_179924_h");

	/**
	 * <p>
	 * Name: isAggressive
	 * </p>
	 */
	public static McObfPair field_179923_j = McMappingDatabase.getSRG("field_179923_j");

	/**
	 * <p>
	 * Name: slime
	 * </p>
	 */
	public static McObfPair field_179925_i = McMappingDatabase.getSRG("field_179925_i");

	/**
	 * <p>
	 * Name: yRot
	 * </p>
	 */
	public static McObfPair field_179922_g = McMappingDatabase.getSRG("field_179922_g");

	/**
	 * <p>
	 * Name: onUpdateMoveHelper
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75641_c = McMappingDatabase.getSRG("EntitySlime$SlimeMoveHelper.func_75641_c");

}

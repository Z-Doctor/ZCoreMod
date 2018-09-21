package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityEnderman$AIFindPlayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acu$b";
		else
			return "net/minecraft/entity/monster/EntityEnderman$AIFindPlayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acu$b";
		else
			return "EntityEnderman$AIFindPlayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacu$b;";
		else
			return "Lnet/minecraft/entity/monster/EntityEnderman$AIFindPlayer;";
	}

	/**
	 * <p>
	 * Name: aggroTime
	 * </p>
	 */
	public static McObfPair field_179450_h = McMappingDatabase.getSRG("field_179450_h");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityEnderman$AIFindPlayer.func_75253_b");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityEnderman$AIFindPlayer.func_75246_d");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityEnderman$AIFindPlayer.func_75251_c");

	/**
	 * <p>
	 * Name: teleportTime
	 * </p>
	 */
	public static McObfPair field_179451_i = McMappingDatabase.getSRG("field_179451_i");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityEnderman$AIFindPlayer.func_75249_e");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityEnderman$AIFindPlayer.func_75250_a");

	/**
	 * <p>
	 * Name: enderman
	 * </p>
	 */
	public static McObfPair field_179449_j = McMappingDatabase.getSRG("field_179449_j");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_179448_g = McMappingDatabase.getSRG("field_179448_g");

}
